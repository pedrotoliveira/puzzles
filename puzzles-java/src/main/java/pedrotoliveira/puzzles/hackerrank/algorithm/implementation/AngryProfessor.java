package pedrotoliveira.puzzles.hackerrank.algorithm.implementation;

import pedrotoliveira.puzzles.hackerrank.HackerRankSolution;

/**
 * https://www.hackerrank.com/challenges/angry-professor
 *
 * @author pedrotoliveira
 */
public class AngryProfessor extends HackerRankSolution {

	@Override
	public void printSolution() {
		int tests = in.nextInt();
		for (int i = 0; i < tests; i++) {
			int students = in.nextInt();
			int threshold = in.nextInt();
			int count = 0;
			while (students-- > 0) {
				int arriveTime = in.nextInt();
				if (arriveTime < 1) {
					count++;
				}
			}
			out.println((count >= threshold) ? "NO" : "YES");
		}
	}
	
	public static void main(String[] args) {
		new AngryProfessor().printSolution();
	}
}
