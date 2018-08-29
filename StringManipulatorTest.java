import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class StringManipulatorTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testX() {
  }
  
  public void testMakeUsernameBasic(){
    StringManipulator m = new StringManipulator();
    String ret = m.makeUsername("john doe");
    assertEquals("jdoe", ret);
  }
  
  public void testMakeEmail() {
    StringManipulator n = new StringManipulator();
    String ref = n.makeEmail("john doe", "purdue.edu");
    assertEquals("jdoe@purdue.edu", ref);
  }
  
  public void testWinToUnixPath() {
    StringManipulator o= new StringManipulator();
    String raf = o.winToUnixPath("c:\\Users\\John Doe\\File.txt");
    assertEquals("/homes/jdoe/File.txt", raf);
  }
  
}
