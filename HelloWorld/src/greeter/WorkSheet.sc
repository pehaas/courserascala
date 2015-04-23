package greeter

import scala.io.Source

object WorkSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = 5                                       //> x  : Int = 5
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 6

  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for (line <- source.getLines)
      processLine(filename, width, line)
  }                                               //> processFile: (filename: String, width: Int)Unit

  def processLine(filename: String,
                  width: Int, line: String) {

    if (line.length > width)
      println(filename + ": " + line.trim)
  }                                               //> processLine: (filename: String, width: Int, line: String)Unit

  processLine("myfile", 20, "mmmmmmm");
  
  
  def something() = {
  		println("do something")
  		1
  }                                               //> something: ()Int
  
  def callByValue(x: Int) = {
  		println("x1="+x)
  		println("x2="+x)
  }                                               //> callByValue: (x: Int)Unit

  def callByName(x: => Int) = {
  		println("x1="+x)
  		println("x2="+x)
  }                                               //> callByName: (x: => Int)Unit
  
  callByName(something())                         //> do something
                                                  //| x1=1
                                                  //| do something
                                                  //| x2=1
 
  callByValue(something())                        //> do something
                                                  //| x1=1
                                                  //| x2=1
                                                  
}




    