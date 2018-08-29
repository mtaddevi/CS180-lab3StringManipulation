/**
 * Purdue CS 180 Fall 2013
 * Lab 3
 * 
 * Sample implementation of StringManipulator
 * 
 * @author Mike Taddeucci <mtaddevi@purdue.edu>
 */
 
/**
 * Manipulate names and addresses.
 */
public class StringManipulator {
 
  /**
   * Make a username out of a person's name (first and last only, separated by
   * a space).
   *
   * This method accepts a String as an argument. This String represents a
   * person?s first and last name, e.g. ?John Doe? or ?Ann Smith?.
   *
   * You may assume that only the first and last names are given (separated by 
   * a space character) and that the names contain only upper and lower case 
   * letters.
   * 
   * Your method should return the entire username in lowercase regardless of
   * the case of the input. For example, the input ?JOHN DOE? should return
   * ?jdoe? and not ?JDOE?.
   * 
   * HINT: If the name is "John Doe", get first letter with substring method
   *       ("J"), get substring after the space until the end of the string 
   *       ("Doe"), concatenate them together ("JDoe"), and make them in 
   *       lowercase ("jdoe").
   * 
   * @param name
   *            Person's first and last names, separated by a space
   */
 
  public String makeUsername(String name) {
    String first;
    String last;
    String full;
    first = name.substring(0,1);
    last = name.substring(name.indexOf(" ")+1);
    full = first.concat(last);
    full = full.toLowerCase();
    // YOUR CODE GOES HERE. REMOVE FOLLOWING return ""; LINE.
    return full;
  }
 
 
  /**
   * Make an email address out of a person's name (first and last only) and a
   * domain.
   *
   * This method takes a name and an Internet domain as arguments, 
   * e.g. ?John Doe? and ?purdue.edu? and returns an email address, 
   * e.g. ?jdoe@purdue.edu?.
   *
   * You may assume that only the first and last names are given (separated by 
   * a space character) and that the names contain only upper and lower case
   * letters.
   *
   * The email address must be in all lowercase, regardless of the case
   * of either argument. For example, the input (?JOHN DOE?, ?Purdue.EDU?)
   * should return ?jdoe@purdue.edu?, not ?JDOE@Purdue.EDU?. 
   *
   * HINT: You may use your implementation of makeUsername to complete 
   *       this method.
   * 
   * @param name
   *            Person's first and last names, separated by a space
   * @param domain
   *            Internet domain name (e.g. purdue.edu)
   */
  public String makeEmail(String name, String domain) {
    String email;
    String first;
    String last;
    String full;
    first = name.substring(0,1);
    last = name.substring(name.indexOf(" ")+1);
    full = first.concat(last);
    full = full.toLowerCase(); 
    email = full+"@"+domain;
    email = email.toLowerCase();
    
    // YOUR CODE GOES HERE. REMOVE FOLLOWING return ""; LINE.
    return email;
  }
 
  /**
   * Convert a Windows-style path of a file in user's home directory to a
   * Unix-style one.
   * 
   * This method takes a Windows-style path to a file in a user?s home
   * directory, e.g. ?c:\Users\John Doe\File.txt? and converts it to the 
   * Unix-style equivalent, e.g. ?/homes/jdoe/File.txt?.
   *
   * About the input, you may assume:
   *   - The beginning will always be: ?c:\Users\?.
   *   - The user?s name (coming between the second and third backslashes) 
   *     will consist of exactly two words; their first and last names.
   *   - The path will always end with a file in the user?s home directory,
   *     meaning there will always be exactly three backslashes.
   *
   * The output must match these specifications:
   *   - The beginning must always be ?/homes/?.
   *   - The username (coming between the second and third forward slashes) 
   *     will consist of exactly one word, all in lowercase; their username 
   *     from makeUsername.
   *
   * The path will always end with a file in the user?s home directory, 
   * meaning there will always be exactly three forward slashes.
   *
   * HINT: You may use your implementation of makeUsername to complete 
   *       this method.
   *       First, try to get user's name + filename ("John Doe\File.txt").
   *       Then, you can get substring of user's name ("John Doe") to make a 
   *       username from it ("jdoe").
   *
   * @param winPath
   *            Windows-style path, e.g. "c:\Users\John Doe\File.txt"
   * 
   */
  public String winToUnixPath(String winPath) {
    String path;
    String first;
    String last;
    String full;
    String name;
    String rest;
    name = winPath.substring(10, winPath.indexOf("F"));
    //rest = name.substring(name.indexOf("F"-2));
   // first = name.substring(0, rest);
    //name = name.substring(0, name.indexOf("F"));
    first = name.substring(0,name.indexOf('o'));
    last = name.substring(name.indexOf(" "));
    full = first.concat(last);
    full = full.toLowerCase();
    path = "/homes/"+full+"/File.txt";
    
    // YOUR CODE GOES HERE. REMOVE FOLLOWING return ""; LINE.
    return path;
  }
 
  // NOTE: This is optional. You don't need to implement this method.
  /**
   * Return a String containing the rest of s after the nth occurence of c.
   *
   * For example,
   *   String str = "c:\\Users\\John Doe\\File.txt";
   *   System.out.println(chomp(str, '\\', 2));
   *
   * Then the output will be "John Doe\File.txt".
   * 
   * NOTE : '\' is an escape character so that you must use double
   *        backslash when you use it. 
   * 
   * @param s
   *            String to chomp on
   * @param c
   *            Character to chmop after
   * @param n
   *            nth c to chomp after
   * @return Chomped string
   */
 
  public String chomp(String s, char c, int n) {
    // YOUR CODE GOES HERE. REMOVE FOLLOWING return ""; LINE.
    return "";
  }
}