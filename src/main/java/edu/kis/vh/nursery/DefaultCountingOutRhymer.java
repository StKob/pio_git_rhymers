package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INT = -1;
	public static final int SIZE = 12;
	public static final int INT1 = SIZE - 1;
	private final int[] numbers = new int[SIZE];

	public int total = INT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == INT;
	}
		
	public boolean isFull() {
		return total == INT1;
	}
		
	protected int peekaboo() {
		if (callCheck())
			return INT;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return INT;
		return numbers[total--];
	}

}
