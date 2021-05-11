
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

object product_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[UpdateProductForm],Seq[Category],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[UpdateProductForm],category: Seq[Category])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.115*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.ProductController.updateProductHandle())/*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<input name="id" id="id" value=""""),_display_(/*9.38*/product("id")/*9.51*/.value),format.raw/*9.57*/("""" type="hidden" />
    """),_display_(/*10.6*/inputText(product("name"))),format.raw/*10.32*/("""
    """),_display_(/*11.6*/inputText(product("description"))),format.raw/*11.39*/("""
    """),_display_(/*12.6*/inputText(product("price"))),format.raw/*12.33*/("""

    """),format.raw/*14.5*/("""<select name="categoryId" id="categoryId">
    """),_display_(/*15.6*/for(cat <- category) yield /*15.26*/{_display_(Seq[Any](format.raw/*15.27*/("""
        """),_display_(/*16.10*/if(cat.id.toString==product("category").value.getOrElse(0))/*16.69*/ {_display_(Seq[Any](format.raw/*16.71*/("""
            """),format.raw/*17.13*/("""<option value=""""),_display_(/*17.29*/cat/*17.32*/.id),format.raw/*17.35*/("""" selected>"""),_display_(/*17.47*/cat/*17.50*/.name),format.raw/*17.55*/("""</option>
        """)))}/*18.10*/else/*18.14*/{_display_(Seq[Any](format.raw/*18.15*/("""
            """),format.raw/*19.13*/("""<option value=""""),_display_(/*19.29*/cat/*19.32*/.id),format.raw/*19.35*/("""">"""),_display_(/*19.38*/cat/*19.41*/.name),format.raw/*19.46*/("""</option>
        """)))}),format.raw/*20.10*/("""

    """)))}),format.raw/*22.6*/("""
    """),format.raw/*23.5*/("""</select>

    """),_display_(/*25.6*/inputText(product("weight"))),format.raw/*25.34*/("""
    """),_display_(/*26.6*/inputText(product("height"))),format.raw/*26.34*/("""
    """),_display_(/*27.6*/inputText(product("width"))),format.raw/*27.33*/("""

    """),format.raw/*29.5*/("""<div class="buttons">
        <input type="submit" value="Update Product"/>
    </div>
""")))}))
      }
    }
  }

  def render(product:Form[UpdateProductForm],category:Seq[Category],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(product,category)(request,flash)

  def f:((Form[UpdateProductForm],Seq[Category]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (product,category) => (request,flash) => apply(product,category)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.528
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/product_update.scala.html
                  HASH: 58c587d72353296122d889c706a577f69ff77aa3
                  MATRIX: 797->1|983->119|1029->114|1059->136|1087->139|1099->144|1148->173|1178->178|1238->230|1277->232|1309->239|1323->245|1358->260|1390->266|1449->299|1470->312|1496->318|1547->343|1594->369|1627->376|1681->409|1714->416|1762->443|1797->451|1872->500|1908->520|1947->521|1985->532|2053->591|2093->593|2135->607|2178->623|2190->626|2214->629|2253->641|2265->644|2291->649|2330->669|2343->673|2382->674|2424->688|2467->704|2479->707|2503->710|2533->713|2545->716|2571->721|2622->741|2661->750|2694->756|2738->774|2787->802|2820->809|2869->837|2902->844|2950->871|2985->879
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|35->10|35->10|36->11|36->11|37->12|37->12|39->14|40->15|40->15|40->15|41->16|41->16|41->16|42->17|42->17|42->17|42->17|42->17|42->17|42->17|43->18|43->18|43->18|44->19|44->19|44->19|44->19|44->19|44->19|44->19|45->20|47->22|48->23|50->25|50->25|51->26|51->26|52->27|52->27|54->29
                  -- GENERATED --
              */
          