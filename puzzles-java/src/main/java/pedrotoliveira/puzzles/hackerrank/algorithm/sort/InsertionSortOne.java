package pedrotoliveira.puzzles.hackerrank.algorithm.sort;

import java.util.Scanner;

/**
 *
 * @author pedrotoliveira
 */
public class InsertionSortOne {

	public static void insertIntoSorted(int[] arr) {
		int rightmostCell = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > rightmostCell) {
				int aux = arr[i];
				arr[i + 1] = aux;
				printArray(arr);
			} else {
				arr[i + 1] = rightmostCell;
				printArray(arr);
				break;
			}
		}

		if (rightmostCell <= arr[0]) {
			arr[0] = rightmostCell;
			printArray(arr);
		}
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] arr) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
