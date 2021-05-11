
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

object users extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: Seq[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/for(user <- users) yield /*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<b>"""),_display_(/*4.9*/user/*4.13*/.nick),format.raw/*4.18*/("""</b>
    """),_display_(/*5.6*/user/*5.10*/.firstName),format.raw/*5.20*/("""
    """),_display_(/*6.6*/user/*6.10*/.lastName),format.raw/*6.19*/("""
    """),_display_(/*7.6*/user/*7.10*/.email),format.raw/*7.16*/("""
    """),format.raw/*8.5*/("""<a href=""""),_display_(/*8.15*/controllers/*8.26*/.routes.UserController.updateUser(user.id)),format.raw/*8.68*/("""">Edit</a>
    <a href=""""),_display_(/*9.15*/controllers/*9.26*/.routes.UserController.deleteUser(user.id)),format.raw/*9.68*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(users:Seq[User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((Seq[User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.637
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/users.scala.html
                  HASH: cca61d7922da987dada23f98eb0569c2aa4df2af
                  MATRIX: 732->1|845->19|875->24|908->42|947->44|979->50|1008->54|1020->58|1045->63|1081->74|1093->78|1123->88|1155->95|1167->99|1196->108|1228->115|1240->119|1266->125|1298->131|1334->141|1353->152|1415->194|1467->220|1486->231|1548->273
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|33->8|34->9|34->9|34->9
                  -- GENERATED --
              */
          