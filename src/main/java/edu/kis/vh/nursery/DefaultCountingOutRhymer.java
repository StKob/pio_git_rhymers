package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

	private int[] numbers = new int[12];

	/**
	 * The Total.
	 */
	public int total = -1;

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
		return total == -1;
	}

	/**
	 * Is full boolean.
	 *
	 * @return the boolean
	 */
	public boolean isFull() {
		return total == 11;
	}

	/**
	 * Peekaboo int.
	 *
	 * @return the int
	 */
	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	/**
	 * Count out int.
	 *
	 * @return the int
	 */
	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
