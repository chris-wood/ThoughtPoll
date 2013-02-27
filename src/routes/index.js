/*
 * GET home page.
 */
exports.index = function(req, res){
  res.render('index', { title: 'Home', id: 'home', brand: 'ThoughtPoll'});
};

exports.about = function(req, res){
  res.render('about', { title: 'About', id: 'about', brand: 'ThoughtPoll'});
};

exports.history = function(req, res){
  res.render('history', { title: 'History', id: 'history', brand: 'ThoughtPoll'});
};

exports.partials = function (req, res) {
  var name = req.params.name;
  res.render('partials/' + name);
};