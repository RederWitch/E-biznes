
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

object addresses extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Address],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Seq[Address]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/for(a <- add) yield /*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),_display_(/*4.6*/a/*4.7*/.userId),format.raw/*4.14*/("""
    """),_display_(/*5.6*/a/*5.7*/.city),format.raw/*5.12*/("""
    """),_display_(/*6.6*/a/*6.7*/.postalCode),format.raw/*6.18*/("""
    """),_display_(/*7.6*/a/*7.7*/.country),format.raw/*7.15*/("""
    """),_display_(/*8.6*/a/*8.7*/.telephone),format.raw/*8.17*/("""
    """),_display_(/*9.6*/a/*9.7*/.mobile),format.raw/*9.14*/("""
    """),_display_(/*10.6*/a/*10.7*/.addressLine),format.raw/*10.19*/("""

    """),format.raw/*12.5*/("""<a href=""""),_display_(/*12.15*/controllers/*12.26*/.routes.AddressController.updateAddress(a.id)),format.raw/*12.71*/("""">Edit</a>
    <a href=""""),_display_(/*13.15*/controllers/*13.26*/.routes.AddressController.deleteAddress(a.id)),format.raw/*13.71*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(add:Seq[Address]): play.twirl.api.HtmlFormat.Appendable = apply(add)

  def f:((Seq[Address]) => play.twirl.api.HtmlFormat.Appendable) = (add) => apply(add)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T19:08:32.953
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/addresses.scala.html
                  HASH: af547afba2be2a0dc3ebc5b6cd2ab46eef55752f
                  MATRIX: 739->1|853->20|883->25|911->38|950->40|982->47|990->48|1017->55|1049->62|1057->63|1082->68|1114->75|1122->76|1153->87|1185->94|1193->95|1221->103|1253->110|1261->111|1291->121|1323->128|1331->129|1358->136|1391->143|1400->144|1433->156|1468->164|1505->174|1525->185|1591->230|1644->256|1664->267|1730->312
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|37->12|37->12|37->12|37->12|38->13|38->13|38->13
                  -- GENERATED --
              */
          