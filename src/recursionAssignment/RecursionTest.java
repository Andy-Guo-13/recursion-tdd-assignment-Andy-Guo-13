package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
/*
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;
*/

import recursionAssignment.Recursion;

public class RecursionTest {

  /*
  @Before
  public void beforeTest(){
    // some steps to perform before tests are run
  }
  */
  
  /**
   * An initial test
   * Testing run command
   */
  @Test
  public void TestInitial() {
    // make assertion statement(s)
    // assertEquals(EXPECTEDVALUE, TESTVALUE);
    // assertTrue(TESTBOOLEAN);
    assertEquals(true, Recursion.testMethod());
  }
    
  // add more tests

  // countHi

  /*
  * Initial test for countHi
  */

  @Test
  public void TestcountHi1() {
    assertEquals(0, Recursion.countHi("xxx"));
  }

  /*
  * Test base case for countHi
  */
  @Test
  public void TestcountHi2() {
    assertEquals(0, Recursion.countHi("xx"));
  }

  /*
  * Test another bae case for countHi
  */
  @Test
  public void TestcountHi3() {
    assertEquals(1, Recursion.countHi("hi"));
  }

  /*
  * Test a recursive case for countHi
  */
  @Test
  public void TestcountHi4() {
    assertEquals(1, Recursion.countHi("xhi"));
  }

  /*
  * Another recursive test case
  */
  @Test
  public void TestcountHi5() {
    assertEquals(1, Recursion.countHi("hix"));
  }

  /*
  * Testing for 2 hi's
  */
  @Test
  public void TestcountHi6() {
    assertEquals(2, Recursion.countHi("hihi"));
  }

  /*
  * More test for 2 hi's
  */
  @Test
  public void TestcountHi7() {
    assertEquals(2, Recursion.countHi("hixhi"));
  }

  /*
  * Reversing the letters for hi
  */
  @Test
  public void TestcountHi8() {
    assertEquals(1, Recursion.countHi("ihih"));
  }

  /*
  * Testing case where there is only 1 letters
  */
  @Test
  public void Testcounthi9() {
    assertEquals(0, Recursion.countHi("x"));
  }

  /*
  * Testing case with empty string
  */
  @Test
  public void TestcountHi10() {
    assertEquals(0, Recursion.countHi(""));
  }

  /*
  * Longer string
  */
  @Test
  public void TestcountHi11() {
    assertEquals(6, Recursion.countHi("akhijs;kldhisjf;ekwhaljhivhhilewk;hijfkwhehi;ivh;"));
  }

  /*
  * Even longer strings
  */
  @Test
  public void TestcountHi12() {
    assertEquals(9, Recursion.countHi("ih;asfh;oiewahf;ihae;fiha;hf;ahe;fwahe;oifha;fdh;ash;oifhwae;fha;shidfh;oiwaeihihf;ah;fdah;oiefh;iahef;oihiwe;fha;ihihe;ifhihi;aiehf;iah;eiha;efh;ahf;ih;iehfa;ihih;iefhiahhlfihiahelfihhlhaeifaleihlihfe"));
  }


  // changePi

  /*
  * Initial test for changePi
  */
  @Test
  public void TestchangePi1() {
    assertEquals("xxx", Recursion.changePi("xxx"));
  }
    
  /*
  @After
  public void afterTest(){
    // some steps to perform after tests are run
  }
  */    
}
