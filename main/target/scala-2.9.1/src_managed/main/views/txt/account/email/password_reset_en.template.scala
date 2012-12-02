
package views.txt.account.email

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
import views.txt._
/**/
object password_reset_en extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""Howdy """),_display_(Seq[Any](/*1.66*/name)),format.raw/*1.70*/(""",


You or someone else requested a password reset for your account.
If this was not you or your intention, just relax and ignore this email.

If you wish to reset your password, all you need to do is follow this link to reset your password:
"""),_display_(Seq[Any](/*8.2*/url)),format.raw/*8.5*/("""

Cheers,
The PlayAuthenticate Team"""))}
    }
    
    def render(url:String,token:String,name:String,email:String) = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Txt) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/email/password_reset_en.scala.txt
                    HASH: e159737cc9da7c9da9af11714d8883c91dffd4f1
                    MATRIX: 796->1|929->58|971->65|996->69|1273->312|1296->315
                    LINES: 27->1|30->1|30->1|30->1|37->8|37->8
                    -- GENERATED --
                */
            