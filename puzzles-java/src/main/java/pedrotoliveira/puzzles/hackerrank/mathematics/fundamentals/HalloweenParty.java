package pedrotoliveira.puzzles.hackerrank.mathematics.fundamentals;

import pedrotoliveira.puzzles.hackerrank.HackerRankSolution;

/**
 * https://www.hackerrank.com/challenges/halloween-party
 * 
 * @author pedrotoliveira
 */
public class HalloweenParty extends HackerRankSolution {
		
	public int countPieces(int cuts) {		
		int verticalCut = 0;
		int horizontalCut = 0;
		for (int i=1; i <= cuts; i++) {
			if (i % 2 == 0) {
				horizontalCut++;
			} else {
				verticalCut++;
			}
		}
		return verticalCut * horizontalCut;		
	}
	
	@Override
	public void printSolution() {
		int testCases = in.nextInt();
		while (testCases-- > 0) {
			int cuts = in.nextInt();
			System.out.println(countPieces(cuts));
		}		
	}
	
	public static void main(String[] args) {
		new HalloweenParty().printSolution();
	}
	
}
 