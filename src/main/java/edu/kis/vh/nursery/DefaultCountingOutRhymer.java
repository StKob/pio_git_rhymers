package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

	public static final int INT = -1;
	public static final int SIZE = 12;
	public static final int INT1 = SIZE - 1;
	private final int[] numbers = new int[SIZE];
  private int total = INT;


	/**
	 * Get total int.
   *
   * @return the int
	 */
	public int getTotal() {
		return total;
	}


	/**
	 * Count in.
	 *
	 * @param in the in
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Call check boolean.
	 *
	 * @return the boolean
	 */
	public boolean callCheck() {
		return total == INT;
	}

	/**
	 * Is full boolean.
	 *
	 * @return the boolean
	 */
	public boolean isFull() {
		return total == INT1;
	}

	/**
	 * Peekaboo int.
	 *
	 * @return the int
	 */
	protected int peekaboo() {
		if (callCheck())
			return INT;
		return numbers[total];
	}

	/**
	 * Count out int.
	 *
	 * @return the int
	 */
	public int countOut() {
		if (callCheck())
			return INT;
		return numbers[total--];
	}

}
