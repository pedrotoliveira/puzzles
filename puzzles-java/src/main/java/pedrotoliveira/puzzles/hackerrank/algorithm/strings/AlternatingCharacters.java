package pedrotoliveira.puzzles.hackerrank.algorithm.strings;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/alternating-characters
 *
 * @author pedrotoliveira
 */
public class AlternatingCharacters {

	private final Scanner in;
	private final PrintStream out;

	public AlternatingCharacters() {
		this(System.in, System.out);
	}
	
	public AlternatingCharacters(InputStream input, final PrintStream out) {
		this.in = new Scanner(input);
		this.out = out;
	}

	public void printSolution() {
		int testCases = in.nextInt();		
		while (testCases-- > 0) {
			String line = in.next();			
			out.println(countDeletions(line));
		}
	}

	public long countDeletions(final String line) {
		long count = 0l;
		char[] chars = line.toCharArray();		
		for (int i = 0; i < chars.length - 1; i++) {
			char current = chars[i];
			char next = chars[i + 1];
			if (Character.getNumericValue(current) == Character.getNumericValue(next)) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		new AlternatingCharacters().printSolution();
	}
}
