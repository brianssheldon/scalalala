package org.bubba.scala1

import java.util.Date

object NewMain {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    var foo1: String = "foo1"
    var foo2: String = " foo2"
    var foo3: String = " foo3  "
    var x: Integer = 123
    printstuff("Hello, world! " + foo1 + foo2 + foo3 + x)

    processRa()

    print6810()
    
    println("5,7    = " + addInt(5,7))
    println("22,44  = " + addInt(22,44))
    println("-13,25 = " + addInt(-13,25))
    
    println( "Returned Value2 : " + addInt2(3) ); // = 10
  
    println( apply( layout, 10) )

    var userDir = () => { "asdfasf"} //System.getProperty("user.dir") }
    println("" +  userDir )
    
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"
   
  def addInt2( a:Int=5, b:Int=7 ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }
  
  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
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

}
