
/*
 * GET home page.
 */

var mongoose = require( 'mongoose' );
var Todo     = mongoose.model( 'Todo' );

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