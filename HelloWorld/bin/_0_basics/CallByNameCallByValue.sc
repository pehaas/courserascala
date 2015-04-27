package _0_basics

import scala.util.Random
import scala.compat.Platform


object CallByNameCallByValue {
  
  
  val randomNumber = new Random().nextInt()       //> randomNumber  : Int = 322480838
  var randomNumber2  = new Random().nextInt()     //> randomNumber2  : Int = 1248708846
  
  def genereateRandomNumber = {
  	println("do Something")
  	new Random().nextInt(100)
 	}                                         //> genereateRandomNumber: => Int
  
  def callByValue(x: => Int) = {
  	println("x1="+x)
  	println("x2="+x)
  }                                               //> callByValue: (x: => Int)Unit
  
  def callByName(x: Int) ={
  	println("x1="+x)
  	println("x2="+x)
  }                                               //> callByName: (x: Int)Unit
  
  
  callByName(genereateRandomNumber)               //> do Something
                                                  //| x1=46
                                                  //| x2=46
  
  callByValue(genereateRandomNumber)              //> do Something
                                                  //| x1=94
                                                  //| do Something
                                                  //| x2=12
  
  
  println(randomNumber)                           //> 322480838
  println(randomNumber)                           //> 322480838
  

	callByName(randomNumber)                  //> x1=322480838
                                                  //| x2=322480838


	callByValue (randomNumber)                //> x1=322480838
                                                  //| x2=322480838
	
	
  
  
}