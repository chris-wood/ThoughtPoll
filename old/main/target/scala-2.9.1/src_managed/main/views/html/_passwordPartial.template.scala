
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
object _passwordPartial extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.Html] {

    /**/
    def apply/*1.2*/(f: Form[_]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*5.1*/("""
             """),_display_(Seq[Any](/*6.15*/inputPassword(
                f("password"),
                '_label -> Messages("playauthenticate.login.password.placeholder")
             ))),format.raw/*9.15*/("""
             
             """),_display_(Seq[Any](/*11.15*/inputPassword(
                f("repeatPassword"),
                '_label -> Messages("playauthenticate.login.password.repeat"),
                '_showConstraints -> false,
                '_error -> f.error("password")
             ))))}
    }
    
    def render(f:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) = apply(f)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.Html) = (f) => apply(f)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:33 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/_passwordPartial.scala.html
                    HASH: b965c3aff997e06339a1df6200924ff07ccb34ea
                    MATRIX: 838->1|977->13|1005->66|1055->81|1219->224|1284->253
                    LINES: 29->1|35->1|37->5|38->6|41->9|43->11
                    -- GENERATED --
                */
            