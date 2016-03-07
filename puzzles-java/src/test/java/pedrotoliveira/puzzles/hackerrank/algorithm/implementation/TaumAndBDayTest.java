package pedrotoliveira.puzzles.hackerrank.algorithm.implementation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pedrotoliveira.puzzles.hackerrank.algorithm.greedy.Grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 *
 * @author p-poliveira
 */
@RunWith(value = Parameterized.class)
public class TaumAndBDayTest {

	private final Gifts blackGifts;
	private final Gifts whiteGifts;
	private final int convertCost;
	private final int expectedCost;

	public TaumAndBDayTest(Gifts blackGifts, Gifts whiteGifts, int convertCost, int expectedCost) {
		this.blackGifts = blackGifts;
		this.whiteGifts = whiteGifts;
		this.convertCost = convertCost;
		this.expectedCost = expectedCost;
	}

	@Parameterized.Parameters(name = "Test Case {index}:")
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][]{
			{new Gifts(5, 2), new Gifts(9, 3), 4, 37},
			{new Gifts(3, 6), new Gifts(6, 1), 1, 12},
			{new Gifts(7, 4), new Gifts(7, 2), 1, 35}
		});
	}

	@Test
	public void testConvertGifts() {
		assertThat(new TaumAndBDay().convertGifts(blackGifts, whiteGifts, convertCost), equalTo(expectedCost));
	}
}
