
package views.html.account.email

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
	um deine E-Mail-Adresse zu bestätigen, <a href=""""),_display_(Seq[Any](/*6.51*/verificationUrl)),format.raw/*6.66*/("""">folge einfach diesem Link</a>.
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
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/email/verify_email_de.scala.html
                    HASH: e9b1df917815d806d220b90ea191ce27b6a0e512
                    MATRIX: 800->1|946->70|986->76|1011->80|1116->150|1152->165
                    LINES: 27->1|30->1|31->2|31->2|35->6|35->6
                    -- GENERATED --
                */
            