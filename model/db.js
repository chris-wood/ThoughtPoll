var mongoose = require( 'mongoose' );
var Schema   = mongoose.Schema;
 
// Schema for the TODO list
var Todo = new Schema({
    user_id    : String,
    content    : String,
    updated_at : Date
});

// Schema for users
var UserSchema = new Schema({
	id : {type: Number, required: true},
	email: { type: String, validate: [validatePresenceOf, 'an email is required'], index: { unique: true } },
	hashed_password: {type: String, required: true},
	salt: {type: String, required: true}
});

// Schema for the poll questions, answers, and voting history
var QuestionSchema = new Schema({
	id : {type: Number, required: true, autoIndex: true},
    body : {type: String, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});

var AnswerSchema = new Schema({
	id : {type: Number, required: true, autoIndex: true},
    body : {type: String, required: true},
    votes : {type: Number, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});

var VoteHistorySchema = new Schema({
	id : {type: Number, required: true},
    question_id : {type: Number, required: true},
    answer_id : {type: Number, required: true},
    user_id : {type: Number, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});
 
mongoose.model( 'Todo', Todo );
 
mongoose.connect( 'mongodb://localhost/express-todo' );
