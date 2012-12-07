
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
object signup extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.Html] {

    /**/
    def apply/*1.2*/(signupForm: Form[_]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main(Messages("playauthenticate.signup.title"),"signup")/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
    
  <div class="row">
    <div class="span6">
      <h1>"""),_display_(Seq[Any](/*10.12*/Messages("playauthenticate.signup.title"))),format.raw/*10.53*/("""</h1>
    </div>
  </div>

  <div id="signup" class="row">

    <div class="span3">
        """),format.raw/*17.45*/("""
    	"""),_display_(Seq[Any](/*18.7*/helper/*18.13*/.form(routes.Application.doSignup)/*18.47*/ {_display_(Seq[Any](format.raw/*18.49*/("""
    	
            """),_display_(Seq[Any](/*20.14*/if(signupForm.hasGlobalErrors)/*20.44*/ {_display_(Seq[Any](format.raw/*20.46*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*22.52*/signupForm/*22.62*/.globalError.message)),format.raw/*22.82*/("""</span>
		        </p>
            """)))})),format.raw/*24.14*/("""
            
             """),_display_(Seq[Any](/*26.15*/inputText(
                signupForm("name"),
                '_label -> Messages("playauthenticate.signup.name")
             ))),format.raw/*29.15*/("""
             
             """),_display_(Seq[Any](/*31.15*/_emailPartial(signupForm))),format.raw/*31.40*/("""
             
             """),_display_(Seq[Any](/*33.15*/_passwordPartial(signupForm))),format.raw/*33.43*/("""

            <input type="submit" value=""""),_display_(Seq[Any](/*35.42*/Messages("playauthenticate.signup.now"))),format.raw/*35.81*/("""" class="btn btn-primary">
    	""")))})),format.raw/*36.7*/("""
    </div>

    <div class="span3">
        """),_display_(Seq[Any](/*40.10*/Messages("playauthenticate.signup.oauth"))),format.raw/*40.51*/("""
        """),format.raw/*41.50*/("""
        """),_display_(Seq[Any](/*42.10*/_providerPartial(skipCurrent=false))),format.raw/*42.45*/("""
    </div>

  </div>

""")))})))}
    }
    
    def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) = apply(signupForm)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.Html) = (signupForm) => apply(signupForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/signup.scala.html
                    HASH: 12bdea51443fab37c1a5b2142957c70f657a606f
                    MATRIX: 828->1|976->22|1004->75|1040->77|1104->133|1143->135|1240->196|1303->237|1423->365|1465->372|1480->378|1523->412|1563->414|1619->434|1658->464|1698->466|1821->553|1840->563|1882->583|1950->619|2014->647|2165->776|2230->805|2277->830|2342->859|2392->887|2471->930|2532->969|2596->1002|2678->1048|2741->1089|2778->1139|2824->1149|2881->1184
                    LINES: 29->1|35->1|37->5|38->6|38->6|38->6|42->10|42->10|49->17|50->18|50->18|50->18|50->18|52->20|52->20|52->20|54->22|54->22|54->22|56->24|58->26|61->29|63->31|63->31|65->33|65->33|67->35|67->35|68->36|72->40|72->40|73->41|74->42|74->42
                    -- GENERATED --
                */
            