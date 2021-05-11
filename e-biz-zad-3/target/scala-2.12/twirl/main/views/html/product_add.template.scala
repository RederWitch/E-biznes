
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

object product_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateProductForm],Seq[Category],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm], category: Seq[Category])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.116*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/flash/*4.7*/.get("success").getOrElse("")),format.raw/*4.36*/("""
"""),_display_(/*5.2*/form(routes.ProductController.addProductHandle())/*5.51*/ {_display_(Seq[Any](format.raw/*5.53*/("""
    """),_display_(/*6.6*/helper/*6.12*/.CSRF.formField),format.raw/*6.27*/("""
    """),_display_(/*7.6*/inputText(product("name"))),format.raw/*7.32*/("""
    """),_display_(/*8.6*/inputText(product("description"))),format.raw/*8.39*/("""

    """),format.raw/*10.5*/("""<select name="categoryId" id="categoryId">
    """),_display_(/*11.6*/for(cat <- category) yield /*11.26*/{_display_(Seq[Any](format.raw/*11.27*/("""
        """),format.raw/*12.9*/("""<option value=""""),_display_(/*12.25*/cat/*12.28*/.id),format.raw/*12.31*/("""">"""),_display_(/*12.34*/cat/*12.37*/.name),format.raw/*12.42*/("""</option>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""</select>

    """),_display_(/*16.6*/inputText(product("price"))),format.raw/*16.33*/("""
    """),_display_(/*17.6*/inputText(product("weight"))),format.raw/*17.34*/("""
    """),_display_(/*18.6*/inputText(product("height"))),format.raw/*18.34*/("""
    """),_display_(/*19.6*/inputText(product("width"))),format.raw/*19.33*/("""

    """),format.raw/*21.5*/("""<div class="buttons">
        <input type="submit" value="Add Category"/>
    </div>
""")))}))
      }
    }
  }

  def render(product:Form[CreateProductForm],category:Seq[Category],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(product,category)(request,flash)

  def f:((Form[CreateProductForm],Seq[Category]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (product,category) => (request,flash) => apply(product,category)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.543
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/product_add.scala.html
                  HASH: 7f317df2caf34538e3a39f854decd764a40086e5
                  MATRIX: 794->1|981->118|1027->115|1055->135|1083->138|1095->143|1144->172|1172->175|1229->224|1268->226|1300->233|1314->239|1349->254|1381->261|1427->287|1459->294|1512->327|1547->335|1622->384|1658->404|1697->405|1734->415|1777->431|1789->434|1813->437|1843->440|1855->443|1881->448|1927->464|1960->470|2004->488|2052->515|2085->522|2134->550|2167->557|2216->585|2249->592|2297->619|2332->627
                  LINES: 21->1|24->2|27->1|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|33->8|33->8|35->10|36->11|36->11|36->11|37->12|37->12|37->12|37->12|37->12|37->12|37->12|38->13|39->14|41->16|41->16|42->17|42->17|43->18|43->18|44->19|44->19|46->21
                  -- GENERATED --
              */
          