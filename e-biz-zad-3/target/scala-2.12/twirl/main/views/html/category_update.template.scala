
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

object category_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[UpdateCategoryForm],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cat: Form[UpdateCategoryForm])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.88*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.CategoryController.updateCategoryHandle())/*7.56*/ {_display_(Seq[Any](format.raw/*7.58*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<input name="id" id="id" value=""""),_display_(/*9.38*/cat("id")/*9.47*/.value),format.raw/*9.53*/("""" type="hidden" />
    """),_display_(/*10.6*/inputText(cat("name"))),format.raw/*10.28*/("""
    """),_display_(/*11.6*/inputText(cat("description"))),format.raw/*11.35*/("""

    """),format.raw/*13.5*/("""<div class="buttons">
        <input type="submit" value="Update Category"/>
    </div>
""")))}))
      }
    }
  }

  def render(cat:Form[UpdateCategoryForm],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(cat)(request,flash)

  def f:((Form[UpdateCategoryForm]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (cat) => (request,flash) => apply(cat)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.488
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/category_update.scala.html
                  HASH: 0aa02a6ace061965fd9632039cd3bb13d488ed91
                  MATRIX: 785->1|944->92|989->87|1019->109|1047->112|1059->117|1108->146|1138->151|1200->205|1239->207|1271->214|1285->220|1320->235|1352->241|1411->274|1428->283|1454->289|1505->314|1548->336|1581->343|1631->372|1666->380
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|35->10|35->10|36->11|36->11|38->13
                  -- GENERATED --
              */
          