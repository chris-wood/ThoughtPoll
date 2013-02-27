
/*
 * GET home page.
 */

exports.index = function(req, res){
  res.render('index', { title: 'Home', id: 'home', brand: 'ThoughtPoll'});
};

// TODO: add a redirect on index to the home page

exports.partials = function (req, res) {
  var name = req.params.name;
  res.render('partials/' + name);
};