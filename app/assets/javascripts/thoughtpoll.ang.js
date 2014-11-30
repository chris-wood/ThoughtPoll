var tp = angular.module('thought-poll',[]);

tp.controller('TPQuestionController', ['$scope', '$http', function($scope, $http) {

	$scope.questionHeader = "WTF DO YOU THINK?";
	$scope.question = "";
	$scope.answer_id = 0;
	$scope.answered = false;

	$scope.getQOTD = function() {
		$http.get('/qotd.json').
		success(function(data, status, headers, config) {
			$scope.question = data;
		}).
		error(function(data, status, headers, config) {
			console.log(data);
		});
	};

  $scope.submitVote = function(qid, aindex) {
  	var aid = $scope.question.poll_answers[aindex].id;
  	var vote = {
  		question_id : qid,
  		answer_id : aid,
  		answer_index: aindex
  	};

  	$http.post('/vote.json', vote).
  		success(function(data, status, headers, config) {
  			$scope.answered = true;
  			$scope.questionHeader = "HERE'S WHAT THE WORLD THINKS";

  			// Now plot the data for the user...
  			$scope.plotBarChart(data);
  		}).
  		error(function(data, status, headers, config) {
  			alert("failed to submit vote");
  		});
  };

  $scope.plotBarChart = function(results) {

  	// Generate the list of labels
  	var ls = [];
  	var dd = [];
  	for (var i = 0; i < $scope.question.poll_answers.length; i++) {
  		ls.push($scope.question.poll_answers[i].body);
  		dd.push(0); // initialize the results array to 0
  	}

  	console.log(results);
  	for (var i = 0; i < results.length; i++) {
  		if (results[i].answer_index == null) {
  			dd[0] = dd[0] + 1;
  		} else {
  			var index = results[i].answer_index;
  			dd[index] = dd[index] + 1;
  		}
  	}

  	var data = {
	    labels: ls,
	    datasets: [
	        {
	            label: "My First dataset",
	            fillColor: "rgba(220,220,220,0.5)",
	            strokeColor: "rgba(220,220,220,0.8)",
	            highlightFill: "rgba(220,220,220,0.75)",
	            highlightStroke: "rgba(220,220,220,1)",
	            // data: [65, 59, 80, 81]
	            data: dd
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
  }

  // Load the data
  $scope.getQOTD();

}]);