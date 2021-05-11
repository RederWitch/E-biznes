
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

object productReview extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[ProductReview],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rew: Seq[ProductReview]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/for(a <- rew) yield /*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),_display_(/*4.6*/a/*4.7*/.id),format.raw/*4.10*/(""" """),format.raw/*4.11*/("""|
    """),_display_(/*5.6*/a/*5.7*/.productId),format.raw/*5.17*/(""" """),format.raw/*5.18*/("""|
    """),_display_(/*6.6*/a/*6.7*/.date),format.raw/*6.12*/("""
    """),_display_(/*7.6*/a/*7.7*/.description),format.raw/*7.19*/("""
    """),_display_(/*8.6*/a/*8.7*/.userId),format.raw/*8.14*/("""

    """),format.raw/*10.5*/("""<a href=""""),_display_(/*10.15*/controllers/*10.26*/.routes.ProductReviewController.updateProductReview(a.id)),format.raw/*10.83*/("""">Edit</a>
    <a href=""""),_display_(/*11.15*/controllers/*11.26*/.routes.ProductReviewController.deleteProductReview(a.id)),format.raw/*11.83*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(rew:Seq[ProductReview]): play.twirl.api.HtmlFormat.Appendable = apply(rew)

  def f:((Seq[ProductReview]) => play.twirl.api.HtmlFormat.Appendable) = (rew) => apply(rew)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-05-11T18:27:16.571
                  SOURCE: /home/wiki/Pulpit/e-biznes/wojtek/E-biznes/sklep_play/app/views/productReview.scala.html
                  HASH: e993e47580648206efa1d703edce8a2601f6e25c
                  MATRIX: 749->1|869->26|899->31|927->44|966->46|998->53|1006->54|1029->57|1057->58|1090->66|1098->67|1128->77|1156->78|1189->86|1197->87|1222->92|1254->99|1262->100|1294->112|1326->119|1334->120|1361->127|1396->135|1433->145|1453->156|1531->213|1584->239|1604->250|1682->307
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|35->10|35->10|35->10|35->10|36->11|36->11|36->11
                  -- GENERATED --
              */
          