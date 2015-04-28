// Ionic Starter App

// angular.module is a global place for creating, registering and retrieving Angular modules
// 'starter' is the name of this angular module example (also set in a <body> attribute in index.html)
// the 2nd parameter is an array of 'requires'
var module = angular.module('thoughtpoll', ['ionic']);

module.run(function($ionicPlatform) {
  $ionicPlatform.ready(function() {
    // Hide the accessory bar by default (remove this to show the accessory bar above the keyboard
    // for form inputs)
    if(window.cordova && window.cordova.plugins.Keyboard) {
      cordova.plugins.Keyboard.hideKeyboardAccessoryBar(true);
    }
    if(window.StatusBar) {
      StatusBar.styleDefault();
    }
  });
})

module.controller('questionController', ['$scope', '$http', function($scope, $http) {
  $scope.question = {id:0, text:"Does hot sauce mask flavor?"}
  $scope.selectedAnswer = {
    aid: 0
  };
  $scope.answers = [ 
    {aid: 1, text: "Yes."}, 
    {aid: 2, text: "No."} 
  ];

  $scope.submitAnswer = function() {
    console.log($scope.selectedAnswer.aid);
    // TODO: log to the server and get the latest data set
  }

  

}]);