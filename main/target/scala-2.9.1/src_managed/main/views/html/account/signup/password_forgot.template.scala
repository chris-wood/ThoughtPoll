
package views.html.account.signup

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
object password_forgot extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[providers.MyUsernamePasswordAuthProvider.MyIdentity],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(emailForm: Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.password.forgot.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

	<h1>"""),_display_(Seq[Any](/*8.7*/Messages("playauthenticate.password.forgot.title"))),format.raw/*8.57*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*10.3*/form(routes.Signup.doForgotPassword)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
	   
            """),_display_(Seq[Any](/*12.14*/if(emailForm.hasGlobalErrors)/*12.43*/ {_display_(Seq[Any](format.raw/*12.45*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*14.52*/emailForm/*14.61*/.globalError.message)),format.raw/*14.81*/("""</span>
		        </p>
            """)))})),format.raw/*16.14*/("""
	   
	   """),_display_(Seq[Any](/*18.6*/_emailPartial(emailForm))),format.raw/*18.30*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*20.32*/Messages("playauthenticate.password.forgot.cta"))),format.raw/*20.80*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*21.3*/("""
	</p>
""")))})))}
    }
    
    def render(emailForm:Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]) = apply(emailForm)
    
    def f:((Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]) => play.api.templates.Html) = (emailForm) => apply(emailForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/signup/password_forgot.scala.html
                    HASH: 21bab19777bd34e5956e14722a5fbd92ddedca7d
                    MATRIX: 831->1|1028->71|1056->124|1092->126|1156->182|1195->184|1237->192|1308->242|1356->255|1401->291|1441->293|1496->312|1534->341|1574->343|1697->430|1715->439|1757->459|1825->495|1871->506|1917->530|1997->574|2067->622|2128->652
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|38->8|38->8|40->10|40->10|40->10|42->12|42->12|42->12|44->14|44->14|44->14|46->16|48->18|48->18|50->20|50->20|51->21
                    -- GENERATED --
                */
            