
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

object recordInCarts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[RecordInCart],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cart: Seq[RecordInCart]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/for(a <- cart) yield /*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    """),_display_(/*4.6*/a/*4.7*/.id),format.raw/*4.10*/(""" """),format.raw/*4.11*/("""|
    """),_display_(/*5.6*/a/*5.7*/.productId),format.raw/*5.17*/(""" """),format.raw/*5.18*/("""|
    """),_display_(/*6.6*/a/*6.7*/.quantity),format.raw/*6.16*/(""" """),format.raw/*6.17*/("""|
    """),_display_(/*7.6*/a/*7.7*/.cartId),format.raw/*7.14*/("""

    """),format.raw/*9.5*/("""<a href=""""),_display_(/*9.15*/controllers/*9.26*/.routes.RecordInCartController.updateRecordInCart(a.id)),format.raw/*9.81*/("""">Edit</a>
    <a href=""""),_display_(/*10.15*/controllers/*10.26*/.routes.RecordInCartController.deleteRecordInCart(a.id)),format.raw/*10.81*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(cart:Seq[RecordInCart]): play.twirl.api.HtmlFormat.Appendable = apply(cart)

  def f:((Seq[RecordInCart]) => play.twirl.api.HtmlFormat.Appendable) = (cart) => apply(cart)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T19:08:32.779
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/recordInCarts.scala.html
                  HASH: b4da39d0e073120367278bd6dd6da00111d2ce64
                  MATRIX: 748->1|868->26|898->31|927->45|966->47|998->54|1006->55|1029->58|1057->59|1090->67|1098->68|1128->78|1156->79|1189->87|1197->88|1226->97|1254->98|1287->106|1295->107|1322->114|1356->122|1392->132|1411->143|1486->198|1539->224|1559->235|1635->290
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|31->6|32->7|32->7|32->7|34->9|34->9|34->9|34->9|35->10|35->10|35->10
                  -- GENERATED --
              */
          