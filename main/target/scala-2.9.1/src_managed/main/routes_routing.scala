// @SOURCE:/Users/caw/Projects/ThoughtPoll/main/conf/routes
// @HASH:c2d01d17e1d18c7b66c370ccedc2de0a90cd4b44
// @DATE:Sat Dec 01 21:09:30 EST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_restricted1 = Route("GET", PathPattern(List(StaticPart("/restricted"))))
                    

// @LINE:8
val controllers_Application_jsRoutes2 = Route("GET", PathPattern(List(StaticPart("/assets/javascript/routes.js"))))
                    

// @LINE:10
val controllers_Application_profile3 = Route("GET", PathPattern(List(StaticPart("/profile"))))
                    

// @LINE:12
val controllers_Application_login4 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:13
val controllers_Application_doLogin5 = Route("POST", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:15
val com_feth_play_module_pa_controllers_Authenticate_logout6 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:16
val com_feth_play_module_pa_controllers_Authenticate_authenticate7 = Route("GET", PathPattern(List(StaticPart("/authenticate/"),DynamicPart("provider", """[^/]+"""))))
                    

// @LINE:18
val controllers_Application_signup8 = Route("GET", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:19
val controllers_Application_doSignup9 = Route("POST", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:21
val controllers_Signup_unverified10 = Route("GET", PathPattern(List(StaticPart("/accounts/unverified"))))
                    

// @LINE:22
val controllers_Signup_oAuthDenied11 = Route("GET", PathPattern(List(StaticPart("/authenticate/"),DynamicPart("provider", """[^/]+"""),StaticPart("/denied"))))
                    

// @LINE:24
val controllers_Signup_verify12 = Route("GET", PathPattern(List(StaticPart("/accounts/verify/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:25
val controllers_Signup_exists13 = Route("GET", PathPattern(List(StaticPart("/accounts/exists"))))
                    

// @LINE:27
val controllers_Signup_resetPassword14 = Route("GET", PathPattern(List(StaticPart("/accounts/password/reset/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:28
val controllers_Signup_doResetPassword15 = Route("POST", PathPattern(List(StaticPart("/accounts/password/reset"))))
                    

// @LINE:30
val controllers_Account_changePassword16 = Route("GET", PathPattern(List(StaticPart("/accounts/password/change"))))
                    

// @LINE:31
val controllers_Account_doChangePassword17 = Route("POST", PathPattern(List(StaticPart("/accounts/password/change"))))
                    

// @LINE:33
val controllers_Account_verifyEmail18 = Route("GET", PathPattern(List(StaticPart("/accounts/verify"))))
                    

// @LINE:35
val controllers_Account_link19 = Route("GET", PathPattern(List(StaticPart("/accounts/add"))))
                    

// @LINE:37
val controllers_Account_askLink20 = Route("GET", PathPattern(List(StaticPart("/accounts/link"))))
                    

// @LINE:38
val controllers_Account_doLink21 = Route("POST", PathPattern(List(StaticPart("/accounts/link"))))
                    

// @LINE:40
val controllers_Account_askMerge22 = Route("GET", PathPattern(List(StaticPart("/accounts/merge"))))
                    

// @LINE:41
val controllers_Account_doMerge23 = Route("POST", PathPattern(List(StaticPart("/accounts/merge"))))
                    

// @LINE:43
val controllers_Signup_forgotPassword24 = Route("GET", PathPattern(List(StaticPart("/login/password/forgot"))))
                    

// @LINE:44
val controllers_Signup_doForgotPassword25 = Route("POST", PathPattern(List(StaticPart("/login/password/forgot"))))
                    

// @LINE:47
val controllers_Assets_at26 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/restricted""","""controllers.Application.restricted"""),("""GET""","""/assets/javascript/routes.js""","""controllers.Application.jsRoutes"""),("""GET""","""/profile""","""controllers.Application.profile"""),("""GET""","""/login""","""controllers.Application.login"""),("""POST""","""/login""","""controllers.Application.doLogin"""),("""GET""","""/logout""","""com.feth.play.module.pa.controllers.Authenticate.logout"""),("""GET""","""/authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""","""/signup""","""controllers.Application.signup"""),("""POST""","""/signup""","""controllers.Application.doSignup"""),("""GET""","""/accounts/unverified""","""controllers.Signup.unverified"""),("""GET""","""/authenticate/$provider<[^/]+>/denied""","""controllers.Signup.oAuthDenied(provider:String)"""),("""GET""","""/accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""","""/accounts/exists""","""controllers.Signup.exists"""),("""GET""","""/accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""POST""","""/accounts/password/reset""","""controllers.Signup.doResetPassword"""),("""GET""","""/accounts/password/change""","""controllers.Account.changePassword"""),("""POST""","""/accounts/password/change""","""controllers.Account.doChangePassword"""),("""GET""","""/accounts/verify""","""controllers.Account.verifyEmail"""),("""GET""","""/accounts/add""","""controllers.Account.link"""),("""GET""","""/accounts/link""","""controllers.Account.askLink"""),("""POST""","""/accounts/link""","""controllers.Account.doLink"""),("""GET""","""/accounts/merge""","""controllers.Account.askMerge"""),("""POST""","""/accounts/merge""","""controllers.Account.doMerge"""),("""GET""","""/login/password/forgot""","""controllers.Signup.forgotPassword(email:String ?= "")"""),("""POST""","""/login/password/forgot""","""controllers.Signup.doForgotPassword"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_restricted1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.restricted, HandlerDef(this, "controllers.Application", "restricted", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_jsRoutes2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.jsRoutes, HandlerDef(this, "controllers.Application", "jsRoutes", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_profile3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.profile, HandlerDef(this, "controllers.Application", "profile", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_login4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_doLogin5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.doLogin, HandlerDef(this, "controllers.Application", "doLogin", Nil))
   }
}
                    

// @LINE:15
case com_feth_play_module_pa_controllers_Authenticate_logout6(params) => {
   call { 
        invokeHandler(_root_.com.feth.play.module.pa.controllers.Authenticate.logout, HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Nil))
   }
}
                    

// @LINE:16
case com_feth_play_module_pa_controllers_Authenticate_authenticate7(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(_root_.com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String])))
   }
}
                    

// @LINE:18
case controllers_Application_signup8(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil))
   }
}
                    

// @LINE:19
case controllers_Application_doSignup9(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.doSignup, HandlerDef(this, "controllers.Application", "doSignup", Nil))
   }
}
                    

// @LINE:21
case controllers_Signup_unverified10(params) => {
   call { 
        invokeHandler(_root_.controllers.Signup.unverified, HandlerDef(this, "controllers.Signup", "unverified", Nil))
   }
}
                    

// @LINE:22
case controllers_Signup_oAuthDenied11(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(_root_.controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String])))
   }
}
                    

// @LINE:24
case controllers_Signup_verify12(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String])))
   }
}
                    

// @LINE:25
case controllers_Signup_exists13(params) => {
   call { 
        invokeHandler(_root_.controllers.Signup.exists, HandlerDef(this, "controllers.Signup", "exists", Nil))
   }
}
                    

// @LINE:27
case controllers_Signup_resetPassword14(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String])))
   }
}
                    

// @LINE:28
case controllers_Signup_doResetPassword15(params) => {
   call { 
        invokeHandler(_root_.controllers.Signup.doResetPassword, HandlerDef(this, "controllers.Signup", "doResetPassword", Nil))
   }
}
                    

// @LINE:30
case controllers_Account_changePassword16(params) => {
   call { 
        invokeHandler(_root_.controllers.Account.changePassword, HandlerDef(this, "controllers.Account", "changePassword", Nil))
   }
}
                    

// @LINE:31
case controllers_Account_doChangePassword17(params) => {
   call { 
        invokeHandler(_root_.controllers.Account.doChangePassword, HandlerDef(this, "controllers.Account", "doChangePassword", Nil))
   }
}
                    

// @LINE:33
case controllers_Account_verifyEmail18(params) => {
   call { 
        invokeHandler(_root_.controllers.Account.verifyEmail, HandlerDef(this, "controllers.Account", "verifyEmail", Nil))
   }
}
                    

// @LINE:35
case controllers_Account_link19(params) => {
   call { 
        invokeHandler(_root_.controllers.Account.link, HandlerDef(this, "controllers.Account", "link", Nil))
   }
}
                    

// @LINE:37
case controllers_Account_askLink20(params) => {
   call { 
        invokeHandler(_root_.controllers.Account.askLink, HandlerDef(this, "controllers.Account", "askLink", Nil))
   }
}
                    

// @LINE:38
case controllers_Account_doLink21(params) => {
   call { 
        invokeHandler(_root_.controllers.Account.doLink, HandlerDef(this, "controllers.Account", "doLink", Nil))
   }
}
                    

// @LINE:40
case controllers_Account_askMerge22(params) => {
   call { 
        invokeHandler(_root_.controllers.Account.askMerge, HandlerDef(this, "controllers.Account", "askMerge", Nil))
   }
}
                    

// @LINE:41
case controllers_Account_doMerge23(params) => {
   call { 
        invokeHandler(_root_.controllers.Account.doMerge, HandlerDef(this, "controllers.Account", "doMerge", Nil))
   }
}
                    

// @LINE:43
case controllers_Signup_forgotPassword24(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(_root_.controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String])))
   }
}
                    

// @LINE:44
case controllers_Signup_doForgotPassword25(params) => {
   call { 
        invokeHandler(_root_.controllers.Signup.doForgotPassword, HandlerDef(this, "controllers.Signup", "doForgotPassword", Nil))
   }
}
                    

// @LINE:47
case controllers_Assets_at26(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                