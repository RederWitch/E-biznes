// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wiki/Pulpit/e-biznes/shop-scala/E-biznes/e-biz-zad-3/conf/routes
// @DATE:Tue May 11 19:52:13 CEST 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_10: controllers.HomeController,
  // @LINE:10
  Assets_9: controllers.Assets,
  // @LINE:13
  ProductController_7: controllers.ProductController,
  // @LINE:28
  CategoryController_4: controllers.CategoryController,
  // @LINE:43
  UserController_8: controllers.UserController,
  // @LINE:58
  PaymentController_5: controllers.PaymentController,
  // @LINE:73
  AddressController_3: controllers.AddressController,
  // @LINE:88
  DiscountController_11: controllers.DiscountController,
  // @LINE:103
  CartController_0: controllers.CartController,
  // @LINE:118
  OrderController_1: controllers.OrderController,
  // @LINE:133
  RecordInCartController_2: controllers.RecordInCartController,
  // @LINE:148
  ProductReviewController_6: controllers.ProductReviewController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_10: controllers.HomeController,
    // @LINE:10
    Assets_9: controllers.Assets,
    // @LINE:13
    ProductController_7: controllers.ProductController,
    // @LINE:28
    CategoryController_4: controllers.CategoryController,
    // @LINE:43
    UserController_8: controllers.UserController,
    // @LINE:58
    PaymentController_5: controllers.PaymentController,
    // @LINE:73
    AddressController_3: controllers.AddressController,
    // @LINE:88
    DiscountController_11: controllers.DiscountController,
    // @LINE:103
    CartController_0: controllers.CartController,
    // @LINE:118
    OrderController_1: controllers.OrderController,
    // @LINE:133
    RecordInCartController_2: controllers.RecordInCartController,
    // @LINE:148
    ProductReviewController_6: controllers.ProductReviewController
  ) = this(errorHandler, HomeController_10, Assets_9, ProductController_7, CategoryController_4, UserController_8, PaymentController_5, AddressController_3, DiscountController_11, CartController_0, OrderController_1, RecordInCartController_2, ProductReviewController_6, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_10, Assets_9, ProductController_7, CategoryController_4, UserController_8, PaymentController_5, AddressController_3, DiscountController_11, CartController_0, OrderController_1, RecordInCartController_2, ProductReviewController_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproducthandle""", """controllers.ProductController.addProductHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/del/""" + "$" + """id<[^/]+>""", """controllers.ProductController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/up/""" + "$" + """id<[^/]+>""", """controllers.ProductController.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproducthandle""", """controllers.ProductController.updateProductHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/products""", """controllers.ProductController.getProductsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.getProductJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product""", """controllers.ProductController.addProductJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product/""" + "$" + """id<[^/]+>""", """controllers.ProductController.deleteProductJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/product_update""", """controllers.ProductController.updateProductJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.CategoryController.addCategory"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategoryhandle""", """controllers.CategoryController.addCategoryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.CategoryController.getCategories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.getCategory(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/del/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.deleteCategory(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category/up/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.updateCategory(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecategoryhandle""", """controllers.CategoryController.updateCategoryHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/categories""", """controllers.CategoryController.getCategoriesJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.getCategoryJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/category""", """controllers.CategoryController.addCategoryJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/category/""" + "$" + """id<[^/]+>""", """controllers.CategoryController.deleteCategoryJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/category_update""", """controllers.CategoryController.updateCategoryJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.UserController.addUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduserhandle""", """controllers.UserController.addUserHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.getUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/del/""" + "$" + """id<[^/]+>""", """controllers.UserController.deleteUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/up/""" + "$" + """id<[^/]+>""", """controllers.UserController.updateUser(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuserhandle""", """controllers.UserController.updateUserHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/users""", """controllers.UserController.getUsersJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>""", """controllers.UserController.getUserJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user""", """controllers.UserController.addUserJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user/""" + "$" + """id<[^/]+>""", """controllers.UserController.deleteUserJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/user_update""", """controllers.UserController.updateUserJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpayment""", """controllers.PaymentController.addPayment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addpaymentHandle""", """controllers.PaymentController.addPaymentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payments""", """controllers.PaymentController.getPayments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.getPayment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment/del/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.deletePayment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment/up/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.updatePayment(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatepaymentHandle""", """controllers.PaymentController.updatePaymentHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayments""", """controllers.PaymentController.getPaymentsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayment""" + "$" + """id<[^/]+>""", """controllers.PaymentController.getPaymentJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayment""", """controllers.PaymentController.addPaymentJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayment/""" + "$" + """id<[^/]+>""", """controllers.PaymentController.deletePaymentJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersPayment_update""", """controllers.PaymentController.updatePaymentJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addaddress""", """controllers.AddressController.addAddress"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addaddressHandle""", """controllers.AddressController.addAddressHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addresses""", """controllers.AddressController.getAddresses"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address/""" + "$" + """id<[^/]+>""", """controllers.AddressController.getAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address/del/""" + "$" + """id<[^/]+>""", """controllers.AddressController.deleteAddress(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """address/up/""" + "$" + """id<[^/]+>""", """controllers.AddressController.updateAddress(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateaddress""", """controllers.AddressController.updateAddressHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/usersAddresses""", """controllers.AddressController.getUsersAddressesJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addresses/""" + "$" + """id<[^/]+>""", """controllers.AddressController.getAddressesJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addres""", """controllers.AddressController.addaddresJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addres/""" + "$" + """id<[^/]+>""", """controllers.AddressController.deleteaddresJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/addres_update""", """controllers.AddressController.updateaddrestJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddiscount""", """controllers.DiscountController.addDiscount"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adddiscountHandle""", """controllers.DiscountController.addDiscountHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discounts""", """controllers.DiscountController.getDiscounts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.getDiscount(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/del/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.deleteDiscount(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """discount/up/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.updateDiscount(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatediscount""", """controllers.DiscountController.updateDiscountHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discounts""", """controllers.DiscountController.getDiscountsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.getDiscountJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount""", """controllers.DiscountController.addDiscountJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount/""" + "$" + """id<[^/]+>""", """controllers.DiscountController.deleteDiscountJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/discount_update""", """controllers.DiscountController.updateDiscountJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcart""", """controllers.CartController.addCart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcartHandle""", """controllers.CartController.addCartHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """carts""", """controllers.CartController.getCarts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""" + "$" + """id<[^/]+>""", """controllers.CartController.getCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/del/""" + "$" + """id<[^/]+>""", """controllers.CartController.deleteCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/up/""" + "$" + """id<[^/]+>""", """controllers.CartController.updateCart(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecart""", """controllers.CartController.updateCartHandle()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/carts""", """controllers.CartController.getCartsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/carts/""" + "$" + """id<[^/]+>""", """controllers.CartController.getCartJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cart""", """controllers.CartController.addCartJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cart/""" + "$" + """id<[^/]+>""", """controllers.CartController.deleteCartJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cart_update""", """controllers.CartController.updateCartJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addorder""", """controllers.OrderController.addOrder"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderHandle""", """controllers.OrderController.addOrderHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orders""", """controllers.OrderController.getOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.getOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/del/""" + "$" + """id<[^/]+>""", """controllers.OrderController.deleteOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """order/up/""" + "$" + """id<[^/]+>""", """controllers.OrderController.updateOrder(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateorder""", """controllers.OrderController.updateOrderHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/orders""", """controllers.OrderController.getOrdersJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.getOrderJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order""", """controllers.OrderController.addOrderJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order/""" + "$" + """id<[^/]+>""", """controllers.OrderController.deleteOrderJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/order_update""", """controllers.OrderController.updateOrderJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addrecordInCart""", """controllers.RecordInCartController.addRecordInCart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addrecordInCartHandle""", """controllers.RecordInCartController.addRecordInCartHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recordInCarts""", """controllers.RecordInCartController.getRecordInCarts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recordInCart/""" + "$" + """id<[^/]+>""", """controllers.RecordInCartController.getRecordInCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recordInCart/del/""" + "$" + """id<[^/]+>""", """controllers.RecordInCartController.deleteRecordInCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recordInCart/up/""" + "$" + """id<[^/]+>""", """controllers.RecordInCartController.updateRecordInCart(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updaterecordInCart""", """controllers.RecordInCartController.updateRecordInCartHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cartsItems""", """controllers.RecordInCartController.getCartsItemsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/recordInCarts/""" + "$" + """id<[^/]+>""", """controllers.RecordInCartController.getCarItemsJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/recordInCart""", """controllers.RecordInCartController.addCarItemJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/recordInCart/""" + "$" + """id<[^/]+>""", """controllers.RecordInCartController.deleteCarItemJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/recordInCart_update""", """controllers.RecordInCartController.updateCarItemJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReview""", """controllers.ProductReviewController.addProductReview"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReviewHandle""", """controllers.ProductReviewController.addProductReviewHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReviews""", """controllers.ProductReviewController.getProductReviews"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReview/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.getProductReview(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReview/del/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.deleteProductReview(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productReview/up/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.updateProductReview(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateproductReview""", """controllers.ProductReviewController.updateProductReviewHandle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productsReviews""", """controllers.ProductReviewController.getProductdReviewsJson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productReviews/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.getProductReviewsJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productReview""", """controllers.ProductReviewController.addProductReviewJson"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productReview/""" + "$" + """id<[^/]+>""", """controllers.ProductReviewController.deleteProductReviewJson(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/productReview_update""", """controllers.ProductReviewController.updateProductReviewJson"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_10.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProductController_addProduct2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct2_invoker = createInvoker(
    ProductController_7.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addproduct""",
      """ products routes (ok)""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ProductController_addProductHandle3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproducthandle")))
  )
  private[this] lazy val controllers_ProductController_addProductHandle3_invoker = createInvoker(
    ProductController_7.addProductHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProductHandle",
      Nil,
      "POST",
      this.prefix + """addproducthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ProductController_getProducts4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts4_invoker = createInvoker(
    ProductController_7.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ProductController_getProduct5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProduct5_invoker = createInvoker(
    ProductController_7.getProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ProductController_deleteProduct6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_deleteProduct6_invoker = createInvoker(
    ProductController_7.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ProductController_updateProduct7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_updateProduct7_invoker = createInvoker(
    ProductController_7.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """product/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ProductController_updateProductHandle8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproducthandle")))
  )
  private[this] lazy val controllers_ProductController_updateProductHandle8_invoker = createInvoker(
    ProductController_7.updateProductHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProductHandle",
      Nil,
      "POST",
      this.prefix + """updateproducthandle""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ProductController_getProductsJson9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/products")))
  )
  private[this] lazy val controllers_ProductController_getProductsJson9_invoker = createInvoker(
    ProductController_7.getProductsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProductsJson",
      Nil,
      "GET",
      this.prefix + """api/products""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ProductController_getProductJson10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_getProductJson10_invoker = createInvoker(
    ProductController_7.getProductJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProductJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ProductController_addProductJson11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product")))
  )
  private[this] lazy val controllers_ProductController_addProductJson11_invoker = createInvoker(
    ProductController_7.addProductJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProductJson",
      Nil,
      "POST",
      this.prefix + """api/product""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProductController_deleteProductJson12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductController_deleteProductJson12_invoker = createInvoker(
    ProductController_7.deleteProductJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "deleteProductJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/product/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProductController_updateProductJson13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/product_update")))
  )
  private[this] lazy val controllers_ProductController_updateProductJson13_invoker = createInvoker(
    ProductController_7.updateProductJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "updateProductJson",
      Nil,
      "POST",
      this.prefix + """api/product_update""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CategoryController_addCategory14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory14_invoker = createInvoker(
    CategoryController_4.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "GET",
      this.prefix + """addcategory""",
      """ category routes (ok)""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_CategoryController_addCategoryHandle15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategoryhandle")))
  )
  private[this] lazy val controllers_CategoryController_addCategoryHandle15_invoker = createInvoker(
    CategoryController_4.addCategoryHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategoryHandle",
      Nil,
      "POST",
      this.prefix + """addcategoryhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_CategoryController_getCategories16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_CategoryController_getCategories16_invoker = createInvoker(
    CategoryController_4.getCategories,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategories",
      Nil,
      "GET",
      this.prefix + """categories""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_CategoryController_getCategory17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_getCategory17_invoker = createInvoker(
    CategoryController_4.getCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategory",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_CategoryController_deleteCategory18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_deleteCategory18_invoker = createInvoker(
    CategoryController_4.deleteCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "deleteCategory",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """category/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_CategoryController_updateCategory19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_updateCategory19_invoker = createInvoker(
    CategoryController_4.updateCategory(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "updateCategory",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """category/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_CategoryController_updateCategoryHandle20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecategoryhandle")))
  )
  private[this] lazy val controllers_CategoryController_updateCategoryHandle20_invoker = createInvoker(
    CategoryController_4.updateCategoryHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "updateCategoryHandle",
      Nil,
      "POST",
      this.prefix + """updatecategoryhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_CategoryController_getCategoriesJson21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/categories")))
  )
  private[this] lazy val controllers_CategoryController_getCategoriesJson21_invoker = createInvoker(
    CategoryController_4.getCategoriesJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategoriesJson",
      Nil,
      "GET",
      this.prefix + """api/categories""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_CategoryController_getCategoryJson22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_getCategoryJson22_invoker = createInvoker(
    CategoryController_4.getCategoryJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategoryJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_CategoryController_addCategoryJson23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/category")))
  )
  private[this] lazy val controllers_CategoryController_addCategoryJson23_invoker = createInvoker(
    CategoryController_4.addCategoryJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategoryJson",
      Nil,
      "POST",
      this.prefix + """api/category""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_CategoryController_deleteCategoryJson24_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/category/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoryController_deleteCategoryJson24_invoker = createInvoker(
    CategoryController_4.deleteCategoryJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "deleteCategoryJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/category/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_CategoryController_updateCategoryJson25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/category_update")))
  )
  private[this] lazy val controllers_CategoryController_updateCategoryJson25_invoker = createInvoker(
    CategoryController_4.updateCategoryJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "updateCategoryJson",
      Nil,
      "POST",
      this.prefix + """api/category_update""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_UserController_addUser26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_UserController_addUser26_invoker = createInvoker(
    UserController_8.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "GET",
      this.prefix + """adduser""",
      """ user routes (ok)""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_UserController_addUserHandle27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduserhandle")))
  )
  private[this] lazy val controllers_UserController_addUserHandle27_invoker = createInvoker(
    UserController_8.addUserHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUserHandle",
      Nil,
      "POST",
      this.prefix + """adduserhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_UserController_getUsers28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getUsers28_invoker = createInvoker(
    UserController_8.getUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_UserController_getUser29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUser29_invoker = createInvoker(
    UserController_8.getUser(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_UserController_deleteUser30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUser30_invoker = createInvoker(
    UserController_8.deleteUser(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUser",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_UserController_updateUser31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_updateUser31_invoker = createInvoker(
    UserController_8.updateUser(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUser",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_UserController_updateUserHandle32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuserhandle")))
  )
  private[this] lazy val controllers_UserController_updateUserHandle32_invoker = createInvoker(
    UserController_8.updateUserHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUserHandle",
      Nil,
      "POST",
      this.prefix + """updateuserhandle""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_UserController_getUsersJson33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/users")))
  )
  private[this] lazy val controllers_UserController_getUsersJson33_invoker = createInvoker(
    UserController_8.getUsersJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsersJson",
      Nil,
      "GET",
      this.prefix + """api/users""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_UserController_getUserJson34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUserJson34_invoker = createInvoker(
    UserController_8.getUserJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUserJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_UserController_addUserJson35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user")))
  )
  private[this] lazy val controllers_UserController_addUserJson35_invoker = createInvoker(
    UserController_8.addUserJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUserJson",
      Nil,
      "POST",
      this.prefix + """api/user""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_UserController_deleteUserJson36_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUserJson36_invoker = createInvoker(
    UserController_8.deleteUserJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUserJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_UserController_updateUserJson37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/user_update")))
  )
  private[this] lazy val controllers_UserController_updateUserJson37_invoker = createInvoker(
    UserController_8.updateUserJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUserJson",
      Nil,
      "POST",
      this.prefix + """api/user_update""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_PaymentController_addPayment38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpayment")))
  )
  private[this] lazy val controllers_PaymentController_addPayment38_invoker = createInvoker(
    PaymentController_5.addPayment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "addPayment",
      Nil,
      "GET",
      this.prefix + """addpayment""",
      """ payment data (ok)""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_PaymentController_addPaymentHandle39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addpaymentHandle")))
  )
  private[this] lazy val controllers_PaymentController_addPaymentHandle39_invoker = createInvoker(
    PaymentController_5.addPaymentHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "addPaymentHandle",
      Nil,
      "POST",
      this.prefix + """addpaymentHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_PaymentController_getPayments40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payments")))
  )
  private[this] lazy val controllers_PaymentController_getPayments40_invoker = createInvoker(
    PaymentController_5.getPayments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPayments",
      Nil,
      "GET",
      this.prefix + """payments""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_PaymentController_getPayment41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_getPayment41_invoker = createInvoker(
    PaymentController_5.getPayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPayment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """payment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_PaymentController_deletePayment42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_deletePayment42_invoker = createInvoker(
    PaymentController_5.deletePayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "deletePayment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """payment/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_PaymentController_updatePayment43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_updatePayment43_invoker = createInvoker(
    PaymentController_5.updatePayment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "updatePayment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """payment/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_PaymentController_updatePaymentHandle44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatepaymentHandle")))
  )
  private[this] lazy val controllers_PaymentController_updatePaymentHandle44_invoker = createInvoker(
    PaymentController_5.updatePaymentHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "updatePaymentHandle",
      Nil,
      "POST",
      this.prefix + """updatepaymentHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_PaymentController_getPaymentsJson45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayments")))
  )
  private[this] lazy val controllers_PaymentController_getPaymentsJson45_invoker = createInvoker(
    PaymentController_5.getPaymentsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPaymentsJson",
      Nil,
      "GET",
      this.prefix + """api/usersPayments""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_PaymentController_getPaymentJson46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayment"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_getPaymentJson46_invoker = createInvoker(
    PaymentController_5.getPaymentJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "getPaymentJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/usersPayment""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_PaymentController_addPaymentJson47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayment")))
  )
  private[this] lazy val controllers_PaymentController_addPaymentJson47_invoker = createInvoker(
    PaymentController_5.addPaymentJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "addPaymentJson",
      Nil,
      "POST",
      this.prefix + """api/usersPayment""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_PaymentController_deletePaymentJson48_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaymentController_deletePaymentJson48_invoker = createInvoker(
    PaymentController_5.deletePaymentJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "deletePaymentJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/usersPayment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_PaymentController_updatePaymentJson49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersPayment_update")))
  )
  private[this] lazy val controllers_PaymentController_updatePaymentJson49_invoker = createInvoker(
    PaymentController_5.updatePaymentJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaymentController",
      "updatePaymentJson",
      Nil,
      "POST",
      this.prefix + """api/usersPayment_update""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_AddressController_addAddress50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addaddress")))
  )
  private[this] lazy val controllers_AddressController_addAddress50_invoker = createInvoker(
    AddressController_3.addAddress,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "addAddress",
      Nil,
      "GET",
      this.prefix + """addaddress""",
      """ address (ok)""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_AddressController_addAddressHandle51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addaddressHandle")))
  )
  private[this] lazy val controllers_AddressController_addAddressHandle51_invoker = createInvoker(
    AddressController_3.addAddressHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "addAddressHandle",
      Nil,
      "POST",
      this.prefix + """addaddressHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_AddressController_getAddresses52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addresses")))
  )
  private[this] lazy val controllers_AddressController_getAddresses52_invoker = createInvoker(
    AddressController_3.getAddresses,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "getAddresses",
      Nil,
      "GET",
      this.prefix + """addresses""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_AddressController_getAddress53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_getAddress53_invoker = createInvoker(
    AddressController_3.getAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "getAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """address/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_AddressController_deleteAddress54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_deleteAddress54_invoker = createInvoker(
    AddressController_3.deleteAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "deleteAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """address/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_AddressController_updateAddress55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("address/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_updateAddress55_invoker = createInvoker(
    AddressController_3.updateAddress(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "updateAddress",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """address/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_AddressController_updateAddressHandle56_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateaddress")))
  )
  private[this] lazy val controllers_AddressController_updateAddressHandle56_invoker = createInvoker(
    AddressController_3.updateAddressHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "updateAddressHandle",
      Nil,
      "POST",
      this.prefix + """updateaddress""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_AddressController_getUsersAddressesJson57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/usersAddresses")))
  )
  private[this] lazy val controllers_AddressController_getUsersAddressesJson57_invoker = createInvoker(
    AddressController_3.getUsersAddressesJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "getUsersAddressesJson",
      Nil,
      "GET",
      this.prefix + """api/usersAddresses""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_AddressController_getAddressesJson58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addresses/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_getAddressesJson58_invoker = createInvoker(
    AddressController_3.getAddressesJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "getAddressesJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/addresses/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_AddressController_addaddresJson59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addres")))
  )
  private[this] lazy val controllers_AddressController_addaddresJson59_invoker = createInvoker(
    AddressController_3.addaddresJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "addaddresJson",
      Nil,
      "POST",
      this.prefix + """api/addres""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_AddressController_deleteaddresJson60_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addres/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AddressController_deleteaddresJson60_invoker = createInvoker(
    AddressController_3.deleteaddresJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "deleteaddresJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/addres/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_AddressController_updateaddrestJson61_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/addres_update")))
  )
  private[this] lazy val controllers_AddressController_updateaddrestJson61_invoker = createInvoker(
    AddressController_3.updateaddrestJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AddressController",
      "updateaddrestJson",
      Nil,
      "POST",
      this.prefix + """api/addres_update""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_DiscountController_addDiscount62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddiscount")))
  )
  private[this] lazy val controllers_DiscountController_addDiscount62_invoker = createInvoker(
    DiscountController_11.addDiscount,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscount",
      Nil,
      "GET",
      this.prefix + """adddiscount""",
      """ discount (ok)""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_DiscountController_addDiscountHandle63_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adddiscountHandle")))
  )
  private[this] lazy val controllers_DiscountController_addDiscountHandle63_invoker = createInvoker(
    DiscountController_11.addDiscountHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscountHandle",
      Nil,
      "POST",
      this.prefix + """adddiscountHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_DiscountController_getDiscounts64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discounts")))
  )
  private[this] lazy val controllers_DiscountController_getDiscounts64_invoker = createInvoker(
    DiscountController_11.getDiscounts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscounts",
      Nil,
      "GET",
      this.prefix + """discounts""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_DiscountController_getDiscount65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_getDiscount65_invoker = createInvoker(
    DiscountController_11.getDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscount",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_DiscountController_deleteDiscount66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_deleteDiscount66_invoker = createInvoker(
    DiscountController_11.deleteDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "deleteDiscount",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """discount/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_DiscountController_updateDiscount67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("discount/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_updateDiscount67_invoker = createInvoker(
    DiscountController_11.updateDiscount(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscount",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """discount/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_DiscountController_updateDiscountHandle68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatediscount")))
  )
  private[this] lazy val controllers_DiscountController_updateDiscountHandle68_invoker = createInvoker(
    DiscountController_11.updateDiscountHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscountHandle",
      Nil,
      "POST",
      this.prefix + """updatediscount""",
      """""",
      Seq()
    )
  )

  // @LINE:96
  private[this] lazy val controllers_DiscountController_getDiscountsJson69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discounts")))
  )
  private[this] lazy val controllers_DiscountController_getDiscountsJson69_invoker = createInvoker(
    DiscountController_11.getDiscountsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscountsJson",
      Nil,
      "GET",
      this.prefix + """api/discounts""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_DiscountController_getDiscountJson70_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_getDiscountJson70_invoker = createInvoker(
    DiscountController_11.getDiscountJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "getDiscountJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_DiscountController_addDiscountJson71_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount")))
  )
  private[this] lazy val controllers_DiscountController_addDiscountJson71_invoker = createInvoker(
    DiscountController_11.addDiscountJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "addDiscountJson",
      Nil,
      "POST",
      this.prefix + """api/discount""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_DiscountController_deleteDiscountJson72_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DiscountController_deleteDiscountJson72_invoker = createInvoker(
    DiscountController_11.deleteDiscountJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "deleteDiscountJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/discount/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val controllers_DiscountController_updateDiscountJson73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/discount_update")))
  )
  private[this] lazy val controllers_DiscountController_updateDiscountJson73_invoker = createInvoker(
    DiscountController_11.updateDiscountJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DiscountController",
      "updateDiscountJson",
      Nil,
      "POST",
      this.prefix + """api/discount_update""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_CartController_addCart74_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcart")))
  )
  private[this] lazy val controllers_CartController_addCart74_invoker = createInvoker(
    CartController_0.addCart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addCart",
      Nil,
      "GET",
      this.prefix + """addcart""",
      """ cart routes (ok)""",
      Seq()
    )
  )

  // @LINE:104
  private[this] lazy val controllers_CartController_addCartHandle75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcartHandle")))
  )
  private[this] lazy val controllers_CartController_addCartHandle75_invoker = createInvoker(
    CartController_0.addCartHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addCartHandle",
      Nil,
      "POST",
      this.prefix + """addcartHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val controllers_CartController_getCarts76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("carts")))
  )
  private[this] lazy val controllers_CartController_getCarts76_invoker = createInvoker(
    CartController_0.getCarts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCarts",
      Nil,
      "GET",
      this.prefix + """carts""",
      """""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val controllers_CartController_getCart77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_getCart77_invoker = createInvoker(
    CartController_0.getCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:107
  private[this] lazy val controllers_CartController_deleteCart78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_deleteCart78_invoker = createInvoker(
    CartController_0.deleteCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "deleteCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val controllers_CartController_updateCart79_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_updateCart79_invoker = createInvoker(
    CartController_0.updateCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "updateCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """cart/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:109
  private[this] lazy val controllers_CartController_updateCartHandle80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecart")))
  )
  private[this] lazy val controllers_CartController_updateCartHandle80_invoker = createInvoker(
    CartController_0.updateCartHandle(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "updateCartHandle",
      Nil,
      "POST",
      this.prefix + """updatecart""",
      """""",
      Seq()
    )
  )

  // @LINE:111
  private[this] lazy val controllers_CartController_getCartsJson81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/carts")))
  )
  private[this] lazy val controllers_CartController_getCartsJson81_invoker = createInvoker(
    CartController_0.getCartsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCartsJson",
      Nil,
      "GET",
      this.prefix + """api/carts""",
      """""",
      Seq()
    )
  )

  // @LINE:112
  private[this] lazy val controllers_CartController_getCartJson82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/carts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_getCartJson82_invoker = createInvoker(
    CartController_0.getCartJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "getCartJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/carts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_CartController_addCartJson83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cart")))
  )
  private[this] lazy val controllers_CartController_addCartJson83_invoker = createInvoker(
    CartController_0.addCartJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "addCartJson",
      Nil,
      "POST",
      this.prefix + """api/cart""",
      """""",
      Seq()
    )
  )

  // @LINE:114
  private[this] lazy val controllers_CartController_deleteCartJson84_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CartController_deleteCartJson84_invoker = createInvoker(
    CartController_0.deleteCartJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "deleteCartJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:115
  private[this] lazy val controllers_CartController_updateCartJson85_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cart_update")))
  )
  private[this] lazy val controllers_CartController_updateCartJson85_invoker = createInvoker(
    CartController_0.updateCartJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CartController",
      "updateCartJson",
      Nil,
      "POST",
      this.prefix + """api/cart_update""",
      """""",
      Seq()
    )
  )

  // @LINE:118
  private[this] lazy val controllers_OrderController_addOrder86_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addorder")))
  )
  private[this] lazy val controllers_OrderController_addOrder86_invoker = createInvoker(
    OrderController_1.addOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrder",
      Nil,
      "GET",
      this.prefix + """addorder""",
      """ order routes""",
      Seq()
    )
  )

  // @LINE:119
  private[this] lazy val controllers_OrderController_addOrderHandle87_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderHandle")))
  )
  private[this] lazy val controllers_OrderController_addOrderHandle87_invoker = createInvoker(
    OrderController_1.addOrderHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrderHandle",
      Nil,
      "POST",
      this.prefix + """orderHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:120
  private[this] lazy val controllers_OrderController_getOrders88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orders")))
  )
  private[this] lazy val controllers_OrderController_getOrders88_invoker = createInvoker(
    OrderController_1.getOrders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrders",
      Nil,
      "GET",
      this.prefix + """orders""",
      """""",
      Seq()
    )
  )

  // @LINE:121
  private[this] lazy val controllers_OrderController_getOrder89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrder89_invoker = createInvoker(
    OrderController_1.getOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:122
  private[this] lazy val controllers_OrderController_deleteOrder90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_deleteOrder90_invoker = createInvoker(
    OrderController_1.deleteOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "deleteOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """order/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:123
  private[this] lazy val controllers_OrderController_updateOrder91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("order/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_updateOrder91_invoker = createInvoker(
    OrderController_1.updateOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "updateOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """order/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:124
  private[this] lazy val controllers_OrderController_updateOrderHandle92_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateorder")))
  )
  private[this] lazy val controllers_OrderController_updateOrderHandle92_invoker = createInvoker(
    OrderController_1.updateOrderHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "updateOrderHandle",
      Nil,
      "POST",
      this.prefix + """updateorder""",
      """""",
      Seq()
    )
  )

  // @LINE:126
  private[this] lazy val controllers_OrderController_getOrdersJson93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/orders")))
  )
  private[this] lazy val controllers_OrderController_getOrdersJson93_invoker = createInvoker(
    OrderController_1.getOrdersJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrdersJson",
      Nil,
      "GET",
      this.prefix + """api/orders""",
      """""",
      Seq()
    )
  )

  // @LINE:127
  private[this] lazy val controllers_OrderController_getOrderJson94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_getOrderJson94_invoker = createInvoker(
    OrderController_1.getOrderJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "getOrderJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:128
  private[this] lazy val controllers_OrderController_addOrderJson95_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order")))
  )
  private[this] lazy val controllers_OrderController_addOrderJson95_invoker = createInvoker(
    OrderController_1.addOrderJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "addOrderJson",
      Nil,
      "POST",
      this.prefix + """api/order""",
      """""",
      Seq()
    )
  )

  // @LINE:129
  private[this] lazy val controllers_OrderController_deleteOrderJson96_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrderController_deleteOrderJson96_invoker = createInvoker(
    OrderController_1.deleteOrderJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "deleteOrderJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/order/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:130
  private[this] lazy val controllers_OrderController_updateOrderJson97_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/order_update")))
  )
  private[this] lazy val controllers_OrderController_updateOrderJson97_invoker = createInvoker(
    OrderController_1.updateOrderJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrderController",
      "updateOrderJson",
      Nil,
      "POST",
      this.prefix + """api/order_update""",
      """""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_RecordInCartController_addRecordInCart98_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addrecordInCart")))
  )
  private[this] lazy val controllers_RecordInCartController_addRecordInCart98_invoker = createInvoker(
    RecordInCartController_2.addRecordInCart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "addRecordInCart",
      Nil,
      "GET",
      this.prefix + """addrecordInCart""",
      """ recordInCart routes""",
      Seq()
    )
  )

  // @LINE:134
  private[this] lazy val controllers_RecordInCartController_addRecordInCartHandle99_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addrecordInCartHandle")))
  )
  private[this] lazy val controllers_RecordInCartController_addRecordInCartHandle99_invoker = createInvoker(
    RecordInCartController_2.addRecordInCartHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "addRecordInCartHandle",
      Nil,
      "POST",
      this.prefix + """addrecordInCartHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:135
  private[this] lazy val controllers_RecordInCartController_getRecordInCarts100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recordInCarts")))
  )
  private[this] lazy val controllers_RecordInCartController_getRecordInCarts100_invoker = createInvoker(
    RecordInCartController_2.getRecordInCarts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "getRecordInCarts",
      Nil,
      "GET",
      this.prefix + """recordInCarts""",
      """""",
      Seq()
    )
  )

  // @LINE:136
  private[this] lazy val controllers_RecordInCartController_getRecordInCart101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recordInCart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecordInCartController_getRecordInCart101_invoker = createInvoker(
    RecordInCartController_2.getRecordInCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "getRecordInCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """recordInCart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:137
  private[this] lazy val controllers_RecordInCartController_deleteRecordInCart102_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recordInCart/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecordInCartController_deleteRecordInCart102_invoker = createInvoker(
    RecordInCartController_2.deleteRecordInCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "deleteRecordInCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """recordInCart/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:138
  private[this] lazy val controllers_RecordInCartController_updateRecordInCart103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recordInCart/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecordInCartController_updateRecordInCart103_invoker = createInvoker(
    RecordInCartController_2.updateRecordInCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "updateRecordInCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """recordInCart/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:139
  private[this] lazy val controllers_RecordInCartController_updateRecordInCartHandle104_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updaterecordInCart")))
  )
  private[this] lazy val controllers_RecordInCartController_updateRecordInCartHandle104_invoker = createInvoker(
    RecordInCartController_2.updateRecordInCartHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "updateRecordInCartHandle",
      Nil,
      "POST",
      this.prefix + """updaterecordInCart""",
      """""",
      Seq()
    )
  )

  // @LINE:141
  private[this] lazy val controllers_RecordInCartController_getCartsItemsJson105_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cartsItems")))
  )
  private[this] lazy val controllers_RecordInCartController_getCartsItemsJson105_invoker = createInvoker(
    RecordInCartController_2.getCartsItemsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "getCartsItemsJson",
      Nil,
      "GET",
      this.prefix + """api/cartsItems""",
      """""",
      Seq()
    )
  )

  // @LINE:142
  private[this] lazy val controllers_RecordInCartController_getCarItemsJson106_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/recordInCarts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecordInCartController_getCarItemsJson106_invoker = createInvoker(
    RecordInCartController_2.getCarItemsJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "getCarItemsJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/recordInCarts/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:143
  private[this] lazy val controllers_RecordInCartController_addCarItemJson107_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/recordInCart")))
  )
  private[this] lazy val controllers_RecordInCartController_addCarItemJson107_invoker = createInvoker(
    RecordInCartController_2.addCarItemJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "addCarItemJson",
      Nil,
      "POST",
      this.prefix + """api/recordInCart""",
      """""",
      Seq()
    )
  )

  // @LINE:144
  private[this] lazy val controllers_RecordInCartController_deleteCarItemJson108_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/recordInCart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecordInCartController_deleteCarItemJson108_invoker = createInvoker(
    RecordInCartController_2.deleteCarItemJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "deleteCarItemJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/recordInCart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:145
  private[this] lazy val controllers_RecordInCartController_updateCarItemJson109_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/recordInCart_update")))
  )
  private[this] lazy val controllers_RecordInCartController_updateCarItemJson109_invoker = createInvoker(
    RecordInCartController_2.updateCarItemJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecordInCartController",
      "updateCarItemJson",
      Nil,
      "POST",
      this.prefix + """api/recordInCart_update""",
      """""",
      Seq()
    )
  )

  // @LINE:148
  private[this] lazy val controllers_ProductReviewController_addProductReview110_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReview")))
  )
  private[this] lazy val controllers_ProductReviewController_addProductReview110_invoker = createInvoker(
    ProductReviewController_6.addProductReview,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "addProductReview",
      Nil,
      "GET",
      this.prefix + """productReview""",
      """# productReview routes""",
      Seq()
    )
  )

  // @LINE:149
  private[this] lazy val controllers_ProductReviewController_addProductReviewHandle111_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReviewHandle")))
  )
  private[this] lazy val controllers_ProductReviewController_addProductReviewHandle111_invoker = createInvoker(
    ProductReviewController_6.addProductReviewHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "addProductReviewHandle",
      Nil,
      "POST",
      this.prefix + """productReviewHandle""",
      """""",
      Seq()
    )
  )

  // @LINE:150
  private[this] lazy val controllers_ProductReviewController_getProductReviews112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReviews")))
  )
  private[this] lazy val controllers_ProductReviewController_getProductReviews112_invoker = createInvoker(
    ProductReviewController_6.getProductReviews,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "getProductReviews",
      Nil,
      "GET",
      this.prefix + """productReviews""",
      """""",
      Seq()
    )
  )

  // @LINE:151
  private[this] lazy val controllers_ProductReviewController_getProductReview113_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_getProductReview113_invoker = createInvoker(
    ProductReviewController_6.getProductReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "getProductReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productReview/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:152
  private[this] lazy val controllers_ProductReviewController_deleteProductReview114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReview/del/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_deleteProductReview114_invoker = createInvoker(
    ProductReviewController_6.deleteProductReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "deleteProductReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productReview/del/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:153
  private[this] lazy val controllers_ProductReviewController_updateProductReview115_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productReview/up/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_updateProductReview115_invoker = createInvoker(
    ProductReviewController_6.updateProductReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "updateProductReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """productReview/up/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:154
  private[this] lazy val controllers_ProductReviewController_updateProductReviewHandle116_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateproductReview")))
  )
  private[this] lazy val controllers_ProductReviewController_updateProductReviewHandle116_invoker = createInvoker(
    ProductReviewController_6.updateProductReviewHandle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "updateProductReviewHandle",
      Nil,
      "POST",
      this.prefix + """updateproductReview""",
      """""",
      Seq()
    )
  )

  // @LINE:156
  private[this] lazy val controllers_ProductReviewController_getProductdReviewsJson117_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productsReviews")))
  )
  private[this] lazy val controllers_ProductReviewController_getProductdReviewsJson117_invoker = createInvoker(
    ProductReviewController_6.getProductdReviewsJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "getProductdReviewsJson",
      Nil,
      "GET",
      this.prefix + """api/productsReviews""",
      """""",
      Seq()
    )
  )

  // @LINE:157
  private[this] lazy val controllers_ProductReviewController_getProductReviewsJson118_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productReviews/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_getProductReviewsJson118_invoker = createInvoker(
    ProductReviewController_6.getProductReviewsJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "getProductReviewsJson",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/productReviews/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:158
  private[this] lazy val controllers_ProductReviewController_addProductReviewJson119_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productReview")))
  )
  private[this] lazy val controllers_ProductReviewController_addProductReviewJson119_invoker = createInvoker(
    ProductReviewController_6.addProductReviewJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "addProductReviewJson",
      Nil,
      "POST",
      this.prefix + """api/productReview""",
      """""",
      Seq()
    )
  )

  // @LINE:159
  private[this] lazy val controllers_ProductReviewController_deleteProductReviewJson120_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProductReviewController_deleteProductReviewJson120_invoker = createInvoker(
    ProductReviewController_6.deleteProductReviewJson(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "deleteProductReviewJson",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/productReview/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:160
  private[this] lazy val controllers_ProductReviewController_updateProductReviewJson121_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/productReview_update")))
  )
  private[this] lazy val controllers_ProductReviewController_updateProductReviewJson121_invoker = createInvoker(
    ProductReviewController_6.updateProductReviewJson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductReviewController",
      "updateProductReviewJson",
      Nil,
      "POST",
      this.prefix + """api/productReview_update""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_10.index())
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_9.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_ProductController_addProduct2_route(params@_) =>
      call { 
        controllers_ProductController_addProduct2_invoker.call(ProductController_7.addProduct)
      }
  
    // @LINE:14
    case controllers_ProductController_addProductHandle3_route(params@_) =>
      call { 
        controllers_ProductController_addProductHandle3_invoker.call(ProductController_7.addProductHandle)
      }
  
    // @LINE:15
    case controllers_ProductController_getProducts4_route(params@_) =>
      call { 
        controllers_ProductController_getProducts4_invoker.call(ProductController_7.getProducts)
      }
  
    // @LINE:16
    case controllers_ProductController_getProduct5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_getProduct5_invoker.call(ProductController_7.getProduct(id))
      }
  
    // @LINE:17
    case controllers_ProductController_deleteProduct6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_deleteProduct6_invoker.call(ProductController_7.deleteProduct(id))
      }
  
    // @LINE:18
    case controllers_ProductController_updateProduct7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_updateProduct7_invoker.call(ProductController_7.updateProduct(id))
      }
  
    // @LINE:19
    case controllers_ProductController_updateProductHandle8_route(params@_) =>
      call { 
        controllers_ProductController_updateProductHandle8_invoker.call(ProductController_7.updateProductHandle)
      }
  
    // @LINE:21
    case controllers_ProductController_getProductsJson9_route(params@_) =>
      call { 
        controllers_ProductController_getProductsJson9_invoker.call(ProductController_7.getProductsJson)
      }
  
    // @LINE:22
    case controllers_ProductController_getProductJson10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_getProductJson10_invoker.call(ProductController_7.getProductJson(id))
      }
  
    // @LINE:23
    case controllers_ProductController_addProductJson11_route(params@_) =>
      call { 
        controllers_ProductController_addProductJson11_invoker.call(ProductController_7.addProductJson)
      }
  
    // @LINE:24
    case controllers_ProductController_deleteProductJson12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductController_deleteProductJson12_invoker.call(ProductController_7.deleteProductJson(id))
      }
  
    // @LINE:25
    case controllers_ProductController_updateProductJson13_route(params@_) =>
      call { 
        controllers_ProductController_updateProductJson13_invoker.call(ProductController_7.updateProductJson)
      }
  
    // @LINE:28
    case controllers_CategoryController_addCategory14_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory14_invoker.call(CategoryController_4.addCategory)
      }
  
    // @LINE:29
    case controllers_CategoryController_addCategoryHandle15_route(params@_) =>
      call { 
        controllers_CategoryController_addCategoryHandle15_invoker.call(CategoryController_4.addCategoryHandle)
      }
  
    // @LINE:30
    case controllers_CategoryController_getCategories16_route(params@_) =>
      call { 
        controllers_CategoryController_getCategories16_invoker.call(CategoryController_4.getCategories)
      }
  
    // @LINE:31
    case controllers_CategoryController_getCategory17_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_getCategory17_invoker.call(CategoryController_4.getCategory(id))
      }
  
    // @LINE:32
    case controllers_CategoryController_deleteCategory18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_deleteCategory18_invoker.call(CategoryController_4.deleteCategory(id))
      }
  
    // @LINE:33
    case controllers_CategoryController_updateCategory19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_updateCategory19_invoker.call(CategoryController_4.updateCategory(id))
      }
  
    // @LINE:34
    case controllers_CategoryController_updateCategoryHandle20_route(params@_) =>
      call { 
        controllers_CategoryController_updateCategoryHandle20_invoker.call(CategoryController_4.updateCategoryHandle)
      }
  
    // @LINE:36
    case controllers_CategoryController_getCategoriesJson21_route(params@_) =>
      call { 
        controllers_CategoryController_getCategoriesJson21_invoker.call(CategoryController_4.getCategoriesJson)
      }
  
    // @LINE:37
    case controllers_CategoryController_getCategoryJson22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_getCategoryJson22_invoker.call(CategoryController_4.getCategoryJson(id))
      }
  
    // @LINE:38
    case controllers_CategoryController_addCategoryJson23_route(params@_) =>
      call { 
        controllers_CategoryController_addCategoryJson23_invoker.call(CategoryController_4.addCategoryJson)
      }
  
    // @LINE:39
    case controllers_CategoryController_deleteCategoryJson24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoryController_deleteCategoryJson24_invoker.call(CategoryController_4.deleteCategoryJson(id))
      }
  
    // @LINE:40
    case controllers_CategoryController_updateCategoryJson25_route(params@_) =>
      call { 
        controllers_CategoryController_updateCategoryJson25_invoker.call(CategoryController_4.updateCategoryJson)
      }
  
    // @LINE:43
    case controllers_UserController_addUser26_route(params@_) =>
      call { 
        controllers_UserController_addUser26_invoker.call(UserController_8.addUser)
      }
  
    // @LINE:44
    case controllers_UserController_addUserHandle27_route(params@_) =>
      call { 
        controllers_UserController_addUserHandle27_invoker.call(UserController_8.addUserHandle)
      }
  
    // @LINE:45
    case controllers_UserController_getUsers28_route(params@_) =>
      call { 
        controllers_UserController_getUsers28_invoker.call(UserController_8.getUsers)
      }
  
    // @LINE:46
    case controllers_UserController_getUser29_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getUser29_invoker.call(UserController_8.getUser(id))
      }
  
    // @LINE:47
    case controllers_UserController_deleteUser30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUser30_invoker.call(UserController_8.deleteUser(id))
      }
  
    // @LINE:48
    case controllers_UserController_updateUser31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_updateUser31_invoker.call(UserController_8.updateUser(id))
      }
  
    // @LINE:49
    case controllers_UserController_updateUserHandle32_route(params@_) =>
      call { 
        controllers_UserController_updateUserHandle32_invoker.call(UserController_8.updateUserHandle)
      }
  
    // @LINE:51
    case controllers_UserController_getUsersJson33_route(params@_) =>
      call { 
        controllers_UserController_getUsersJson33_invoker.call(UserController_8.getUsersJson)
      }
  
    // @LINE:52
    case controllers_UserController_getUserJson34_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_getUserJson34_invoker.call(UserController_8.getUserJson(id))
      }
  
    // @LINE:53
    case controllers_UserController_addUserJson35_route(params@_) =>
      call { 
        controllers_UserController_addUserJson35_invoker.call(UserController_8.addUserJson)
      }
  
    // @LINE:54
    case controllers_UserController_deleteUserJson36_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUserJson36_invoker.call(UserController_8.deleteUserJson(id))
      }
  
    // @LINE:55
    case controllers_UserController_updateUserJson37_route(params@_) =>
      call { 
        controllers_UserController_updateUserJson37_invoker.call(UserController_8.updateUserJson)
      }
  
    // @LINE:58
    case controllers_PaymentController_addPayment38_route(params@_) =>
      call { 
        controllers_PaymentController_addPayment38_invoker.call(PaymentController_5.addPayment)
      }
  
    // @LINE:59
    case controllers_PaymentController_addPaymentHandle39_route(params@_) =>
      call { 
        controllers_PaymentController_addPaymentHandle39_invoker.call(PaymentController_5.addPaymentHandle)
      }
  
    // @LINE:60
    case controllers_PaymentController_getPayments40_route(params@_) =>
      call { 
        controllers_PaymentController_getPayments40_invoker.call(PaymentController_5.getPayments)
      }
  
    // @LINE:61
    case controllers_PaymentController_getPayment41_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaymentController_getPayment41_invoker.call(PaymentController_5.getPayment(id))
      }
  
    // @LINE:62
    case controllers_PaymentController_deletePayment42_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaymentController_deletePayment42_invoker.call(PaymentController_5.deletePayment(id))
      }
  
    // @LINE:63
    case controllers_PaymentController_updatePayment43_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaymentController_updatePayment43_invoker.call(PaymentController_5.updatePayment(id))
      }
  
    // @LINE:64
    case controllers_PaymentController_updatePaymentHandle44_route(params@_) =>
      call { 
        controllers_PaymentController_updatePaymentHandle44_invoker.call(PaymentController_5.updatePaymentHandle)
      }
  
    // @LINE:66
    case controllers_PaymentController_getPaymentsJson45_route(params@_) =>
      call { 
        controllers_PaymentController_getPaymentsJson45_invoker.call(PaymentController_5.getPaymentsJson)
      }
  
    // @LINE:67
    case controllers_PaymentController_getPaymentJson46_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaymentController_getPaymentJson46_invoker.call(PaymentController_5.getPaymentJson(id))
      }
  
    // @LINE:68
    case controllers_PaymentController_addPaymentJson47_route(params@_) =>
      call { 
        controllers_PaymentController_addPaymentJson47_invoker.call(PaymentController_5.addPaymentJson)
      }
  
    // @LINE:69
    case controllers_PaymentController_deletePaymentJson48_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PaymentController_deletePaymentJson48_invoker.call(PaymentController_5.deletePaymentJson(id))
      }
  
    // @LINE:70
    case controllers_PaymentController_updatePaymentJson49_route(params@_) =>
      call { 
        controllers_PaymentController_updatePaymentJson49_invoker.call(PaymentController_5.updatePaymentJson)
      }
  
    // @LINE:73
    case controllers_AddressController_addAddress50_route(params@_) =>
      call { 
        controllers_AddressController_addAddress50_invoker.call(AddressController_3.addAddress)
      }
  
    // @LINE:74
    case controllers_AddressController_addAddressHandle51_route(params@_) =>
      call { 
        controllers_AddressController_addAddressHandle51_invoker.call(AddressController_3.addAddressHandle)
      }
  
    // @LINE:75
    case controllers_AddressController_getAddresses52_route(params@_) =>
      call { 
        controllers_AddressController_getAddresses52_invoker.call(AddressController_3.getAddresses)
      }
  
    // @LINE:76
    case controllers_AddressController_getAddress53_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AddressController_getAddress53_invoker.call(AddressController_3.getAddress(id))
      }
  
    // @LINE:77
    case controllers_AddressController_deleteAddress54_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AddressController_deleteAddress54_invoker.call(AddressController_3.deleteAddress(id))
      }
  
    // @LINE:78
    case controllers_AddressController_updateAddress55_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AddressController_updateAddress55_invoker.call(AddressController_3.updateAddress(id))
      }
  
    // @LINE:79
    case controllers_AddressController_updateAddressHandle56_route(params@_) =>
      call { 
        controllers_AddressController_updateAddressHandle56_invoker.call(AddressController_3.updateAddressHandle)
      }
  
    // @LINE:81
    case controllers_AddressController_getUsersAddressesJson57_route(params@_) =>
      call { 
        controllers_AddressController_getUsersAddressesJson57_invoker.call(AddressController_3.getUsersAddressesJson)
      }
  
    // @LINE:82
    case controllers_AddressController_getAddressesJson58_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AddressController_getAddressesJson58_invoker.call(AddressController_3.getAddressesJson(id))
      }
  
    // @LINE:83
    case controllers_AddressController_addaddresJson59_route(params@_) =>
      call { 
        controllers_AddressController_addaddresJson59_invoker.call(AddressController_3.addaddresJson)
      }
  
    // @LINE:84
    case controllers_AddressController_deleteaddresJson60_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AddressController_deleteaddresJson60_invoker.call(AddressController_3.deleteaddresJson(id))
      }
  
    // @LINE:85
    case controllers_AddressController_updateaddrestJson61_route(params@_) =>
      call { 
        controllers_AddressController_updateaddrestJson61_invoker.call(AddressController_3.updateaddrestJson)
      }
  
    // @LINE:88
    case controllers_DiscountController_addDiscount62_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscount62_invoker.call(DiscountController_11.addDiscount)
      }
  
    // @LINE:89
    case controllers_DiscountController_addDiscountHandle63_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscountHandle63_invoker.call(DiscountController_11.addDiscountHandle)
      }
  
    // @LINE:90
    case controllers_DiscountController_getDiscounts64_route(params@_) =>
      call { 
        controllers_DiscountController_getDiscounts64_invoker.call(DiscountController_11.getDiscounts)
      }
  
    // @LINE:91
    case controllers_DiscountController_getDiscount65_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_getDiscount65_invoker.call(DiscountController_11.getDiscount(id))
      }
  
    // @LINE:92
    case controllers_DiscountController_deleteDiscount66_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_deleteDiscount66_invoker.call(DiscountController_11.deleteDiscount(id))
      }
  
    // @LINE:93
    case controllers_DiscountController_updateDiscount67_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_updateDiscount67_invoker.call(DiscountController_11.updateDiscount(id))
      }
  
    // @LINE:94
    case controllers_DiscountController_updateDiscountHandle68_route(params@_) =>
      call { 
        controllers_DiscountController_updateDiscountHandle68_invoker.call(DiscountController_11.updateDiscountHandle)
      }
  
    // @LINE:96
    case controllers_DiscountController_getDiscountsJson69_route(params@_) =>
      call { 
        controllers_DiscountController_getDiscountsJson69_invoker.call(DiscountController_11.getDiscountsJson)
      }
  
    // @LINE:97
    case controllers_DiscountController_getDiscountJson70_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_getDiscountJson70_invoker.call(DiscountController_11.getDiscountJson(id))
      }
  
    // @LINE:98
    case controllers_DiscountController_addDiscountJson71_route(params@_) =>
      call { 
        controllers_DiscountController_addDiscountJson71_invoker.call(DiscountController_11.addDiscountJson)
      }
  
    // @LINE:99
    case controllers_DiscountController_deleteDiscountJson72_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_DiscountController_deleteDiscountJson72_invoker.call(DiscountController_11.deleteDiscountJson(id))
      }
  
    // @LINE:100
    case controllers_DiscountController_updateDiscountJson73_route(params@_) =>
      call { 
        controllers_DiscountController_updateDiscountJson73_invoker.call(DiscountController_11.updateDiscountJson)
      }
  
    // @LINE:103
    case controllers_CartController_addCart74_route(params@_) =>
      call { 
        controllers_CartController_addCart74_invoker.call(CartController_0.addCart)
      }
  
    // @LINE:104
    case controllers_CartController_addCartHandle75_route(params@_) =>
      call { 
        controllers_CartController_addCartHandle75_invoker.call(CartController_0.addCartHandle)
      }
  
    // @LINE:105
    case controllers_CartController_getCarts76_route(params@_) =>
      call { 
        controllers_CartController_getCarts76_invoker.call(CartController_0.getCarts)
      }
  
    // @LINE:106
    case controllers_CartController_getCart77_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_getCart77_invoker.call(CartController_0.getCart(id))
      }
  
    // @LINE:107
    case controllers_CartController_deleteCart78_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_deleteCart78_invoker.call(CartController_0.deleteCart(id))
      }
  
    // @LINE:108
    case controllers_CartController_updateCart79_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_updateCart79_invoker.call(CartController_0.updateCart(id))
      }
  
    // @LINE:109
    case controllers_CartController_updateCartHandle80_route(params@_) =>
      call { 
        controllers_CartController_updateCartHandle80_invoker.call(CartController_0.updateCartHandle())
      }
  
    // @LINE:111
    case controllers_CartController_getCartsJson81_route(params@_) =>
      call { 
        controllers_CartController_getCartsJson81_invoker.call(CartController_0.getCartsJson)
      }
  
    // @LINE:112
    case controllers_CartController_getCartJson82_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_getCartJson82_invoker.call(CartController_0.getCartJson(id))
      }
  
    // @LINE:113
    case controllers_CartController_addCartJson83_route(params@_) =>
      call { 
        controllers_CartController_addCartJson83_invoker.call(CartController_0.addCartJson)
      }
  
    // @LINE:114
    case controllers_CartController_deleteCartJson84_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CartController_deleteCartJson84_invoker.call(CartController_0.deleteCartJson(id))
      }
  
    // @LINE:115
    case controllers_CartController_updateCartJson85_route(params@_) =>
      call { 
        controllers_CartController_updateCartJson85_invoker.call(CartController_0.updateCartJson)
      }
  
    // @LINE:118
    case controllers_OrderController_addOrder86_route(params@_) =>
      call { 
        controllers_OrderController_addOrder86_invoker.call(OrderController_1.addOrder)
      }
  
    // @LINE:119
    case controllers_OrderController_addOrderHandle87_route(params@_) =>
      call { 
        controllers_OrderController_addOrderHandle87_invoker.call(OrderController_1.addOrderHandle)
      }
  
    // @LINE:120
    case controllers_OrderController_getOrders88_route(params@_) =>
      call { 
        controllers_OrderController_getOrders88_invoker.call(OrderController_1.getOrders)
      }
  
    // @LINE:121
    case controllers_OrderController_getOrder89_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_getOrder89_invoker.call(OrderController_1.getOrder(id))
      }
  
    // @LINE:122
    case controllers_OrderController_deleteOrder90_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_deleteOrder90_invoker.call(OrderController_1.deleteOrder(id))
      }
  
    // @LINE:123
    case controllers_OrderController_updateOrder91_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_updateOrder91_invoker.call(OrderController_1.updateOrder(id))
      }
  
    // @LINE:124
    case controllers_OrderController_updateOrderHandle92_route(params@_) =>
      call { 
        controllers_OrderController_updateOrderHandle92_invoker.call(OrderController_1.updateOrderHandle)
      }
  
    // @LINE:126
    case controllers_OrderController_getOrdersJson93_route(params@_) =>
      call { 
        controllers_OrderController_getOrdersJson93_invoker.call(OrderController_1.getOrdersJson)
      }
  
    // @LINE:127
    case controllers_OrderController_getOrderJson94_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_getOrderJson94_invoker.call(OrderController_1.getOrderJson(id))
      }
  
    // @LINE:128
    case controllers_OrderController_addOrderJson95_route(params@_) =>
      call { 
        controllers_OrderController_addOrderJson95_invoker.call(OrderController_1.addOrderJson)
      }
  
    // @LINE:129
    case controllers_OrderController_deleteOrderJson96_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrderController_deleteOrderJson96_invoker.call(OrderController_1.deleteOrderJson(id))
      }
  
    // @LINE:130
    case controllers_OrderController_updateOrderJson97_route(params@_) =>
      call { 
        controllers_OrderController_updateOrderJson97_invoker.call(OrderController_1.updateOrderJson)
      }
  
    // @LINE:133
    case controllers_RecordInCartController_addRecordInCart98_route(params@_) =>
      call { 
        controllers_RecordInCartController_addRecordInCart98_invoker.call(RecordInCartController_2.addRecordInCart)
      }
  
    // @LINE:134
    case controllers_RecordInCartController_addRecordInCartHandle99_route(params@_) =>
      call { 
        controllers_RecordInCartController_addRecordInCartHandle99_invoker.call(RecordInCartController_2.addRecordInCartHandle)
      }
  
    // @LINE:135
    case controllers_RecordInCartController_getRecordInCarts100_route(params@_) =>
      call { 
        controllers_RecordInCartController_getRecordInCarts100_invoker.call(RecordInCartController_2.getRecordInCarts)
      }
  
    // @LINE:136
    case controllers_RecordInCartController_getRecordInCart101_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecordInCartController_getRecordInCart101_invoker.call(RecordInCartController_2.getRecordInCart(id))
      }
  
    // @LINE:137
    case controllers_RecordInCartController_deleteRecordInCart102_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecordInCartController_deleteRecordInCart102_invoker.call(RecordInCartController_2.deleteRecordInCart(id))
      }
  
    // @LINE:138
    case controllers_RecordInCartController_updateRecordInCart103_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecordInCartController_updateRecordInCart103_invoker.call(RecordInCartController_2.updateRecordInCart(id))
      }
  
    // @LINE:139
    case controllers_RecordInCartController_updateRecordInCartHandle104_route(params@_) =>
      call { 
        controllers_RecordInCartController_updateRecordInCartHandle104_invoker.call(RecordInCartController_2.updateRecordInCartHandle)
      }
  
    // @LINE:141
    case controllers_RecordInCartController_getCartsItemsJson105_route(params@_) =>
      call { 
        controllers_RecordInCartController_getCartsItemsJson105_invoker.call(RecordInCartController_2.getCartsItemsJson)
      }
  
    // @LINE:142
    case controllers_RecordInCartController_getCarItemsJson106_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecordInCartController_getCarItemsJson106_invoker.call(RecordInCartController_2.getCarItemsJson(id))
      }
  
    // @LINE:143
    case controllers_RecordInCartController_addCarItemJson107_route(params@_) =>
      call { 
        controllers_RecordInCartController_addCarItemJson107_invoker.call(RecordInCartController_2.addCarItemJson)
      }
  
    // @LINE:144
    case controllers_RecordInCartController_deleteCarItemJson108_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecordInCartController_deleteCarItemJson108_invoker.call(RecordInCartController_2.deleteCarItemJson(id))
      }
  
    // @LINE:145
    case controllers_RecordInCartController_updateCarItemJson109_route(params@_) =>
      call { 
        controllers_RecordInCartController_updateCarItemJson109_invoker.call(RecordInCartController_2.updateCarItemJson)
      }
  
    // @LINE:148
    case controllers_ProductReviewController_addProductReview110_route(params@_) =>
      call { 
        controllers_ProductReviewController_addProductReview110_invoker.call(ProductReviewController_6.addProductReview)
      }
  
    // @LINE:149
    case controllers_ProductReviewController_addProductReviewHandle111_route(params@_) =>
      call { 
        controllers_ProductReviewController_addProductReviewHandle111_invoker.call(ProductReviewController_6.addProductReviewHandle)
      }
  
    // @LINE:150
    case controllers_ProductReviewController_getProductReviews112_route(params@_) =>
      call { 
        controllers_ProductReviewController_getProductReviews112_invoker.call(ProductReviewController_6.getProductReviews)
      }
  
    // @LINE:151
    case controllers_ProductReviewController_getProductReview113_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_getProductReview113_invoker.call(ProductReviewController_6.getProductReview(id))
      }
  
    // @LINE:152
    case controllers_ProductReviewController_deleteProductReview114_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_deleteProductReview114_invoker.call(ProductReviewController_6.deleteProductReview(id))
      }
  
    // @LINE:153
    case controllers_ProductReviewController_updateProductReview115_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_updateProductReview115_invoker.call(ProductReviewController_6.updateProductReview(id))
      }
  
    // @LINE:154
    case controllers_ProductReviewController_updateProductReviewHandle116_route(params@_) =>
      call { 
        controllers_ProductReviewController_updateProductReviewHandle116_invoker.call(ProductReviewController_6.updateProductReviewHandle)
      }
  
    // @LINE:156
    case controllers_ProductReviewController_getProductdReviewsJson117_route(params@_) =>
      call { 
        controllers_ProductReviewController_getProductdReviewsJson117_invoker.call(ProductReviewController_6.getProductdReviewsJson)
      }
  
    // @LINE:157
    case controllers_ProductReviewController_getProductReviewsJson118_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_getProductReviewsJson118_invoker.call(ProductReviewController_6.getProductReviewsJson(id))
      }
  
    // @LINE:158
    case controllers_ProductReviewController_addProductReviewJson119_route(params@_) =>
      call { 
        controllers_ProductReviewController_addProductReviewJson119_invoker.call(ProductReviewController_6.addProductReviewJson)
      }
  
    // @LINE:159
    case controllers_ProductReviewController_deleteProductReviewJson120_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProductReviewController_deleteProductReviewJson120_invoker.call(ProductReviewController_6.deleteProductReviewJson(id))
      }
  
    // @LINE:160
    case controllers_ProductReviewController_updateProductReviewJson121_route(params@_) =>
      call { 
        controllers_ProductReviewController_updateProductReviewJson121_invoker.call(ProductReviewController_6.updateProductReviewJson)
      }
  }
}
