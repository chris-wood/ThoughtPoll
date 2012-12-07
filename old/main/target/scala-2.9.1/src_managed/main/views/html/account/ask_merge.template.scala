
package views.html.account

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
object ask_merge extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(acceptForm: Form[Account.Accept], aUser: com.feth.play.module.pa.user.AuthUser, bUser: com.feth.play.module.pa.user.AuthUser):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/label/*6.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(Seq[Any](/*7.3*/Messages("playauthenticate.merge.accounts.question",aUser,bUser))),format.raw/*7.67*/("""
""")))};
Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(Messages("playauthenticate.merge.accounts.title"))/*10.57*/ {_display_(Seq[Any](format.raw/*10.59*/("""

	<h1>"""),_display_(Seq[Any](/*12.7*/Messages("playauthenticate.merge.accounts.title"))),format.raw/*12.56*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*14.3*/form(routes.Account.doMerge)/*14.31*/ {_display_(Seq[Any](format.raw/*14.33*/("""

            """),_display_(Seq[Any](/*16.14*/if(acceptForm.hasGlobalErrors)/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*18.52*/acceptForm/*18.62*/.globalError.message)),format.raw/*18.82*/("""</span>
		        </p>
            """)))})),format.raw/*20.14*/("""
	   
	   """),_display_(Seq[Any](/*22.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.merge.accounts.true"),
            	"false"->Messages("playauthenticate.merge.accounts.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        ))),format.raw/*30.10*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*32.32*/Messages("playauthenticate.merge.accounts.ok"))),format.raw/*32.78*/("""" class="btn btn-primary">
	""")))})),format.raw/*33.3*/("""
	</p>
""")))})))}
    }
    
    def render(acceptForm:Form[Account.Accept],aUser:com.feth.play.module.pa.user.AuthUser,bUser:com.feth.play.module.pa.user.AuthUser) = apply(acceptForm,aUser,bUser)
    
    def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser) => play.api.templates.Html) = (acceptForm,aUser,bUser) => apply(acceptForm,aUser,bUser)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/ask_merge.scala.html
                    HASH: eb8f199459553e147c9556375c337bafa5642304
                    MATRIX: 857->1|1093->182|1105->187|1172->191|1209->194|1294->258|1336->127|1364->180|1391->260|1429->263|1493->318|1533->320|1576->328|1647->377|1695->390|1732->418|1772->420|1823->435|1862->465|1902->467|2025->554|2044->564|2086->584|2154->620|2200->631|2537->946|2617->990|2685->1036|2745->1065
                    LINES: 27->1|32->6|32->6|34->6|35->7|35->7|37->1|39->5|40->8|42->10|42->10|42->10|44->12|44->12|46->14|46->14|46->14|48->16|48->16|48->16|50->18|50->18|50->18|52->20|54->22|62->30|64->32|64->32|65->33
                    -- GENERATED --
                */
            