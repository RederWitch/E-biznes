// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wiki/Pulpit/e-biznes/shop-scala/E-biznes/e-biz-zad-3/conf/routes
// @DATE:Tue May 11 19:52:13 CEST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:88
  class ReverseDiscountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:99
    def deleteDiscountJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/discount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:93
    def updateDiscount(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discount/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:94
    def updateDiscountHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatediscount")
    }
  
    // @LINE:90
    def getDiscounts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discounts")
    }
  
    // @LINE:97
    def getDiscountJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/discount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:98
    def addDiscountJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/discount")
    }
  
    // @LINE:91
    def getDiscount(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discount/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:92
    def deleteDiscount(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "discount/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:100
    def updateDiscountJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/discount_update")
    }
  
    // @LINE:96
    def getDiscountsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/discounts")
    }
  
    // @LINE:89
    def addDiscountHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adddiscountHandle")
    }
  
    // @LINE:88
    def addDiscount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adddiscount")
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:58
  class ReversePaymentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def addPayment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addpayment")
    }
  
    // @LINE:67
    def getPaymentJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/usersPayment" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:62
    def deletePayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:66
    def getPaymentsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/usersPayments")
    }
  
    // @LINE:60
    def getPayments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payments")
    }
  
    // @LINE:59
    def addPaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addpaymentHandle")
    }
  
    // @LINE:70
    def updatePaymentJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/usersPayment_update")
    }
  
    // @LINE:63
    def updatePayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:61
    def getPayment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "payment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:68
    def addPaymentJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/usersPayment")
    }
  
    // @LINE:69
    def deletePaymentJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/usersPayment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:64
    def updatePaymentHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatepaymentHandle")
    }
  
  }

  // @LINE:103
  class ReverseCartController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def updateCartHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecart")
    }
  
    // @LINE:115
    def updateCartJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/cart_update")
    }
  
    // @LINE:106
    def getCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:105
    def getCarts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "carts")
    }
  
    // @LINE:113
    def addCartJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/cart")
    }
  
    // @LINE:107
    def deleteCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:103
    def addCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcart")
    }
  
    // @LINE:104
    def addCartHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcartHandle")
    }
  
    // @LINE:108
    def updateCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:112
    def getCartJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/carts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:114
    def deleteCartJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:111
    def getCartsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/carts")
    }
  
  }

  // @LINE:28
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def getCategoryJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:36
    def getCategoriesJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/categories")
    }
  
    // @LINE:28
    def addCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:30
    def getCategories(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:31
    def getCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:32
    def deleteCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:29
    def addCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategoryhandle")
    }
  
    // @LINE:34
    def updateCategoryHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updatecategoryhandle")
    }
  
    // @LINE:40
    def updateCategoryJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/category_update")
    }
  
    // @LINE:38
    def addCategoryJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/category")
    }
  
    // @LINE:33
    def updateCategory(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:39
    def deleteCategoryJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/category/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:13
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def getProductsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/products")
    }
  
    // @LINE:16
    def getProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:22
    def getProductJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:19
    def updateProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproducthandle")
    }
  
    // @LINE:23
    def addProductJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/product")
    }
  
    // @LINE:14
    def addProductHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproducthandle")
    }
  
    // @LINE:17
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:18
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "product/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:25
    def updateProductJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/product_update")
    }
  
    // @LINE:13
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:24
    def deleteProductJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:133
  class ReverseRecordInCartController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:135
    def getRecordInCarts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recordInCarts")
    }
  
    // @LINE:136
    def getRecordInCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recordInCart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:137
    def deleteRecordInCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recordInCart/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:138
    def updateRecordInCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "recordInCart/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:134
    def addRecordInCartHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addrecordInCartHandle")
    }
  
    // @LINE:143
    def addCarItemJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/recordInCart")
    }
  
    // @LINE:141
    def getCartsItemsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/cartsItems")
    }
  
    // @LINE:145
    def updateCarItemJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/recordInCart_update")
    }
  
    // @LINE:139
    def updateRecordInCartHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updaterecordInCart")
    }
  
    // @LINE:144
    def deleteCarItemJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/recordInCart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:142
    def getCarItemsJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/recordInCarts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:133
    def addRecordInCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addrecordInCart")
    }
  
  }

  // @LINE:43
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def addUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduserhandle")
    }
  
    // @LINE:43
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:46
    def getUser(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:48
    def updateUser(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:45
    def getUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:47
    def deleteUser(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:52
    def getUserJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:54
    def deleteUserJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:51
    def getUsersJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/users")
    }
  
    // @LINE:55
    def updateUserJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user_update")
    }
  
    // @LINE:53
    def addUserJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/user")
    }
  
    // @LINE:49
    def updateUserHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateuserhandle")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:118
  class ReverseOrderController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:127
    def getOrderJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/order/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:128
    def addOrderJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/order")
    }
  
    // @LINE:122
    def deleteOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:119
    def addOrderHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "orderHandle")
    }
  
    // @LINE:130
    def updateOrderJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/order_update")
    }
  
    // @LINE:129
    def deleteOrderJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/order/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:124
    def updateOrderHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateorder")
    }
  
    // @LINE:118
    def addOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addorder")
    }
  
    // @LINE:120
    def getOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "orders")
    }
  
    // @LINE:121
    def getOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:123
    def updateOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "order/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:126
    def getOrdersJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/orders")
    }
  
  }

  // @LINE:148
  class ReverseProductReviewController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:151
    def getProductReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:149
    def addProductReviewHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "productReviewHandle")
    }
  
    // @LINE:152
    def deleteProductReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReview/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:157
    def getProductReviewsJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/productReviews/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:150
    def getProductReviews(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReviews")
    }
  
    // @LINE:156
    def getProductdReviewsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/productsReviews")
    }
  
    // @LINE:160
    def updateProductReviewJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/productReview_update")
    }
  
    // @LINE:154
    def updateProductReviewHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateproductReview")
    }
  
    // @LINE:158
    def addProductReviewJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/productReview")
    }
  
    // @LINE:148
    def addProductReview(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReview")
    }
  
    // @LINE:153
    def updateProductReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productReview/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:159
    def deleteProductReviewJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/productReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:73
  class ReverseAddressController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def addAddressHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addaddressHandle")
    }
  
    // @LINE:85
    def updateaddrestJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addres_update")
    }
  
    // @LINE:79
    def updateAddressHandle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateaddress")
    }
  
    // @LINE:73
    def addAddress(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addaddress")
    }
  
    // @LINE:75
    def getAddresses(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addresses")
    }
  
    // @LINE:84
    def deleteaddresJson(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/addres/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:77
    def deleteAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address/del/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:81
    def getUsersAddressesJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/usersAddresses")
    }
  
    // @LINE:82
    def getAddressesJson(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/addresses/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:83
    def addaddresJson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/addres")
    }
  
    // @LINE:78
    def updateAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address/up/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:76
    def getAddress(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "address/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}
