package _0_basics

import scala.util.Random
import scala.compat.Platform


object CallByNameCallByValue {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(157); 
  
  
  val randomNumber = new Random().nextInt();System.out.println("""randomNumber  : Int = """ + $show(randomNumber ));$skip(46); 
  var randomNumber2  = new Random().nextInt();System.out.println("""randomNumber2  : Int = """ + $show(randomNumber2 ));$skip(95); 
  
  def genereateRandomNumber = {
  	println("do Something")
  	new Random().nextInt(100)
 	};System.out.println("""genereateRandomNumber: => Int""");$skip(80); 
  
  def callByValue(x: => Int) = {
  	println("x1="+x)
  	println("x2="+x)
  };System.out.println("""callByValue: (x: => Int)Unit""");$skip(75); 
  
  def callByName(x: Int) ={
  	println("x1="+x)
  	println("x2="+x)
  };System.out.println("""callByName: (x: Int)Unit""");$skip(42); 
  
  
  callByName(genereateRandomNumber);$skip(40); 
  
  callByValue(genereateRandomNumber);$skip(30); 
  
  
  println(randomNumber);$skip(24); 
  println(randomNumber);$skip(30); 
  

	callByName(randomNumber);$skip(30); 


	callByValue (randomNumber)}
	
	
  
  
}
