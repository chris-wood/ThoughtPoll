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
    var lastPoll = null;
    var lastDate = null;

    // Only pass along the most recent poll...
    console.log("DEBUG: searching for today's poll");
    polls.forEach(function (poll) {
      if (lastPoll == null || lastDate == null) {
        lastDate = poll.created_at; // created_at or updated_at?
        lastPoll = poll; 
      } else if (poll.created_at > lastDate) {
        lastDate = poll.created_at;
        lastPoll = poll;
      }
    });

    // Now try to find an answer set if one exists...
    var answer = null;
    if (lastPoll != null) { // an alternative would be to search for the most recent entry..
      console.log(lastPoll.toString());
      console.log("Searching for answer set for question id: " + lastPoll._id);
      Answer.find(function (err, answers, newCount) {
        console.log("display answer results");
        console.log(answers);

        // Safety net...
        if (answers.length > 0) {
          for (var i = 0; i < answers.length; i++) {
            console.log("answers[i].question = " + answers[i].question);
            console.log("lastPoll._id = " + lastPoll._id);
            if (String(answers[i].question) == String(lastPoll._id)) {
              console.log("found it!");
              answer = answers[i];
              break;
            }
          }
          //answer = answers[0]; // there should only be one... big problem if there's n>1
        } else {
          console.log("ERROR: UNMATCHED QUESTION SET FOUND");
          console.log(lastPoll);
        }

        var answerBody = null;
        if (answer != null) {
          answerBody = answer.body;
        }

        console.log("DEBUG: rendering poll view!!!");

        console.log("DEBUG: setting the request session cookie for the cookie!");
        req.session.question = "TESTING-123";

        res.render('poll', {
          title : 'ThoughtPoll',
          poll : lastPoll,
          answers : answerBody,
          description: "TODO",
          author: "TODO"
          // TODO: add more params as drawn from the databases
        });
      });
    } else {
      // Render the poll view
      console.log("DEBUG: rendering poll view");
      res.render('poll', {
        title : 'ThoughtPoll',
        poll : lastPoll,
        answers : null,
        description: "TODO",
        author: "TODO" // must be null since lastPoll is null...
        // TODO: add more params as drawn from the databases
      });
    }
  });
};

// updating a mongoose collection
/*

ContactSchema.findOne({phone: request.phone}, function(err, contact) {
    if(!err) {
        if(!contact) {
            contact = new ContactSchema();
            contact.phone = request.phone;
        }
        contact.status = request.status;
        contact.save(function(err) {
            if(!err) {
                console.log("contact " + contact.phone + " created at " + contact.createdAt + " updated at " + contact.updatedAt);
            }
            else {
                console.log("Error: could not save contact " + contact.phone);
            }
        });
    }
});

*/

exports.submitVote = function(req, res) {
  // handle the 
  console.log("submitVote param body = " + req.body.vote);


  // need to pull up the answer model that matches the question tag and then up the vote for the answer...
}

/*
id : {type: Number, required: true, autoIndex: true},
    body : {type: String, required: true},
    created_at : {type: Date, required: true},
    updated_at : {type: Date, required: true}
*/

exports.createPoll = function (req, res){
  var date = new Date();

  console.log("THE SESSION QUESTION = " + req.session.question);

  // switch on the type that was sent here!
  console.log("Question type = " + req.body.category);

  Question.find(function(err, polls, count) {
    var lastPoll = null;
    var lastDate = null;

    // Only pass along the most recent poll...
    console.log("DEBUG: searching for today's poll");
    polls.forEach(function (poll) {
      if (lastPoll == null || lastDate == null) {
        lastDate = poll.created_at; // created_at or updated_at?
        lastPoll = poll; 
      } else if (poll.created_at > lastDate) {
        lastDate = poll.created_at;
        lastPoll = poll;
      }
    });

    // TODO: insert code that's below here, build the tag, and then save it and the answer contents...
  });

/*
 value="0">General</option>
    <option value="1">Technology</option>
    <option value="2">Politics</option>
    */
  var qTag = "";
  switch (req.body.category) 
  {
    case "Technology":
      qTag = "t";
      break;
    case "Politics":
      qTag = "p";
      break;
    case "General":
      qTag = "g";
      break;
    default:
      console.log("ERROR: Unmatched category provided.");
  }

  // TODO: we need to somehow find the number to append to qTag (the question unique ID \in \mathbb{N})

  var newQuestion = new Question({
    tag        : qTag,
    body       : req.body.content,
    created_at : date,
    updated_at : date
  });

  // Debug and display the array contents
  console.log("Answer contents:");
  for (var i = 0; i < req.body.answer.length; i++)
  {
    console.log(req.body.answer[i]);
  }

  // TODO: do we need to re-build the array entries?
  console.log("New question objectid = " + newQuestion._id);
  var newAnswer = new Answer({
    question : newQuestion._id, // save the question id to link them together
    body : req.body.answer, // the answer array passed in from the browser
    created_at : date,
    updated_at : date
  });

  // TODO: should the question link to the set of answers? That might be a good idea...

  // Save the new entries
  newQuestion.save();
  newAnswer.save(function(err, ans, count) {
    res.redirect('/poll');
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
  Todo.findById(req.params.id, function ( err, todo ){
    todo.remove( function ( err, todo ){
      res.redirect( '/' );
    });
  });
};

