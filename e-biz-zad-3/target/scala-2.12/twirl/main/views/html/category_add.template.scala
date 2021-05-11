
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

object category_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateCategoryForm],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(category: Form[CreateCategoryForm])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.93*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/flash/*4.7*/.get("success").getOrElse("")),format.raw/*4.36*/("""
"""),_display_(/*5.2*/form(routes.CategoryController.addCategoryHandle())/*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""
    """),_display_(/*6.6*/helper/*6.12*/.CSRF.formField),format.raw/*6.27*/("""
    """),_display_(/*7.6*/inputText(category("name"))),format.raw/*7.33*/("""
    """),_display_(/*8.6*/inputText(category("description"))),format.raw/*8.40*/("""

    """),format.raw/*10.5*/("""<div class="buttons">
        <input type="submit" value="Add Category"/>
    </div>
""")))}))
      }
    }
  }

  def render(category:Form[CreateCategoryForm],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(category)(request,flash)

  def f:((Form[CreateCategoryForm]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (category) => (request,flash) => apply(category)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.851
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/category_add.scala.html
                  HASH: 39a9260f306b7dd6a913236273d929845e3f8901
                  MATRIX: 782->1|946->95|991->92|1019->112|1047->115|1059->120|1108->149|1136->152|1195->203|1234->205|1266->212|1280->218|1315->233|1347->240|1394->267|1426->274|1480->308|1515->316
                  LINES: 21->1|24->2|27->1|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|33->8|33->8|35->10
                  -- GENERATED --
              */
          