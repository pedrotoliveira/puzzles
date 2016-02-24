package pedrotoliveira.puzzles.hackerrank.algorithm.greedy;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Pedro T. Oliveira
 */
@RunWith(value = Parameterized.class)
public class GridTest {

	private int gridSize;
	private String[] lines;
	private String expected;

	public GridTest(int gridSize, String[] lines, String expected) {
		this.gridSize = gridSize;
		this.lines = lines;
		this.expected = expected;
	}

	@Parameters(name = "{index}: ")
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][]{
			{5, new String[]{"ebacd", "fghij", "olmkn", "trpqs", "xywuv"}, "YES"},
			{5, new String[]{"fghij", "olmkn", "trpqs", "xywuv", "ebacd"}, "NO"},
			{3, new String[]{"hcd", "awc", "shm"}, "NO"},
			{3, new String[]{"sur", "eyy", "gxy"}, "NO"},
			{3, new String[]{"nyx", "ynx", "xyt"}, "YES"},
			{4, new String[]{"vpvv", "pvvv", "vzzp", "zzyy"}, "YES"}
		});
	}

	@Test
	public void testCanBeRearranged() {
		Grid grid = new Grid(gridSize);
		for (String line : lines) {
			grid.addLine(line);
		}
		assertThat(grid.canBeRearranged(), equalTo(expected));
	}
}
