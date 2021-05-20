package recursionAssignment;

public class Recursion {

  /*
  * A test method to check if our test class functions
  * 
  * @return true
  * @author: Andy Guo
  */
  public static boolean testMethod() {
    return true;
  }


  /*
  * A method that returns the number of "hi"s within a given string
  * 
  * @param str  The input string
  * @return an integer representing the number of "hi"s
  * @author: Andy Guo
  */
  public static int countHi(String str) {

    // If the number of letters are not enough to create "hi", return 0
    if (str.length() < 2) {
      return 0;
    }
  
    // Base case: variable length of 2
    if (str.length() == 2) {
      // If those 2 chars make "hi", return 1
      if (str.equals("hi")) {
        return 1;
      }

      // If they don't make "hi", return 0
      return 0;
    }

    // Recursive case

    // Declaring variables
    int hiNumber = 0;
    String firstTwoChar;

    // Take the first two characters in the string
    firstTwoChar = str.substring(0, 2);

    // If they are "hi", make hiNumber = 1
    if (firstTwoChar.equals("hi")) {
      hiNumber = 1;
    }

    // The amount of "hi"s in str is equal to:
    // The amount of "hi"s in the first two characters PLUS
    // The amount of "hi"s in str without the first character
    return hiNumber + countHi(str.substring(1));
  }


  /*
  * A method changes all instances of "pi" in a string into "3.14"
  * 
  * @param str  The input string
  * @return a String with all instances of "pi" changed to "3.14"
  * @author: Andy Guo
  */
  public static String changePi(String str) {
    
    // If str only has 1 or 0 characters, return str
    if (str.length() < 2) {
      return str;
    }

    // Base case: variable length 2
    if (str.length() == 2) {
      // If those two chars make "pi", return "3.14"
      if (str.equals("pi")) {
        return "3.14";
      }

      // If not, return str
      return str;
    }

    
    // Recursive case

    // Declaring variables
    String firstTwoChar;

    // Taking the first two characters of str
    firstTwoChar = str.substring(0, 2);

    if (firstTwoChar.equals("pi")) {
      return "3.14" + changePi(str.substring(2));
    }

    return str.substring(0, 1) + changePi(str.substring(1));
  }

}
