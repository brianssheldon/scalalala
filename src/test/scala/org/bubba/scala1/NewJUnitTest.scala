package org.bubba.scala1

import org.junit.Assert
import org.junit.Before
import org.junit.After
import org.junit.Test
//import org.bubba.scala1.NewMain

class NewJUnitTest {

  @Before
  def setUp: Unit = {
    
 
  }

  @After
  def tearDown: Unit = {
  }

  @Test
  def example = {
//    var x: Array[String] = new Array["",""]
//    NewMain(null, 1)
    var x:Array[String] = new Array[String](3)
    x(0) = "abcdefg"
    x(1) = "hijklmn"
    x(2) = "opqrstu"
    NewMain.main(x)
  }

}
