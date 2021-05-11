
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

object orders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Order],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Seq[Order]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/for(a <- add) yield /*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),_display_(/*4.6*/a/*4.7*/.userId),format.raw/*4.14*/("""
    """),_display_(/*5.6*/a/*5.7*/.status),format.raw/*5.14*/("""
    """),_display_(/*6.6*/a/*6.7*/.items),format.raw/*6.13*/("""
    """),_display_(/*7.6*/a/*7.7*/.tax),format.raw/*7.11*/("""
    """),_display_(/*8.6*/a/*8.7*/.price),format.raw/*8.13*/("""
    """),_display_(/*9.6*/a/*9.7*/.shipping),format.raw/*9.16*/("""
    """),_display_(/*10.6*/a/*10.7*/.payed),format.raw/*10.13*/("""
    """),_display_(/*11.6*/a/*11.7*/.realized),format.raw/*11.16*/("""

    """),format.raw/*13.5*/("""<a href=""""),_display_(/*13.15*/controllers/*13.26*/.routes.OrderController.updateOrder(a.id)),format.raw/*13.67*/("""">Edit</a>
    <a href=""""),_display_(/*14.15*/controllers/*14.26*/.routes.OrderController.deleteOrder(a.id)),format.raw/*14.67*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(add:Seq[Order]): play.twirl.api.HtmlFormat.Appendable = apply(add)

  def f:((Seq[Order]) => play.twirl.api.HtmlFormat.Appendable) = (add) => apply(add)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.620
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/orders.scala.html
                  HASH: aadc5f56dd4281eaf36b230d729fcd95153f1fb2
                  MATRIX: 734->1|846->18|876->23|904->36|943->38|975->45|983->46|1010->53|1042->60|1050->61|1077->68|1109->75|1117->76|1143->82|1175->89|1183->90|1207->94|1239->101|1247->102|1273->108|1305->115|1313->116|1342->125|1375->132|1384->133|1411->139|1444->146|1453->147|1483->156|1518->164|1555->174|1575->185|1637->226|1690->252|1710->263|1772->304
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|38->13|38->13|38->13|38->13|39->14|39->14|39->14
                  -- GENERATED --
              */
          