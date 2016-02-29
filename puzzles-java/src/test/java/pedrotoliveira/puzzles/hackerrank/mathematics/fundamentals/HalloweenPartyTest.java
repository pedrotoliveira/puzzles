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
	
	private final long cuts;
	private final long expectedPieces;

	public HalloweenPartyTest(long cuts, long expectedPieces) {
		this.cuts = cuts;
		this.expectedPieces = expectedPieces;
	}
	
	@Test
	public void testCountPieces() {
		assertThat(new HalloweenParty().countPieces(cuts), equalTo(expectedPieces));
	}	
	
	@Parameterized.Parameters(name = "Test Case {index}: cuts={0} exp={1}")
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][] {
			{5L, 6L},
			{6L, 9L},
			{7L, 12L},
			{8L, 16L},
			{1856378L, 861534819721L},
			{525494L, 69035986009L},
			{4137970L, 4280698930225L}
		});
	}
}
