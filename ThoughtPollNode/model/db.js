// File that defines the application data model..

var mongoose = require( 'mongoose' );

var teamSchema = new mongoose.Schema({
 country: String,
 GroupName: String
});
mongoose.model( 'Team', teamSchema );



mongoose.connect( 'mongodb://localhost/thoughtpoll' );
