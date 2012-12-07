
package views.html.account.signup.email

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
object verify_email_de extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""
Hey """),_display_(Seq[Any](/*2.6*/name)),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Du hast dich kürzlich bei PlayAuthenticate registriert.<br />
	<br />
	Folge diesem Link um dein Konto <a href=""""),_display_(Seq[Any](/*8.44*/verificationUrl)),format.raw/*8.59*/("""">jetzt zu aktivieren</a>.
</p>
<br />
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String) = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Html) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/signup/email/verify_email_de.scala.html
                    HASH: 8db2121c8220ae1a8f8f93b6b5b03a7d3e39359d
                    MATRIX: 807->1|953->70|993->76|1018->80|1187->214|1223->229
                    LINES: 27->1|30->1|31->2|31->2|37->8|37->8
                    -- GENERATED --
                */
            