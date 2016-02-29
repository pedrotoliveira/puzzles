package pedrotoliveira.puzzles.hackerrank;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public abstract class HackerRankSolution {
	
	protected final Scanner in;
	protected final PrintStream out;

	public HackerRankSolution() {
		this(System.in, System.out);
	}

	public HackerRankSolution(final InputStream in, final PrintStream out) {
		Objects.requireNonNull(in, "InputStream Cannot be null.");
		Objects.requireNonNull(out, "PrintStream Cannot be null.");
		this.in = new Scanner(in);
		this.out = out;
	}
	
	public abstract void printSolution();
}
