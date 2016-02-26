/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedrotoliveira.puzzles.hackerrank.algorithm.strings;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author pedrotoliveira
 */
@RunWith(value = Parameterized.class)
public class AlternatingCharactersTest {

	private final String line;
	private final long expectedCount;

	public AlternatingCharactersTest(String line, long expectedCount) {
		this.line = line;
		this.expectedCount = expectedCount;
	}
	
	@Parameterized.Parameters(name = "Test Case {index}:")
	public static Collection<Object[]> testData() {
		return Arrays.asList(new Object[][]{
			{"AAAA", 3l},
			{"BBBBB", 4l},
			{"ABABABAB", 0l},
			{"BABABA", 0l},
			{"AAABBB", 4l}
		});
	}

	@Test
	public void testCountDeletions() {
		assertThat(new AlternatingCharacters().countDeletions(line), equalTo(expectedCount));
	}
}
