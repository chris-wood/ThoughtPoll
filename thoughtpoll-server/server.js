// Import required modules.
var express = require('express');
var stormpath = require('express-stormpath');

// Initialize our Express app.
var app = express();

var qotdURI = '/qotd';

// Configure Stormpath.
var stormpathMiddleware = stormpath.init(app, {
  apiKeyFile: '/Users/caw/.stormpath/apiKey.properties',
  application: 'https://api.stormpath.com/v1/applications/3ow3opGnLNWjwhTYQwd014',
  secretKey: 'RANDOMTHINGMKAYOKAY',
  expandCustomData: true,
  enableForgotPassword: true
});

app.use(stormpathMiddleware);

// Generate a simple home page.
app.get('/', function(req, res) {
  res.redirect(qotdURI);
});

// Generate a simple dashboard page.
app.get(qotdURI, stormpath.loginRequired, function(req, res) {
  res.send('Hi: ' + req.user.email + '. Logout <a href="/logout">here</a>');
});

// Post a new QOTD
// TODO: handle post for new key here

// Listen for incoming requests and serve them.
app.listen(process.env.PORT || 3000);
