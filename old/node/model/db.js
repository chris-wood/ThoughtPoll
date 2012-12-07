var mongoose = require( 'mongoose' );
var Schema   = mongoose.Schema;
 
// Schema for the TODO list
var Todo = new Schema({
    user_id    : String,
    content    : String,
    updated_at : Date
});

// Schema for users 
var User = new Schema({
	id : {type: Number, required: true},
	email: { type: String, index: { unique: true } }, //validate: [validatePresenceOf, 'an email is required']
	hashed_password: {type: String, required: true},
	salt: {type: String, required: true}
});

// Schema for the poll questions 
var Question = new Schema({
    tag : {type: String, index: {unique: true}, required: true}, // tech-N, politics-N, finance-N, gen-N
    body : {type: String, index: { unique: true }, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});

// Schema for the poll answers 
var Answer = new Schema({
	//id : {type: Number, required: true, autoIndex: true},
    question : Schema.Types.ObjectId, // a reference to the question model instance we are tied to...
    body : {type: [String], index: { unique: true }, required: true}, // body is array of strings (the answers)
    //votes : {type: Number, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});

// Schema for the poll voting history 
var VoteHistory = new Schema({
	id : {type: Number, required: true},
    question_id : {type: Number, required: true},
    answer_id : {type: Number, required: true},
    user_id : {type: Number, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
});

// Compile the schemas into the model
mongoose.model('Todo', Todo); 
mongoose.model('User', User);
mongoose.model('Question', Question);
mongoose.model('Answer', Answer);
mongoose.model('VoteHistory', VoteHistory);
mongoose.connect('mongodb://localhost/thoughtpoll');

/*

Defining an instance method for a Schema type...

var animalSchema = new Schema({ name: String, type: String });

animalSchema.methods.findSimilarTypes = function (cb) {
  return this.model('Animal').find({ type: this.type }, cb);
}

*/

// Some instance methods for the documents
Question.methods.isQOTD = function() {
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth() + 1; // January is 0
	var yyyy = today.getFullYear();
	var matchString = yyyy + "-" + mm + "-" + dd;
    return (this.created_at.toISOString().indexOf(matchString) == 0);
}

// Re-compile the schemas into the model and then connect to the database
mongoose.model('Todo', Todo); 
mongoose.model('User', User);
mongoose.model('Question', Question);
mongoose.model('Answer', Answer);
mongoose.model('VoteHistory', VoteHistory);
