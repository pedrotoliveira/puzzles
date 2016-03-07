package pedrotoliveira.puzzles.hackerrank.algorithm.implementation;

import pedrotoliveira.puzzles.hackerrank.HackerRankSolution;

/**
 *
 * https://www.hackerrank.com/challenges/taum-and-bday
 *
 * @author Pedro T. Oliveira
 */
public class TaumAndBDay extends HackerRankSolution {

	@Override
	public void printSolution() {
		int testCases = in.nextInt();
		while(testCases-- > 0) {
			long blackQuant = in.nextLong();
			long whiteQuant = in.nextLong();
			long blackCost = in.nextLong();
			long whiteCost = in.nextLong();
			long convert = in.nextLong();
			out.println(convertGifts(new Gifts(blackQuant, blackCost), new Gifts(whiteQuant, whiteCost), convert));
		}
	}

	public static void main(String[] args) {
		new TaumAndBDay().printSolution();
	}

	public long convertGifts(final Gifts blackGifts, final Gifts whiteGifts, long convertCost) {
		long blackGiftCost = blackGifts.getCost();
		long whiteGiftCost = whiteGifts.getCost();
		
		if (blackGiftCost > whiteGiftCost && blackGiftCost > (whiteGiftCost + convertCost)) {
			return whiteGifts.getQuantity() * whiteGiftCost + (blackGifts.getQuantity() * (whiteGiftCost + convertCost));
		}
		
		if (whiteGiftCost > blackGiftCost && whiteGiftCost > (blackGiftCost + convertCost)) {
			return blackGifts.getQuantity() * blackGiftCost + (whiteGifts.getQuantity() * (blackGiftCost + convertCost));
		}		
		return blackGifts.getQuantity() * blackGiftCost + whiteGifts.getQuantity() * whiteGiftCost;
	}
}
