var tp = angular.module('thought-poll',[]);

tp.controller('TPQuestionController', ['$scope', '$http', function($scope, $http) {

  $scope.question = "";
  $scope.answer_id = 0;

  $scope.getQOTD = function() {
	$http.get('/qotd.json').
		success(function(data, status, headers, config) {
			$scope.question = data;
		}).
		error(function(data, status, headers, config) {
			console.log(data);
		});
  };

  $scope.submitVote = function(qid, aid) {
  	var vote = {
  		question_id : qid,
  		answer_id : aid
  	};

  	$http.post('/vote.json', vote).
  		success(function(data, status, headers, config) {
  			alert("vote submitted -- render the results");
  		}).
  		error(function(data, status, headers, config) {
  			alert("failed to submit vote");
  		});
  }

  // Load the data
  $scope.getQOTD();

}]);