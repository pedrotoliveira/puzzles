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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	public static void main(String[] args) {
		new TaumAndBDay().printSolution();
	}

	public int convertGifts(final Gifts blackGifts, final Gifts whiteGifts, int convertCost) {
		int blackGiftCost = blackGifts.getCost();
		int whiteGiftCost = whiteGifts.getCost();
		
		if (blackGiftCost > whiteGiftCost && blackGiftCost > (whiteGiftCost + convertCost)) {
			return whiteGifts.getQuantity() * whiteGiftCost + (blackGifts.getQuantity() * (whiteGiftCost + convertCost));
		}
		
		if (whiteGiftCost > blackGiftCost && whiteGiftCost > (blackGiftCost + convertCost)) {
			return blackGifts.getQuantity() * blackGiftCost + (whiteGifts.getQuantity() * (blackGiftCost + convertCost));
		}		
		return blackGifts.getQuantity() * blackGiftCost + whiteGifts.getQuantity() * whiteGiftCost;
	}
}
