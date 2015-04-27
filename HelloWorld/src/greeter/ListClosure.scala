package greeter

import scala.collection.immutable.List

object Main {
  
	def main (args: Array[String]){
		new ListClosure().f_--
	}
  
}


class ListClosure {

  
  def f_-- {
    
    println("GO")
    
    val list = List(2, "toto", Array(2.1d, 5.2d), Vector(1,2,3,5,8,13,21) )
    
    val types = list.map {
      case _: Int => "int"
      case _: String => "string"
      case c: AnyRef => c.getClass.getName
      case _ => "something else"
    }
    
    println(types.mkString(",\n"))
    
  }
}