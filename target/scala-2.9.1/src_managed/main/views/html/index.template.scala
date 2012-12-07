
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[scala.Tuple2[String, String]],Flash,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.54*/("""

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*5.17*/Messages("thoughtpoll.index.title"))),format.raw/*5.52*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Projects.index)),format.raw/*12.44*/("""" id="logo"><span>Thought</span>Poll</a>
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
        <p><a class="btn" href="#">"""),_display_(Seq[Any](/*44.37*/Messages("thoughtpoll.index.title"))),format.raw/*44.72*/(""" &raquo;</a></p>
        
        """),_display_(Seq[Any](/*46.10*/helper/*46.16*/.form(routes.Application.authenticate)/*46.54*/ {_display_(Seq[Any](format.raw/*46.56*/("""
            
            <h1>Sign in</h1>
            
            """),_display_(Seq[Any](/*50.14*/form/*50.18*/.globalError.map/*50.34*/ { error =>_display_(Seq[Any](format.raw/*50.45*/("""
                <p class="error">
                    """),_display_(Seq[Any](/*52.22*/error/*52.27*/.message)),format.raw/*52.35*/("""
                </p>
            """)))})),format.raw/*54.14*/("""
            
            """),_display_(Seq[Any](/*56.14*/flash/*56.19*/.get("success").map/*56.38*/ { message =>_display_(Seq[Any](format.raw/*56.51*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*58.22*/message)),format.raw/*58.29*/("""
                </p>
            """)))})),format.raw/*60.14*/("""
            
            <p>
                <input type="email" name="email" placeholder="Email" id="email" value=""""),_display_(Seq[Any](/*63.89*/form("email")/*63.102*/.value)),format.raw/*63.108*/("""">
            </p>
            <p>
                <input type="password" name="password" id="password" placeholder="Password">
            </p>
            <p>
                <button type="submit" id="loginbutton">Login</button>
            </p>
            
        """)))})),format.raw/*72.10*/("""
        
        <p class="note">
            Try <em>root</em> with <em>toor</em> as password.
        </p>
            
    </body>
</html>
    """))}
    }
    
    def render(form:Form[scala.Tuple2[String, String]],flash:Flash) = apply(form)(flash)
    
    def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.api.templates.Html) = (form) => (flash) => apply(form)(flash)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 06 21:53:38 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/app/views/index.scala.html
                    HASH: 4fedb58ed3865eb656fc3870c7bf0fbb4b2f9d92
                    MATRIX: 539->1|668->53|739->89|795->124|897->191|911->197|964->229|1071->301|1085->307|1142->342|1252->416|1267->422|1304->437|2649->1746|2706->1781|2777->1816|2792->1822|2839->1860|2879->1862|2984->1931|2997->1935|3022->1951|3071->1962|3163->2018|3177->2023|3207->2031|3274->2066|3337->2093|3351->2098|3379->2117|3430->2130|3524->2188|3553->2195|3620->2230|3774->2348|3797->2361|3826->2367|4129->2638
                    LINES: 19->1|22->1|26->5|26->5|27->6|27->6|27->6|28->7|28->7|28->7|33->12|33->12|33->12|65->44|65->44|67->46|67->46|67->46|67->46|71->50|71->50|71->50|71->50|73->52|73->52|73->52|75->54|77->56|77->56|77->56|77->56|79->58|79->58|81->60|84->63|84->63|84->63|93->72
                    -- GENERATED --
                */
            