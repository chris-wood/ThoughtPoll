
package views.html

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
object profile extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.Html = {
        _display_ {import com.feth.play.module.pa.views.html._


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Messages("playauthenticate.profile.title"),"profile")/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/Messages("playauthenticate.profile.title"))),format.raw/*7.52*/("""</h1>
    <p>
    Your name is """),_display_(Seq[Any](/*9.19*/localUser/*9.28*/.name)),format.raw/*9.33*/(""" and your email address is """),_display_(Seq[Any](/*9.61*/localUser/*9.70*/.email)),format.raw/*9.76*/("""!
    <i>
    """),_display_(Seq[Any](/*11.6*/if(!localUser.emailValidated)/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
      (<a href=""""),_display_(Seq[Any](/*12.18*/routes/*12.24*/.Account.verifyEmail)),format.raw/*12.44*/("""">unverified - click to verify</a>)
    """)))}/*13.7*/else/*13.12*/{_display_(Seq[Any](format.raw/*13.13*/("""
      (verified)
    """)))})),format.raw/*15.6*/("""</i>
    <br/>
    """),_display_(Seq[Any](/*17.6*/defining(localUser.getProviders())/*17.40*/ { providers =>_display_(Seq[Any](format.raw/*17.55*/("""
        """),_display_(Seq[Any](/*18.10*/if(providers.size() > 0)/*18.34*/ {_display_(Seq[Any](format.raw/*18.36*/("""
        """),_display_(Seq[Any](/*19.10*/if(providers.size() ==1)/*19.34*/ {_display_(Seq[Any](format.raw/*19.36*/("""
            """),_display_(Seq[Any](/*20.14*/Messages("playauthenticate.profile.providers_one"))),format.raw/*20.64*/("""
        """)))}/*21.11*/else/*21.16*/{_display_(Seq[Any](format.raw/*21.17*/("""
            """),_display_(Seq[Any](/*22.14*/Messages("playauthenticate.profile.providers_many",providers.size().toString()))),format.raw/*22.93*/("""
        """)))})),format.raw/*23.10*/("""
        """),_display_(Seq[Any](/*24.10*/for(p <- providers) yield /*24.29*/ {_display_(Seq[Any](format.raw/*24.31*/("""
            """),_display_(Seq[Any](/*25.14*/_providerIcon(p))),format.raw/*25.30*/("""
        """)))})),format.raw/*26.10*/("""
        <br/>
        """)))})),format.raw/*28.10*/("""
    """)))})),format.raw/*29.6*/("""
    
    <br/>
    """),_display_(Seq[Any](/*32.6*/currentAuth()/*32.19*/ { auth =>_display_(Seq[Any](format.raw/*32.29*/("""
        """),_display_(Seq[Any](/*33.10*/Messages("playauthenticate.profile.logged"))),format.raw/*33.53*/(""" """),_display_(Seq[Any](/*33.55*/_providerIcon(auth.getProvider()))),format.raw/*33.88*/("""<br/>
        """),_display_(Seq[Any](/*34.10*/if(auth.expires() == -1)/*34.34*/{_display_(Seq[Any](format.raw/*34.35*/("""
            """),_display_(Seq[Any](/*35.14*/Messages("playauthenticate.profile.session", auth.getId(), Application.formatTimestamp(auth.expires())))),format.raw/*35.117*/("""
        """)))}/*36.11*/else/*36.16*/{_display_(Seq[Any](format.raw/*36.17*/("""
            """),_display_(Seq[Any](/*37.14*/Messages("playauthenticate.profile.session_endless", auth.getId()))),format.raw/*37.80*/("""
        """)))})),format.raw/*38.10*/("""
    """)))})),format.raw/*39.6*/("""
    <br/>
    <ul>
    	<li><a href=""""),_display_(Seq[Any](/*42.20*/routes/*42.26*/.Account.changePassword)),format.raw/*42.49*/("""">"""),_display_(Seq[Any](/*42.52*/Messages("playauthenticate.profile.password_change"))),format.raw/*42.104*/("""</a></li>
    </ul>
    </p>
""")))})))}
    }
    
    def render(localUser:models.User) = apply(localUser)
    
    def f:((models.User) => play.api.templates.Html) = (localUser) => apply(localUser)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/profile.scala.html
                    HASH: bb18bb6533a1b025f131d94b053d559553cbdfb1
                    MATRIX: 762->1|914->32|942->79|978->81|1044->139|1083->141|1133->156|1196->198|1263->230|1280->239|1306->244|1369->272|1386->281|1413->287|1463->302|1501->331|1541->333|1595->351|1610->357|1652->377|1711->419|1724->424|1763->425|1817->448|1872->468|1915->502|1968->517|2014->527|2047->551|2087->553|2133->563|2166->587|2206->589|2256->603|2328->653|2357->664|2370->669|2409->670|2459->684|2560->763|2602->773|2648->783|2683->802|2723->804|2773->818|2811->834|2853->844|2909->868|2946->874|3002->895|3024->908|3072->918|3118->928|3183->971|3221->973|3276->1006|3327->1021|3360->1045|3399->1046|3449->1060|3575->1163|3604->1174|3617->1179|3656->1180|3706->1194|3794->1260|3836->1270|3873->1276|3948->1315|3963->1321|4008->1344|4047->1347|4122->1399
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|38->9|38->9|38->9|38->9|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|44->15|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|50->21|50->21|50->21|51->22|51->22|52->23|53->24|53->24|53->24|54->25|54->25|55->26|57->28|58->29|61->32|61->32|61->32|62->33|62->33|62->33|62->33|63->34|63->34|63->34|64->35|64->35|65->36|65->36|65->36|66->37|66->37|67->38|68->39|71->42|71->42|71->42|71->42|71->42
                    -- GENERATED --
                */
            