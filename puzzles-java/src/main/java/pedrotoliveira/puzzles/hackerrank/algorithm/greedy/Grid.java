/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedrotoliveira.puzzles.hackerrank.algorithm.greedy;

import java.util.Arrays;

/**
 *
 * @author pedrotoliveira
 */
public class Grid {

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

        for (int i = 0; i < gridSize; i++) {
			for (int j = 0; j < gridSize - 1; j++) {
				int n1 = Character.getNumericValue(gridChars[i][j]);
				int n2 = Character.getNumericValue(gridChars[i][j + 1]);
				int n3 = Character.getNumericValue(gridChars[j][i]);
				int n4 = Character.getNumericValue(gridChars[j + 1][i]);
				if (!(n1 <= n2 && n3 <= n4)) {
					canBe = false;
					break;
				}
			}
		}        
		return canBe ? "YES" : "NO";
	}
	
	public void printGrid() {
		for (char[] gridChar : this.gridChars) {
			for (int j = 0; j < this.gridChars.length; j++) {
                System.out.print(Character.getNumericValue(gridChar[j]));
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}