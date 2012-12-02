
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
object oAuthDenied extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(providerKey: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(Seq[Any](/*3.2*/main(Messages("playauthenticate.oauth.access.denied.title"))/*3.62*/ {_display_(Seq[Any](format.raw/*3.64*/("""

	<h1>"""),_display_(Seq[Any](/*5.7*/Messages("playauthenticate.oauth.access.denied.title"))),format.raw/*5.61*/("""</h1>
	<p>
		"""),_display_(Seq[Any](/*7.4*/Messages("playauthenticate.oauth.access.denied.explanation"))),format.raw/*7.64*/("""<br/>
	</p>
	<p>
		"""),_display_(Seq[Any](/*10.4*/Messages("playauthenticate.oauth.access.denied.alternative"))),format.raw/*10.64*/(""" <a href=""""),_display_(Seq[Any](/*10.75*/routes/*10.81*/.Application.signup)),format.raw/*10.100*/("""">"""),_display_(Seq[Any](/*10.103*/Messages("playauthenticate.oauth.access.denied.alternative.cta"))),format.raw/*10.167*/("""</a>.
	</p>
""")))})))}
    }
    
    def render(providerKey:String) = apply(providerKey)
    
    def f:((String) => play.api.templates.Html) = (providerKey) => apply(providerKey)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/signup/oAuthDenied.scala.html
                    HASH: 5089e6c37355a1f9f68f642fca843093d3dddc47
                    MATRIX: 776->1|874->22|911->25|979->85|1018->87|1060->95|1135->149|1183->163|1264->223|1319->243|1401->303|1448->314|1463->320|1505->339|1545->342|1632->406
                    LINES: 27->1|30->1|32->3|32->3|32->3|34->5|34->5|36->7|36->7|39->10|39->10|39->10|39->10|39->10|39->10|39->10
                    -- GENERATED --
                */
            