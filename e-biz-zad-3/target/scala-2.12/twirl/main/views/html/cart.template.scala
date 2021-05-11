
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

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Cart],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cart: Seq[Cart]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/for(a <- cart) yield /*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    """),_display_(/*4.6*/a/*4.7*/.id),format.raw/*4.10*/(""" """),format.raw/*4.11*/("""|
    """),_display_(/*5.6*/a/*5.7*/.userId),format.raw/*5.14*/(""" """),format.raw/*5.15*/("""|
    """),_display_(/*6.6*/a/*6.7*/.createdAt),format.raw/*6.17*/(""" """),format.raw/*6.18*/("""|

    <a href=""""),_display_(/*8.15*/controllers/*8.26*/.routes.CartController.updateCart(a.id)),format.raw/*8.65*/("""">Edit</a>
    <a href=""""),_display_(/*9.15*/controllers/*9.26*/.routes.CartController.deleteCart(a.id)),format.raw/*9.65*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(cart:Seq[Cart]): play.twirl.api.HtmlFormat.Appendable = apply(cart)

  def f:((Seq[Cart]) => play.twirl.api.HtmlFormat.Appendable) = (cart) => apply(cart)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.651
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/cart.scala.html
                  HASH: ab4c13c50e2010fb1484b82ee4df90672e1ac8ff
                  MATRIX: 731->1|843->18|873->23|902->37|941->39|973->46|981->47|1004->50|1032->51|1065->59|1073->60|1100->67|1128->68|1161->76|1169->77|1199->87|1227->88|1272->107|1291->118|1350->157|1402->183|1421->194|1480->233
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|31->6|33->8|33->8|33->8|34->9|34->9|34->9
                  -- GENERATED --
              */
          