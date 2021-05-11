
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

object discounts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Discount],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(discounts: Seq[Discount]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/for(dis <- discounts) yield /*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
    """),_display_(/*4.6*/dis/*4.9*/.name),format.raw/*4.14*/("""
    """),_display_(/*5.6*/dis/*5.9*/.discountPercentage),format.raw/*5.28*/("""
    """),_display_(/*6.6*/dis/*6.9*/.expire),format.raw/*6.16*/("""

    """),format.raw/*8.5*/("""<a href=""""),_display_(/*8.15*/controllers/*8.26*/.routes.DiscountController.updateDiscount(dis.id)),format.raw/*8.75*/("""">Edit</a>
    <a href=""""),_display_(/*9.15*/controllers/*9.26*/.routes.DiscountController.deleteDiscount(dis.id)),format.raw/*9.75*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(discounts:Seq[Discount]): play.twirl.api.HtmlFormat.Appendable = apply(discounts)

  def f:((Seq[Discount]) => play.twirl.api.HtmlFormat.Appendable) = (discounts) => apply(discounts)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.714
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/discounts.scala.html
                  HASH: 0159e59527420205a39b892feeb8e336c3496bd1
                  MATRIX: 740->1|861->27|891->32|927->53|966->55|998->62|1008->65|1033->70|1065->77|1075->80|1114->99|1146->106|1156->109|1183->116|1217->124|1253->134|1272->145|1341->194|1393->220|1412->231|1481->280
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|33->8|33->8|33->8|33->8|34->9|34->9|34->9
                  -- GENERATED --
              */
          