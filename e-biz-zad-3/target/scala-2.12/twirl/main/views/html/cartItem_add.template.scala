
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

object cartItem_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[CreateRecordInCartForm],Seq[Product],Seq[Cart],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

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
                  DATE: 2021-05-11T18:58:57.900
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/recordInCart_add.scala.html
                  HASH: 4542cf306fa2f1e03e0dc1290a0887d6f28598c3
                  MATRIX: 809->1|1012->136|1058->131|1088->153|1116->156|1128->161|1177->190|1207->195|1274->254|1313->256|1345->263|1359->269|1394->284|1429->293|1476->319|1511->327|1584->374|1617->391|1656->392|1693->402|1736->418|1746->419|1770->422|1800->425|1810->426|1836->431|1882->447|1915->453|1999->511|2029->525|2068->526|2105->536|2148->552|2158->553|2182->556|2212->559|2222->560|2246->563|2292->579|2325->585
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|35->10|35->10|37->12|38->13|38->13|38->13|39->14|39->14|39->14|39->14|39->14|39->14|39->14|40->15|41->16|44->19|44->19|44->19|45->20|45->20|45->20|45->20|45->20|45->20|45->20|46->21|47->22
                  -- GENERATED --
              */
          