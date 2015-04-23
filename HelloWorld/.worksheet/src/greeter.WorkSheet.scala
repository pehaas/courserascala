package greeter

import scala.io.Source

object WorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 
  println("Welcome to the Scala worksheet");$skip(12); 
  val x = 5;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(174); 

  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for (line <- source.getLines)
      processLine(filename, width, line)
  };System.out.println("""processFile: (filename: String, width: Int)Unit""");$skip(162); 

  def processLine(filename: String,
                  width: Int, line: String) {

    if (line.length > width)
      println(filename + ": " + line.trim)
  };System.out.println("""processLine: (filename: String, width: Int, line: String)Unit""");$skip(42); 

  processLine("myfile", 20, "mmmmmmm");$skip(66); ;
  
  
  def something() = {
  		println("do something")
  		1
  };System.out.println("""something: ()Int""");$skip(79); 
  
  def callByValue(x: Int) = {
  		println("x1="+x)
  		println("x2="+x)
  };System.out.println("""callByValue: (x: Int)Unit""");$skip(79); 

  def callByName(x: => Int) = {
  		println("x1="+x)
  		println("x2="+x)
  };System.out.println("""callByName: (x: => Int)Unit""");$skip(29); 
  
  callByName(something());$skip(29); 
 
  callByValue(something())}
                                                  
}




    