
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
            <!--
            <div class="btn-group" data-toggle-name="is_private" data-toggle="buttons-radio" >
              <button type="button" value="0" class="btn" data-toggle="button">Public</button>
              <button type="button" value="1" class="btn" data-toggle="button">Private</button>
            </div>
            -->
            <div class="btn-group btn-group-vertical" data-toggle-name="poll" data-toggle="buttons-radio">
              <button type="button" value="0" class="btn" data-toggle="button">Option1</button>
              <button type="button" value="1" class="btn" data-toggle="button">Option2</button>
            </div>
            <input type="hidden" name="poll" value="0" /> <!-- TODO: handle ajax input here -->
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
          <h2>"""),_display_(Seq[Any](/*40.16*/Messages("playauthenticate.index.heading"))),format.raw/*40.58*/("""</h2>
           <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*42.39*/Messages("playauthenticate.index.details"))),format.raw/*42.81*/(""" &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Heading</h2>
           <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*47.39*/Messages("playauthenticate.index.details"))),format.raw/*47.81*/(""" &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Heading</h2>
          <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*52.39*/Messages("playauthenticate.index.details"))),format.raw/*52.81*/(""" &raquo;</a></p>
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
                    DATE: Mon Dec 03 23:40:19 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/index.scala.html
                    HASH: 2387c2a0af8bf8139228291af01c6606f0bfc7e6
                    MATRIX: 819->1|914->62|968->108|1007->110|1166->234|1227->274|1280->292|1343->334|1385->341|1449->383|2699->1597|2763->1639|3068->1908|3132->1950|3473->2255|3537->2297|3884->2608|3948->2650
                    LINES: 30->2|31->3|31->3|31->3|34->6|34->6|35->7|35->7|35->7|35->7|68->40|68->40|70->42|70->42|75->47|75->47|80->52|80->52
                    -- GENERATED --
                */
            