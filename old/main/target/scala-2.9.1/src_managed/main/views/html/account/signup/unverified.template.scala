
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
object unverified extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.verify.email.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""

	<h1>"""),_display_(Seq[Any](/*4.7*/Messages("playauthenticate.verify.email.title"))),format.raw/*4.54*/("""</h1>
	<p>
		"""),_display_(Seq[Any](/*6.4*/Messages("playauthenticate.verify.email.requirement"))),format.raw/*6.57*/("""</br>
		"""),_display_(Seq[Any](/*7.4*/Messages("playauthenticate.verify.email.cta"))),format.raw/*7.49*/("""
	<br/>
	
	</p>
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/signup/unverified.scala.html
                    HASH: 6f57b927688ca05c13fe21f085d1096687265e3e
                    MATRIX: 848->2|909->55|948->57|990->65|1058->112|1106->126|1180->179|1223->188|1289->233
                    LINES: 30->2|30->2|30->2|32->4|32->4|34->6|34->6|35->7|35->7
                    -- GENERATED --
                */
            