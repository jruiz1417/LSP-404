package org.howard.edu.hw5;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.hw5.IntegerSet.IntegerSetException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
    
    IntegerSet emptySet;
    IntegerSet set1;
    IntegerSet set2;
    
    @BeforeEach
    void setUp() throws Exception {
        emptySet = new IntegerSet();
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);
    }

    @Test
    @DisplayName("Test case for clear")
    void testClear() {
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    void testLength() {
        assertEquals(0, emptySet.length());
        assertEquals(3, set1.length());
        assertEquals(3, set2.length());
    }

    @Test
    @DisplayName("Test case for equals")
    void testEquals() {
        assertTrue(set1.equals(set1));
        assertFalse(set1.equals(set2));
        assertFalse(set2.equals(set1));
        assertFalse(set1.equals(emptySet));
    }

    @Test
    @DisplayName("Test case for contains")
    void testContains() {
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertFalse(set1.contains(4));
        assertFalse(emptySet.contains(1));
    }

    @Test
    @DisplayName("Test case for largest")
    
    void testLargest() {
        assertThrows(IntegerSetException.class, () -> emptySet.largest());
        try {
			assertEquals(3, set1.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			assertEquals(4, set2.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Test
    @DisplayName("Test case for smallest")
    void testSmallest() {
        assertThrows(IntegerSetException.class, () -> emptySet.smallest());
        try {
			assertEquals(1, set1.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			assertEquals(2, set2.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Test
    @DisplayName("Test case for add")
    void testAdd() {
        emptySet.add(1);
        assertTrue(emptySet.contains(1));
        emptySet.add(1);
        assertEquals(1, emptySet.length());
    }

    @Test
    @DisplayName("Test case for remove")
    void testRemove() {
        set1.remove(2);
        assertFalse(set1.contains(2));
        set2.remove(4);
        assertEquals(2, set1.length());
    }

    @Test
    @DisplayName("Test case for union")
    void testUnion() {
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertTrue(set1.contains(4));
    }

    @Test
    @DisplayName("Test case for intersect")
    void testIntersect() {
        set1.intersect(set2);
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertFalse(set1.contains(1));
        assertFalse(set1.contains(4));
    }

    @Test
    @DisplayName("Test case for difference")
    void testDiff() {
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(3));
        assertFalse(set1.contains(4));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    void testIsEmpty() {
        assertTrue(emptySet.isEmpty()); // should return true 
        assertFalse(set1.isEmpty()); // should return false
    }

    @Test
    @DisplayName("Test case for ToString")
    void testToString() {
    	String set1String = set1.toString();
    	assertTrue(set1String.contains("1"));
    	assertTrue(set1String.contains("2"));
    	assertTrue(set1String.contains("3"));
    
    	String set2String = set2.toString();
    	assertTrue(set2String.contains("2"));
    	assertTrue(set2String.contains("3"));
    	assertTrue(set2String.contains("4"));
        
    }

}
