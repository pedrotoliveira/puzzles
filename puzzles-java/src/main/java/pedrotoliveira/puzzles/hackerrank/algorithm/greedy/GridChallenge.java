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
        out.close();
    }

    public static void main(String[] args) {
        new GridChallenge(System.in, System.out).printSolution();
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
                if (!(n1 <= n2 && n3 <= n4)) {
                    canBe = false;
                    break;
                }
            }
        }
        //printGrid(gridChars);
        return canBe ? "YES" : "NO";
    }

    private void printGrid(char[][] gridChars) {
        for (char[] gridChar : this.gridChars) {
            for (int j = 0; j < this.gridChars.length; j++) {
                System.out.print(Character.getNumericValue(gridChar[j]));
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
