
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

object discount_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[UpdateDiscountForm],Seq[Product],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(discount: Form[UpdateDiscountForm], product: Seq[Product])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.116*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.DiscountController.updateDiscountHandle)/*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<input name="id" id="id" value=""""),_display_(/*9.38*/discount("id")/*9.52*/.value),format.raw/*9.58*/("""" type="hidden" />

    <select name="productId" id="productId">
    """),_display_(/*12.6*/for(u <- product) yield /*12.23*/{_display_(Seq[Any](format.raw/*12.24*/("""
        """),format.raw/*13.9*/("""<option value=""""),_display_(/*13.25*/u/*13.26*/.id),format.raw/*13.29*/("""" selected>"""),_display_(/*13.41*/u/*13.42*/.name),format.raw/*13.47*/("""</option>
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</select>

    """),_display_(/*17.6*/inputText(discount("name"))),format.raw/*17.33*/("""
    """),_display_(/*18.6*/inputText(discount("discountPercentage"))),format.raw/*18.47*/("""
    """),_display_(/*19.6*/inputDate(discount("expire"))),format.raw/*19.35*/("""

    """),format.raw/*21.5*/("""<div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(discount:Form[UpdateDiscountForm],product:Seq[Product],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(discount,product)(request,flash)

  def f:((Form[UpdateDiscountForm],Seq[Product]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (discount,product) => (request,flash) => apply(discount,product)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.559
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/discount_update.scala.html
                  HASH: 5167eb14da1afa0b5efb9f037a527f944bb18c51
                  MATRIX: 798->1|985->120|1031->115|1061->137|1089->140|1101->145|1150->174|1180->179|1240->231|1279->233|1311->240|1325->246|1360->261|1392->267|1451->300|1473->314|1499->320|1598->393|1631->410|1670->411|1707->421|1750->437|1760->438|1784->441|1823->453|1833->454|1859->459|1905->475|1938->481|1982->499|2030->526|2063->533|2125->574|2158->581|2208->610|2243->618
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|37->12|37->12|37->12|38->13|38->13|38->13|38->13|38->13|38->13|38->13|39->14|40->15|42->17|42->17|43->18|43->18|44->19|44->19|46->21
                  -- GENERATED --
              */
          