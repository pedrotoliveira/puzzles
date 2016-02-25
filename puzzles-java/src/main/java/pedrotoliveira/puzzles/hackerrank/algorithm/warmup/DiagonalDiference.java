package pedrotoliveira.puzzles.hackerrank.algorithm.warmup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * Problem Statement
 *
 * Given a square matrix of size N×N, calculate the absolute difference between
 * the sums of its diagonals.
 *
 * Input Format
 *
 * The first line contains a single integer, N. The next N lines denote the
 * matrix's rows, with each line containing N space-separated integers
 * describing the columns.
 *
 * Output Format
 *
 * Print the absolute difference between the two sums of the matrix's diagonals
 * as a single integer.
 *
 * <code>
 * Sample Input
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * </code>
 *
 * Sample Output
 *
 * 15
 *
 * Explanation
 *
 * The primary diagonal is: 11 5 -12
 *
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 *
 * The secondary diagonal is: 4 5 10
 *
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 *
 * Difference: |4 - 19| = 15
 *
 * @author pedrotoliveira
 */
public class DiagonalDiference {

    private final List<Integer> primaryDiagonal;
    private final List<Integer> secondaryDiagonal;

    public DiagonalDiference(int squareSize, Map<Integer, List<Integer>> squareLines) {
        this.primaryDiagonal = extraxtPrimaryDiagonal(squareSize, squareLines);
        this.secondaryDiagonal = extractSecondaryDiagonal(squareSize, squareLines);
    }

    private List<Integer> extraxtPrimaryDiagonal(int squareSize, Map<Integer, List<Integer>> squareLines) {
        List<Integer> priDiagonal = new ArrayList<>();
        if (squareLines != null && !squareLines.isEmpty()) {
            for (int i = 0; i < squareSize; i++) {
                List<Integer> line = squareLines.get(i);
                priDiagonal.add(line.get(i));
            }
        }
        return priDiagonal;
    }

    private List<Integer> extractSecondaryDiagonal(int squareSize, Map<Integer, List<Integer>> squareLines) {
        List<Integer> secDiagonal = new ArrayList<>();
        for (int i = 0; i < squareSize; i++) {
            List<Integer> line = squareLines.get(i);
            secDiagonal.add(line.get(squareSize - (i + 1)));
        }
        return secDiagonal;
    }

    public int doDiference() {
        int primarySum = diagonalSum(primaryDiagonal);
        int secondarySum = diagonalSum(secondaryDiagonal);
        return Math.abs(primarySum - secondarySum);
    }

    private int diagonalSum(List<Integer> primaryDiagonal) {
        return primaryDiagonal.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int squareSize = in.nextInt();
            Map<Integer, List<Integer>> squareLines = new HashMap<>(squareSize);
            for (int i = 0; i < squareSize; i++) {
                List<Integer> line = new ArrayList<>();
                for (int j = 0; j < squareSize; j++) {
                    if (in.hasNextInt()) {
                        line.add(in.nextInt());
                    } else {
                        throw new RuntimeException("Wrong Square");
                    }
                }
                squareLines.put(i, line);
            }
            System.out.println(new DiagonalDiference(squareSize, squareLines).doDiference());
        }
    }
}
