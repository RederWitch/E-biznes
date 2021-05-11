
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

object payments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Payment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(payments: Seq[Payment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/for(pay <- payments) yield /*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),_display_(/*4.6*/pay/*4.9*/.userId),format.raw/*4.16*/("""
    """),_display_(/*5.6*/pay/*5.9*/.paymentType),format.raw/*5.21*/("""
    """),_display_(/*6.6*/pay/*6.9*/.provider),format.raw/*6.18*/("""
    """),_display_(/*7.6*/pay/*7.9*/.accountNumber),format.raw/*7.23*/("""
    """),_display_(/*8.6*/pay/*8.9*/.expiry),format.raw/*8.16*/("""

    """),format.raw/*10.5*/("""<a href=""""),_display_(/*10.15*/controllers/*10.26*/.routes.PaymentController.updatePayment(pay.id)),format.raw/*10.73*/("""">Edit</a>
    <a href=""""),_display_(/*11.15*/controllers/*11.26*/.routes.PaymentController.deletePayment(pay.id)),format.raw/*11.73*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(payments:Seq[Payment]): play.twirl.api.HtmlFormat.Appendable = apply(payments)

  def f:((Seq[Payment]) => play.twirl.api.HtmlFormat.Appendable) = (payments) => apply(payments)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T19:08:32.979
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/payments.scala.html
                  HASH: 0a0f2bd0abd0ef08aeece252d7b8d043cfe207cb
                  MATRIX: 738->1|857->25|887->30|922->50|961->52|993->59|1003->62|1030->69|1062->76|1072->79|1104->91|1136->98|1146->101|1175->110|1207->117|1217->120|1251->134|1283->141|1293->144|1320->151|1355->159|1392->169|1412->180|1480->227|1533->253|1553->264|1621->311
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|35->10|35->10|35->10|35->10|36->11|36->11|36->11
                  -- GENERATED --
              */
          