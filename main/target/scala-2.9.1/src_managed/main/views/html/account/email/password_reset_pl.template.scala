
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
object password_reset_pl extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""
Cześć """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Poproszono o zmianę hasła dla Twojego konta.<br />
    Jeśli to nie Ty, zrelaksuj się i zignoruj tę wiadomość.<br />
</p>
<p>
    Jeśli jednak naprawdę chcesz zmienić hasło <a href=""""),_display_(Seq[Any](/*10.58*/url)),format.raw/*10.61*/("""">skorzystaj z tego linku aby to zrobić</a>.
</p>
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))}
    }
    
    def render(url:String,token:String,name:String,email:String) = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Html) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/email/password_reset_pl.scala.html
                    HASH: 062c7b2891a9b993a3514aa52d98bd0d59252ee5
                    MATRIX: 802->1|936->58|978->66|1003->70|1246->277|1271->280
                    LINES: 27->1|30->1|31->2|31->2|39->10|39->10
                    -- GENERATED --
                */
            