
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
object verify_email_pl extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""Cześć """),_display_(Seq[Any](/*1.78*/name)),format.raw/*1.82*/(""",


Twoje konto w PlayAuthenticate zostało utworzone.

Aby je aktywować, użyj ten link
"""),_display_(Seq[Any](/*7.2*/verificationUrl)),format.raw/*7.17*/("""

Pozdrawiamy,
Ekipa PlayAuthenticate"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String) = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Txt) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/signup/email/verify_email_pl.scala.txt
                    HASH: a040bcb9ffdc1f67fd724347607740ca18cfa03b
                    MATRIX: 801->1|946->70|988->77|1013->81|1135->169|1171->184
                    LINES: 27->1|30->1|30->1|30->1|36->7|36->7
                    -- GENERATED --
                */
            