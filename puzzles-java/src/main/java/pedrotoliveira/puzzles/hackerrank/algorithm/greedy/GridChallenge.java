package pedrotoliveira.puzzles.hackerrank.algorithm.greedy;

import java.util.*;

/**
 *
 * https://www.hackerrank.com/challenges/grid-challenge
 *
 * @author Pedro T. Oliveira
 */
public class GridChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			int gridSize = in.nextInt();
			final Grid grid = new Grid(gridSize);
			while (gridSize-- > 0) {
				String line = in.next();
				grid.addLine(line);
			}

			System.out.println(grid.canBeRearranged());
		}
	}
}

class Grid {

	private final int gridSize;
	private int addedLines = 0;
	private final char[][] gridChars;

	public Grid(int gridSize) {
		this.gridSize = gridSize;
		this.gridChars = new char[gridSize][gridSize];
	}

	public void addLine(String line) {
		if (line.toCharArray().length > gridSize) {
			throw new IllegalArgumentException("Line Size Must Have at Most " + gridSize + " characters");
		}

		if (addedLines <= gridSize) {
			char[] chars = line.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char aChar = chars[i];
				gridChars[addedLines][i] = aChar;
			}
		}
		addedLines++;
	}

	public String canBeRearranged() {
		boolean canBe = true;
		for (int i = 0; i < gridSize; i++) {
			char[] line = gridChars[i];
			Arrays.sort(line);
		}

		for (int i = 0; i < gridSize - 1; i++) {
			for (int j = 0; j < gridSize - 1; j++) {
				int n1 = Character.getNumericValue(gridChars[i][j]);
				int n2 = Character.getNumericValue(gridChars[i][j + 1]);
				int n3 = Character.getNumericValue(gridChars[j][i]);
				int n4 = Character.getNumericValue(gridChars[j + 1][i]);
				if (n1 > n2 || n3 > n4) {
					canBe = false;
				}
			}
		}
		printGrid(gridChars);
		return canBe ? "YES" : "NO";
	}

	private void printGrid(char[][] gridChars) {
		for (int i = 0; i < this.gridChars.length; i++) {
			for (int j = 0; j < this.gridChars.length; j++) {
				System.out.print(Character.getNumericValue(this.gridChars[i][j]));
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
