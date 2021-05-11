
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

object recordInCart_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[CreateRecordInCartForm],Seq[Product],Seq[Cart],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Form[CreateRecordInCartForm], product: Seq[Product], cart: Seq[Cart])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.132*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.RecordInCartController.addRecordInCartHandle())/*7.61*/ {_display_(Seq[Any](format.raw/*7.63*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""

    """),_display_(/*10.6*/inputText(add("quantity"))),format.raw/*10.32*/("""

    """),format.raw/*12.5*/("""<select name="productId" id="productId">
    """),_display_(/*13.6*/for(u <- product) yield /*13.23*/{_display_(Seq[Any](format.raw/*13.24*/("""
        """),format.raw/*14.9*/("""<option value=""""),_display_(/*14.25*/u/*14.26*/.id),format.raw/*14.29*/("""">"""),_display_(/*14.32*/u/*14.33*/.name),format.raw/*14.38*/("""</option>
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""</select>

    <select name="cardId" id="cardId">
    """),_display_(/*19.6*/for(c <- cart) yield /*19.20*/{_display_(Seq[Any](format.raw/*19.21*/("""
        """),format.raw/*20.9*/("""<option value=""""),_display_(/*20.25*/c/*20.26*/.id),format.raw/*20.29*/("""">"""),_display_(/*20.32*/c/*20.33*/.id),format.raw/*20.36*/("""</option>
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""</select>

    <div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(add:Form[CreateRecordInCartForm],product:Seq[Product],cart:Seq[Cart],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(add,product,cart)(request,flash)

  def f:((Form[CreateRecordInCartForm],Seq[Product],Seq[Cart]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (add,product,cart) => (request,flash) => apply(add,product,cart)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T19:08:32.932
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/recordInCart_add.scala.html
                  HASH: 4542cf306fa2f1e03e0dc1290a0887d6f28598c3
                  MATRIX: 813->1|1016->136|1062->131|1092->153|1120->156|1132->161|1181->190|1211->195|1278->254|1317->256|1349->263|1363->269|1398->284|1433->293|1480->319|1515->327|1588->374|1621->391|1660->392|1697->402|1740->418|1750->419|1774->422|1804->425|1814->426|1840->431|1886->447|1919->453|2003->511|2033->525|2072->526|2109->536|2152->552|2162->553|2186->556|2216->559|2226->560|2250->563|2296->579|2329->585
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|35->10|35->10|37->12|38->13|38->13|38->13|39->14|39->14|39->14|39->14|39->14|39->14|39->14|40->15|41->16|44->19|44->19|44->19|45->20|45->20|45->20|45->20|45->20|45->20|45->20|46->21|47->22
                  -- GENERATED --
              */
          