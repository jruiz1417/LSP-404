package org.howard.edu.hw5;

/**
 * @author josem
 */

//Needed imports
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;

public class IntegerSet {

    // Hint: probably best to use an array list. You will need to do a little research
    private List<Integer> set = new ArrayList<>();
    

    // Default Constructor
    public IntegerSet() {}

    // Clears the internal representation of the set
    public void clear() {
        set.clear();
    }

    // Returns the length of the set
    public int length() {
        return set.size();
    }

    /**
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     * @param b parameter that accepts an array
     * @return boolean 
     */
    
    public boolean equals(IntegerSet b) {
        if (set.size() != b.length()) {
            return false;
        }
        for (int i = 0; i < set.size(); i++) {
            if (!b.contains(set.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns true if the set contains the value, otherwise false
     * @param value parameter that accepts an array and verifies value
     * @return boolean type
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set; Throws a IntegerSetException if the set is empty
     * @return max
     * @throws IntegerSetException Exception for integerset value if set is empty
     */
    
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) > max) {
                max = set.get(i);
            }
        }
        return max;
    }

    /**
     * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
     * @return min
     * @throws IntegerSetException Exception for integerset value if set is empty
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = set.get(0);
        for (int i = 1; i < set.size(); i++) {
            if (set.get(i) < min) {
                min = set.get(i);
            }
        }
        return min;
    }

    /**
     * 
     * @param item adds an item to the set or does nothing if already there 
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * 
     * @param item removes an item from the set or does nothing if not there
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Set union
     * @param intSetb parameter that accepts an array
     */
    public void union(IntegerSet intSetb) {
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Set intersection
     * @param intSetb parameter that accepts an array
     */
    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            if (set.contains(item)) {
                intersection.add(item);
            }
        }
        set = intersection;
    }

    /**
     * Set difference, i.e., s1 –s2
     * @param intSetb parameter that accepts an array
     */
    
    public void diff(IntegerSet intSetb) {
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            set.remove(Integer.valueOf(item));
        }
    }

    /**
     * Returns true if the set is empty, false otherwise
     * @return returns boolean type
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }
    /**
     * 
     * IntegersetException method for function calls
     *
     */
    public class IntegerSetException extends Exception {
    	private static final long serialVersionUID = 1L;
    	
        public IntegerSetException(String message) {
        	
            super(message);
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < set.size(); i++) {
            sb.append(set.get(i));
            sb.append(" ");
        }
        sb.append("}");
        return sb.toString();
    }
}
   

