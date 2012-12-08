
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
    <head>
        <title>"""),_display_(Seq[Any](/*3.17*/Messages("thoughtpoll.index.title"))),format.raw/*3.52*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*4.59*/routes/*4.65*/.Assets.at("images/favicon.png"))),format.raw/*4.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*5.70*/routes/*5.76*/.Assets.at("stylesheets/login.css"))),format.raw/*5.111*/("""">
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.TPController.index)),format.raw/*10.48*/("""" id="logo"><span>Thought</span>Poll</a>
        </header>

        <div id="create_poll_container">

            <!-- TODO: use ajax and hide this container to replace it with the follow-up screen -->

            <form id="pollSubmissionForm" accept-charset="utf-8"> <!-- consider changing url to /poll/create -->
              <input type="text" name="content" />
              <br/>
              <select id="categorySelect" name="category" size="1"> <!-- enforce selecting one category -->
                <option value="0">General</option>
                <option value="1">Technology</option>
                <option value="2">Politics</option>
              </select>
              <br/>
              <input type="text" name="choice[]" value="1"/>
              <br/>
              <input type="text" name="choice[]" value="2"/>
              <br/>
              <input type="text" name="choice[]" value="3"/>
              <br/>
              <input type="text" name="choice[]" value="4"/>
              <br/>
              <input type="submit" value="Create Poll"/>
            </form>

            <!-- TODO: Create the code in poll.js to dynamically add/remove items from this form -->

        </div>

        Here's a fancy button just hanging around. Cool.
        <p><a class="btn" href="#">"""),_display_(Seq[Any](/*42.37*/Messages("thoughtpoll.index.title"))),format.raw/*42.72*/(""" &raquo;</a></p>
        
        
        
        <!--
        <p class="note">
            Try <em>root</em> with <em>toor</em> as password.
        </p>
      -->
            
    </body>
</html>
    """))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Dec 07 19:45:00 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/app/views/index.scala.html
                    HASH: e8e59b0cba7cf9910481c577c3e18bde0e0f7381
                    MATRIX: 569->0|638->34|694->69|796->136|810->142|863->174|970->246|984->252|1041->287|1151->361|1166->367|1207->386|2552->1695|2609->1730
                    LINES: 22->1|24->3|24->3|25->4|25->4|25->4|26->5|26->5|26->5|31->10|31->10|31->10|63->42|63->42
                    -- GENERATED --
                */
            