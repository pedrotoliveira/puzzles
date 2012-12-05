package puzzles.ocjp.flowcontrol;

/**
 * Propagating Exceptions.
 *
 * n	Create a class called Propagate and a main() method, which will remain
 * empty for now.
 *
 * n	Create a method called reverse. It takes an argument of a String and
 * returns a String.
 *
 * n	In reverse, check if the String has a length of 0 by using the
 * String.length() method. If the length is 0, the reverse method will throw an
 * exception.
 *
 * n	Now include the code to reverse the order of the String. Because this isn't
 * the main topic of this chapter, the reversal code has been provided, but feel
 * free to try it on your own.
 *
 * <code>
 * String reverseStr = "";
 *      for(int i=s.length()-1;i>=0;--i) {
 *          reverseStr += * s.charAt(i);
 *      }
 * return reverseStr;
 * </code>
 *
 * n	Now in the main() method you will attempt to call this method and deal with
 * any potential exceptions. Additionally, you will include a finally statement
 * that displays when main() has finished.
 *
 * @author cad_ptoliveira
 */
public class Propagate {

    public static void main(String args[]) {
        try {
            for (String s : args) {
                System.out.println("Reversed: " + reverse(s));
            }            
        } catch(Exception ex) {
            System.out.println("Exception has throwed: " + ex.getMessage());
        } finally {
            System.out.println("End of Main");
        }
    }

    private static String reverse(final String s) {
        if (s.length() == 0) {
            throw new IllegalArgumentException("Invalid String");
        }
        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }
}
