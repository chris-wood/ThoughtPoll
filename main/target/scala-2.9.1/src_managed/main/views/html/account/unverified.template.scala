
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
object unverified extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.verify.account.title"))/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

	<h1>"""),_display_(Seq[Any](/*4.7*/Messages("playauthenticate.verify.account.title"))),format.raw/*4.56*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*6.3*/Messages("playauthenticate.verify.account.before"))),format.raw/*6.53*/(""" <a href=""""),_display_(Seq[Any](/*6.64*/routes/*6.70*/.Account.verifyEmail)),format.raw/*6.90*/("""">"""),_display_(Seq[Any](/*6.93*/Messages("playauthenticate.verify.account.first"))),format.raw/*6.142*/("""</a>.<br/>
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
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/unverified.scala.html
                    HASH: a208e6fcb9f8c681c5e60d3dfba1027c1ba5e6de
                    MATRIX: 841->2|904->57|943->59|985->67|1055->116|1102->129|1173->179|1219->190|1233->196|1274->216|1312->219|1383->268
                    LINES: 30->2|30->2|30->2|32->4|32->4|34->6|34->6|34->6|34->6|34->6|34->6|34->6
                    -- GENERATED --
                */
            