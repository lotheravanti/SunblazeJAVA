package baseConcepts;

import java.util.*;
import java.util.regex.Pattern;

public class AlphaOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitives
		int integer = 10;
		double decimal = 12.45;
		float realNumber = 3.1417639f;
		long largeNumber = 100000000000L;
		//Max value for byte is 100
		byte binaryValue = 100;
		boolean booleanValue = true;
		//Single quotes for Character
		char character = 'a';
		
		//Non Primitives
		//Double quotes for String
		String message = "Alpha One Initialized";
		//Arrays
		int[] integerArray = {1, 2, 3, 4, 5, 6, 7};
		String[] stringArray = {"This", "is", "an", "Array", "from", "a", "String."};
		//Implicit variable declaration can only be done inside a Method(main here)
		var varString = "varString";
		var varInteger = new int[]{1, 2, 3, 4, 5};
		
		//Integer Operations
		//Split String into Integer Array, split to String Array(with REGEX), then convert into Integer Array
		String stringInt = "549713";
		String[] stringToArray = stringInt.split("(?<=.)");
		int[] stringToIntArray = Arrays.stream(stringToArray).mapToInt(Integer::parseInt).toArray();
		
		//String Operations
		String stringValue = "lower case text";
		//Get length of String
		int lengthString = message.length();
		//Convert to Upper Case
		String upperCase = stringValue.toUpperCase();
		//Reverse String
		StringBuilder reverseString = new StringBuilder().append(stringValue).reverse();
		//Replace part of String
		String replacedMessage = message.replace("One", "Prime");
		//Get last N characters of a String
		String lastOfString = stringValue.substring(stringValue.length() - 3);
		//Remove First and Last characters of String
		String removeFirstLast = stringValue.substring(1, stringValue.length() - 1);
		//Check if String is Alphabet
		String stringAlphabet = "OnLyAlPhAbEt"; 
		boolean checkAlphabet = Pattern.matches("[a-zA-Z]+",stringAlphabet);
		//Verify if String starts or ends with
		boolean startsWith = message.startsWith("Alpha");
		boolean endsWith = message.endsWith("Initialized");
		//Check if String is Upper Case or Lower Case
		String upperString = "ALLCAPS";
		boolean isUpper = upperString.equals(upperString.toUpperCase());
		String lowerString = "alllower";
		boolean isLower = lowerString.equals(lowerString.toLowerCase());
		
		//Array Operations
		//Get length of Array
		int lengthArray = stringArray.length;
		//Create new placeholder Array of fixed length
		int[] fixedArray = new int[5];
		fixedArray[2] = 10;
		//Create Two Dimensional Array
		int[][] twoDimArray = {{1, 2}, {3, 4}, {5, 6}};
		//Generate String from Array with delimiter
		String joinedArray = String.join(" ", stringArray);
		//Reverse Array method in JAVA permanently reverses Array, so can't use original
		String[] reverseArray = stringArray;
		Collections.reverse(Arrays.asList(reverseArray));
		
		//If statement
		boolean condition = false;
		if (integerArray[0] == 1){
		      condition = true;
		    }
		else {
			condition = false;
		}
		//If statement with AND
		if (integerArray[0] == 1 && integerArray[1] == 2){
		      condition = true;
		    }
		//If statement with OR
		if (integerArray[0] == 1 || integerArray[1] == 2){
		      condition = true;
		    }
		
		//Integers
		System.out.println("Split '" + stringInt + "' to Int Array '" + Arrays.toString(stringToIntArray) + "'");
		
		//Strings
		//No F String method exists for JAVA
		System.out.println("String length for '" + stringValue + "' is " + lengthString);
		System.out.println("Reversed String is '" + reverseString + "'");
		System.out.println("Stripping last 3 characters from '" + stringValue + "' results in '" + lastOfString + "'");
		System.out.println("Removing first and last characters from '" + stringValue + "' results in '" + removeFirstLast + "'");
		System.out.println("'" + stringAlphabet + "' contains only alphabet characters: " + checkAlphabet);
		System.out.println(replacedMessage + " starts with Alpha: " + startsWith + " and ends with Initialized: " + endsWith);
		System.out.println("'" + upperString + "' is all Upper Case: " + isUpper);
		System.out.println("'" + lowerString + "' is all Lower Case: " + isLower);
		
		//Arrays
		System.out.println("Joined Array is '" + joinedArray + "'");
		System.out.println("Reversed Array is '" + String.join(" ", reverseArray) + "'");
	}

}
