package _3_3_polymorphism


object nth {

  def nth[T](n: Int, xs: List[T]) : T =
  	if(xs.isEmpty) throw new IndexOutOfBoundsException
  	else if(n == 0) xs.head
  	else nth(n-1, xs.tail)                    //> nth: [T](n: Int, xs: _3_3_polymorphism.List[T])T
  
  
  
  val list       = new Cons(1, new Cons(2, new Cons(3, new Nil()   ) )  )
                                                  //> list  : _3_3_polymorphism.Cons[Int] = _3_3_polymorphism.Cons@568b9df2
  	
  nth(-1, list)                                   //> java.lang.IndexOutOfBoundsException
                                                  //| 	at _3_3_polymorphism.nth$$anonfun$main$1.nth$1(_3_3_polymorphism.nth.sca
                                                  //| la:7)
                                                  //| 	at _3_3_polymorphism.nth$$anonfun$main$1.apply$mcV$sp(_3_3_polymorphism.
                                                  //| nth.scala:15)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at _3_3_polymorphism.nth$.main(_3_3_polymorphism.nth.scala:4)
                                                  //| 	at _3_3_polymorphism.nth.main(_3_3_polymorphism.nth.scala)
  
  
  
  
  
  nth(4, list)
  	
  	
}