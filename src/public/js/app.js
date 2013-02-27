'use strict';

// Declare app level module which depends on filters, and services
angular.module('thoughtPoll', ['thoughtPoll.filters', 'thoughtPoll.services', 'thoughtPoll.directives']).
  config(['$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {
    $routeProvider.when('/home', {templateUrl: 'partials/home', controller: PollController});
    $routeProvider.when('/history', {templateUrl: 'partials/history', controller: HistoryController});
    $routeProvider.when('/about', {templateUrl: 'partials/about', controller: AboutController});
    $routeProvider.otherwise({redirectTo: '/home'});
    $locationProvider.html5Mode(true);
  }]);