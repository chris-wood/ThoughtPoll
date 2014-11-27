var tp = angular.module('thought-poll',[]);

tp.controller('TPQuestionController', ['$scope', '$http', function($scope, $http) {
  $scope.question = "QOTD";

  $scope.getQOTD = function() {
	$http.get('/qotd.json').
		success(function(data, status, headers, config) {
			alert(data);
			$scope.question = data;
		}).
		error(function(data, status, headers, config) {
			console.log(data);
		});
  };

}]);