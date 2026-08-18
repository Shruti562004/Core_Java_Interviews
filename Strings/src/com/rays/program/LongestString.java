package com.rays.program;

public class LongestString {
	
	public static void main(String[] args) {
		String str="a ab abvdfdf ddffdf tgtgt";
		String[] words=str.split(" ");
		
		
		String longest="";
		for(String word:words)
		{
			if(word.length()>longest.length()) {
				longest=word;
				
			}
		}

        System.out.println("longest word: " + longest);
	}

}
