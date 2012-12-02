
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
object ask_link extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(acceptForm: Form[Account.Accept], newAccount: com.feth.play.module.pa.user.AuthUser):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/label/*6.7*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(Seq[Any](/*7.3*/_providerIcon(newAccount.getProvider()))),format.raw/*7.42*/(""" """),_display_(Seq[Any](/*7.44*/Messages("playauthenticate.link.account.question",newAccount))),format.raw/*7.105*/("""
""")))};
Seq[Any](format.raw/*1.87*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(Messages("playauthenticate.link.account.title"))/*10.55*/ {_display_(Seq[Any](format.raw/*10.57*/("""

	<h1>"""),_display_(Seq[Any](/*12.7*/Messages("playauthenticate.link.account.title"))),format.raw/*12.54*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*14.3*/form(routes.Account.doLink)/*14.30*/ {_display_(Seq[Any](format.raw/*14.32*/("""
	   
            """),_display_(Seq[Any](/*16.14*/if(acceptForm.hasGlobalErrors)/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*18.52*/acceptForm/*18.62*/.globalError.message)),format.raw/*18.82*/("""</span>
		        </p>
            """)))})),format.raw/*20.14*/("""
	   
	   """),_display_(Seq[Any](/*22.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.link.account.true"),
            	"false"->Messages("playauthenticate.link.account.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        ))),format.raw/*30.10*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*32.32*/Messages("playauthenticate.link.account.ok"))),format.raw/*32.76*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*33.3*/("""
	</p>
""")))})))}
    }
    
    def render(acceptForm:Form[Account.Accept],newAccount:com.feth.play.module.pa.user.AuthUser) = apply(acceptForm,newAccount)
    
    def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser) => play.api.templates.Html) = (acceptForm,newAccount) => apply(acceptForm,newAccount)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/ask_link.scala.html
                    HASH: 0629f73949947590beba52b2cac3fa87ea3aedcf
                    MATRIX: 818->1|1013->141|1025->146|1092->150|1129->153|1189->192|1226->194|1309->255|1350->86|1378->139|1405->257|1443->260|1505->313|1545->315|1588->323|1657->370|1705->383|1741->410|1781->412|1836->431|1875->461|1915->463|2038->550|2057->560|2099->580|2167->616|2213->627|2546->938|2626->982|2692->1026|2753->1056
                    LINES: 27->1|32->6|32->6|34->6|35->7|35->7|35->7|35->7|37->1|39->5|40->8|42->10|42->10|42->10|44->12|44->12|46->14|46->14|46->14|48->16|48->16|48->16|50->18|50->18|50->18|52->20|54->22|62->30|64->32|64->32|65->33
                    -- GENERATED --
                */
            