
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
object exists extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.user.exists.title"))/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
	<h1>"""),_display_(Seq[Any](/*3.7*/Messages("playauthenticate.user.exists.title"))),format.raw/*3.53*/("""</h1>
	<p>"""),_display_(Seq[Any](/*4.6*/Messages("playauthenticate.user.exists.message"))),format.raw/*4.54*/("""</p>
""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/signup/exists.scala.html
                    HASH: 3865d56c53bd22fb0c26d356d92bd3717c019909
                    MATRIX: 844->2|904->54|943->56|984->63|1051->109|1096->120|1165->168
                    LINES: 30->2|30->2|30->2|31->3|31->3|32->4|32->4
                    -- GENERATED --
                */
            