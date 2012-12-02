
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
object _providerIcon extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(providerKey: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<img alt=""""),_display_(Seq[Any](/*2.12*/providerKey)),format.raw/*2.23*/(""" icon" title=""""),_display_(Seq[Any](/*2.38*/providerKey)),format.raw/*2.49*/("""" src=""""),_display_(Seq[Any](/*2.57*/routes/*2.63*/.Assets.at("icons/"+providerKey+"-24x24.png"))),format.raw/*2.108*/("""">"""))}
    }
    
    def render(providerKey:String) = apply(providerKey)
    
    def f:((String) => play.api.templates.Html) = (providerKey) => apply(providerKey)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:33 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/_providerIcon.scala.html
                    HASH: 23a89b27d3146af6ef6e03ed817da972c8824a30
                    MATRIX: 763->1|861->22|908->34|940->45|990->60|1022->71|1065->79|1079->85|1146->130
                    LINES: 27->1|30->1|31->2|31->2|31->2|31->2|31->2|31->2|31->2
                    -- GENERATED --
                */
            