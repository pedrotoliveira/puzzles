package pedrotoliveira.puzzles.hackerrank.algorithm.implementation;

/**
 * @author pedrotoliveira
 */
public class Gifts {

	private final long quantity;
	private final long cost;

	public Gifts(long quantity, long cost) {
		this.quantity = quantity;
		this.cost = cost;
	}

	public long getQuantity() {
		return quantity;
	}

	public long getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "Gifts{" + "quantity=" + quantity + ", cost=" + cost + '}';
	}
}
