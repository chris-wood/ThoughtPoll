// Pull in the mongoose schema models
var mongoose = require('mongoose');
var Todo     = mongoose.model('Todo');
var Question = mongoose.model('Question');
var Answer   = mongoose.model('Answer');
var VoteHistory = mongoose.model('VoteHistory');

//exports.index = function(req, res){
//  res.render('index', { title: 'ThoughtPoll' });
//};

// query db for all todo items
exports.index = function ( req, res ){
  Todo.find(function (err, todos, count ){
    res.render( 'index', {
        title : 'ThoughtPoll',
        todos : todos
    });
  });
};

// Show the latest poll question 
exports.showPoll = function (req, res) {
  console.log("DEBUG: showPoll()");
  Question.find(function(err, polls, count) {
    var todayPoll = null;

    // Only pass along the most recent poll...
    console.log("DEBUG: searching for today's poll");
    polls.forEach(function (poll) {
      if (todayPoll == null) {
        todayPoll = poll;
      } else if (poll > todayPoll) {
        todayPoll = poll;
      }
    });
    if (todayPoll != null) { // an alternative would be to search for the most recent entry..
      console.log(todayPoll.toString());
    }

    // render the poll view
    console.log("DEBUG: rendering poll view");
    res.render('poll', {
      title : 'ThoughtPoll',
      poll : todayPoll
      // TODO: add more params as drawn from the database
    });
  });
};

/*
id : {type: Number, required: true, autoIndex: true},
    body : {type: String, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
*/

exports.createPoll = function ( req, res ){
  var date = new Date();
  new Question({
    body    : req.body.content,
    created_at : date,
    updated_at : date
  }).save( function(err, todo, count){
    res.redirect( '/poll' );
  });
};

exports.create = function ( req, res ){
  new Todo({
    content    : req.body.content,
    updated_at : Date.now()
  }).save( function( err, todo, count ){
    res.redirect( '/' );
  });
};

// remove todo item by its id
exports.destroy = function ( req, res ){
  Todo.findById( req.params.id, function ( err, todo ){
    todo.remove( function ( err, todo ){
      res.redirect( '/' );
    });
  });
};

