// Import required modules.
var express = require('express');
var stormpath = require('express-stormpath');
var mongoose = require("mongoose");

mongoose.connect('mongodb://localhost/thoughtpoll')

var AnswerSchema = {
	answerId:Number,
	answerText:String,
	count:Number
}

var QuestionSchema = {
	questionId:Number,
    questionText:String,
    answers: [AnswerSchema]
};

var Question = mongoose.model('Question', QuestionSchema, 'questions');

// Initialize our Express app.
var app = express();

var qotdURI = '/qotd';

// Configure Stormpath.
var stormpathMiddleware = stormpath.init(app, {
  apiKeyFile: '/Users/caw/.stormpath/apiKey.properties',
  application: 'https://api.stormpath.com/v1/applications/3ow3opGnLNWjwhTYQwd014',
  secretKey: 'RANDOMTHINGMKAYOKAY',
  expandCustomData: true,
  enableForgotPassword: true
});

app.use(stormpathMiddleware);

app.use(function(req, res, next) {
  res.header("Access-Control-Allow-Origin", "*");
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

// Generate a simple home page.
app.get('/', function(req, res) {
  res.redirect(qotdURI);
});

// Generate a simple dashboard page.
// app.get(qotdURI, stormpath.loginRequired, function(req, res) {
app.get(qotdURI, function(req, res) {
  Question.find({}, function (err, questions) {
  	var qotd = questions[0];
  	res.json(qotd);
  });
});

// Record a new answer
app.get('/answer', function(req, res) {
	var qid = req.query.questionId;
	var aid = req.query.answerId;
  console.log(qid + "  " + aid);
	var query = { questionId : parseInt(qid) };
	Question.find(query, function (err, questions) {
  		var qotd = questions[0];
  		var answerIndex = 0;
  		if (qotd != null) {
  			for (var i = 0; i < qotd.answers.length; i++) {
	  			if (qotd.answers[i].answerId == aid) {
	  				qotd.answers[i].count++;
	  				qotd.save();
	  				res.json(qotd);
            console.log(qotd);
	  				break;
	  			}
	  		}
  		}
  	});
});

// Listen for incoming requests and serve them.
app.listen(process.env.PORT || 3000);
