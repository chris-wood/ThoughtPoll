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
	email: { type: String, index: { unique: true } }, //validate: [validatePresenceOf, 'an email is required']
	hashed_password: {type: String, required: true},
	salt: {type: String, required: true}
});

// Schema for the poll questions 
var QuestionSchema = new Schema({
	id : {type: Number, required: true, autoIndex: true},
    body : {type: String, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});

// Schema for the poll answers 
var AnswerSchema = new Schema({
	id : {type: Number, required: true, autoIndex: true},
    body : {type: String, required: true},
    votes : {type: Number, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});

// Schema for the poll voting history 
var VoteHistorySchema = new Schema({
	id : {type: Number, required: true},
    question_id : {type: Number, required: true},
    answer_id : {type: Number, required: true},
    user_id : {type: Number, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});

mongoose.model('Todo', Todo); 
mongoose.connect('mongodb://localhost/express-todo');
