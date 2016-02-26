package pedrotoliveira.puzzles.hackerrank.algorithm.greedy;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

/**
 *
 * https://www.hackerrank.com/challenges/grid-challenge
 *
 * @author Pedro T. Oliveira
 */
public class GridChallenge {

	private final Scanner in;
	private final PrintStream out;

	public GridChallenge(final InputStream input, final PrintStream output) {
		this.in = new Scanner(input);
		this.out = output;
	}

	public void printSolution() {
		int testCases = in.nextInt();
        while (testCases-- > 0) {
			int gridSize = in.nextInt();
			final Grid grid = new Grid(gridSize);
			while (gridSize-- > 0) {
				String line = in.next();
				grid.addLine(line);
			}
            out.println(grid.canBeRearranged());
		}
	}

	public static void main(String[] args) {
		new GridChallenge(System.in, System.out).printSolution();
	}
}
