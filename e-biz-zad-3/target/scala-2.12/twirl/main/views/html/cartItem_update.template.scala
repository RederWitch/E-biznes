
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

object cartItem_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[UpdateRecordInCartForm],Seq[Product],Seq[Cart],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Form[UpdateRecordInCartForm], product: Seq[Product], cart: Seq[Cart])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.132*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.RecordInCartController.updateRecordInCartHandle())/*7.64*/ {_display_(Seq[Any](format.raw/*7.66*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<input name="id" id="id" value=""""),_display_(/*9.38*/add("id")/*9.47*/.value),format.raw/*9.53*/("""" type="hidden" />

    <select name="productId" id="productId">
    """),_display_(/*12.6*/for(u <- product) yield /*12.23*/{_display_(Seq[Any](format.raw/*12.24*/("""
        """),format.raw/*13.9*/("""<option value=""""),_display_(/*13.25*/u/*13.26*/.id),format.raw/*13.29*/("""" selected>"""),_display_(/*13.41*/u/*13.42*/.name),format.raw/*13.47*/("""</option>
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</select>

    <select name="cardId" id="cardId">
    """),_display_(/*18.6*/for(c <- cart) yield /*18.20*/{_display_(Seq[Any](format.raw/*18.21*/("""
        """),format.raw/*19.9*/("""<option value=""""),_display_(/*19.25*/c/*19.26*/.id),format.raw/*19.29*/("""">"""),_display_(/*19.32*/c/*19.33*/.id),format.raw/*19.36*/("""</option>
    """)))}),format.raw/*20.6*/("""
    """),format.raw/*21.5*/("""</select>

    """),_display_(/*23.6*/inputText(add("quantity"))),format.raw/*23.32*/("""

    """),format.raw/*25.5*/("""<div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(add:Form[UpdateRecordInCartForm],product:Seq[Product],cart:Seq[Cart],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(add,product,cart)(request,flash)

  def f:((Form[UpdateRecordInCartForm],Seq[Product],Seq[Cart]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (add,product,cart) => (request,flash) => apply(add,product,cart)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:58:57.967
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/recordInCart_update.scala.html
                  HASH: 9de96bb9a148e47a0bb68ceda1f79bc172d5291f
                  MATRIX: 812->1|1015->136|1061->131|1091->153|1119->156|1131->161|1180->190|1210->195|1280->257|1319->259|1351->266|1365->272|1400->287|1432->293|1491->326|1508->335|1534->341|1633->414|1666->431|1705->432|1742->442|1785->458|1795->459|1819->462|1858->474|1868->475|1894->480|1940->496|1973->502|2057->560|2087->574|2126->575|2163->585|2206->601|2216->602|2240->605|2270->608|2280->609|2304->612|2350->628|2383->634|2427->652|2474->678|2509->686
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|37->12|37->12|37->12|38->13|38->13|38->13|38->13|38->13|38->13|38->13|39->14|40->15|43->18|43->18|43->18|44->19|44->19|44->19|44->19|44->19|44->19|44->19|45->20|46->21|48->23|48->23|50->25
                  -- GENERATED --
              */
          