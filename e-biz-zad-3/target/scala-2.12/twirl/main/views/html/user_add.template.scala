
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

object user_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateUserForm],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Form[CreateUserForm])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.85*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/flash/*4.7*/.get("success").getOrElse("")),format.raw/*4.36*/("""
"""),_display_(/*5.2*/form(routes.UserController.addUserHandle())/*5.45*/ {_display_(Seq[Any](format.raw/*5.47*/("""
    """),_display_(/*6.6*/helper/*6.12*/.CSRF.formField),format.raw/*6.27*/("""
    """),_display_(/*7.6*/inputText(user("nick"))),format.raw/*7.29*/("""
    """),_display_(/*8.6*/inputText(user("firstName"))),format.raw/*8.34*/("""
    """),_display_(/*9.6*/inputText(user("lastName"))),format.raw/*9.33*/("""
    """),_display_(/*10.6*/inputText(user("email"))),format.raw/*10.30*/("""
    """),_display_(/*11.6*/inputPassword(user("password"))),format.raw/*11.37*/("""

    """),format.raw/*13.5*/("""<div class="buttons">
        <input type="submit" value="Submit"/>
    </div>
""")))}))
      }
    }
  }

  def render(user:Form[CreateUserForm],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(user)(request,flash)

  def f:((Form[CreateUserForm]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request,flash) => apply(user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.604
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/user_add.scala.html
                  HASH: b4dad995331940537c7b227af00b038bba292cf4
                  MATRIX: 774->1|930->87|975->84|1003->104|1031->107|1043->112|1092->141|1120->144|1171->187|1210->189|1242->196|1256->202|1291->217|1323->224|1366->247|1398->254|1446->282|1478->289|1525->316|1558->323|1603->347|1636->354|1688->385|1723->393
                  LINES: 21->1|24->2|27->1|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|33->8|33->8|34->9|34->9|35->10|35->10|36->11|36->11|38->13
                  -- GENERATED --
              */
          