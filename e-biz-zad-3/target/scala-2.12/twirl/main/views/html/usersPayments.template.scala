
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

object usersPayments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Payment],play.twirl.api.HtmlFormat.Appendable] {

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
                  DATE: 2021-05-11T18:58:58.035
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/payments.scala.html
                  HASH: 0a0f2bd0abd0ef08aeece252d7b8d043cfe207cb
                  MATRIX: 743->1|862->25|892->30|927->50|966->52|998->59|1008->62|1035->69|1067->76|1077->79|1109->91|1141->98|1151->101|1180->110|1212->117|1222->120|1256->134|1288->141|1298->144|1325->151|1360->159|1397->169|1417->180|1485->227|1538->253|1558->264|1626->311
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|35->10|35->10|35->10|35->10|36->11|36->11|36->11
                  -- GENERATED --
              */
          