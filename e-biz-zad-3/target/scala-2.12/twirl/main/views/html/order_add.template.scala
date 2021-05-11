
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object order_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateOrderForm],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(order: Form[CreateOrderForm], user: Seq[User])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.OrderController.addOrderHandle())/*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<select name="userId" id="userId">
    """),_display_(/*10.6*/for(u <- user) yield /*10.20*/{_display_(Seq[Any](format.raw/*10.21*/("""
        """),format.raw/*11.9*/("""<option value=""""),_display_(/*11.25*/u/*11.26*/.id),format.raw/*11.29*/("""" selected>"""),_display_(/*11.41*/u/*11.42*/.nick),format.raw/*11.47*/("""</option>
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""</select>

    """),_display_(/*15.6*/inputText(order("status"))),format.raw/*15.32*/("""
    """),_display_(/*16.6*/inputText(order("items"))),format.raw/*16.31*/("""
    """),_display_(/*17.6*/inputText(order("tax"))),format.raw/*17.29*/("""
    """),_display_(/*18.6*/inputText(order("price"))),format.raw/*18.31*/("""
    """),_display_(/*19.6*/inputText(order("shipping"))),format.raw/*19.34*/("""
    """),_display_(/*20.6*/checkbox(order("payed"))),format.raw/*20.30*/("""
    """),_display_(/*21.6*/checkbox(order("realized"))),format.raw/*21.33*/("""

    """),format.raw/*23.5*/("""<div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(order:Form[CreateOrderForm],user:Seq[User],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(order,user)(request,flash)

  def f:((Form[CreateOrderForm],Seq[User]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (order,user) => (request,flash) => apply(order,user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.755
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/order_add.scala.html
                  HASH: 9485e387797fcbdeb0e82ecd7ef5d975b80e1eea
                  MATRIX: 786->1|961->108|1007->103|1037->125|1065->128|1077->133|1126->162|1156->167|1209->212|1248->214|1280->221|1294->227|1329->242|1361->248|1428->289|1458->303|1497->304|1534->314|1577->330|1587->331|1611->334|1650->346|1660->347|1686->352|1732->368|1765->374|1809->392|1856->418|1889->425|1935->450|1968->457|2012->480|2045->487|2091->512|2124->519|2173->547|2206->554|2251->578|2284->585|2332->612|2367->620
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|36->11|36->11|37->12|38->13|40->15|40->15|41->16|41->16|42->17|42->17|43->18|43->18|44->19|44->19|45->20|45->20|46->21|46->21|48->23
                  -- GENERATED --
              */
          