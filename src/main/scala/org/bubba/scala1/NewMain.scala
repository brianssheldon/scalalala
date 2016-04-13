package org.bubba.scala1

import java.util.Date

object NewMain {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {

    for (x <- args) {
      println("args: " + x)
    }

    var foo1: String = "foo1"
    var foo2: String = " foo2"
    var foo3: String = " foo3  "
    var x: Integer = 123
    printstuff("Hello, world! " + foo1 + foo2 + foo3 + x)

    processRa()

    print6810()

    println("5,7    = " + addInt(5, 7))
    println("22,44  = " + addInt(22, 44))
    println("-13,25 = " + addInt(-13, 25))

    println("Returned Value2 : " + addInt2(3)); // = 10

    println(apply(layout, 10))

    var userDir = () => { "asdfasf" } //System.getProperty("user.dir") }
    println("" + userDir)
    
    val asdfas: String = {
      val sb = new StringBuilder();
      sb.append("asdfdd")
      sb.append("xxxxx")
      sb.append("yyyyy")
      sb.toString;
    }    
    println("string + sb: " + asdfas);
    
    doOrderStuff()
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"

  def addInt2(a: Int = 5, b: Int = 7): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }

  def print6810() {
    for {
      i <- 0 to 10
      if i % 2 == 0
      if i > 5
    } println(i)
  }

  def processRa() {
    var MILLSINADAY: Long = 86400000L; // 24 * 60 * 60 * 1000
    var MILLSINONEHOUR: Long = 3600000L; // 60 * 60 * 1000
    var MILLSINONEMINUTE: Long = 60000L; // 60 * 1000

    var ra: TasRa = new TasRa()
    ra.customerName = "Bubba Wuz Here"
    ra.raNumber = "123456789"
    ra.rentDate = new Date(ra.rentDate.getTime - (5 * MILLSINADAY))
    ra.returnDate = new Date(ra.returnDate.getTime + (5 * MILLSINADAY))
    ra.numberOfRentalDays = Integer.parseInt("" + ((ra.returnDate.getTime - ra.rentDate.getTime) / MILLSINADAY))

    var fs = printf(
      "\n\nra#            : %s   \ncustomer       : %s    \nrent date      : %s      \nreturn date    : %s      \nnumber of days : %d  \n\n",
      ra.raNumber, ra.customerName, ra.rentDate.toString(), ra.returnDate.toString(), ra.numberOfRentalDays
    )

    for (i <- 1 to 5) {
      println(fs)
    }
  }

  def printstuff(s: String) {
    println("'" + s + "'")
  }
  def doOrderStuff()
  {
        
    var prod1: Product = getProduct(1)    
    var prod2: Product = getProduct(2)
    var prod3: Product = getProduct(3)    
    var prod4: Product = getProduct(4)    
    var prod5: Product = getProduct(5)    
    var prod6: Product = getProduct(6)    
    var prod7: Product = getProduct(7)    
    var prod8: Product = getProduct(8)    
    var prod9: Product = getProduct(9)    
    var prod10: Product = getProduct(10)    
    var prod11: Product = getProduct(11)
    
    var order1: Order = getOrder(1)
    var order2: Order = getOrder(2)
    var order3: Order = getOrder(3)
    var order4: Order = getOrder(4)
    var order5: Order = getOrder(5)
    var order6: Order = getOrder(6)
    var order7: Order = getOrder(7)
   
    order1.products = List(prod1, prod2, prod3)
    order2.products = List(prod4, prod5, prod6, prod7)
    order3.products = List(prod8)
    order4.products = List(prod9)
    order5.products = List(prod10, prod11)
    order6.products = List(prod1, prod2, prod3, prod7, prod11)
    order7.products = List(prod11)
    
    var user1: User = new User("User 1", List(order1, order2, order3))
    var user2: User = new User("User 2", List(order4, order5, order6))
    var user3: User = new User("User 3", List(order7))
    
    
    println("-----user  1 -------")
    println(user1)
    println("-----user  2 -------")
    println(user2)
    println("-----user  3 -------")
    println(user3)
  }
  
  def getOrder(i: Int): Order = 
  {
    var order: Order = new Order()
    order.id = i
    return order
  }
  
  def getProduct(i: Int): Product = 
  {
    var prod: Product = new Product()
    prod.category = "cat" + i
    prod.desc = "desc " + i
    prod.id = i
    return prod
  }
  
}
