
package views.txt.account.signup.email

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
object verify_email_de extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""Hey """),_display_(Seq[Any](/*1.76*/name)),format.raw/*1.80*/(""",


Du hast dich kürzlich bei PlayAuthenticate registriert.

Folge diesem Link um dein Konto jetzt zu aktivieren:

"""),_display_(Seq[Any](/*8.2*/verificationUrl)),format.raw/*8.17*/("""

Grüße,
Das PlayAuthenticate-Team"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String) = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Txt) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/signup/email/verify_email_de.scala.txt
                    HASH: 5e17c2637b481b71be2fea547b682e4869ac583c
                    MATRIX: 801->1|946->70|986->75|1011->79|1161->195|1197->210
                    LINES: 27->1|30->1|30->1|30->1|37->8|37->8
                    -- GENERATED --
                */
            