
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.Html] {

    /**/
    def apply/*1.2*/(loginForm: Form[_]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.login.title"),"login")/*6.56*/ {_display_(Seq[Any](format.raw/*6.58*/("""

  <div class="row">
    <div class="span6">
      <h1>"""),_display_(Seq[Any](/*10.12*/Messages("playauthenticate.login.title"))),format.raw/*10.52*/("""</h1>
    </div>
  </div>
    
  <div id="login" class="row">

    <div class="span3">
      """),format.raw/*17.43*/("""
    	"""),_display_(Seq[Any](/*18.7*/helper/*18.13*/.form(routes.Application.doLogin)/*18.46*/ {_display_(Seq[Any](format.raw/*18.48*/("""
    	
        """),_display_(Seq[Any](/*20.10*/if(loginForm.hasGlobalErrors)/*20.39*/ {_display_(Seq[Any](format.raw/*20.41*/(""" 
          <p class="error">
            <span class="label label-important">"""),_display_(Seq[Any](/*22.50*/loginForm/*22.59*/.globalError.message)),format.raw/*22.79*/("""</span>
          </p>
        """)))})),format.raw/*24.10*/("""
        
        """),_display_(Seq[Any](/*26.10*/_emailPartial(loginForm))),format.raw/*26.34*/("""
          
        """),_display_(Seq[Any](/*28.10*/inputPassword(
          loginForm("password"),
          '_showConstraints -> false,
          '_label -> Messages("playauthenticate.login.password.placeholder")
        ))),format.raw/*32.10*/("""
          
        <input type="submit" value=""""),_display_(Seq[Any](/*34.38*/Messages("playauthenticate.login.now"))),format.raw/*34.76*/("""" class="btn btn-primary"><br/>
        <br/>
        <a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword($('#email').val() || null).absoluteURL();">"""),_display_(Seq[Any](/*36.158*/Messages("playauthenticate.login.forgot.password"))),format.raw/*36.208*/("""</a>

    	""")))})),format.raw/*38.7*/("""
    </div>

    <div class="span3">
      """),_display_(Seq[Any](/*42.8*/Messages("playauthenticate.login.oauth"))),format.raw/*42.48*/("""
      """),format.raw/*43.48*/("""
      """),_display_(Seq[Any](/*44.8*/_providerPartial(skipCurrent=false))),format.raw/*44.43*/("""
    </div>

  </div>

""")))})))}
    }
    
    def render(loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) = apply(loginForm)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.Html) = (loginForm) => apply(loginForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/login.scala.html
                    HASH: c3f79fdab0277e011050a4587f778bd331c29dc8
                    MATRIX: 827->1|974->21|1002->74|1038->76|1100->130|1139->132|1232->189|1294->229|1415->358|1457->365|1472->371|1514->404|1554->406|1606->422|1644->451|1684->453|1799->532|1817->541|1859->561|1923->593|1978->612|2024->636|2081->657|2275->829|2360->878|2420->916|2660->1119|2733->1169|2776->1181|2855->1225|2917->1265|2952->1313|2995->1321|3052->1356
                    LINES: 29->1|35->1|37->5|38->6|38->6|38->6|42->10|42->10|49->17|50->18|50->18|50->18|50->18|52->20|52->20|52->20|54->22|54->22|54->22|56->24|58->26|58->26|60->28|64->32|66->34|66->34|68->36|68->36|70->38|74->42|74->42|75->43|76->44|76->44
                    -- GENERATED --
                */
            