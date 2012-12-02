
package views.html.account

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
object password_change extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[controllers.Account.PasswordChange],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(changeForm: Form[controllers.Account.PasswordChange]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.change.password.title"))/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""

	<h1>"""),_display_(Seq[Any](/*8.7*/Messages("playauthenticate.change.password.title"))),format.raw/*8.57*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*10.3*/form(routes.Account.doChangePassword)/*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""
	   
       """),_display_(Seq[Any](/*12.9*/if(changeForm.hasGlobalErrors)/*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/(""" 
        <p class="error">
          <span class="label label-important">"""),_display_(Seq[Any](/*14.48*/changeForm/*14.58*/.globalError.message)),format.raw/*14.78*/("""</span>
     	</p>
       """)))})),format.raw/*16.9*/("""

	   """),_display_(Seq[Any](/*18.6*/_passwordPartial(changeForm))),format.raw/*18.34*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*20.32*/Messages("playauthenticate.change.password.cta"))),format.raw/*20.80*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*21.3*/("""
	</p>
""")))})))}
    }
    
    def render(changeForm:Form[controllers.Account.PasswordChange]) = apply(changeForm)
    
    def f:((Form[controllers.Account.PasswordChange]) => play.api.templates.Html) = (changeForm) => apply(changeForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/password_change.scala.html
                    HASH: bb44f6e97c405440744f7c6e5ea2c8abfcc7c6cc
                    MATRIX: 807->1|988->55|1016->108|1052->110|1116->166|1155->168|1197->176|1268->226|1316->239|1362->276|1402->278|1451->292|1490->322|1530->324|1641->399|1660->409|1702->429|1760->456|1802->463|1852->491|1932->535|2002->583|2063->613
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|38->8|38->8|40->10|40->10|40->10|42->12|42->12|42->12|44->14|44->14|44->14|46->16|48->18|48->18|50->20|50->20|51->21
                    -- GENERATED --
                */
            