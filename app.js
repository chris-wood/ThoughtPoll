
// Module dependencies.
var db = require('./model/db');
var mongoose = require('mongoose');
var connect = require('connect');
var user = require('./routes/user');
var http = require('http');
var path = require('path');

// Create the app from the express framework
var express = require('express');
var app = express();

// Configure the app
app.configure(function(){
  app.set('port', 3000); // process.env.PORT || 3000
  app.set('views', __dirname + '/views');
  app.set('view engine', 'ejs');
  app.use(express.favicon());
  app.use(express.logger('dev'));
  app.use(express.bodyParser());
  app.use(express.methodOverride());
  app.use(app.router);
  app.use(express.static(path.join(__dirname, 'public')));
});

// Modes of operation
app.configure('development', function(){
  app.use(express.errorHandler());
});
app.configure('production', function(){
  app.use( express.errorHandler());
});

// Routes needs to go here to handle dependencies
var routes = require('./routes')

// Define the routes that we support in this app
app.get('/', routes.index);
app.get('/poll', routes.showPoll);
app.get('/destroy/:id', routes.destroy);
app.post('/createPoll', routes.createPoll);
app.post('/create', routes.create);

// Start the server!
http.createServer(app).listen(3000, function(){
  console.log("Express server listening on port " + app.get('port'));
});
