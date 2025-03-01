package baseConcepts;

import java.util.*;
import java.util.regex.Pattern;

public class AlphaOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitives
		int integer = 16;
		int secondInteger = 3;
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
		//Array
		int[] integerArray = {1, 2, 3, 4, 5, 6, 7};
		String[] stringArray = {"This", "is", "a", "String", "Array."};
		//Implicit variable declaration can only be done inside a Method(main here)
		var varString = "varString";
		var varInteger = new int[]{1, 2, 3, 4, 5};
		//List
		//Tuple
		//Set
		Set<String> hashSet = new HashSet<>();
		//Use TreeSet for a Sorted Set
		Set<String> sortedSet = new TreeSet<>();
		//Dictionary
		
		//Integer Operations
		//Convert String to Integer
		String stringNumber = "12345";
		int intStringNumber = Integer.parseInt(stringNumber);
		//Get difference between two numbers
		int differenceInteger = Math.abs(character - secondInteger);
		
		//String Operations
		String stringValue = "lower case text";
		//Get length of String
		int lengthString = message.length();
		//Convert to Upper Case
		String upperCase = stringValue.toUpperCase();
		//Reverse String
		String reverseString = new StringBuilder().append(stringValue).reverse().toString();
		//Replace part of String
		String replacedMessage = message.replace("One", "Prime");
		//Get first N characters of a String
		String firstOfString = stringValue.substring(0,1);
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
		//String can be broken down into Characters
		String stringCharacters = "thisisacharacterstring";
		//Generate String of unique characters
		StringBuilder charactersFromStringDistinct = stringCharacters.chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
		//Generate String of sorted characters
		StringBuilder charactersFromStringSorted = stringCharacters.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
		
		//Array Operations
		//Get length of Array
		int lengthArray = stringArray.length;
		//Create new placeholder Array of fixed length
		int[] fixedArray = new int[5];
		fixedArray[2] = 10;
		//Create Two Dimensional Array
		int[][] twoDimArray = {{1, 2}, {3, 4}, {5, 6}};
		//Generate Array from String
		String stringToArray = "This is an Array from a String.";
		String[] arrayFromString = stringToArray.split(" ");
		//Generate String from Array with delimiter
		String joinedArray = String.join(" ", stringArray);
		//In JAVA use .clone() to create a new variable, otherwise the original will be affected
		String[] reverseArray = stringArray.clone();
		Collections.reverse(Arrays.asList(reverseArray));
		//Count occurrences in Array
		//Split String into Integer Array, split to String Array(with REGEX), then convert into Integer Array
		String stringInt = "549713";
		String[] stringIntToArray = stringInt.split("(?<=.)");
		int[] stringToIntArray = Arrays.stream(stringIntToArray).mapToInt(Integer::parseInt).toArray();
		//Get Minimum and Maximum values from an Array
		int minArray = Arrays.stream(integerArray).min().getAsInt();
		int maxArray = Arrays.stream(integerArray).max().getAsInt();
		//Sort an Array, cloning original so it isn't affected
		int[] unsortedArray = {9,5,2,7,1,8,3,4};
		int[] sortedArray = unsortedArray.clone();
		Arrays.sort(sortedArray);
		//Sum of Array
		int sumArray = Arrays.stream(integerArray).sum();
		//Average of Array can return a Double, so use var or OptionalDouble as type
		var averageArray = Arrays.stream(integerArray).average();
		//Multiply all elements of Array
		int multiplyArray = Arrays.stream(integerArray).reduce(1, Math::multiplyExact);
		
		
		//Set Operations
		//Sets don't allow for duplicate items, can be used to get number of unique occurrences
		String stringForSet = "aretheyhereyestheyarehere";
		String[] stringForSetArray = stringForSet.split("(?<=.)");
		//Add one by one from Array
		for(String s: stringForSetArray) {
	    	hashSet.add(s);
	    }
		//Add all from Array at once
		Collections.<String>addAll(sortedSet, stringForSetArray);
		
		//Conditionals
		//If Else Statement
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
		//Switch
		String switchString = "Green Light";
		String waitForSwitch = "";
		switch (switchString) {
		case "Yellow Light":
			waitForSwitch = "Wait for Red Light";
			break;
		case "Red Light":
			waitForSwitch = "Wait for Green Light";
			break;
		default:
			waitForSwitch = "Wait for Yellow Light";
		}
		//In JAVA, when comparing two Strings use .equals() and not == or it will check if it's the same object in memory
		String verifyString1 = "checkthis";
		String verifyString2 = "checkthis";
		boolean verifiedString = false;
		if (verifyString1.equals(verifyString2)) {
			verifiedString = true;
		}
		
		//For Loops
		//For index in Array
		int forLoopCount = 0;
		for (int i = 0; i < integerArray.length; i++)
		{
		    forLoopCount += integerArray[i];
		}
		//For item in Array
		String forEachString = "";
		for (String s: stringArray)
		{
		    forEachString += s;
		}
	    //Count number of matching characters in a String
	    String matchingString = "We will count the number of vowels";
	    int countMatchingString = 0;
	    String[] matchingStringArray = matchingString.split("(?<=.)");
	    for (int i = 0; i < matchingStringArray.length; i++){
	    	//Using .matches() with expression to count all vowels
	    	if (matchingStringArray[i].matches(".*(a|e|i|o|u).*")){
	    		countMatchingString += 1;
	    		}
	    	}
	    
		//While Loops
		//Calculate number of divisors in a number, example: 30 has 1, 2, 3, 5, 6, 10, 15 and 30
	    int intDivisors = 30;
		int numberOfDivisors = 1;
	    int whileIterator = 1;
	    while(whileIterator < intDivisors){
	    	//Check if number can be divided by iterator
	    	if(intDivisors % whileIterator == 0){
		        numberOfDivisors += 1;
		      }
		      whileIterator += 1;
		    }
		
		//OOP
		//Public method requires Instance of Class
		AlphaTwo _alphaTwo = new AlphaTwo();
		int alphaTwoIntSum = _alphaTwo.SumIntArray(integerArray);
		//Static method does not require Instance of Class
		int alphaTwoIntAverage = AlphaTwo.AverageIntArray(integerArray);
		//Create instance of Inner Class, must be static
		AlphaTwo.InnerAlphaTwo _innerAlphaTwo = new AlphaTwo.InnerAlphaTwo();
		int innerAlphaTwoIntMin = _innerAlphaTwo.MinIntArray(integerArray);
		_innerAlphaTwo.InnerAlphaTwoSet();
		//Create instance of Subclass(shorthand)
		AlphaTwoSub _alphaTwoSub = new AlphaTwoSub();
		//Subclass inherits method from Superclass
		int alphaTwoSubIntSum = _alphaTwoSub.SumIntArray(_alphaTwoSub.alphaTwoIntArray);
		
		//Integers
		System.out.println(String.format("Integers"));
		System.out.println(String.format("Converting String '%s' to Integer: %d", stringNumber, intStringNumber));
		
		//Strings
		//No F String method exists for JAVA, instead the closest thing is String format, %s for String, %d for Integer
		System.out.println(String.format("%nStrings"));
		System.out.println(String.format("String length for '%s' is %d", stringValue, lengthString));
		System.out.println(String.format("Reversed String is '%s'", reverseString));
		System.out.println("First character from '" + stringValue + "' is '" + firstOfString + "'");
		System.out.println("Last 3 characters from '" + stringValue + "' are '" + lastOfString + "'");
		System.out.println("Removing first and last characters from '" + stringValue + "' results in '" + removeFirstLast + "'");
		System.out.println("'" + stringAlphabet + "' contains only alphabet characters: " + checkAlphabet);
		System.out.println(String.format("%s starts with Alpha: %b and ends with Initialized: %b", replacedMessage, startsWith, endsWith));
		System.out.println("'" + upperString + "' is all Upper Case: " + isUpper);
		System.out.println("'" + lowerString + "' is all Lower Case: " + isLower);
		System.out.println(String.format("Breaking down String '%s' and returning all distinct values results in '%s'", stringCharacters, charactersFromStringDistinct));
		System.out.println(String.format("Breaking down String '%s' and returning sorted values results in '%s'", stringCharacters, charactersFromStringSorted));
		
		//Arrays
		System.out.println(String.format("%nArrays"));
		System.out.println(String.format("Split String '%s' into Array '%s'", stringToArray, Arrays.toString(arrayFromString)));
		System.out.println("Joined Array is '" + joinedArray + "'");
		System.out.println("Reversed Array is '" + String.join(" ", reverseArray) + "'");
		System.out.println("Split '" + stringInt + "' to Int Array '" + Arrays.toString(stringToIntArray) + "'");
		System.out.println(String.format("Minimum value of Array '%s' is %d, Maximum value is %d", Arrays.toString(integerArray), minArray, maxArray));
		System.out.println(String.format("Unsorted Array is '%s', sorted Array is '%s'", Arrays.toString(unsortedArray), Arrays.toString(sortedArray)));
		
		//Sets
		System.out.println(String.format("%nSets"));
		System.out.println(String.format("Unique letters in String '%s' are '%s'", stringForSet, String.join("", hashSet)));
		System.out.println(String.format("Unique and sorted letters in String '%s' are '%s'", stringForSet, String.join("", sortedSet)));
		
		//Conditionals
		System.out.println(String.format("%nConditionals"));
		System.out.println(String.format("Verified if String '%s' is the same as '%s': %b", verifyString1, verifyString2, verifiedString));
		
		//For Loops
		System.out.println(String.format("%nFor Loops"));
		System.out.println(String.format("Using Index For Loop to count Array '%s' returns %d", Arrays.toString(integerArray), forLoopCount));
		System.out.println(String.format("Using Foreach Loop on every element in Array '%s' returns the following String '%s'", String.join(" ", stringArray), forEachString));
		System.out.println(String.format("The number of vowels in '%s' is %d", matchingString, countMatchingString));
		
		//While Loops
		System.out.println(String.format("%nWhile Loops"));
		System.out.println(String.format("The number %d has %d divisors", intDivisors, numberOfDivisors));
		
		//OOP
		System.out.println(String.format("%nOOP"));
		System.out.println(String.format("After creating instance of Class AlphaTwo, using its method SumIntArray to calculate sum of '%s' is %d", Arrays.toString(integerArray), alphaTwoIntSum));
		System.out.println(String.format("Static method of Class AlphaTwo AverageIntArray used to calculate average of '%s' is %d", Arrays.toString(integerArray), alphaTwoIntAverage));
		_alphaTwo.VoidAlphaTwo();
		System.out.println(String.format("Method overloading from Class AlphaTwo of ReverseString Method using second parameter returns '%s'", _alphaTwo.ReverseString(_alphaTwo.outerAlphaTwoString, _alphaTwo.overLoadString)));
		System.out.println(String.format("Method of Inner Class InnerAlphaTwo MinIntArray used to retrieve minimum value of '%s' is %d", Arrays.toString(integerArray), innerAlphaTwoIntMin));
		_innerAlphaTwo.InnerAlphaTwoGet();
		System.out.println(String.format("Array Field from AlphaTwo is '%s', from AlphaTwoSub is '%s'", Arrays.toString(_alphaTwo.alphaTwoIntArray), Arrays.toString(_alphaTwoSub.alphaTwoIntArray)));
		System.out.println(String.format("AlphaTwoSub is a Subclass and has inherited SumIntArray from AlphaTwo to sum '%s' resulting in %d", Arrays.toString(_alphaTwo.alphaTwoIntArray), alphaTwoSubIntSum));
		System.out.println(String.format("AlphaTwoSub's String has been reversed using Base Class' Method: '%s'", _alphaTwoSub.alphaTwoSubString));
	}

}
