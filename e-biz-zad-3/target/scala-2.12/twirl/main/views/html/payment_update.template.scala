
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

object payment_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[UpdatePaymentForm],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(payments: Form[UpdatePaymentForm], user: Seq[User])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.109*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.PaymentController.updatePaymentHandle())/*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<input name="id" id="id" value=""""),_display_(/*9.38*/payments("id")/*9.52*/.value),format.raw/*9.58*/("""" type="hidden" />

    <select name="userId" id="userId">
    """),_display_(/*12.6*/for(u <- user) yield /*12.20*/{_display_(Seq[Any](format.raw/*12.21*/("""
        """),_display_(/*13.10*/if(u.id.toString==payments("userId").value.getOrElse(0))/*13.66*/ {_display_(Seq[Any](format.raw/*13.68*/("""
            """),format.raw/*14.13*/("""<option value=""""),_display_(/*14.29*/u/*14.30*/.id),format.raw/*14.33*/("""" selected>"""),_display_(/*14.45*/u/*14.46*/.nick),format.raw/*14.51*/("""</option>
        """)))}/*15.10*/else/*15.14*/{_display_(Seq[Any](format.raw/*15.15*/("""
            """),format.raw/*16.13*/("""<option value=""""),_display_(/*16.29*/u/*16.30*/.id),format.raw/*16.33*/("""">"""),_display_(/*16.36*/u/*16.37*/.nick),format.raw/*16.42*/("""</option>
        """)))}),format.raw/*17.10*/("""
    """)))}),format.raw/*18.6*/("""
    """),format.raw/*19.5*/("""</select>

    """),_display_(/*21.6*/inputText(payments("paymentType"))),format.raw/*21.40*/("""
    """),_display_(/*22.6*/inputText(payments("provider"))),format.raw/*22.37*/("""
    """),_display_(/*23.6*/inputText(payments("accountNumber"))),format.raw/*23.42*/("""
    """),_display_(/*24.6*/inputDate(payments("expiry"))),format.raw/*24.35*/("""

    """),format.raw/*26.5*/("""<div class="buttons">
        <input type="submit" value="Update"/>
    </div>
""")))}))
      }
    }
  }

  def render(payments:Form[UpdatePaymentForm],user:Seq[User],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(payments,user)(request,flash)

  def f:((Form[UpdatePaymentForm],Seq[User]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (payments,user) => (request,flash) => apply(payments,user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T19:08:32.877
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/payment_update.scala.html
                  HASH: db19a1a9543e4817ac8262777ea75d76aacc1aa9
                  MATRIX: 793->1|973->113|1019->108|1049->130|1077->133|1089->138|1138->167|1168->172|1228->224|1267->226|1299->233|1313->239|1348->254|1380->260|1439->293|1461->307|1487->313|1580->380|1610->394|1649->395|1687->406|1752->462|1792->464|1834->478|1877->494|1887->495|1911->498|1950->510|1960->511|1986->516|2025->536|2038->540|2077->541|2119->555|2162->571|2172->572|2196->575|2226->578|2236->579|2262->584|2313->604|2350->611|2383->617|2427->635|2482->669|2515->676|2567->707|2600->714|2657->750|2690->757|2740->786|2775->794
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|39->14|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|41->16|41->16|42->17|43->18|44->19|46->21|46->21|47->22|47->22|48->23|48->23|49->24|49->24|51->26
                  -- GENERATED --
              */
          