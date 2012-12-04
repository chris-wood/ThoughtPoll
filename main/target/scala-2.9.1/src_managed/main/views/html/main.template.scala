
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
    <script src=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Assets.at("js/poll.js"))),format.raw/*19.49*/("""" type="text/javascript" charset="utf-8"></script>
    <script src=""""),_display_(Seq[Any](/*20.19*/routes/*20.25*/.Assets.at("js/bootstrap.min.js"))),format.raw/*20.58*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*21.19*/routes/*21.25*/.Application.jsRoutes)),format.raw/*21.46*/("""" defer="defer"></script>
	
    <!-- Le styles -->
    <link href=""""),_display_(Seq[Any](/*24.18*/routes/*24.24*/.Assets.at("stylesheets/main.min.css"))),format.raw/*24.62*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*25.18*/routes/*25.24*/.Assets.at("css/main.css"))),format.raw/*25.50*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*26.18*/routes/*26.24*/.Assets.at("css/bootstrap.min.css"))),format.raw/*26.59*/("""" rel="stylesheet">
    

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
          <a class="brand" href=""""),_display_(Seq[Any](/*44.35*/routes/*44.41*/.Application.index())),format.raw/*44.61*/("""">ThoughtPoll</a>
          
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
                
                <!-- If the user is not logged in, show the sign-up page -->
                """),_display_(Seq[Any](/*72.18*/if(!Deadbolt.viewRoleHolderPresent())/*72.55*/ {_display_(Seq[Any](format.raw/*72.57*/("""
			    	      <li class=""""),_display_(Seq[Any](/*73.27*/("active".when(nav == "signup")))),format.raw/*73.59*/(""""><a href=""""),_display_(Seq[Any](/*73.71*/routes/*73.77*/.Application.signup())),format.raw/*73.98*/("""">"""),_display_(Seq[Any](/*73.101*/Messages("playauthenticate.navigation.signup"))),format.raw/*73.147*/("""</a></li>
			          """)))})),format.raw/*74.15*/("""
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
	    """),_display_(Seq[Any](/*82.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*82.54*/ {_display_(Seq[Any](format.raw/*82.56*/("""
	      <div class="alert alert-error">
	      	"""),_display_(Seq[Any](/*84.10*/flash()/*84.17*/.get(Application.FLASH_ERROR_KEY))),format.raw/*84.50*/("""
	      </div>
	    """)))})),format.raw/*86.7*/("""
	    """),_display_(Seq[Any](/*87.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*87.56*/ {_display_(Seq[Any](format.raw/*87.58*/("""
	      <div class="alert alert-success">
	      	"""),_display_(Seq[Any](/*89.10*/flash()/*89.17*/.get(Application.FLASH_MESSAGE_KEY))),format.raw/*89.52*/("""
	      </div>
	    """)))})),format.raw/*91.7*/("""

    <!-- Drop in the content for this page... -->
		"""),_display_(Seq[Any](/*94.4*/content)),format.raw/*94.11*/("""
		
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
                    DATE: Mon Dec 03 23:07:55 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/main.scala.html
                    HASH: 05b339ea76d5624abcf3b1d12978de9ffbda559b
                    MATRIX: 766->1|972->49|1000->133|1065->163|1079->169|1107->176|1166->200|1192->205|1610->587|1625->593|1671->617|1776->686|1791->692|1846->725|1912->755|1927->761|1970->782|2074->850|2089->856|2149->894|2222->931|2237->937|2285->963|2358->1000|2373->1006|2430->1041|3069->1644|3084->1650|3126->1670|3247->1755|3292->1791|3332->1793|3381->1806|3435->1851|3483->1861|3637->1979|3650->1983|3677->1988|3840->2115|3855->2121|3899->2143|3938->2146|4008->2193|4082->2231|4097->2237|4134->2252|4173->2255|4245->2304|4359->2382|4371->2385|4454->2446|4519->2474|4588->2520|4661->2561|4692->2574|4705->2579|4744->2580|4803->2603|4818->2609|4860->2629|4931->2664|4987->2697|5027->2700|5095->2745|5143->2761|5301->2883|5349->2909|5397->2921|5412->2927|5454->2947|5493->2950|5560->2994|5632->3030|5690->3066|5738->3078|5753->3084|5801->3109|5841->3112|5914->3162|6071->3283|6117->3320|6157->3322|6220->3349|6274->3381|6322->3393|6337->3399|6380->3420|6420->3423|6489->3469|6545->3493|6712->3625|6768->3672|6808->3674|6893->3723|6909->3730|6964->3763|7016->3784|7058->3791|7116->3840|7156->3842|7243->3893|7259->3900|7316->3935|7368->3956|7458->4011|7487->4018
                    LINES: 27->1|33->1|35->5|37->7|37->7|37->7|39->9|39->9|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|74->44|74->44|74->44|77->47|77->47|77->47|78->48|78->48|78->48|80->50|80->50|80->50|84->54|84->54|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|87->57|87->57|87->57|87->57|87->57|89->59|90->60|90->60|90->60|91->61|91->61|91->61|91->61|91->61|91->61|91->61|92->62|98->68|98->68|98->68|98->68|98->68|98->68|98->68|99->69|99->69|99->69|99->69|99->69|99->69|99->69|102->72|102->72|102->72|103->73|103->73|103->73|103->73|103->73|103->73|103->73|104->74|112->82|112->82|112->82|114->84|114->84|114->84|116->86|117->87|117->87|117->87|119->89|119->89|119->89|121->91|124->94|124->94
                    -- GENERATED --
                */
            