package pedrotoliveira.puzzles.hackerrank.algorithm.sort;

import pedrotoliveira.puzzles.hackerrank.HackerRankSolution;

/**
 * https://www.hackerrank.com/challenges/insertionsort2
 *
 * @author pedrotoliveira
 */
public class InsertionSortTwo extends HackerRankSolution {

	public static int[] insertionSortPart2(int[] ar) {		
		return null;
	}
	
	private void printArray(int[] ar) {
		for (int n : ar) {
			out.print(n + " ");
		}		
		out.println("");
	}

	public static void main(String[] args) {		
		new InsertionSortTwo().printSolution();
	}
	
	@Override
	public void printSolution() {
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
	}
}
