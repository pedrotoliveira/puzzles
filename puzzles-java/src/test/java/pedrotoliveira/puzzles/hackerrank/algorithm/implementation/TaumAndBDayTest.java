package pedrotoliveira.puzzles.hackerrank.algorithm.implementation;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author p-poliveira
 */
public class TaumAndBDayTest {
	
	private final List<Gift> blackGifts;
	private final List<Gift> whiteGifts;
	private final int convertCost;

	public TaumAndBDayTest(List<Gift> blackGifts, List<Gift> whiteGifts, int convertCost) {
		this.blackGifts = blackGifts;
		this.whiteGifts = whiteGifts;
		this.convertCost = convertCost;
	}
	
	@Test
	public void testConvertGifts() {
		new TaumAndBDay().convertGifts(blackGifts, whiteGifts, convertCost);
	}
}
