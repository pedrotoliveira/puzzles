package pedrotoliveira.puzzles.hackerrank.mathematics.fundamentals;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author pedrotoliveira
 */
@RunWith(value = Parameterized.class)
public class HalloweenPartyTest {
	
	private final int cuts;
	private final int expectedPieces;

	public HalloweenPartyTest(int cuts, int expectedPieces) {
		this.cuts = cuts;
		this.expectedPieces = expectedPieces;
	}
	
	@Test
	public void testCountPieces() {
		assertThat(new HalloweenParty().countPieces(cuts), equalTo(expectedPieces));
	}	
	
	@Parameterized.Parameters(name = "Test Case {index}:")
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] {
			{5, 6},
			{6, 9},
			{7, 12},
			{8, 16}
		});
	}
}
