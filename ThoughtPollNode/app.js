var express = require('express');
var http = require('http');
var app = express();

app.set('view engine', 'jade');
app.set('view options', { layout : true});
app.set('views', __dirname + '/views');

app.get('/?', function(req, res) {
	res.render('index');
});

var port = 8000;
app.listen(port);
console.log('Listening on port ' + port);
