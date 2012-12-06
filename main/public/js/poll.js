// Global variable definitions
// DB column numbers
var OPT_ID = 0;
var OPT_TITLE = 1;
var OPT_VOTES = 2;

var votedID;

$(document).ready(function(){
  $("#poll").submit(formProcess); // setup the submit handler
  $("#results").hide(); // hide this to start
  
  if ($("#poll-results").length > 0 ) {
    animateResults();
  }
  
  /*
  if ($.cookie('vote_id')) {
    $("#poll-container").empty();
    votedID = $.cookie('vote_id');
    $.getJSON("poll.php?vote=none",loadResults);
  }
  */
});

// handler for the poll creation form
$("#pollSubmissionForm").on('submit', function(e) {
  //alert("aha");
  e.preventDefault(); // Prevent the default event for form submission from occuring 

  // TODO: perform validation right here...

  // log...
  console.log($(this).serialize());

  /*
success: function(data){alert(data);},
        failure: function(errMsg) {
            alert(errMsg);
        }

  */

  // TODO: build the HTML form data as a JSON object and then send that

  // Here is the fun part (AJAX call). I'm going to do the robust way that handles error catching (there are shorter 
  // helper methods in jQuery for this sort of thing, e.g. $.post, but this spells it all out clearly).
  $.ajax({
      url : '/create_poll/new',               
      data : $(this).serialize(),  // TODO: this needs to be a JSON object!
      type : 'post',  
      contentType: "application/json; charset=utf-8",
      dataType: 'json' 
  }).done(function(data) {
      // This is the callback function when the call completes, in other words this will be run when the server sends back your JSON object (which is represented as the 'data' parameter)
      //** Process your JSON here (since it's an object, you use dot notation to get properties. It's as simple as saying 'data.<property-name>'
        console.log(data);
  }).fail(function() {
      // The call failed, spawn some popup alert or something on the page telling the user (this isn't required, just accounts for all possible scenarios)
  });
});

// callback for submit button when the user selects a poll option
function formProcess(event){
  event.preventDefault();

  //alert("here we are!");
  
  var id = $("input[@name='poll']:checked").attr("value");
  id = id.replace("opt",'');
  
  $("#poll-container").fadeOut("slow",function(){
    $(this).empty();
    
    votedID = id;

    //alert("user submitted some stuffs!");

    // Load the results below
    loadResults();

    //$.getJSON("poll.php?vote="+id,loadResults); 
    //$.cookie('vote_id', id, {expires: 365}); // $ refers to the global document variable
    });
}

function animateResults(){
  $("#poll-results div").each(function(){
      var percentage = $(this).next().text();
      $(this).css({width: "0%"}).animate({
				width: percentage}, 'slow');
  });
}

function loadResults(data) {
  var total_votes = 0;
  var percent;
  
  for (id in data) {
    total_votes = total_votes+parseInt(data[id][OPT_VOTES]);
  }
  
  var results_html = "<div id='poll-results'><h3>Poll Results</h3>\n<dl class='graph'>\n";
  for (id in data) {
    percent = Math.round((parseInt(data[id][OPT_VOTES])/parseInt(total_votes))*100);
    if (data[id][OPT_ID] !== votedID) {
      results_html = results_html+"<dt class='bar-title'>"+data[id][OPT_TITLE]+"</dt><dd class='bar-container'><div id='bar"+data[id][OPT_ID]+"'style='width:0%;'>&nbsp;</div><strong>"+percent+"%</strong></dd>\n";
    } else {
      results_html = results_html+"<dt class='bar-title'>"+data[id][OPT_TITLE]+"</dt><dd class='bar-container'><div id='bar"+data[id][OPT_ID]+"'style='width:0%;background-color:#0066cc;'>&nbsp;</div><strong>"+percent+"%</strong></dd>\n";
    }
  }
  
  results_html = results_html+"</dl><p>Total Votes: "+total_votes+"</p></div>\n";
  
  $("#results").append(results_html).fadeIn("slow",function(){
    animateResults();});
}