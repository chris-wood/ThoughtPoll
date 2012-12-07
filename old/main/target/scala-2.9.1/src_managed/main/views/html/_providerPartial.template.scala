
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
object _providerPartial extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Boolean,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(skipCurrent: Boolean = true):play.api.templates.Html = {
        _display_ {import com.feth.play.module.pa.views.html._


Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""
<script type="text/javascript">
function askOpenID(url) """),format.raw("""{"""),format.raw/*6.26*/("""
	var openid = prompt("Please enter your OpenID:", "yourname.myopenid.com");
	if(openid) """),format.raw("""{"""),format.raw/*8.14*/("""
		window.location.href = url + "?p=" + encodeURIComponent(openid);
	"""),format.raw("""}"""),format.raw/*10.3*/("""
"""),format.raw("""}"""),format.raw/*11.2*/("""
</script>
<ul class="providers">
	"""),_display_(Seq[Any](/*14.3*/forProviders(skipCurrent)/*14.28*/ { p =>_display_(Seq[Any](format.raw/*14.35*/("""
		<li>
		"""),_display_(Seq[Any](/*16.4*/if(p.getKey() == "openid")/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
			<a href="javascript:void(0);" onclick="askOpenID('"""),_display_(Seq[Any](/*17.55*/p/*17.56*/.getUrl())),format.raw/*17.65*/("""');">
		""")))}/*18.5*/else/*18.10*/{_display_(Seq[Any](format.raw/*18.11*/("""
			<a href=""""),_display_(Seq[Any](/*19.14*/p/*19.15*/.getUrl())),format.raw/*19.24*/("""">
		""")))})),format.raw/*20.4*/("""
		"""),_display_(Seq[Any](/*21.4*/_providerIcon(p.getKey()))),format.raw/*21.29*/("""</a>
		</li>
	""")))})),format.raw/*23.3*/("""
</ul>"""))}
    }
    
    def render(skipCurrent:Boolean) = apply(skipCurrent)
    
    def f:((Boolean) => play.api.templates.Html) = (skipCurrent) => apply(skipCurrent)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 01 21:09:34 EST 2012
                    SOURCE: /Users/caw/Projects/ThoughtPoll/main/app/views/_providerPartial.scala.html
                    HASH: af82579dbd5ad78a5b5b76625c86f933767ddd1e
                    MATRIX: 767->1|917->30|945->77|1049->135|1185->225|1301->295|1349->297|1420->333|1454->358|1499->365|1545->376|1580->402|1620->404|1711->459|1721->460|1752->469|1779->479|1792->484|1831->485|1881->499|1891->500|1922->509|1959->515|1998->519|2045->544|2091->559
                    LINES: 27->1|31->1|33->4|35->6|37->8|39->10|40->11|43->14|43->14|43->14|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|50->21|50->21|52->23
                    -- GENERATED --
                */
            