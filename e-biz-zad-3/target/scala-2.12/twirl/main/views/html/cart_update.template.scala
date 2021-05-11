
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

object cart_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[UpdateCartForm],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cart: Form[UpdateCartForm], user: Seq[User])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.CartController.updateCartHandle())/*7.48*/ {_display_(Seq[Any](format.raw/*7.50*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<input name="id" id="id" value=""""),_display_(/*9.38*/cart("id")/*9.48*/.value),format.raw/*9.54*/("""" type="hidden" />

    <select name="userId" id="userId">
    """),_display_(/*12.6*/for(u <- user) yield /*12.20*/{_display_(Seq[Any](format.raw/*12.21*/("""
        """),format.raw/*13.9*/("""<option value=""""),_display_(/*13.25*/u/*13.26*/.id),format.raw/*13.29*/("""" selected>"""),_display_(/*13.41*/u/*13.42*/.nick),format.raw/*13.47*/("""</option>
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</select>

    <div class="buttons">
        <input type="submit" value="Update"/>
    </div>
""")))}))
      }
    }
  }

  def render(cart:Form[UpdateCartForm],user:Seq[User],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(cart,user)(request,flash)

  def f:((Form[UpdateCartForm],Seq[User]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (cart,user) => (request,flash) => apply(cart,user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.768
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/cart_update.scala.html
                  HASH: e6b872dd0323dbcd4d9dc0e82633a20fe245848c
                  MATRIX: 787->1|960->106|1006->101|1036->123|1064->126|1076->131|1125->160|1155->165|1209->211|1248->213|1280->220|1294->226|1329->241|1361->247|1420->280|1438->290|1464->296|1557->363|1587->377|1626->378|1663->388|1706->404|1716->405|1740->408|1779->420|1789->421|1815->426|1861->442|1894->448
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|37->12|37->12|37->12|38->13|38->13|38->13|38->13|38->13|38->13|38->13|39->14|40->15
                  -- GENERATED --
              */
          