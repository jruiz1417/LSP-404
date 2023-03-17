package org.howard.edu.lsp.midterm.problem51;
/**
 * @author Jose Ruiz
 */
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class IntegerRangeTest {

    @Test
    @DisplayName("Test of GetLower")
    public void testGetLower() {
        IntegerRange range = new IntegerRange(5, 10);
        assertEquals(5, range.getLower()); //Verifies if the lowest number is equal
    }

    @Test
    @DisplayName("Test of GetUpper")
    public void testGetUpper() {
        IntegerRange range = new IntegerRange(5, 10);
        assertEquals(10, range.getUpper()); //Verifies if the largest number is equal
    }

    @Test
    @DisplayName("Test of IntergerContain")
    //Verifies if interger is within the range
    public void testContains() {
        IntegerRange range = new IntegerRange(5, 10);
        assertTrue(range.contains(7)); //Verifies if it is true
        assertFalse(range.contains(11)); //Verifies if it is false
    }

    @Test
    @DisplayName ("Test of Overlap")
    //Throws Exception if range is null
    public void testOverlaps() throws Exception {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        assertTrue(range1.overlaps(range2)); //Verifies if it overlaps
    }

    @Test(expected = Exception.class)
    @DisplayName ("Test of Overlap null range")
    //Throws null exception if any
    public void testOverlapsWithNullRange() throws Exception {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = null;
        range1.overlaps(range2);
    }

    @Test
    @DisplayName ("Test of range bound size")
 // create an instance of IntegerRange with lower bound 5 and upper bound 10
    public void testSize() {
        IntegerRange range = new IntegerRange(5, 10);
        assertEquals(6, range.size());
    }
}


