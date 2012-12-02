
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
object verify_email_en extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""
Howdy """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
	To verify your e-mail address, <a href=""""),_display_(Seq[Any](/*6.43*/verificationUrl)),format.raw/*6.58*/("""">now follow this link</a>.
</p>
<br />
<p>
	Cheers,<br /> 
	<i>The PlayAuthenticate Team</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String) = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Html) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/email/verify_email_en.scala.html
                    HASH: 8af21a82ac3eeda102c92e00a9a5584ee44345be
                    MATRIX: 800->1|946->70|988->78|1013->82|1110->144|1146->159
                    LINES: 27->1|30->1|31->2|31->2|35->6|35->6
                    -- GENERATED --
                */
            