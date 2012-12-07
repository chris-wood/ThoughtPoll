
package views.html.account.signup

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
object password_reset extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[controllers.Signup.PasswordReset],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(resetForm: Form[controllers.Signup.PasswordReset]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.password.reset.title"))/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""

	<h1>"""),_display_(Seq[Any](/*8.7*/Messages("playauthenticate.password.reset.title"))),format.raw/*8.56*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*10.3*/form(routes.Signup.doResetPassword)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
	   
       """),_display_(Seq[Any](/*12.9*/if(resetForm.hasGlobalErrors)/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/(""" 
        <p class="error">
          <span class="label label-important">"""),_display_(Seq[Any](/*14.48*/resetForm/*14.57*/.globalError.message)),format.raw/*14.77*/("""</span>
     	</p>
       """)))})),format.raw/*16.9*/("""
       
        """),_display_(Seq[Any](/*18.10*/input(
   			resetForm("token"),
   			'_label -> "",
   			'_showConstraints -> false
   		
   		)/*23.7*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*23.36*/("""
		    <input type="hidden" value=""""),_display_(Seq[Any](/*24.36*/value)),format.raw/*24.41*/("""" name=""""),_display_(Seq[Any](/*24.50*/name)),format.raw/*24.54*/("""" id=""""),_display_(Seq[Any](/*24.61*/id)),format.raw/*24.63*/("""" """),_display_(Seq[Any](/*24.66*/toHtmlArgs(args))),format.raw/*24.82*/(""">
		""")))})),format.raw/*25.4*/("""
	   
	   """),_display_(Seq[Any](/*27.6*/_passwordPartial(resetForm))),format.raw/*27.33*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*29.32*/Messages("playauthenticate.password.reset.cta"))),format.raw/*29.79*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*30.3*/("""
	</p>
""")))})))}
    }
    
    def render(resetForm:Form[controllers.Signup.PasswordReset]) = apply(resetForm)
    
    def f:((Form[controllers.Signup.PasswordReset]) => play.api.templates.Html) = (resetForm) => apply(resetForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/account/signup/password_reset.scala.html
                    HASH: cb9771bb59e7e3b49ae99cd68370d6d0c7a6b255
                    MATRIX: 811->1|989->52|1017->105|1053->107|1116->162|1155->164|1197->172|1267->221|1315->234|1359->269|1399->271|1448->285|1486->314|1526->316|1637->391|1655->400|1697->420|1755->447|1809->465|1916->564|1983->593|2055->629|2082->634|2127->643|2153->647|2196->654|2220->656|2259->659|2297->675|2333->680|2379->691|2428->718|2508->762|2577->809|2638->839
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|38->8|38->8|40->10|40->10|40->10|42->12|42->12|42->12|44->14|44->14|44->14|46->16|48->18|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|57->27|57->27|59->29|59->29|60->30
                    -- GENERATED --
                */
            