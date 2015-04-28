package funsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {

  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  test("adding ints") {
    assert(1 + 2 === 3)
  }

  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   *
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   *
   *   val s1 = singletonSet(1)
   *
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   *
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   *
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
    val s4 = singletonSet(4)
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   *
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {

    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3".
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
    }
  }

  test("singletonSet(1) does not contain 2") {
    new TestSets {
      assert(!contains(s1, 2))
    }
  }

  test("union contains all elements") {
    new TestSets {
      val s = union(s1, s2)
      val sx = union(s, s3)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
      
      assert(contains(sx, 1), "Union 4")
      assert(contains(sx, 2), "Union 5")
      assert(contains(sx, 3), "Union 6")
    }
  }

  test("intersec contains elements both set have in common") {
    new TestSets {
      val s12 = union(s1, s2)
      val s123 = union(s3, union(s1, s2))
      val inters = intersect(s12, s123)
      assert(contains(inters, 1), "Intersect 1")
      assert(contains(inters, 2), "Intersect 2")
      assert(!contains(inters, 3), "Intersect 3")
    }
  }

  test("diff contains the set of all elements of `s` that are not in `t`") {
    new TestSets {
      val s12 = union(s1, s2)
      val s123 = union(s3, union(s1, s2))
      val diffset = diff(s12, s123)
      assert(!contains(diffset, 1), "Diff 1")
      assert(!contains(diffset, 2), "Diff 2")
      assert(contains(diffset, 3), "Diff 3")

      val diffset2 = diff(s123, s12)
      assert(!contains(diffset2, 1), "Diff 4")
      assert(!contains(diffset2, 2), "Diff 5")
      assert(contains(diffset2, 3), "Diff 6")
    }
  }

  test("filter contains elements both set have in common") {
    new TestSets {
      val s123 = union(s3, union(s1, s2))
      def setFilter: Int => Boolean = (x => x == 3 * 1)

      assert(!contains(setFilter, 1), "Filtered 1")
      assert(!contains(setFilter, 2), "Filtered 2")
      assert(contains(setFilter, 3), "Filtered 3")

      val filtered = filter(s123, s2)
      assert(!contains(filtered, 1), "Filtered 4")
      assert(contains(filtered, 2), "Filtered 5")
      assert(!contains(filtered, 3), "Filtered 6")
    }
  }

  test("forall should return if all sets match the given condition") {
    new TestSets {
      val mod2Set = union(s2, s4)
      val s234 = union(s3, union(s2, s4))
      assert(forall(mod2Set, x => x % 2 == 0), "ForAll 1")
      assert(!forall(s234, x => x % 2 == 0), "ForAll 2")
    }
  }

  test("exists") {
	  new TestSets {
		  assert( exists(s2, x => x == 2), "exists 1")
	  }
  }
  
  test("map") {
    println("jklhhhhhhhhhh")
    new TestSets {
      val mapedSet = map(s2, x => x * x)
      printSet(mapedSet)
      assert(contains(mapedSet, 4), "mapedset")
    }
  }

}
