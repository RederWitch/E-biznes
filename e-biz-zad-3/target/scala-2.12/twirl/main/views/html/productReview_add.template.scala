
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

object productReview_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[CreateProductReviewForm],Seq[Product],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Form[CreateProductReviewForm], product: Seq[Product], user: Seq[User])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.133*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.ProductReviewController.addProductReviewHandle())/*7.63*/ {_display_(Seq[Any](format.raw/*7.65*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""

    """),format.raw/*10.5*/("""<select name="productId" id="productId">
    """),_display_(/*11.6*/for(u <- product) yield /*11.23*/{_display_(Seq[Any](format.raw/*11.24*/("""
        """),format.raw/*12.9*/("""<option value=""""),_display_(/*12.25*/u/*12.26*/.id),format.raw/*12.29*/("""" selected>"""),_display_(/*12.41*/u/*12.42*/.name),format.raw/*12.47*/("""</option>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""</select>

    """),_display_(/*16.6*/inputDate(add("date"))),format.raw/*16.28*/("""
    """),_display_(/*17.6*/inputText(add("description"))),format.raw/*17.35*/("""

    """),format.raw/*19.5*/("""<select name="userId" id="userId">
    """),_display_(/*20.6*/for(c <- user) yield /*20.20*/{_display_(Seq[Any](format.raw/*20.21*/("""
        """),format.raw/*21.9*/("""<option value=""""),_display_(/*21.25*/c/*21.26*/.id),format.raw/*21.29*/("""">"""),_display_(/*21.32*/c/*21.33*/.firstName),format.raw/*21.43*/("""</option>
    """)))}),format.raw/*22.6*/("""
    """),format.raw/*23.5*/("""</select>

    <div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(add:Form[CreateProductReviewForm],product:Seq[Product],user:Seq[User],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(add,product,user)(request,flash)

  def f:((Form[CreateProductReviewForm],Seq[Product],Seq[User]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (add,product,user) => (request,flash) => apply(add,product,user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.876
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/productReview_add.scala.html
                  HASH: 8d6088e269c1e0e9f837d30db7a6b7b640a75ba3
                  MATRIX: 815->1|1019->137|1065->132|1095->154|1123->157|1135->162|1184->191|1214->196|1283->257|1322->259|1354->266|1368->272|1403->287|1438->295|1511->342|1544->359|1583->360|1620->370|1663->386|1673->387|1697->390|1736->402|1746->403|1772->408|1818->424|1851->430|1895->448|1938->470|1971->477|2021->506|2056->514|2123->555|2153->569|2192->570|2229->580|2272->596|2282->597|2306->600|2336->603|2346->604|2377->614|2423->630|2456->636
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|35->10|36->11|36->11|36->11|37->12|37->12|37->12|37->12|37->12|37->12|37->12|38->13|39->14|41->16|41->16|42->17|42->17|44->19|45->20|45->20|45->20|46->21|46->21|46->21|46->21|46->21|46->21|46->21|47->22|48->23
                  -- GENERATED --
              */
          