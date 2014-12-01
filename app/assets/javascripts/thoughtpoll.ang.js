var tp = angular.module('thought-poll',[]);

tp.controller('TPQuestionController', ['$scope', '$http', function($scope, $http) {

	$scope.questionHeader = "WTF DO YOU THINK?";
	$scope.question = "";
	$scope.didVote = false;
	$scope.answer_id = 0;
	$scope.answered = false;
	$scope.latitude = null;
	$scope.longitude = null;
	$scope.isSignedIn = false;
	$scope.isAnonymous = false;
	$scope.errorMessage = null;

	$scope.quoteBody = "Prejudice is the child of ignorance.";
	$scope.quoteAuthor = "William Hazlitt";

	$scope.getQOTD = function() {
		$http.get('/qotd.json').
		success(function(data, status, headers, config) {
			$scope.question = data;
			if (data["signed_in"] == true) {
				$scope.isSignedIn = true;
			}
		}).
		error(function(data, status, headers, config) {
			console.log(data);
		});
	};

	$scope.flagAnonymous = function() {
		$scope.isAnonymous = true;
	}

	$scope.getVoteStatus = function() {
		// didVote
		$http.get('/didVote.json').
		success(function(data, status, headers, config) {
			// alert(data);
			console.log(data);

			$scope.didVote = data;
		}).
		error(function(data, status, headers, config) {
			console.log(data);
		});
	};

	$scope.submitVote = function(qid, aindex) {

		if ($scope.latitude == null || $scope.longitude == null) {
			$scope.errorMessage = "See what the rest of the world thinks... Share your location if you're using being anonymous.";
			$(".alert").show();
		} else {
			var aid = $scope.question.poll_answers[aindex].id;
			var vote = {
				question_id : qid,
				answer_id : aid,
				answer_index: aindex,
				lat: $scope.latitude,
				lon: $scope.longitude,
				anonymous: $scope.isAnonymous
			};

			$http.post('/vote.json', vote).
				success(function(data, status, headers, config) {
					$scope.questionHeader = "HERE'S WHAT THE WORLD THINKS";

					// Generate all of the simple plots
					var tuple = $scope.generateResults(data);
					$scope.plotBarChart(tuple);
					$scope.plotDonutChart(tuple);
					$scope.plotRadarChart(tuple);

					// Generate world results from raw data
					// $scope.renderWorldMap(data);

					// Now turn on data visualization after everything's prepped
					$scope.prepareVisualization();
				}).
				error(function(data, status, headers, config) {
					alert("failed to submit vote");
				});
		}
	};

	$scope.generateResults = function(results) {
		// Generate the list of labels
		var ls = [];
		var dd = [];
		for (var i = 0; i < $scope.question.poll_answers.length; i++) {
			ls.push($scope.question.poll_answers[i].body);
			dd.push(0); // initialize the results array to 0
		}

		// Generate the data counts
		for (var i = 0; i < results.length; i++) {
			if (results[i].answer_index == null) {
				dd[0] = dd[0] + 1;
			} else {
				var index = results[i].answer_index;
				dd[index] = dd[index] + 1;
			}
		}

		return {labels: ls, data: dd};
	}

	// tuple: {labels: [list of labels], data: [list of answer counts]}
	$scope.plotRadarChart = function(tuple) {
		// TODO: plot the darn thing!
	}

	// tuple: {labels: [list of labels], data: [list of answer counts]}
	$scope.plotDonutChart = function(tuple) {
		var data = [];

		var labels = tuple["labels"];
		for (var i = 0; i < labels.length; i++) {
			data.push({
				value: tuple["data"][i],
				label: labels[i],
				color: "rgba(231,76,60,1)"
			});
		}

		var options = {
			// Boolean - Whether we should show a stroke on each segment
			segmentShowStroke : true,

			// String - The colour of each segment stroke
			segmentStrokeColor : "#fff",

			// Number - The width of each segment stroke
			segmentStrokeWidth : 2,

			// Number - The percentage of the chart that we cut out of the middle
			percentageInnerCutout : 0, // This is 0 for Pie charts

			// Number - Amount of animation steps
			animationSteps : 100,

			// String - Animation easing effect
			animationEasing : "easeOutBounce",

			// Boolean - Whether we animate the rotation of the Doughnut
			animateRotate : true,

			// Boolean - Whether we animate scaling the Doughnut from the centre
			animateScale : false,

			// String - A legend template
			legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>"
		}

		var ctx = document.getElementById("donutChart").getContext("2d");
		var myPieChart = new Chart(ctx).Pie(data, options);
	};

	// tuple: {labels: [list of labels], data: [list of answer counts]}
	$scope.plotBarChart = function(tuple) {

		
		var data = {
			labels: tuple["labels"],
			datasets: [
				{
					label: "My First dataset",
					fillColor: "rgba(231,76,60,1)",
					strokeColor: "rgba(231,76,60,1)",
					highlightFill: "rgba(230,126,34,1)",
					highlightStroke: "rgba(230,126,34,1)",
					data: tuple["data"]
				}
			]
		};

		var options = {
			//Boolean - Whether the scale should start at zero, or an order of magnitude down from the lowest value
			scaleBeginAtZero : true,

			//Boolean - Whether grid lines are shown across the chart
			scaleShowGridLines : true,

			//String - Colour of the grid lines
			scaleGridLineColor : "rgba(0,0,0,.05)",

			//Number - Width of the grid lines
			scaleGridLineWidth : 1,

			//Boolean - If there is a stroke on each bar
			barShowStroke : true,

			//Number - Pixel width of the bar stroke
			barStrokeWidth : 2,

			//Number - Spacing between each of the X value sets
			barValueSpacing : 5,

			//Number - Spacing between data sets within X values
			barDatasetSpacing : 1,

			//String - A legend template
			legendTemplate : "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<datasets.length; i++){%><li><span style=\"background-color:<%=datasets[i].lineColor%>\"></span><%if(datasets[i].label){%><%=datasets[i].label%><%}%></li><%}%></ul>"
		};

		var ctx = document.getElementById("barChart").getContext("2d");
		var myBarChart = new Chart(ctx).Bar(data, options);
	};

	$scope.renderWorldMap = function(data) {

		// TODO: use the data to fill in the data here

		var worldMap = new Datamap({
			element: document.getElementById("world-map"),
			projection: 'mercator',
			fills: {
				defaultFill: "#ABDDA4",
				authorHasTraveledTo: "#fa0fa0"
			},
			data: {
				USA: { fillKey: "authorHasTraveledTo" },
				JPN: { fillKey: "authorHasTraveledTo" },
				ITA: { fillKey: "authorHasTraveledTo" },
				CRI: { fillKey: "authorHasTraveledTo" },
				KOR: { fillKey: "authorHasTraveledTo" },
				DEU: { fillKey: "authorHasTraveledTo" },
			}
		});

		var colors = d3.scale.category10();

		window.setInterval(function() {
			worldMap.updateChoropleth({
			USA: colors(Math.random() * 10),
			RUS: colors(Math.random() * 100),
			AUS: { fillKey: 'authorHasTraveledTo' },
			BRA: colors(Math.random() * 50),
			CAN: colors(Math.random() * 50),
			ZAF: colors(Math.random() * 50),
			IND: colors(Math.random() * 50),
			});
		}, 2000);

		$("#world-map").height(500);
	}

	$scope.getUserLocation = function(position) {
		$scope.latitude = position.coords.latitude;
		$scope.longitude = position.coords.longitude;
	}

	// Set up the slick carousel and then turn on that part of the page
	$scope.prepareVisualization = function() {

		// TODO: perform any other initialization stuff here

		$scope.answered = true; // go brah
	};

	// Main.
	$scope.main = function() {
		$('.fade').slick({
			dots: true,
			infinite: true,
			speed: 500,
			fade: true,
			slide: 'div',
			cssEase: 'linear'
		});

		$('.autoplay').slick({
			slidesToShow: 1,
			slidesToScroll: 1,
			autoplay: true,
			autoplaySpeed: 2000,
			slide: 'div',
			dots: true
		});

		$scope.getVoteStatus();
		$scope.getQOTD();
    	navigator.geolocation.getCurrentPosition($scope.getUserLocation);
	};
	$scope.main();
}]);