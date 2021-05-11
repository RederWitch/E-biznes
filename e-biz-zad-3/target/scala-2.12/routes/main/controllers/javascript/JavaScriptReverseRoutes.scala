// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wiki/Pulpit/e-biznes/shop-scala/E-biznes/e-biz-zad-3/conf/routes
// @DATE:Tue May 11 19:52:13 CEST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:88
  class ReverseDiscountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:99
    def deleteDiscountJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.deleteDiscountJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:93
    def updateDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.updateDiscount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discount/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:94
    def updateDiscountHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.updateDiscountHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatediscount"})
        }
      """
    )
  
    // @LINE:90
    def getDiscounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discounts"})
        }
      """
    )
  
    // @LINE:97
    def getDiscountJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscountJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:98
    def addDiscountJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscountJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount"})
        }
      """
    )
  
    // @LINE:91
    def getDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discount/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:92
    def deleteDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.deleteDiscount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "discount/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:100
    def updateDiscountJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.updateDiscountJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discount_update"})
        }
      """
    )
  
    // @LINE:96
    def getDiscountsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.getDiscountsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/discounts"})
        }
      """
    )
  
    // @LINE:89
    def addDiscountHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscountHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adddiscountHandle"})
        }
      """
    )
  
    // @LINE:88
    def addDiscount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.DiscountController.addDiscount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adddiscount"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:58
  class ReversePaymentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def addPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.addPayment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addpayment"})
        }
      """
    )
  
    // @LINE:67
    def getPaymentJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.getPaymentJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayment" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:62
    def deletePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.deletePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:66
    def getPaymentsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.getPaymentsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayments"})
        }
      """
    )
  
    // @LINE:60
    def getPayments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.getPayments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payments"})
        }
      """
    )
  
    // @LINE:59
    def addPaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.addPaymentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addpaymentHandle"})
        }
      """
    )
  
    // @LINE:70
    def updatePaymentJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.updatePaymentJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayment_update"})
        }
      """
    )
  
    // @LINE:63
    def updatePayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.updatePayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:61
    def getPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.getPayment",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:68
    def addPaymentJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.addPaymentJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayment"})
        }
      """
    )
  
    // @LINE:69
    def deletePaymentJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.deletePaymentJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersPayment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:64
    def updatePaymentHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaymentController.updatePaymentHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatepaymentHandle"})
        }
      """
    )
  
  }

  // @LINE:103
  class ReverseCartController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:109
    def updateCartHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.updateCartHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecart"})
        }
      """
    )
  
    // @LINE:115
    def updateCartJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.updateCartJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cart_update"})
        }
      """
    )
  
    // @LINE:106
    def getCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.getCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:105
    def getCarts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.getCarts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "carts"})
        }
      """
    )
  
    // @LINE:113
    def addCartJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addCartJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cart"})
        }
      """
    )
  
    // @LINE:107
    def deleteCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.deleteCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:103
    def addCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcart"})
        }
      """
    )
  
    // @LINE:104
    def addCartHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.addCartHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcartHandle"})
        }
      """
    )
  
    // @LINE:108
    def updateCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.updateCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:112
    def getCartJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.getCartJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/carts/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:114
    def deleteCartJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.deleteCartJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:111
    def getCartsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CartController.getCartsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/carts"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseCategoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def getCategoryJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategoryJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:36
    def getCategoriesJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategoriesJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/categories"})
        }
      """
    )
  
    // @LINE:28
    def addCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategory"})
        }
      """
    )
  
    // @LINE:30
    def getCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categories"})
        }
      """
    )
  
    // @LINE:31
    def getCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.getCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:32
    def deleteCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.deleteCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:29
    def addCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcategoryhandle"})
        }
      """
    )
  
    // @LINE:34
    def updateCategoryHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.updateCategoryHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecategoryhandle"})
        }
      """
    )
  
    // @LINE:40
    def updateCategoryJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.updateCategoryJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/category_update"})
        }
      """
    )
  
    // @LINE:38
    def addCategoryJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.addCategoryJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/category"})
        }
      """
    )
  
    // @LINE:33
    def updateCategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.updateCategory",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "category/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def deleteCategoryJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoryController.deleteCategoryJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/category/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseProductController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def getProductsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProductsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/products"})
        }
      """
    )
  
    // @LINE:16
    def getProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:22
    def getProductJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProductJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:15
    def getProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.getProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products"})
        }
      """
    )
  
    // @LINE:19
    def updateProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.updateProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproducthandle"})
        }
      """
    )
  
    // @LINE:23
    def addProductJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProductJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product"})
        }
      """
    )
  
    // @LINE:14
    def addProductHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProductHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addproducthandle"})
        }
      """
    )
  
    // @LINE:17
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:18
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:25
    def updateProductJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.updateProductJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product_update"})
        }
      """
    )
  
    // @LINE:13
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addproduct"})
        }
      """
    )
  
    // @LINE:24
    def deleteProductJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductController.deleteProductJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:133
  class ReverseRecordInCartController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:135
    def getRecordInCarts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.getRecordInCarts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recordInCarts"})
        }
      """
    )
  
    // @LINE:136
    def getRecordInCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.getRecordInCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recordInCart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:137
    def deleteRecordInCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.deleteRecordInCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recordInCart/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:138
    def updateRecordInCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.updateRecordInCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recordInCart/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:134
    def addRecordInCartHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.addRecordInCartHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addrecordInCartHandle"})
        }
      """
    )
  
    // @LINE:143
    def addCarItemJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.addCarItemJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/recordInCart"})
        }
      """
    )
  
    // @LINE:141
    def getCartsItemsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.getCartsItemsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cartsItems"})
        }
      """
    )
  
    // @LINE:145
    def updateCarItemJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.updateCarItemJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/recordInCart_update"})
        }
      """
    )
  
    // @LINE:139
    def updateRecordInCartHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.updateRecordInCartHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updaterecordInCart"})
        }
      """
    )
  
    // @LINE:144
    def deleteCarItemJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.deleteCarItemJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/recordInCart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:142
    def getCarItemsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.getCarItemsJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/recordInCarts/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:133
    def addRecordInCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecordInCartController.addRecordInCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addrecordInCart"})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def addUserHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUserHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduserhandle"})
        }
      """
    )
  
    // @LINE:43
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:46
    def getUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:48
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:45
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:47
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:52
    def getUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:54
    def deleteUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUserJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:51
    def getUsersJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsersJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/users"})
        }
      """
    )
  
    // @LINE:55
    def updateUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUserJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user_update"})
        }
      """
    )
  
    // @LINE:53
    def addUserJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUserJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/user"})
        }
      """
    )
  
    // @LINE:49
    def updateUserHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUserHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuserhandle"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:118
  class ReverseOrderController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:127
    def getOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrderJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:128
    def addOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrderJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order"})
        }
      """
    )
  
    // @LINE:122
    def deleteOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.deleteOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:119
    def addOrderHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrderHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "orderHandle"})
        }
      """
    )
  
    // @LINE:130
    def updateOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.updateOrderJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order_update"})
        }
      """
    )
  
    // @LINE:129
    def deleteOrderJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.deleteOrderJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/order/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:124
    def updateOrderHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.updateOrderHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateorder"})
        }
      """
    )
  
    // @LINE:118
    def addOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.addOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addorder"})
        }
      """
    )
  
    // @LINE:120
    def getOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orders"})
        }
      """
    )
  
    // @LINE:121
    def getOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:123
    def updateOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.updateOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "order/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:126
    def getOrdersJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrderController.getOrdersJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/orders"})
        }
      """
    )
  
  }

  // @LINE:148
  class ReverseProductReviewController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:151
    def getProductReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.getProductReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:149
    def addProductReviewHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.addProductReviewHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "productReviewHandle"})
        }
      """
    )
  
    // @LINE:152
    def deleteProductReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.deleteProductReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReview/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:157
    def getProductReviewsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.getProductReviewsJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productReviews/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:150
    def getProductReviews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.getProductReviews",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReviews"})
        }
      """
    )
  
    // @LINE:156
    def getProductdReviewsJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.getProductdReviewsJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productsReviews"})
        }
      """
    )
  
    // @LINE:160
    def updateProductReviewJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.updateProductReviewJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productReview_update"})
        }
      """
    )
  
    // @LINE:154
    def updateProductReviewHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.updateProductReviewHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateproductReview"})
        }
      """
    )
  
    // @LINE:158
    def addProductReviewJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.addProductReviewJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productReview"})
        }
      """
    )
  
    // @LINE:148
    def addProductReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.addProductReview",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReview"})
        }
      """
    )
  
    // @LINE:153
    def updateProductReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.updateProductReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productReview/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:159
    def deleteProductReviewJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductReviewController.deleteProductReviewJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/productReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:73
  class ReverseAddressController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:74
    def addAddressHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.addAddressHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addaddressHandle"})
        }
      """
    )
  
    // @LINE:85
    def updateaddrestJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.updateaddrestJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addres_update"})
        }
      """
    )
  
    // @LINE:79
    def updateAddressHandle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.updateAddressHandle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateaddress"})
        }
      """
    )
  
    // @LINE:73
    def addAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.addAddress",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addaddress"})
        }
      """
    )
  
    // @LINE:75
    def getAddresses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.getAddresses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addresses"})
        }
      """
    )
  
    // @LINE:84
    def deleteaddresJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.deleteaddresJson",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addres/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:77
    def deleteAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.deleteAddress",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "address/del/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:81
    def getUsersAddressesJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.getUsersAddressesJson",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/usersAddresses"})
        }
      """
    )
  
    // @LINE:82
    def getAddressesJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.getAddressesJson",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addresses/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:83
    def addaddresJson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.addaddresJson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/addres"})
        }
      """
    )
  
    // @LINE:78
    def updateAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.updateAddress",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "address/up/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:76
    def getAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AddressController.getAddress",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "address/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
