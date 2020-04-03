package com.qa.testdrivendevelopment;

public class Questions {
	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string and a char, returns the position in the String where the char
	 * first appears. Ensure the positions are numbered correctly, please refer to
	 * the examples for guidance. <br>
	 * Do not ignore case <br>
	 * Ignore whitespace <br>
	 * If the char does not occur, return the number -1. <br>
	 * <br>
	 * For Example: <br>
	 * returnPosition("This is a Sentence",'s') → 4 <br>
	 * returnPosition("This is a Sentence",'S') → 8 <br>
	 * returnPosition("Fridge for sale",'z') → -1
	 */
	public int returnPosition(String input, char letter) {
		String noWhiteSpaces = input.replaceAll("\\s", "");
		if (input.contains("" + letter)) {
			int position = noWhiteSpaces.indexOf(letter) + 1;
			return position;
		} else {
			return -1;
		}

	}

	/**
	 * Given two Strings of equal length, 'merge' them into one String. Do this by
	 * 'zipping' the Strings together. <br>
	 * Start with the first char of the first String. <br>
	 * Then add the first char from the second String. <br>
	 * Then add the second char from the first String. <br>
	 * And so on. <br>
	 * Maintain case. <br>
	 * You will not encounter whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * zipped("String","Fridge") → "SFtrriidngge" <br>
	 * zipped("Dog","Cat") → "DCoagt"<br>
	 * zipped("True","Tree") → "TTrrueee" <br>
	 * zipped("return","letter") → "rleettutrenr" <br>
	 */
	public String zipped(String input1, String input2) {
		if (input1.length() == input2.length()) {
			String zipup = "";
			int counter = 0;
			while (counter < input1.length()) {
				String char1 = input1.substring(counter, counter + 1);
				String char2 = input2.substring(counter, counter + 1);
				String chars = char1 + char2;
				zipup = zipup + chars;
				counter++;
			}
			return zipup;
		} else {
			return "The inputs are not of equal length";
		}
// I spent ages with the while loop having the > the wrong way!!!
	}

	/**
	 * Given an Array of Strings, remove any duplicate Strings that occur, then
	 * return the Array. <br>
	 * Do not ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * removeDuplicates({"Dog"}) → {"Dog"} <br>
	 * removeDuplicates({"Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","Dog","Cat"}) → {"Dog","Cat"} <br>
	 * removeDuplicates({"Dog","DoG","Cat"}) → {"Dog","DoG","Cat"}
	 */
	public String[] removeDuplicates(String[] stringArray) {
		// for an empty or single input array
		if (stringArray.length == 1 || stringArray.length == 0) {
			return stringArray;
		} else {
//			int counter = 0;
//			while (stringArray.length >= counter) {
//				int duplicate = stringArray[counter].compareTo(stringArray[counter + 1]);
//				counter++;
//				if (duplicate == 0) {
//					String [] noDups = stringArray;
//				}
//			}
			return null;
		}
	}

	/**
	 * Given a large string that represents a csv (comma separated values), the
	 * structure of each record will be as follows:
	 * owner,nameOfFile,encrypted?,fileSize <br>
	 * <br>
	 * Example:
	 * "Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445"
	 * <br>
	 * <br>
	 * Where a comma separates out the fields, and the \n represents a new line.
	 * <br>
	 * For each record, if it is not encrypted, return the names of the owners of
	 * the files in a String Array. <br>
	 * Do not include duplicate names. <br>
	 * <br>
	 * For Example: <br>
	 * csvScan("Jeff,private.key,False,1445") → {"Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,True,1318\nJeff,private.key,False,1445")
	 * → {"Jeff"} <br>
	 * csvScan("Bert,private.key,False,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445")
	 * → {"Bert","Jeff"} <br>
	 * csvScan("Bert,private.key,True,1447\nBert,public.key,False,1318\nJeff,private.key,False,1445")
	 * → {"Bert","Jeff"}
	 */
	public String[] csvScan(String csvInput) {
		String[] initialArray = csvInput.split(",");
		// 0 *name,1 file,2 *encrypted?, 3 number+\n*name, file, encrypted*, number
		// problematic to use split ^
		if (initialArray[2] == "False") {
			String[] newArray = { initialArray[0] };
			return newArray;
		} else {
			return null;
		}
	}

	/**
	 * Write a function to randomly generate a list with 5 even numbers between 100
	 * and 200 inclusive. <br>
	 * <br>
	 * For Example: <br>
	 * listGen() → {100,102,122,198,200} <br>
	 * listGen() → {108,104,106,188,200} <br>
	 * listGen() → {154,102,132,178,164}
	 */
	public int[] listGen() {
		int ran1 = (int) (100 + (Math.random() * 100));
		if (ran1 % 2 == 0) {
		} else {
			ran1++;
		}
		int ran2 = (int) (100 + (Math.random() * 100));
		if (ran2 % 2 == 0) {
		} else {
			ran2++;
		}
		int ran3 = (int) (100 + (Math.random() * 100));
		if (ran3 % 2 == 0) {
		} else {
			ran3++;
		}
		int ran4 = (int) (100 + (Math.random() * 100));
		if (ran4 % 2 == 0) {
		} else {
			ran4++;
		}
		int ran5 = (int) (100 + (Math.random() * 100));
		if (ran5 % 2 == 0) {
		} else {
			ran5++;
		}
		return new int[] { ran1, ran2, ran3, ran4, ran5 };
	}

	/**
	 * A prime number is one which is only divisible by one and itself. <br>
	 * Write a function which returns the boolean True if a number is prime, and the
	 * boolean False if not. <br>
	 * <br>
	 * For Example: <br>
	 * isPrime(3) → True <br>
	 * isPrime(8) → False
	 */
	public boolean isPrime(int num) {
		// will fail after 25 w/o num%5
		if (num == 2 || num == 3) {
			return true;
		} else if (num % 2 == 0) {
			return false; // filtered out evens
		} else {
			if (num % 3 == 0) { // filters out multiples of 3
				return false;
			} else {
				// a loop would avoid nesting if statements for however big
				if (num % 5 == 0) {
					return false;
				}
				return true;
			}
		}
	}

	/**
	 * Wrtie a function which returns the number of vowels in a given string. <br>
	 * You should ignore case. <br>
	 * <br>
	 * For Example: <br>
	 * getVowel("Hello") → 2 <br>
	 * getVowel("hEelLoooO") → 6
	 */
	public int getVowel(String input) {
		String lc = input.toLowerCase();
		int vcounter = 0;
		int charCounter = 0;

		while (charCounter < input.length()) {

			String aChar = lc.substring(charCounter, charCounter + 1);
			if (aChar.contains("a")) {
				vcounter++;
			}
			if (aChar.contains("e")) {
				vcounter++;
			}
			if (aChar.contains("i")) {
				vcounter++;
			}
			if (aChar.contains("o")) {
				vcounter++;
			}
			if (aChar.contains("u")) {
				vcounter++;
			}
			charCounter++;
		}
		return vcounter;
	}

// I keep trying to use for loops instead of while...
//for (int i = 0; i > input.length(); i++) {
	/**
	 * Given two string inputs, if one can be made from the other return the boolean
	 * True, if not return the boolean False. <br>
	 * <br>
	 * For Example: <br>
	 * wordFinder("dog", "god") → True <br>
	 * wordFinder("tiredest", "tree") → True <br>
	 * wordFinder("dog", "cat") → False <br>
	 * wordFinder("tripping", "gin") → True
	 */
	public boolean wordFinder(String initialWord, String madeString) {
//		char[] charSet = initialWord.toCharArray();
//		char[] makesWord = madeString.toCharArray();

		return false;
	}

	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which
	 * is used to determine which order "ei" or "ie" should be in a word. <br>
	 * <br>
	 * Write a function which returns the boolean True if a string follows the
	 * mnemonic, and returns the boolean False if not. <br>
	 * <br>
	 * For Example: <br>
	 * iBeforeE("ceiling") → True <br>
	 * iBeforeE("believe") → True <br>
	 * iBeforeE("glacier") → False <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		if (input.contains("cie")) {
			return false;
		} else if (input.contains("cei")) {
			return true;
		} else if (input.contains("ie")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * A factorial is the product of itself and all previous numbers <br>
	 * eg 3 factorial is 1 x 2 x 3 = 6 <br>
	 * <br>
	 * Write a function which can compute the factorial of a given number between 1
	 * and 10 inclusive. <br>
	 * <br>
	 * For Example: <br>
	 * factorial(1) → 1 <br>
	 * factorial(4) → 24 <br>
	 * factorial(8) → 40320
	 */
	public int factorial(int number) {
		if (10 >= number) { // if input is less than or equal to 10...
			if (number == 1) {
				return 1;
			} else {
				int factor = 1;
				int count = 1;
				while (count < number) {
					factor = factor * (count + 1);
					count++;
				}
				return factor;
			}
		} else {
			return -1;
		}
	}
}
