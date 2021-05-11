
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

object userPayment_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[UpdatePaymentForm],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

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
                  DATE: 2021-05-11T18:58:58.023
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/payment_update.scala.html
                  HASH: db19a1a9543e4817ac8262777ea75d76aacc1aa9
                  MATRIX: 797->1|977->113|1023->108|1053->130|1081->133|1093->138|1142->167|1172->172|1232->224|1271->226|1303->233|1317->239|1352->254|1384->260|1443->293|1465->307|1491->313|1584->380|1614->394|1653->395|1691->406|1756->462|1796->464|1838->478|1881->494|1891->495|1915->498|1954->510|1964->511|1990->516|2029->536|2042->540|2081->541|2123->555|2166->571|2176->572|2200->575|2230->578|2240->579|2266->584|2317->604|2354->611|2387->617|2431->635|2486->669|2519->676|2571->707|2604->714|2661->750|2694->757|2744->786|2779->794
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|39->14|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|41->16|41->16|42->17|43->18|44->19|46->21|46->21|47->22|47->22|48->23|48->23|49->24|49->24|51->26
                  -- GENERATED --
              */
          