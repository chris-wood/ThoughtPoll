
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
object password_reset_de extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""Hey """),_display_(Seq[Any](/*1.64*/name)),format.raw/*1.68*/(""",


du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.
Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.

Falls du dein Passwort zurücksetzen möchtest, musst du nur diesem Link folgen:

"""),_display_(Seq[Any](/*9.2*/url)),format.raw/*9.5*/("""

Grüße,
Das PlayAuthenticate-Team"""))}
    }
    
    def render(url:String,token:String,name:String,email:String) = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Txt) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/email/password_reset_de.scala.txt
                    HASH: 5613ede5b9681d88c174bd598af9daddd243501d
                    MATRIX: 796->1|929->58|969->63|994->67|1295->334|1318->337
                    LINES: 27->1|30->1|30->1|30->1|38->9|38->9
                    -- GENERATED --
                */
            