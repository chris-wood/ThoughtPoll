
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.api.templates.Html = {
        _display_ {import be.objectify.deadbolt.views.html._

import be.objectify.deadbolt.Deadbolt


Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
<!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*7.14*/lang()/*7.20*/.code())),format.raw/*7.27*/("""">
  <head>
    <title>"""),_display_(Seq[Any](/*9.13*/title)),format.raw/*9.18*/("""</title>
    
    <!-- Le meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
    <meta name="author" content="The Play Authenticate Team">
    
    <!-- Le scripts -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src=""""),_display_(Seq[Any](/*19.16*/routes/*19.22*/.Assets.at("js/bootstrap.min.js"))),format.raw/*19.55*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*20.16*/routes/*20.22*/.Application.jsRoutes)),format.raw/*20.43*/("""" defer="defer"></script>
	
    <!-- Le styles -->
    <link href=""""),_display_(Seq[Any](/*23.18*/routes/*23.24*/.Assets.at("stylesheets/main.min.css"))),format.raw/*23.62*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*24.18*/routes/*24.24*/.Assets.at("css/bootstrap.min.css"))),format.raw/*24.59*/("""" rel="stylesheet">
    

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href=""""),_display_(Seq[Any](/*44.35*/routes/*44.41*/.Application.index())),format.raw/*44.61*/("""">Play! Authenticate</a>
          
          <div class="btn-group pull-right">
          """),_display_(Seq[Any](/*47.12*/if(Deadbolt.viewRoleHolderPresent())/*47.48*/ {_display_(Seq[Any](format.raw/*47.50*/("""
          	"""),_display_(Seq[Any](/*48.13*/defining(Application.getLocalUser(session()))/*48.58*/ { user =>_display_(Seq[Any](format.raw/*48.68*/("""
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              <i class="icon-user"></i> """),_display_(Seq[Any](/*50.42*/user/*50.46*/.name)),format.raw/*50.51*/("""
              <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),_display_(Seq[Any](/*54.29*/routes/*54.35*/.Application.profile())),format.raw/*54.57*/("""">"""),_display_(Seq[Any](/*54.60*/Messages("playauthenticate.navigation.profile"))),format.raw/*54.107*/("""</a></li>
              <li><a href=""""),_display_(Seq[Any](/*55.29*/routes/*55.35*/.Account.link())),format.raw/*55.50*/("""">"""),_display_(Seq[Any](/*55.53*/Messages("playauthenticate.navigation.link_more"))),format.raw/*55.102*/("""</a></li>
              <li class="divider"></li>
              <li><a href=""""),_display_(Seq[Any](/*57.29*/com/*57.32*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*57.93*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*57.121*/Messages("playauthenticate.navigation.logout"))),format.raw/*57.167*/("""</a></li>
            </ul>
            """)))})),format.raw/*59.14*/("""
          """)))}/*60.13*/else/*60.18*/{_display_(Seq[Any](format.raw/*60.19*/("""
            <a href=""""),_display_(Seq[Any](/*61.23*/routes/*61.29*/.Application.login())),format.raw/*61.49*/("""" class="btn btn-primary btn-mini """),_display_(Seq[Any](/*61.84*/("disabled".when(nav == "login")))),format.raw/*61.117*/("""">"""),_display_(Seq[Any](/*61.120*/Messages("playauthenticate.navigation.login"))),format.raw/*61.165*/("""</a>
          """)))})),format.raw/*62.12*/("""
          </div>

          
          <div class="nav-collapse">
            <ul class="nav">
              <li class=""""),_display_(Seq[Any](/*68.27*/("active".when(nav == "")))),format.raw/*68.53*/(""""><a href=""""),_display_(Seq[Any](/*68.65*/routes/*68.71*/.Application.index())),format.raw/*68.91*/("""">"""),_display_(Seq[Any](/*68.94*/Messages("playauthenticate.navigation.home"))),format.raw/*68.138*/("""</a></li>
              <li class=""""),_display_(Seq[Any](/*69.27*/("active".when(nav == "restricted")))),format.raw/*69.63*/(""""><a href=""""),_display_(Seq[Any](/*69.75*/routes/*69.81*/.Application.restricted())),format.raw/*69.106*/("""">"""),_display_(Seq[Any](/*69.109*/Messages("playauthenticate.navigation.restricted"))),format.raw/*69.159*/("""</a></li>
                
                """),_display_(Seq[Any](/*71.18*/if(!Deadbolt.viewRoleHolderPresent())/*71.55*/ {_display_(Seq[Any](format.raw/*71.57*/("""
			    	<li class=""""),_display_(Seq[Any](/*72.21*/("active".when(nav == "signup")))),format.raw/*72.53*/(""""><a href=""""),_display_(Seq[Any](/*72.65*/routes/*72.71*/.Application.signup())),format.raw/*72.92*/("""">"""),_display_(Seq[Any](/*72.95*/Messages("playauthenticate.navigation.signup"))),format.raw/*72.141*/("""</a></li>
			    """)))})),format.raw/*73.9*/("""
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
	    """),_display_(Seq[Any](/*81.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*81.54*/ {_display_(Seq[Any](format.raw/*81.56*/("""
	      <div class="alert alert-error">
	      	"""),_display_(Seq[Any](/*83.10*/flash()/*83.17*/.get(Application.FLASH_ERROR_KEY))),format.raw/*83.50*/("""
	      </div>
	    """)))})),format.raw/*85.7*/("""
	    """),_display_(Seq[Any](/*86.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*86.56*/ {_display_(Seq[Any](format.raw/*86.58*/("""
	      <div class="alert alert-success">
	      	"""),_display_(Seq[Any](/*88.10*/flash()/*88.17*/.get(Application.FLASH_MESSAGE_KEY))),format.raw/*88.52*/("""
	      </div>
	    """)))})),format.raw/*90.7*/("""
		"""),_display_(Seq[Any](/*91.4*/content)),format.raw/*91.11*/("""
		
    <hr>

      <footer>
        <p>&copy; 2012 ThoughtPoll</p>
      </footer>
    </div> <!-- /container -->

  </body>
</html>
"""))}
    }
    
    def render(title:String,nav:String,content:Html) = apply(title,nav)(content)
    
    def f:((String,String) => (Html) => play.api.templates.Html) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:35:17 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/main.scala.html
                    HASH: 852f231f132aefe074bfa54b9b701e6f32e03d7c
                    MATRIX: 766->1|972->49|1000->133|1065->163|1079->169|1107->176|1166->200|1192->205|1668->645|1683->651|1738->684|1801->711|1816->717|1859->738|1963->806|1978->812|2038->850|2111->887|2126->893|2183->928|2824->1533|2839->1539|2881->1559|3009->1651|3054->1687|3094->1689|3143->1702|3197->1747|3245->1757|3399->1875|3412->1879|3439->1884|3602->2011|3617->2017|3661->2039|3700->2042|3770->2089|3844->2127|3859->2133|3896->2148|3935->2151|4007->2200|4121->2278|4133->2281|4216->2342|4281->2370|4350->2416|4423->2457|4454->2470|4467->2475|4506->2476|4565->2499|4580->2505|4622->2525|4693->2560|4749->2593|4789->2596|4857->2641|4905->2657|5063->2779|5111->2805|5159->2817|5174->2823|5216->2843|5255->2846|5322->2890|5394->2926|5452->2962|5500->2974|5515->2980|5563->3005|5603->3008|5676->3058|5756->3102|5802->3139|5842->3141|5899->3162|5953->3194|6001->3206|6016->3212|6059->3233|6098->3236|6167->3282|6216->3300|6383->3432|6439->3479|6479->3481|6564->3530|6580->3537|6635->3570|6687->3591|6729->3598|6787->3647|6827->3649|6914->3700|6930->3707|6987->3742|7039->3763|7078->3767|7107->3774
                    LINES: 27->1|33->1|35->5|37->7|37->7|37->7|39->9|39->9|49->19|49->19|49->19|50->20|50->20|50->20|53->23|53->23|53->23|54->24|54->24|54->24|74->44|74->44|74->44|77->47|77->47|77->47|78->48|78->48|78->48|80->50|80->50|80->50|84->54|84->54|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|87->57|87->57|87->57|87->57|87->57|89->59|90->60|90->60|90->60|91->61|91->61|91->61|91->61|91->61|91->61|91->61|92->62|98->68|98->68|98->68|98->68|98->68|98->68|98->68|99->69|99->69|99->69|99->69|99->69|99->69|99->69|101->71|101->71|101->71|102->72|102->72|102->72|102->72|102->72|102->72|102->72|103->73|111->81|111->81|111->81|113->83|113->83|113->83|115->85|116->86|116->86|116->86|118->88|118->88|118->88|120->90|121->91|121->91
                    -- GENERATED --
                */
            