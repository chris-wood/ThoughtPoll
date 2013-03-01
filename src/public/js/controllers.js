'use strict';

/* Controllers */

function AppCtrl($scope, $http) {
  	$http({method: 'GET', url: '/api/name'}).
  		success(function(data, status, headers, config) {
    		$scope.name = data.name;
  		}).
  		error(function(data, status, headers, config) {
    		$scope.name = 'Error!'
  		});

  	$scope.pollQuestions = Array();
	$scope.pollQuestions['q1'] = "question 1";
	$scope.pollQuestions['q2'] = "question 2";
	$scope.pollQuestions['q3'] = "question 3";
	$scope.pollQuestions['q4'] = "question 4";
}

function PollController($scope, $http) {
	// TODO
}
PollController.$inject = [];

function HistoryController() {}
HistoryController.$inject = [];

function AboutController() {}
AboutController.$inject = [];


