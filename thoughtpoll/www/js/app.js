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
  $scope.question = {id:0, text:"Does hot sauce mask flavor?"}
  $scope.selectedAnswer = {
    aid: 0
  };
  $scope.answerSubmitted = false;

  $scope.answers = [ 
    {aid: 1, text: "Yes."}, 
    {aid: 2, text: "No."} 
  ];

  $scope.submitAnswer = function() {
    console.log($scope.selectedAnswer.aid);
    $scope.answerSubmitted = true;
  }

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

  $scope.answerData = {
    data: [
      {
        x: "Yes.",
        y: [2],
        tooltip: "This is a tooltip"
      },
      {
        x: "No.",
        y: [4],
        tooltip: "This is a tooltip"
      }
    ]
  }

}]);