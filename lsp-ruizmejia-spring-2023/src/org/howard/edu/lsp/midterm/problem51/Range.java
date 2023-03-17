package org.howard.edu.lsp.midterm.problem51;
/**
 * 
 * @author Jose Ruiz
 *
 */

public class Range {

	public static void main(String[] args) throws Exception {
	    IntegerRange range1 = new IntegerRange(1, 10);
	    IntegerRange range2 = new IntegerRange(5, 15);

	    System.out.println("range1 contains 5: " + range1.contains(5));
	    System.out.println("range2 contains 10: " + range2.contains(10));
	    try {
	        System.out.println("range1 overlaps range2: " + range1.overlaps(range2));
	    } catch (EmptyRangeException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	    System.out.println("range1 size: " + range1.size());
	}
	@SuppressWarnings("serial")
	public class EmptyRangeException extends Exception {
	    public EmptyRangeException(String message) {
	        super(message);
	    }
	}
}

