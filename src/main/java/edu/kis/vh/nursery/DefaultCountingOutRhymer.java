package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

    public static final int EMPTY = -1;
    public static final int MAX_SIZE = 12;
    public static final int FULL = MAX_SIZE - 1;
    private final int[] numbers = new int[MAX_SIZE];
    private int total = EMPTY;


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
        return total == EMPTY;
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Peekaboo int.
     *
     * @return the int
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Count out int.
     *
     * @return the int
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
