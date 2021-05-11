
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

object userAdress_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateAddressForm],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Form[CreateAddressForm], user: Seq[User])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.AddressController.addAddressHandle())/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<select name="userId" id="userId">
    """),_display_(/*10.6*/for(u <- user) yield /*10.20*/{_display_(Seq[Any](format.raw/*10.21*/("""
        """),format.raw/*11.9*/("""<option value=""""),_display_(/*11.25*/u/*11.26*/.id),format.raw/*11.29*/("""" selected>"""),_display_(/*11.41*/u/*11.42*/.nick),format.raw/*11.47*/("""</option>
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""</select>

    """),_display_(/*15.6*/inputText(add("city"))),format.raw/*15.28*/("""
    """),_display_(/*16.6*/inputText(add("postalCode"))),format.raw/*16.34*/("""
    """),_display_(/*17.6*/inputText(add("country"))),format.raw/*17.31*/("""
    """),_display_(/*18.6*/inputText(add("telephone"))),format.raw/*18.33*/("""
    """),_display_(/*19.6*/inputText(add("mobile"))),format.raw/*19.30*/("""
    """),_display_(/*20.6*/inputText(add("addressLine"))),format.raw/*20.35*/("""

    """),format.raw/*22.5*/("""<div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(add:Form[CreateAddressForm],user:Seq[User],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(add,user)(request,flash)

  def f:((Form[CreateAddressForm],Seq[User]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (add,user) => (request,flash) => apply(add,user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:58:57.938
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/address_add.scala.html
                  HASH: 8ee40c460f68907c8f53f020eb2106e39e619166
                  MATRIX: 793->1|968->108|1014->103|1044->125|1072->128|1084->133|1133->162|1163->167|1220->216|1259->218|1291->225|1305->231|1340->246|1372->252|1439->293|1469->307|1508->308|1545->318|1588->334|1598->335|1622->338|1661->350|1671->351|1697->356|1743->372|1776->378|1820->396|1863->418|1896->425|1945->453|1978->460|2024->485|2057->492|2105->519|2138->526|2183->550|2216->557|2266->586|2301->594
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|36->11|36->11|37->12|38->13|40->15|40->15|41->16|41->16|42->17|42->17|43->18|43->18|44->19|44->19|45->20|45->20|47->22
                  -- GENERATED --
              */
          