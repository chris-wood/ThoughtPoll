
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
object create_poll extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!--

This view enables admins to create poll information

-->

<!-- Messages are provided in the conf/messages.en file -->
"""),_display_(Seq[Any](/*8.2*/main(Messages("playauthenticate.index.title"))/*8.48*/ {_display_(Seq[Any](format.raw/*8.50*/("""
      <!-- Example row of columns -->
      <div class="row">
        <div class="span12">
          <!--<h2>"""),_display_(Seq[Any](/*12.20*/Messages("playauthenticate.index.heading"))),format.raw/*12.62*/("""</h2>-->
          <h2>"""),_display_(Seq[Any](/*13.16*/Messages("thoughtpoll.create_poll.heading"))),format.raw/*13.59*/("""</h2>
          
          <!-- The form! -->
          <div id="create_poll_container">

            <!-- TODO: use ajax and hide this container to replace it with the follow-up screen -->

            <form action="/createPoll" method="post" accept-charset="utf-8"> <!-- consider changing url to /poll/create -->
              <input type="text" name="content" />
              <br/>
              <select id="categorySelect" name="category" size="1"> <!-- enforce selecting one category -->
                <option value="0">General</option>
                <option value="1">Technology</option>
                <option value="2">Politics</option>
              </select>
              <br/>
              <input type="text" name="answer[]" value="1"/>
              <br/>
              <input type="text" name="answer[]" value="2"/>
              <br/>
              <input type="text" name="answer[]" value="3"/>
              <br/>
              <input type="text" name="answer[]" value="4"/>
              <br/>
              <input type="submit" value="Create Poll" onclick="addOpt(this.form.myselect)" />
            </form>

            <!-- TODO: Create the code in poll.js to dynamically add/remove items from this form -->

          </div>

          Here's a fancy button just hanging around. Cool.
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*45.39*/Messages("playauthenticate.index.details"))),format.raw/*45.81*/(""" &raquo;</a></p>
        </div>
      </div>
    """)))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 03 23:07:54 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/create_poll.scala.html
                    HASH: e09d9a487af118bcd28648b92cdb9a8b63287ee8
                    MATRIX: 825->0|984->125|1038->171|1077->173|1224->284|1288->326|1348->350|1413->393|2801->1745|2865->1787
                    LINES: 30->1|37->8|37->8|37->8|41->12|41->12|42->13|42->13|74->45|74->45
                    -- GENERATED --
                */
            