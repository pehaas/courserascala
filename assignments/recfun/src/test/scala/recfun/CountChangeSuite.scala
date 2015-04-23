package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import Main.countChange
  test("countChange: example given in instructions") {
    assert(countChange(4,List(1,2)) === 3)
  }

  test("countChange: sorted CHF") {
    assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
  }

  test("countChange: no pennies") {
    assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  test("countChange: unsorted CHF") {
    assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
  }
  
  test("countChange: 5  =  5+5") {
	  assert(countChange(10,List(5)) === 1)
  }
  
  test("countChange: 5 , 10 =  5+5, 10") {
	  assert(countChange(10,List(5,10)) === 2)
  }

  test("countChange: 5,3,2,10   2+2+2+2+2, 2+3+2+3, 5+5, 5+2+3, 10") {
	  assert(countChange(10,List(5,3,2,10)) === 5)
  }

  test("countChange: supply null as List") {
	  assert(countChange(10,null) === 0)
  }

  test("countChange: supply no money") {
	  assert(countChange(0,List(1)) === 0)
  }
  
  test("countChange: suply empty List"){
    assert(countChange(10,List())=== 0)
  }
  

}
