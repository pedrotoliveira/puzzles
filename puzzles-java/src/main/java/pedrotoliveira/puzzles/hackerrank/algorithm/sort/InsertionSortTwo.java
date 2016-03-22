package pedrotoliveira.puzzles.hackerrank.algorithm.sort;

import java.util.ArrayList;
import java.util.List;
import pedrotoliveira.puzzles.hackerrank.HackerRankSolution;

/**
 * https://www.hackerrank.com/challenges/insertionsort2
 *
 * @author pedrotoliveira
 */
public class InsertionSortTwo extends HackerRankSolution {

	public static List<String> insertionSortPart2(int[] arr) {
		List<String> lines = new ArrayList<>();
		int rightmostCell = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > rightmostCell) {
				int aux = arr[i];
				arr[i + 1] = aux;				
			} else {
				arr[i + 1] = rightmostCell;				
				break;
			}
		}

		if (rightmostCell <= arr[0]) {
			arr[0] = rightmostCell;			
		}
		return lines;
	}
	
	private void printLines(List<String> lines) {
		for (String l : lines) {
			out.println(l);
		}
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
		printLines(insertionSortPart2(ar));
	}
}
