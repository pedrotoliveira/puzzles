package pedrotoliveira.puzzles.hackerrank.algorithm.greedy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Pedro T. Oliveira
 */
public class GridTest {

	private Grid grid;
	
	@Before
	public void setUp() {
		this.grid = new Grid(5);
	}

	@Test
	public void testCanBeRearranged() {
		grid.addLine("ebacd");
		grid.addLine("fghij");
		grid.addLine("olmkn");
		grid.addLine("trpqs");
		grid.addLine("xywuv");
		
		assertThat(grid.canBeRearranged(), equalTo("YES"));
	}
	
}
