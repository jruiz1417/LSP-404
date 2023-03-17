package org.howard.edu.lsp.midterm.problem51;
/**
 * 
 * @author Jose Ruiz
 *
 */
public class IntegerRange  {
    private int lower;
    private int upper;

    public IntegerRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    public boolean contains(int value) {
        return value >= lower && value <= upper;
    }

    public boolean overlaps(IntegerRange range2) throws Exception {
        if (range2 == null) {
            throw EmptyRangeException("Range is null");
        }
        IntegerRange range = (IntegerRange) range2;
        return (lower >= range.getLower() && lower <= range.getUpper()) ||
               (upper >= range.getLower() && upper <= range.getUpper()) ||
               (range.getLower() >= lower && range.getLower() <= upper) ||
               (range.getUpper() >= lower && range.getUpper() <= upper);
    }

    private Exception EmptyRangeException(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
        return upper - lower + 1;
    }
}


