package com.rays.streamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* Stream data store nahi karta. Stream ek data structure nahi hai
 * ye sirf ek pipeline hai jo kisi source, jaise List ya Array, se data lekar process karta hai.
   Stream sirf ek baar traverse ho sakta hai — ek terminal operation, jaise collect() ya forEach()
   chalne ke baad Stream consumed ho jata hai. Dobara use karne ki koshish karo to IllegalStateException aati hai.
   Actual data hamesha original source, jaise List, mein hi store rehta hai
   Stream sirf usko access aur transform karne ka tarika deta hai."
  */

public class StreamDoesNotStoreData {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Ajay", "Anand");
		Stream<String> stream = names.stream();

		stream.forEach(System.out::println); // pehli baar theek chalega
		stream.forEach(System.out::println); // IllegalStateException — stream already consumed
	}

 } 