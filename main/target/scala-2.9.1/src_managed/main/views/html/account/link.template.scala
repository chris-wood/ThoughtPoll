
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
object link extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.link.account.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""
    
    <h1>"""),_display_(Seq[Any](/*4.10*/Messages("playauthenticate.link.account.title"))),format.raw/*4.57*/("""</h1>
    
    <p>
	"""),_display_(Seq[Any](/*7.3*/_providerPartial())),format.raw/*7.21*/("""
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
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/link.scala.html
                    HASH: acad71cae63702ba2187a282a14b70a06f1085d1
                    MATRIX: 835->2|896->55|935->57|985->72|1053->119|1108->140|1147->158
                    LINES: 30->2|30->2|30->2|32->4|32->4|35->7|35->7
                    -- GENERATED --
                */
            