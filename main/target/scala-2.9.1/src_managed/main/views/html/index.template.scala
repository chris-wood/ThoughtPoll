
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*2.1*/("""<!-- Messages are provided in the conf/messages.en file -->
"""),_display_(Seq[Any](/*3.2*/main(Messages("playauthenticate.index.title"))/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
      <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>"""),_display_(Seq[Any](/*6.14*/Messages("playauthenticate.index.intro"))),format.raw/*6.54*/("""</h1>
        <p>"""),_display_(Seq[Any](/*7.13*/Messages("playauthenticate.index.intro_2"))),format.raw/*7.55*/(""" <br/>"""),_display_(Seq[Any](/*7.62*/Messages("playauthenticate.index.intro_3"))),format.raw/*7.104*/("""</p>

        <!-- The main poll information -->
        <div id="left">
          <div id="poll-container">
            <h3>Poll</h3>
            <form id='poll' action="post" accept-charset="utf-8">
              <p>Pick your favorite Javascript framework:</p><p>
              <input type="radio" name="poll" value="opt1" id="opt1" /><label for='opt1'>&nbsp;jQuery</label><br />
              <input type="radio" name="poll" value="opt2" id="opt2" /><label for='opt2'>&nbsp;Ext JS</label><br />
              <input type="radio" name="poll" value="opt3" id="opt3" /><label for='opt3'>&nbsp;Dojo</label><br />
              <input type="radio" name="poll" value="opt4" id="opt4" /><label for='opt4'>&nbsp;Prototype</label><br />
              <input type="radio" name="poll" value="opt5" id="opt5" /><label for='opt5'>&nbsp;YUI</label><br />
              <input type="radio" name="poll" value="opt6" id="opt6" /><label for='opt6'>&nbsp;mootools</label><br /><br />
              <input type="submit" value="Vote &rarr;" /></p>
            </form>
          </div>
          <div id="results">
            <h3>Results</h3>
          </div>
        </div>

        <div id="test">
          <a href="/create_poll">create_poll</a>
        </div>

      </div>

      <!-- Example row of columns -->
      <!--
      <div class="row">
        <div class="span4">
          <h2>"""),_display_(Seq[Any](/*39.16*/Messages("playauthenticate.index.heading"))),format.raw/*39.58*/("""</h2>
           <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*41.39*/Messages("playauthenticate.index.details"))),format.raw/*41.81*/(""" &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Heading</h2>
           <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*46.39*/Messages("playauthenticate.index.details"))),format.raw/*46.81*/(""" &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Heading</h2>
          <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*51.39*/Messages("playauthenticate.index.details"))),format.raw/*51.81*/(""" &raquo;</a></p>
        </div>
      </div>
      -->
    """)))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 03 23:07:55 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/index.scala.html
                    HASH: 8dfcd7e36cba24936603b3f3cdeca3643b47a500
                    MATRIX: 819->1|914->62|968->108|1007->110|1166->234|1227->274|1280->292|1343->334|1385->341|1449->383|2862->1760|2926->1802|3231->2071|3295->2113|3636->2418|3700->2460|4047->2771|4111->2813
                    LINES: 30->2|31->3|31->3|31->3|34->6|34->6|35->7|35->7|35->7|35->7|67->39|67->39|69->41|69->41|74->46|74->46|79->51|79->51
                    -- GENERATED --
                */
            