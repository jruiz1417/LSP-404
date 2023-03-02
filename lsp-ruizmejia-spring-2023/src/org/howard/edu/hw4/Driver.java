package org.howard.edu.hw4;
/**
 * @author josem
 * @version 3/2/2023
 */

//Imported IntegerSetException
import org.howard.edu.hw4.IntegerSet.IntegerSetException;

/**
 * 
 * Driver executes main fuction
 *
 */
public class Driver {
	/**
	 * 
	 * @param args it takes strings as an argument
	 * 
	 * @throws IntegerSetException Exception for integerset value
	 *
	 */

	public static void main(String[] args) throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());

		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Smallest value in Set2 is: " + set2.smallest());
		System.out.println("Largest value in Set2 is: " + set2.largest());
		
		
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2");
		System.out.println(set1.toString());	// result of union of set1 and set2
		set1.intersect(set2);
		System.out.println("The intersection of both Set 1-2: " + set1);
		System.out.println("The length of each Set: " + " Set1: " + set1.length()  + " Set2: " + + set2.length());
		System.out.println("Is both sets empty?: " + " Set1: " + set1.isEmpty() + " Set2: " + set2.isEmpty());
		System.out.println("Is Set 1 equal to Set 2: " + set1.equals(set2));
		set1.remove(3);
		System.out.println("Remove integer for set 1: " + set1);
		System.out.println("Is Set 1 equal to Set 2: " + set1.equals(set2));
		set1.diff(set2);
		System.out.println("The diffence of both sets: " + set1);
		


	}

}
