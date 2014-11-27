var tp = angular.module('thought-poll',[]);

tp.controller('TPQuestionController', ['$scope', function($scope) {
  $scope.question = "QOTD";
}]);