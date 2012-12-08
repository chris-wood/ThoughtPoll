
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[scala.Tuple2[String, String]],Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.54*/("""

<html>
    <head>
        <title>ThoughtPoll</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.TPController.index)),format.raw/*12.48*/("""" id="logo"><span>Thought</span>Poll</a>
        </header>
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.authenticate)/*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
            
            <h1>Sign in</h1>
            
            """),_display_(Seq[Any](/*19.14*/form/*19.18*/.globalError.map/*19.34*/ { error =>_display_(Seq[Any](format.raw/*19.45*/("""
                <p class="error">
                    """),_display_(Seq[Any](/*21.22*/error/*21.27*/.message)),format.raw/*21.35*/("""
                </p>
            """)))})),format.raw/*23.14*/("""
            
            """),_display_(Seq[Any](/*25.14*/flash/*25.19*/.get("success").map/*25.38*/ { message =>_display_(Seq[Any](format.raw/*25.51*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*27.22*/message)),format.raw/*27.29*/("""
                </p>
            """)))})),format.raw/*29.14*/("""
            
            <p>
                <input type="email" name="email" placeholder="Email" id="email" value=""""),_display_(Seq[Any](/*32.89*/form("email")/*32.102*/.value)),format.raw/*32.108*/("""">
            </p>
            <p>
                <input type="password" name="password" id="password" placeholder="Password">
            </p>
            <p>
                <button type="submit" id="loginbutton">Login</button>
            </p>
            
        """)))})),format.raw/*41.10*/("""
        
        <p class="note">
            Try <em>root</em> with <em>toor</em> as password.
        </p>
            
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[scala.Tuple2[String, String]],flash:Flash) = apply(form)(flash)
    
    def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.api.templates.Html) = (form) => (flash) => apply(form)(flash)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 07 19:37:04 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/app/views/login.scala.html
                    HASH: 673196ee105e71992e6d7624b7613d3fb999b37b
                    MATRIX: 539->1|668->53|816->166|830->172|883->204|990->276|1004->282|1061->317|1171->391|1186->397|1227->416|1340->493|1355->499|1402->537|1442->539|1547->608|1560->612|1585->628|1634->639|1726->695|1740->700|1770->708|1837->743|1900->770|1914->775|1942->794|1993->807|2087->865|2116->872|2183->907|2337->1025|2360->1038|2389->1044|2692->1315
                    LINES: 19->1|22->1|27->6|27->6|27->6|28->7|28->7|28->7|33->12|33->12|33->12|36->15|36->15|36->15|36->15|40->19|40->19|40->19|40->19|42->21|42->21|42->21|44->23|46->25|46->25|46->25|46->25|48->27|48->27|50->29|53->32|53->32|53->32|62->41
                    -- GENERATED --
                */
            