
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

object userPayment_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreatePaymentForm],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(payments: Form[CreatePaymentForm], user: Seq[User])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.109*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.PaymentController.addPaymentHandle())/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
"""),_display_(/*8.2*/helper/*8.8*/.CSRF.formField),format.raw/*8.23*/("""
"""),format.raw/*9.1*/("""<select name="userId" id="userId">
    """),_display_(/*10.6*/for(u <- user) yield /*10.20*/{_display_(Seq[Any](format.raw/*10.21*/("""
        """),format.raw/*11.9*/("""<option value=""""),_display_(/*11.25*/u/*11.26*/.id),format.raw/*11.29*/("""" selected>"""),_display_(/*11.41*/u/*11.42*/.nick),format.raw/*11.47*/("""</option>
    """)))}),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</select>

"""),_display_(/*15.2*/inputText(payments("paymentType"))),format.raw/*15.36*/("""
"""),_display_(/*16.2*/inputText(payments("provider"))),format.raw/*16.33*/("""
"""),_display_(/*17.2*/inputText(payments("accountNumber"))),format.raw/*17.38*/("""
"""),_display_(/*18.2*/inputDate(payments("expiry"))),format.raw/*18.31*/("""

"""),format.raw/*20.1*/("""<div class="buttons">
    <input type="submit" value="Add"/>
</div>
""")))}))
      }
    }
  }

  def render(payments:Form[CreatePaymentForm],user:Seq[User],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(payments,user)(request,flash)

  def f:((Form[CreatePaymentForm],Seq[User]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (payments,user) => (request,flash) => apply(payments,user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:58:57.977
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/payment_add.scala.html
                  HASH: a4e6cbd5aad14bdd7592eefbeeba9d76877def9d
                  MATRIX: 794->1|974->113|1020->108|1050->130|1078->133|1090->138|1139->167|1169->172|1226->221|1265->223|1293->226|1306->232|1341->247|1369->249|1436->290|1466->304|1505->305|1542->315|1585->331|1595->332|1619->335|1658->347|1668->348|1694->353|1740->369|1769->371|1809->385|1864->419|1893->422|1945->453|1974->456|2031->492|2060->495|2110->524|2141->528
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|36->11|36->11|37->12|38->13|40->15|40->15|41->16|41->16|42->17|42->17|43->18|43->18|45->20
                  -- GENERATED --
              */
          