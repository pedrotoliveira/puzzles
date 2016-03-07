package pedrotoliveira.puzzles.hackerrank.algorithm.implementation;

/**
 *
 * @author p-poliveira
 */
public class Gifts {

	private final int quantity;
	private final int cost;

	public Gifts(int quantity, int cost) {
		this.quantity = quantity;
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "Gifts{" + "quantity=" + quantity + ", cost=" + cost + '}';
	}
}
