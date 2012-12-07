
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
    <meta name="description" content="ThoughtPoll - TODO">
    <meta name="author" content="Christopher Wood">
    
    <!-- Le scripts -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
    <script src=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Assets.at("js/bootstrap.min.js"))),format.raw/*19.58*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*20.19*/routes/*20.25*/.Application.jsRoutes)),format.raw/*20.46*/("""" defer="defer"></script>
	
    <!-- Le styles -->
    <link href=""""),_display_(Seq[Any](/*23.18*/routes/*23.24*/.Assets.at("stylesheets/main.min.css"))),format.raw/*23.62*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*24.18*/routes/*24.24*/.Assets.at("css/main.css"))),format.raw/*24.50*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*25.18*/routes/*25.24*/.Assets.at("css/bootstrap.min.css"))),format.raw/*25.59*/("""" rel="stylesheet">
    

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
          <a class="brand" href=""""),_display_(Seq[Any](/*43.35*/routes/*43.41*/.Application.index())),format.raw/*43.61*/("""">ThoughtPoll</a>
          
          <div class="btn-group pull-right">
          """),_display_(Seq[Any](/*46.12*/if(Deadbolt.viewRoleHolderPresent())/*46.48*/ {_display_(Seq[Any](format.raw/*46.50*/("""
          	"""),_display_(Seq[Any](/*47.13*/defining(Application.getLocalUser(session()))/*47.58*/ { user =>_display_(Seq[Any](format.raw/*47.68*/("""
            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              <i class="icon-user"></i> """),_display_(Seq[Any](/*49.42*/user/*49.46*/.name)),format.raw/*49.51*/("""
              <span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),_display_(Seq[Any](/*53.29*/routes/*53.35*/.Application.profile())),format.raw/*53.57*/("""">"""),_display_(Seq[Any](/*53.60*/Messages("playauthenticate.navigation.profile"))),format.raw/*53.107*/("""</a></li>
              <li><a href=""""),_display_(Seq[Any](/*54.29*/routes/*54.35*/.Account.link())),format.raw/*54.50*/("""">"""),_display_(Seq[Any](/*54.53*/Messages("playauthenticate.navigation.link_more"))),format.raw/*54.102*/("""</a></li>
              <li class="divider"></li>
              <li><a href=""""),_display_(Seq[Any](/*56.29*/com/*56.32*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*56.93*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*56.121*/Messages("playauthenticate.navigation.logout"))),format.raw/*56.167*/("""</a></li>
            </ul>
            """)))})),format.raw/*58.14*/("""
          """)))}/*59.13*/else/*59.18*/{_display_(Seq[Any](format.raw/*59.19*/("""
            <a href=""""),_display_(Seq[Any](/*60.23*/routes/*60.29*/.Application.login())),format.raw/*60.49*/("""" class="btn btn-primary btn-mini """),_display_(Seq[Any](/*60.84*/("disabled".when(nav == "login")))),format.raw/*60.117*/("""">"""),_display_(Seq[Any](/*60.120*/Messages("playauthenticate.navigation.login"))),format.raw/*60.165*/("""</a>
          """)))})),format.raw/*61.12*/("""
          </div>

          
          <div class="nav-collapse">
            <ul class="nav">
              <li class=""""),_display_(Seq[Any](/*67.27*/("active".when(nav == "")))),format.raw/*67.53*/(""""><a href=""""),_display_(Seq[Any](/*67.65*/routes/*67.71*/.Application.index())),format.raw/*67.91*/("""">"""),_display_(Seq[Any](/*67.94*/Messages("playauthenticate.navigation.home"))),format.raw/*67.138*/("""</a></li>
              <li class=""""),_display_(Seq[Any](/*68.27*/("active".when(nav == "restricted")))),format.raw/*68.63*/(""""><a href=""""),_display_(Seq[Any](/*68.75*/routes/*68.81*/.Application.restricted())),format.raw/*68.106*/("""">"""),_display_(Seq[Any](/*68.109*/Messages("playauthenticate.navigation.restricted"))),format.raw/*68.159*/("""</a></li>
                
                <!-- If the user is not logged in, show the sign-up page -->
                """),_display_(Seq[Any](/*71.18*/if(!Deadbolt.viewRoleHolderPresent())/*71.55*/ {_display_(Seq[Any](format.raw/*71.57*/("""
			    	      <li class=""""),_display_(Seq[Any](/*72.27*/("active".when(nav == "signup")))),format.raw/*72.59*/(""""><a href=""""),_display_(Seq[Any](/*72.71*/routes/*72.77*/.Application.signup())),format.raw/*72.98*/("""">"""),_display_(Seq[Any](/*72.101*/Messages("playauthenticate.navigation.signup"))),format.raw/*72.147*/("""</a></li>
			          """)))})),format.raw/*73.15*/("""
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

    <!-- Drop in the content for this page... -->
		"""),_display_(Seq[Any](/*93.4*/content)),format.raw/*93.11*/("""
		
    <hr>

      <footer>
        <p>&copy; 2012 ThoughtPoll</p>
      </footer>
    </div> <!-- /container -->

    <!-- More of le scripts -->
    <script src=""""),_display_(Seq[Any](/*103.19*/routes/*103.25*/.Assets.at("js/poll.js"))),format.raw/*103.49*/("""" type="text/javascript" charset="utf-8"></script>

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
                    DATE: Thu Dec 06 00:13:39 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/main.scala.html
                    HASH: 051f597bdaeb78bcb4074e4120b222ae11ec236e
                    MATRIX: 766->1|972->49|1000->133|1065->163|1079->169|1107->176|1166->200|1192->205|1610->587|1625->593|1680->626|1746->656|1761->662|1804->683|1908->751|1923->757|1983->795|2056->832|2071->838|2119->864|2192->901|2207->907|2264->942|2903->1545|2918->1551|2960->1571|3081->1656|3126->1692|3166->1694|3215->1707|3269->1752|3317->1762|3471->1880|3484->1884|3511->1889|3674->2016|3689->2022|3733->2044|3772->2047|3842->2094|3916->2132|3931->2138|3968->2153|4007->2156|4079->2205|4193->2283|4205->2286|4288->2347|4353->2375|4422->2421|4495->2462|4526->2475|4539->2480|4578->2481|4637->2504|4652->2510|4694->2530|4765->2565|4821->2598|4861->2601|4929->2646|4977->2662|5135->2784|5183->2810|5231->2822|5246->2828|5288->2848|5327->2851|5394->2895|5466->2931|5524->2967|5572->2979|5587->2985|5635->3010|5675->3013|5748->3063|5905->3184|5951->3221|5991->3223|6054->3250|6108->3282|6156->3294|6171->3300|6214->3321|6254->3324|6323->3370|6379->3394|6546->3526|6602->3573|6642->3575|6727->3624|6743->3631|6798->3664|6850->3685|6892->3692|6950->3741|6990->3743|7077->3794|7093->3801|7150->3836|7202->3857|7292->3912|7321->3919|7524->4085|7540->4091|7587->4115
                    LINES: 27->1|33->1|35->5|37->7|37->7|37->7|39->9|39->9|49->19|49->19|49->19|50->20|50->20|50->20|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|73->43|73->43|73->43|76->46|76->46|76->46|77->47|77->47|77->47|79->49|79->49|79->49|83->53|83->53|83->53|83->53|83->53|84->54|84->54|84->54|84->54|84->54|86->56|86->56|86->56|86->56|86->56|88->58|89->59|89->59|89->59|90->60|90->60|90->60|90->60|90->60|90->60|90->60|91->61|97->67|97->67|97->67|97->67|97->67|97->67|97->67|98->68|98->68|98->68|98->68|98->68|98->68|98->68|101->71|101->71|101->71|102->72|102->72|102->72|102->72|102->72|102->72|102->72|103->73|111->81|111->81|111->81|113->83|113->83|113->83|115->85|116->86|116->86|116->86|118->88|118->88|118->88|120->90|123->93|123->93|133->103|133->103|133->103
                    -- GENERATED --
                */
            