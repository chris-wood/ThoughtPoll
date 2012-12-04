// @SOURCE:/Users/caw/Projects/ThoughtPoll/main/conf/routes
// @HASH:ca73026bf2c00f2637f1e222f59169a9b0efdb7c
// @DATE:Mon Dec 03 23:40:19 EST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:16
// @LINE:15
package com.feth.play.module.pa.controllers {

// @LINE:16
// @LINE:15
class ReverseAuthenticate {
    


 
// @LINE:15
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:16
def authenticate(provider:String) = {
   Call("GET", "/authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                        

                      
    
}
                            
}
                    

// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:44
// @LINE:43
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
class ReverseSignup {
    


 
// @LINE:43
def forgotPassword(email:String = "") = {
   Call("GET", "/login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                        
 
// @LINE:24
def verify(token:String) = {
   Call("GET", "/accounts/verify/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:44
def doForgotPassword() = {
   Call("POST", "/login/password/forgot")
}
                                                        
 
// @LINE:22
def oAuthDenied(provider:String) = {
   Call("GET", "/authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider) + "/denied")
}
                                                        
 
// @LINE:25
def exists() = {
   Call("GET", "/accounts/exists")
}
                                                        
 
// @LINE:27
def resetPassword(token:String) = {
   Call("GET", "/accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:28
def doResetPassword() = {
   Call("POST", "/accounts/password/reset")
}
                                                        
 
// @LINE:21
def unverified() = {
   Call("GET", "/accounts/unverified")
}
                                                        

                      
    
}
                            

// @LINE:50
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:18
def signup() = {
   Call("GET", "/signup")
}
                                                        
 
// @LINE:12
def login() = {
   Call("GET", "/login")
}
                                                        
 
// @LINE:8
def jsRoutes() = {
   Call("GET", "/assets/javascript/routes.js")
}
                                                        
 
// @LINE:7
def restricted() = {
   Call("GET", "/restricted")
}
                                                        
 
// @LINE:19
def doSignup() = {
   Call("POST", "/signup")
}
                                                        
 
// @LINE:50
def create_poll() = {
   Call("GET", "/create_poll")
}
                                                        
 
// @LINE:10
def profile() = {
   Call("GET", "/profile")
}
                                                        
 
// @LINE:13
def doLogin() = {
   Call("POST", "/login")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:47
class ReverseAssets {
    


 
// @LINE:47
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
class ReverseAccount {
    


 
// @LINE:35
def link() = {
   Call("GET", "/accounts/add")
}
                                                        
 
// @LINE:38
def doLink() = {
   Call("POST", "/accounts/link")
}
                                                        
 
// @LINE:37
def askLink() = {
   Call("GET", "/accounts/link")
}
                                                        
 
// @LINE:30
def changePassword() = {
   Call("GET", "/accounts/password/change")
}
                                                        
 
// @LINE:31
def doChangePassword() = {
   Call("POST", "/accounts/password/change")
}
                                                        
 
// @LINE:41
def doMerge() = {
   Call("POST", "/accounts/merge")
}
                                                        
 
// @LINE:33
def verifyEmail() = {
   Call("GET", "/accounts/verify")
}
                                                        
 
// @LINE:40
def askMerge() = {
   Call("GET", "/accounts/merge")
}
                                                        

                      
    
}
                            
}
                    


// @LINE:16
// @LINE:15
package com.feth.play.module.pa.controllers.javascript {

// @LINE:16
// @LINE:15
class ReverseAuthenticate {
    


 
// @LINE:15
def logout = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:16
def authenticate = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    

// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:44
// @LINE:43
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
class ReverseSignup {
    


 
// @LINE:43
def forgotPassword = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function(email) {
      return _wA({method:"GET", url:"/login/password/forgot" + _qS([(email == null ? """ +  implicitly[JavascriptLitteral[String]].to("") + """ : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                                                        
 
// @LINE:24
def verify = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"/accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:44
def doForgotPassword = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"/login/password/forgot"})
      }
   """
)
                                                        
 
// @LINE:22
def oAuthDenied = JavascriptReverseRoute(
   "controllers.Signup.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider) + "/denied"})
      }
   """
)
                                                        
 
// @LINE:25
def exists = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"/accounts/exists"})
      }
   """
)
                                                        
 
// @LINE:27
def resetPassword = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"/accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:28
def doResetPassword = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"/accounts/password/reset"})
      }
   """
)
                                                        
 
// @LINE:21
def unverified = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"/accounts/unverified"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:50
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:18
def signup = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:12
def login = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:8
def jsRoutes = JavascriptReverseRoute(
   "controllers.Application.jsRoutes",
   """
      function() {
      return _wA({method:"GET", url:"/assets/javascript/routes.js"})
      }
   """
)
                                                        
 
// @LINE:7
def restricted = JavascriptReverseRoute(
   "controllers.Application.restricted",
   """
      function() {
      return _wA({method:"GET", url:"/restricted"})
      }
   """
)
                                                        
 
// @LINE:19
def doSignup = JavascriptReverseRoute(
   "controllers.Application.doSignup",
   """
      function() {
      return _wA({method:"POST", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:50
def create_poll = JavascriptReverseRoute(
   "controllers.Application.create_poll",
   """
      function() {
      return _wA({method:"GET", url:"/create_poll"})
      }
   """
)
                                                        
 
// @LINE:10
def profile = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"/profile"})
      }
   """
)
                                                        
 
// @LINE:13
def doLogin = JavascriptReverseRoute(
   "controllers.Application.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:47
class ReverseAssets {
    


 
// @LINE:47
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
class ReverseAccount {
    


 
// @LINE:35
def link = JavascriptReverseRoute(
   "controllers.Account.link",
   """
      function() {
      return _wA({method:"GET", url:"/accounts/add"})
      }
   """
)
                                                        
 
// @LINE:38
def doLink = JavascriptReverseRoute(
   "controllers.Account.doLink",
   """
      function() {
      return _wA({method:"POST", url:"/accounts/link"})
      }
   """
)
                                                        
 
// @LINE:37
def askLink = JavascriptReverseRoute(
   "controllers.Account.askLink",
   """
      function() {
      return _wA({method:"GET", url:"/accounts/link"})
      }
   """
)
                                                        
 
// @LINE:30
def changePassword = JavascriptReverseRoute(
   "controllers.Account.changePassword",
   """
      function() {
      return _wA({method:"GET", url:"/accounts/password/change"})
      }
   """
)
                                                        
 
// @LINE:31
def doChangePassword = JavascriptReverseRoute(
   "controllers.Account.doChangePassword",
   """
      function() {
      return _wA({method:"POST", url:"/accounts/password/change"})
      }
   """
)
                                                        
 
// @LINE:41
def doMerge = JavascriptReverseRoute(
   "controllers.Account.doMerge",
   """
      function() {
      return _wA({method:"POST", url:"/accounts/merge"})
      }
   """
)
                                                        
 
// @LINE:33
def verifyEmail = JavascriptReverseRoute(
   "controllers.Account.verifyEmail",
   """
      function() {
      return _wA({method:"GET", url:"/accounts/verify"})
      }
   """
)
                                                        
 
// @LINE:40
def askMerge = JavascriptReverseRoute(
   "controllers.Account.askMerge",
   """
      function() {
      return _wA({method:"GET", url:"/accounts/merge"})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:16
// @LINE:15
package com.feth.play.module.pa.controllers.ref {

// @LINE:16
// @LINE:15
class ReverseAuthenticate {
    


 
// @LINE:15
def logout() = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq())
)
                              
 
// @LINE:16
def authenticate(provider:String) = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]))
)
                              

                      
    
}
                            
}
                    

// @LINE:50
// @LINE:47
// @LINE:44
// @LINE:43
// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:44
// @LINE:43
// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
class ReverseSignup {
    


 
// @LINE:43
def forgotPassword(email:String) = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]))
)
                              
 
// @LINE:24
def verify(token:String) = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]))
)
                              
 
// @LINE:44
def doForgotPassword() = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this, "controllers.Signup", "doForgotPassword", Seq())
)
                              
 
// @LINE:22
def oAuthDenied(provider:String) = new play.api.mvc.HandlerRef(
   controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]))
)
                              
 
// @LINE:25
def exists() = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this, "controllers.Signup", "exists", Seq())
)
                              
 
// @LINE:27
def resetPassword(token:String) = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]))
)
                              
 
// @LINE:28
def doResetPassword() = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this, "controllers.Signup", "doResetPassword", Seq())
)
                              
 
// @LINE:21
def unverified() = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this, "controllers.Signup", "unverified", Seq())
)
                              

                      
    
}
                            

// @LINE:50
// @LINE:19
// @LINE:18
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:18
def signup() = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq())
)
                              
 
// @LINE:12
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              
 
// @LINE:8
def jsRoutes() = new play.api.mvc.HandlerRef(
   controllers.Application.jsRoutes(), HandlerDef(this, "controllers.Application", "jsRoutes", Seq())
)
                              
 
// @LINE:7
def restricted() = new play.api.mvc.HandlerRef(
   controllers.Application.restricted(), HandlerDef(this, "controllers.Application", "restricted", Seq())
)
                              
 
// @LINE:19
def doSignup() = new play.api.mvc.HandlerRef(
   controllers.Application.doSignup(), HandlerDef(this, "controllers.Application", "doSignup", Seq())
)
                              
 
// @LINE:50
def create_poll() = new play.api.mvc.HandlerRef(
   controllers.Application.create_poll(), HandlerDef(this, "controllers.Application", "create_poll", Seq())
)
                              
 
// @LINE:10
def profile() = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this, "controllers.Application", "profile", Seq())
)
                              
 
// @LINE:13
def doLogin() = new play.api.mvc.HandlerRef(
   controllers.Application.doLogin(), HandlerDef(this, "controllers.Application", "doLogin", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:47
class ReverseAssets {
    


 
// @LINE:47
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:41
// @LINE:40
// @LINE:38
// @LINE:37
// @LINE:35
// @LINE:33
// @LINE:31
// @LINE:30
class ReverseAccount {
    


 
// @LINE:35
def link() = new play.api.mvc.HandlerRef(
   controllers.Account.link(), HandlerDef(this, "controllers.Account", "link", Seq())
)
                              
 
// @LINE:38
def doLink() = new play.api.mvc.HandlerRef(
   controllers.Account.doLink(), HandlerDef(this, "controllers.Account", "doLink", Seq())
)
                              
 
// @LINE:37
def askLink() = new play.api.mvc.HandlerRef(
   controllers.Account.askLink(), HandlerDef(this, "controllers.Account", "askLink", Seq())
)
                              
 
// @LINE:30
def changePassword() = new play.api.mvc.HandlerRef(
   controllers.Account.changePassword(), HandlerDef(this, "controllers.Account", "changePassword", Seq())
)
                              
 
// @LINE:31
def doChangePassword() = new play.api.mvc.HandlerRef(
   controllers.Account.doChangePassword(), HandlerDef(this, "controllers.Account", "doChangePassword", Seq())
)
                              
 
// @LINE:41
def doMerge() = new play.api.mvc.HandlerRef(
   controllers.Account.doMerge(), HandlerDef(this, "controllers.Account", "doMerge", Seq())
)
                              
 
// @LINE:33
def verifyEmail() = new play.api.mvc.HandlerRef(
   controllers.Account.verifyEmail(), HandlerDef(this, "controllers.Account", "verifyEmail", Seq())
)
                              
 
// @LINE:40
def askMerge() = new play.api.mvc.HandlerRef(
   controllers.Account.askMerge(), HandlerDef(this, "controllers.Account", "askMerge", Seq())
)
                              

                      
    
}
                            
}
                    
                