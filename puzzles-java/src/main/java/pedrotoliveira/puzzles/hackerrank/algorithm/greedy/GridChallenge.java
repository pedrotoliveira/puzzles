package pedrotoliveira.puzzles.hackerrank.algorithm.greedy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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
				String line = in.nextLine();
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
		boolean canBe = false;		
		for (int i = 0; i < gridSize; i++) {
			for (int j=0; j < gridSize - 1; j++) {
				char temp = gridChars[i][j];
				if (gridChars[i][j + 1] >  gridChars[i][j]) {
					gridChars[i][j] = gridChars[i][j + 1];
					gridChars[i][j + 1] = temp;					
				}
			}
		}
		
		return canBe ? "YES" : "NO";
	}
}
