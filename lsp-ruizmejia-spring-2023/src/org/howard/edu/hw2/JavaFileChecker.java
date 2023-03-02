package org.howard.edu.hw2;

/**
 * @author joseruiz
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class JavaFileChecker {
	public static void main(String[] args) {
		//Added an interactive function of terminal asking for the text file "Word.txt".
		
		// Created a map to store the word count
	    Map<String, Integer> wordCount = new HashMap<>();

	    // it reads the text file using BufferedReader
	    try (BufferedReader br = new BufferedReader(new FileReader("Word.txt"))) {
	    	String text;
	    	while ((text = br.readLine()) != null) {
	    		// Splits the line into words using a regular expression
	    		String[] words = text.split("\\W+");
	    		// For loop to iterate through each word
	            for (String word : words) {
	            	//convert them all to lower case in case any mixed cases appears.
	            	word = word.toLowerCase();
	            	// If the word is not empty, increment its count in the map
	            	if (!word.isEmpty()) {
	            		wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }
	    	//This catches any unwanted texts inputs and displays it with the IOException message.
	    	} catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }

	        // Print the word count
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
	    }
	}