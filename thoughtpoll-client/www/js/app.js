// Ionic Starter App

// angular.module is a global place for creating, registering and retrieving Angular modules
// 'starter' is the name of this angular module example (also set in a <body> attribute in index.html)
// the 2nd parameter is an array of 'requires'
var module = angular.module('thoughtpoll', ['ionic', 'angularCharts']);

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
  $scope.question = {};
  $scope.answerData = {};
  $scope.answers = [];

  $scope.answerSubmitted = false;
  $scope.selectedAnswer = {
    aid: 0
  };

  var qotdBase = 'http://localhost:3000';
  $scope.submitAnswer = function() {
    var aid = $scope.selectedAnswer.aid;
    var qid = $scope.question.id;

    var submitUrl = qotdBase + "/answer?questionId=" + qid + "&answerId=" + aid;
    var resp = {
      method: 'GET',
      url: submitUrl,
      headers: {
        // 'Access-Control-Allow-Origin': true
      }
    };
    $http(req).success(function(data, status, headers, config) {
      console.log(submitUrl);
      $scope.answerSubmitted = true;
    });
  }

  var qotdUrl = qotdBase + '/qotd';
  var req = {
    method: 'GET',
    url: qotdUrl,
    headers: {
      // 'Access-Control-Allow-Origin': true
    }
  };

  $http(req).success(function(data, status, headers, config) {
    $scope.question = {id: parseInt(data["questionId"]), text: data["questionText"]};
    $scope.answers = [];
    var answerData = [];
    var qotdAnswers = data["answers"];
    for (var i = 0; i < qotdAnswers.length; i++) {
      var answer = qotdAnswers[i];
      var answerId = parseInt(answer["answerId"]);
      var answerText = answer["answerText"];
      var answerCount = parseInt(answer["count"]);
      console.log(i + " " + answerCount);
      $scope.answers.push({aid: answerId, text: answerText});
      answerData.push({x: answerText + " (" + answerCount + ")", y:[answerCount]})
    }
    console.log(answerData);
    $scope.answerData = {"data": answerData};
  });

  $scope.answerChartConfig = {
    title: '', // chart title. If this is false, no title element will be created.
    tooltips: true,

    // exposed events
    mouseover: function() {},
    mouseout: function() {},
    click: function() {},

    // legend config
    legend: {
      display: true, // can be either 'left' or 'right'.
      position: 'left',
    },

    // override this array if you're not happy with default colors
    colors: [],
    innerRadius: 0, // Only on pie Charts
    lineCurveType: 'cardinal', // change this as per d3 guidelines to avoid smoothline
    isAnimate: true, // run animations while rendering chart
    yAxisTickFormat: 's', //refer tickFormats in d3 to edit this value
    xAxisMaxTicks: 7, // Optional: maximum number of X axis ticks to show if data points exceed this number
    yAxisTickFormat: 's', // refer tickFormats in d3 to edit this value
    waitForHeightAndWidth: false // if true, it will not throw an error when the height or width are not defined (e.g. while creating a modal form), and it will be keep watching for valid height and width values
  };

}]);