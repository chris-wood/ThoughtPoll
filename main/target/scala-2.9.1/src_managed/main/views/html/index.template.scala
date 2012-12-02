
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
      </div>

      <!-- Example row of columns -->
      <!--
      <div class="row">
        <div class="span4">
          <h2>"""),_display_(Seq[Any](/*14.16*/Messages("playauthenticate.index.heading"))),format.raw/*14.58*/("""</h2>
           <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*16.39*/Messages("playauthenticate.index.details"))),format.raw/*16.81*/(""" &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Heading</h2>
           <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*21.39*/Messages("playauthenticate.index.details"))),format.raw/*21.81*/(""" &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Heading</h2>
          <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*26.39*/Messages("playauthenticate.index.details"))),format.raw/*26.81*/(""" &raquo;</a></p>
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
                    DATE: Sat Dec 01 21:35:17 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/index.scala.html
                    HASH: d9ecbc53a393fb5405cdee51a24599381a76b158
                    MATRIX: 819->1|914->62|968->108|1007->110|1166->234|1227->274|1280->292|1343->334|1385->341|1449->383|1620->518|1684->560|1989->829|2053->871|2394->1176|2458->1218|2805->1529|2869->1571
                    LINES: 30->2|31->3|31->3|31->3|34->6|34->6|35->7|35->7|35->7|35->7|42->14|42->14|44->16|44->16|49->21|49->21|54->26|54->26
                    -- GENERATED --
                */
            