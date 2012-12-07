
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
object verify_email_de extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""Hey """),_display_(Seq[Any](/*1.76*/name)),format.raw/*1.80*/(""", 


um deine E-Mail-Adresse zu bestätigen, folge einfach diesem Link:

"""),_display_(Seq[Any](/*6.2*/verificationUrl)),format.raw/*6.17*/("""

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
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/email/verify_email_de.scala.txt
                    HASH: de4d8bd225df21c2feff9eacb758a27c244a2547
                    MATRIX: 794->1|939->70|979->75|1004->79|1111->152|1147->167
                    LINES: 27->1|30->1|30->1|30->1|35->6|35->6
                    -- GENERATED --
                */
            