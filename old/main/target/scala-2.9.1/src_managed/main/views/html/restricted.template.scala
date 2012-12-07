
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
object restricted extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main(Messages("playauthenticate.navigation.restricted"), "restricted")/*3.72*/ {_display_(Seq[Any](format.raw/*3.74*/("""
    
    <h1>"""),_display_(Seq[Any](/*5.10*/Messages("playauthenticate.navigation.restricted"))),format.raw/*5.60*/("""</h1>
    <p>
        """),_display_(Seq[Any](/*7.10*/Messages("playauthenticate.restricted.secrets"))),format.raw/*7.57*/("""
    </p>
""")))})))}
    }
    
    def render(localUser:models.User) = apply(localUser)
    
    def f:((models.User) => play.api.templates.Html) = (localUser) => apply(localUser)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/restricted.scala.html
                    HASH: f78b73c12f487bf3d5e6932bd4e9e1d3bf05a25f
                    MATRIX: 765->1|873->32|910->35|988->105|1027->107|1077->122|1148->172|1206->195|1274->242
                    LINES: 27->1|30->1|32->3|32->3|32->3|34->5|34->5|36->7|36->7
                    -- GENERATED --
                */
            