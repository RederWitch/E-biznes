
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

object discount_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateDiscountForm],Seq[Product],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(discount: Form[CreateDiscountForm], product: Seq[Product])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.116*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.DiscountController.addDiscountHandle())/*7.53*/ {_display_(Seq[Any](format.raw/*7.55*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<select name="productId" id="productId">
    """),_display_(/*10.6*/for(u <- product) yield /*10.23*/{_display_(Seq[Any](format.raw/*10.24*/("""
        """),format.raw/*11.9*/("""<option value=""""),_display_(/*11.25*/u/*11.26*/.id),format.raw/*11.29*/("""" selected>"""),_display_(/*11.41*/u/*11.42*/.name),format.raw/*11.47*/("""</option>
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""</select>

    """),_display_(/*15.6*/inputText(discount("name"))),format.raw/*15.33*/("""
    """),_display_(/*16.6*/inputText(discount("discountPercentage"))),format.raw/*16.47*/("""
    """),_display_(/*17.6*/inputDate(discount("expire"))),format.raw/*17.35*/("""

    """),format.raw/*19.5*/("""<div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(discount:Form[CreateDiscountForm],product:Seq[Product],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(discount,product)(request,flash)

  def f:((Form[CreateDiscountForm],Seq[Product]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (discount,product) => (request,flash) => apply(discount,product)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.706
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/discount_add.scala.html
                  HASH: 4bbfb4b421aeab86b67b33c57e24588b6bedbe36
                  MATRIX: 795->1|982->120|1028->115|1058->137|1086->140|1098->145|1147->174|1177->179|1236->230|1275->232|1307->239|1321->245|1356->260|1388->266|1461->313|1494->330|1533->331|1570->341|1613->357|1623->358|1647->361|1686->373|1696->374|1722->379|1768->395|1801->401|1845->419|1893->446|1926->453|1988->494|2021->501|2071->530|2106->538
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|36->11|36->11|37->12|38->13|40->15|40->15|41->16|41->16|42->17|42->17|44->19
                  -- GENERATED --
              */
          