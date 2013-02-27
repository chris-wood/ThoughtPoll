// File that defines the application data model..

var mongoose = require( 'mongoose' );

var pollSchema = new mongoose.Schema({
	id : { type: Number, required: true },
	question : { type: String, required: true },
	startTime : Date,
	endTime : Date
});
mongoose.model('Poll', pollSchema);

var answerSchema = new mongoose.Schema({
	id : { type: Number, required: true },
	pollId : { type: Number, required: true },
	answer : { type: String, required: true }
});
mongoose.model('Answer', answerSchema);

var voteSchema = new mongoose.Schema({
	id : { type: Number, required: true },
	answerId : { type: Number, required: true }
	// TODO: maybe add 
});
mongoose.model('Vote', voteSchema);

mongoose.connect( 'mongodb://localhost/thoughtpoll' );
