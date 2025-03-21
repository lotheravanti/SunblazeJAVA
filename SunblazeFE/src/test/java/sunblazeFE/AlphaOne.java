package sunblazeFE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AlphaOne {

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
	//List
	List<Integer> integerList = new ArrayList<Integer>();
	//Tuple
	//Set
	Set<String> hashSet = new HashSet<>();
	//Use TreeSet for a Sorted Set
	Set<String> sortedSet = new TreeSet<>();
	//HashMap, also known as Dictionary in Python, is unordered and values have to be added manually
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	//LinkedHashMap will always be ordered by order of entries added
	LinkedHashMap<String, String> linkHashMap = new LinkedHashMap<String, String>();
	
	@BeforeEach                                         
    void setUp() {
		//Implicit variable declaration can only be done inside a Method
		var varString = "varString";
		var varInteger = new int[]{1, 2, 3, 4, 5};
    }
	
	@Test                                               
    @DisplayName("Integer Operations")   
    void Integers() {
		//Convert String to Integer
		String stringNumber = "12345";
		int intStringNumber = Integer.parseInt(stringNumber);
		//Always return positive number
		int negativeInteger = -4;
		int negativeToPositiveInteger = Math.abs(negativeInteger);
		//Round down
		double roundDownInt = Math.floor(realNumber);
		//Round up
		double roundUpInt = Math.ceil(realNumber);
		//Dividing two Integers will always return a whole number, cast to double for decimal values
		int forDivisionInt = 10;
		int divisorInt = 3;
		int divisionResultInt = forDivisionInt / divisorInt;
		double divisionResultDouble = (double) forDivisionInt / divisorInt;
		//Get number at the power of N
		int numberForPower = 7;
		int powerN = 2;
		int numberAtPowerN = (int)Math.pow(numberForPower, powerN);
		//Check if number is a perfect square
		double squareRootInt = Math.sqrt(integer);
		//Get difference between two numbers
		int firstNumber = 40;
		int secondNumber = 13;
		int differenceBetween = Math.abs(secondNumber - firstNumber);
		//Get current quarter of the year
		int currentMonth = 5;
		int currentQuarter = (int) Math.ceil(currentMonth / 3.0);
		
		System.out.println(String.format("%nIntegers"));
		System.out.println(String.format("Converting String '%s' to Integer: %d", stringNumber, intStringNumber));
		System.out.println(String.format("%d can be divided by %d a total of %d times", forDivisionInt, divisorInt, divisionResultInt));
		System.out.println(String.format("%d divided by %d is %g", forDivisionInt, divisorInt, divisionResultDouble));
		System.out.println(String.format("Current Month %d is in Quarter: %d", currentMonth, currentQuarter));
    }
	
	@Test                                               
    @DisplayName("Character Operations")   
    void Characters() {
		//Switch Upper Case and Lower Case using For Each loop
		String reverseUpperLower = "uPpEr cAsE lOwEr cAsE";
		String reversedUpperLower = "";
        for (char c : reverseUpperLower.toCharArray()) {
            if(Character.isUpperCase(c)) {
                reversedUpperLower += Character.toLowerCase(c);
            } else {
            	reversedUpperLower += Character.toUpperCase(c);
            }
        }
		
        System.out.println(String.format("%nCharacters"));
		System.out.println(String.format("Switching Upper and Lower case from '%s' is '%s'", reverseUpperLower, reversedUpperLower));
	}
	
	@Test                                               
    @DisplayName("String Operations")   
    void Strings() {
		String stringValue = "lower case text";
		//Get length of String
		int lengthString = message.length();
		//Convert to Upper Case
		String upperCase = stringValue.toUpperCase();
		//Reverse String
		String reverseString = new StringBuilder().append(stringValue).reverse().toString();
		//Replace part of String
		String replacedMessage = message.replace("One", "Prime");
		//Replace multiple characters at once using REGEX
		String replaceMultiple = "This will be A String wIthoUt all vOwels";
		String replacedMultiple = replaceMultiple.replaceAll("[aeiouAEIOU]", "");
		//Get first N characters of a String
		String firstOfString = stringValue.substring(0,1);
		//Get last N characters of a String
		String lastOfString = stringValue.substring(stringValue.length() - 3);
		//Remove First and Last characters of String
		String removeFirstLast = stringValue.substring(1, stringValue.length() - 1);
		//Remove part of String that comes after unique delimiter
        String toRemoveAnchorString = "www.codewars.com#about";
        String removedAnchorString = toRemoveAnchorString.split("#")[0];
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
		
		//No F String method exists for JAVA, instead the closest thing is String format, %s for String, %d for Integer
		System.out.println(String.format("%nStrings"));
		System.out.println(String.format("String length for '%s' is %d", stringValue, lengthString));
		System.out.println(String.format("Reversed String is '%s'", reverseString));
		System.out.println(String.format("Removing all vowels from String '%s' results in: '%s'", replaceMultiple, replacedMultiple));
		System.out.println(String.format("First character from '%s' is '%s'", stringValue, firstOfString));
		System.out.println(String.format("Last 3 characters from '%s' are '%s'", stringValue, lastOfString));
		System.out.println(String.format("Removing first and last characters from '%s' results in '%s'", stringValue, removeFirstLast));
		System.out.println(String.format("Remove from '%s' everything that comes after #: '%s'", toRemoveAnchorString, removedAnchorString));
		System.out.println(String.format("'%s' contains only alphabet characters: %s", stringAlphabet, checkAlphabet));
		System.out.println(String.format("%s starts with Alpha: %b and ends with Initialized: %b", replacedMessage, startsWith, endsWith));
		System.out.println(String.format("'%s' is all Upper Case: %b", upperString, isUpper));
		System.out.println(String.format("'%s' is all Lower Case: %b", lowerString, isLower));
		System.out.println(String.format("Breaking down String '%s' and returning all distinct values results in '%s'", stringCharacters, charactersFromStringDistinct));
		System.out.println(String.format("Breaking down String '%s' and returning sorted values results in '%s'", stringCharacters, charactersFromStringSorted));	
	}
	
	@Test                                               
    @DisplayName("Array Operations")   
    void Arrays() {
		//Get length of Array
		int lengthArray = stringArray.length;
		//Create new placeholder Array of fixed length
		int[] fixedArray = new int[5];
		fixedArray[2] = 10;
		//Create Two Dimensional Array
		int[][] twoDimArray = {{1, 2}, {3, 4}, {5, 6}};
		//Append to Array => List
		//Generate Array from String
		String stringToArray = "This is an Array from a String.";
		String[] arrayFromString = stringToArray.split(" ");
		//Generate String from Array with delimiter
		String joinedStringArray = String.join(" ", stringArray);
		//In JAVA use .clone() to create a new variable, otherwise the original will be affected
		String[] reverseArray = stringArray.clone();
		Collections.reverse(Arrays.asList(reverseArray));
		//Count occurrences in Array
		String[] occurrencesArray = {"a", "a", "b", "c", "d", "d", "e", "e", "f", "x", "x", "y", "y", "z"};
		String[] occurrencesInArray = {"x", "y", "z"};
		int occurrencesInArrayCount = 0;
		for (String st: occurrencesArray)
		{
		    if (Arrays.stream(occurrencesInArray).anyMatch(st::equals))
		    {
		        occurrencesInArrayCount += 1;
		    }
		}
		System.out.println(occurrencesInArrayCount);
		//Split Integer into Integer Array
		int intForArray = 1234567;
	    int[] intToArray = Integer.toString(intForArray).chars().map(c -> c-'0').toArray();
		//Split String into Integer Array, split to String Array(with REGEX), then convert into Integer Array
		String stringInt = "549713";
		String[] stringIntToArray = stringInt.split("(?<=.)");
		int[] stringToIntArray = Arrays.stream(stringIntToArray).mapToInt(Integer::parseInt).toArray();
		//Get Minimum and Maximum values from an Array
		int minArray = Arrays.stream(integerArray).min().getAsInt();
		int maxArray = Arrays.stream(integerArray).max().getAsInt();
		//Sum of Array
		int sumArray = Arrays.stream(integerArray).sum();
		//Average of Array can return a Double, so use var or OptionalDouble as type
		double averageArray = sumArray / integerArray.length;
		//Multiply all elements of Array
		int productArray1 = 1;
		for (int num: integerArray)
		{
		    productArray1 *= num;
		}
		int productArray2 = Arrays.stream(integerArray).reduce(1, Math::multiplyExact);
		//Sort an Array, cloning original so it isn't affected
		int[] unsortedArray = {9,5,2,7,1,8,3,4};
		int[] sortedArray = unsortedArray.clone();
		Arrays.sort(sortedArray);
		//Iterate over object Array using var
		Object[] objArray = {1, 2, "3", "4"};
		var objArraySum = 0;
		for (var value: objArray)
		{
		    objArraySum += Integer.parseInt(value.toString());
		}
		//Convert from Binary to base 10
		int[] binaryArray = {0, 1, 0, 1};
		int intConvertedFromBinary1 = 0;
		String binaryNumberString = "";
		for (int i = 0; i < binaryArray.length; i++)
		{
		    intConvertedFromBinary1 += binaryArray[i] * (int)Math.pow(2, binaryArray.length - i - 1);
		    binaryNumberString += binaryArray[i];
		}
		int intConvertedFromBinary2 = Integer.parseInt(binaryNumberString, 2); //Alternate method
		
		System.out.println(String.format("%nArrays"));
		System.out.println(String.format("Split String '%s' into Array '%s'", stringToArray, Arrays.toString(arrayFromString)));
		System.out.println(String.format("String from joined Array is '%s'", joinedStringArray));
		System.out.println(String.format("For '%s', Reversed Array is '%s'", String.join(", ", stringArray), String.join(", ", reverseArray)));
		System.out.println(String.format("The characters '%s' appear in '%s' a total of %d times", String.join(", ", occurrencesInArray), String.join(", ", occurrencesArray), occurrencesInArrayCount));
		System.out.println(String.format("Split %d to Int Array '%s'", intForArray, Arrays.toString(intToArray)));
		System.out.println(String.format("Split '%s' to Int Array '%s'", stringInt, Arrays.toString(stringToIntArray)));
		System.out.println(String.format("Minimum value of Integer Array '%s' is %d, Maximum value is %d", Arrays.toString(integerArray), minArray, maxArray));
		System.out.println(String.format("For Integer Array '%s' Sum is %d, Average is %f and Product is %d", Arrays.toString(integerArray), sumArray, averageArray, productArray1));
		System.out.println(String.format("Unsorted Array is '%s', sorted Array is '%s'", Arrays.toString(unsortedArray), Arrays.toString(sortedArray)));
		System.out.println(String.format("Sum of Object Array '%s' is %d", Arrays.toString(objArray), objArraySum));
		System.out.println(String.format("Converting binary number %s to base 10 number is %d", binaryNumberString, intConvertedFromBinary1));
	}
	
	@Test                                               
    @DisplayName("Set Operations")   
    void Sets() {
		//Sets don't allow for duplicate items, can be used to get number of unique occurrences
		String stringForSet = "aretheyhereyestheyarehere";
		String[] stringForSetArray = stringForSet.split("(?<=.)");
		//Add one by one from Array
		for(String s: stringForSetArray) {
	    	hashSet.add(s);
	    }
		//Add all from Array at once
		Collections.<String>addAll(sortedSet, stringForSetArray);
		//TreeSets are ideal for representing pangrams(sentences with every letter in alphabet)
		String pangram = "The quick brown fox jumps over the lazy dog.";
	    String[] arrPangram = pangram.split("(?<=.)");
	    Set<String> sortedPangram = new TreeSet<>();
	    for (var s : arrPangram) {
	    	// Requires java.util.regex.Pattern;
	    	if (Pattern.matches("[a-zA-Z]+", s)) {
	    		sortedPangram.add(s.toLowerCase());
	    		}
	    	}
		
		System.out.println(String.format("%nSets"));
		System.out.println(String.format("Unique letters in String '%s' are '%s'", stringForSet, String.join("", hashSet)));
		System.out.println(String.format("Unique and sorted letters in String '%s' are '%s'", stringForSet, String.join("", sortedSet)));
		System.out.println(String.format("'%s' is a pangram and contains every letter of the alphabet: %s", pangram, sortedPangram));
	}
	
	@Test                                               
    @DisplayName("Enumerable Operations")   
    void Enumerables() {
		System.out.println(String.format("%nEnumerable"));
	}
	
	@Test                                               
    @DisplayName("Conditional Operations")   
    void Conditionals() {
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
		
		System.out.println(String.format("%nConditionals"));
		System.out.println(String.format("Verified if String '%s' is the same as '%s': %b", verifyString1, verifyString2, verifiedString));
	}
	
	@Test                                               
    @DisplayName("For Loops")   
    void ForLoops() {
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
		//Reverse For Loop
		int[] reverseLoopArray = new int[integerArray.length];
		for (int i = integerArray.length - 1; i >= 0; i--) {
		    reverseLoopArray[integerArray.length - i - 1] = integerArray[i];
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
		
		System.out.println(String.format("%nFor Loops"));
		System.out.println(String.format("Using Index For Loop to count Array '%s' returns %d", Arrays.toString(integerArray), forLoopCount));
		System.out.println(String.format("Using Foreach Loop on every element in Array '%s' returns the following String '%s'", String.join(" ", stringArray), forEachString));
		System.out.println(String.format("Using Reverse For Loop to created Reversed Array: '%s'", Arrays.toString(reverseLoopArray)));
		System.out.println(String.format("The number of vowels in '%s' is %d", matchingString, countMatchingString));		
	}
	
	@Test                                               
    @DisplayName("While Loops")   
    void WhileLoops() {
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
		
		System.out.println(String.format("%nWhile Loops"));
		System.out.println(String.format("The number %d has %d divisors", intDivisors, numberOfDivisors));		
	}
	
	@Test                                               
    @DisplayName("Collections")   
    void Collections() {
		int[] arrayForCollection = {2,6,4,76,2,102,5,17,2};
	    List<Integer> collectionList = new ArrayList<Integer>();
	    //Add an item to Collection
	    collectionList.add(arrayForCollection[0]);
	    //Add all items to Collection using add
	    for(var item: arrayForCollection) {
	    	collectionList.add(item);
	    }
	    //Get Collection length(Subtract 1 from value to reference last item)
	    int collectionLength = collectionList.size();
	    //Get item in Collection by index
	    int getCollectionItem = collectionList.get(0);
	    //Remove item in List by index
	    collectionList.remove(collectionList.size() - 2);
	    //Remove item in List by value
	    collectionList.remove(Integer.valueOf(102));
	    //Count occurrences in List
	    int collectionNumber = 2;
	    int collectionOccurrencesInt = Collections.frequency(collectionList, collectionNumber);
	    //Get the sum of all items in Collection
	    //Using Iterator and While loop
	    Iterator<Integer> iterationList = collectionList.iterator();
	    int collectionWhileSum = 0;
	    while(iterationList.hasNext()) {
	    	collectionWhileSum += iterationList.next();
	    }	    
	    //Using For Loop
	    int collectionForSum = 0;
	    for(var num : collectionList) {
	    	collectionForSum += num;
	    }
	    //HashMap Collection
	    HashMap<Integer, Integer> intHashMap = new HashMap<Integer, Integer>();
	    //Add number and square of number to HashMap using put
	    for(var num : collectionList) {
	    	intHashMap.put(num, (int)Math.pow(num, 2));
	    }
	    //Get sum of all squares in HashMap 
	    //Using entrySet() both Key and Value can be referenced: getKey(), getValue()
	    int intHashMapSumSquares = 0;
	    for(var num : intHashMap.entrySet()) {
	    	intHashMapSumSquares += num.getValue();
	    }
	    //Using Lambda expression, 
	    //Variable is defined inside Lambda expression
	    intHashMap.forEach((key, value) -> {
	    	int intHashMapSumSquaresLambda = 0;
	    	intHashMapSumSquaresLambda += value;
	    });
	    
		System.out.println(String.format("%nCollections"));
		System.out.println(String.format("The number %d appears %d times in Collection %s", collectionNumber, collectionOccurrencesInt, String.join(", ", collectionList.toString())));
		System.out.println(String.format("Collection is '%s', Sum of Collection using While loop is %d, using For loop is %d", String.join(", ", collectionList.toString()), collectionWhileSum, collectionForSum));
		System.out.println(String.format("Collection is '%s', HashMap with Square values is %s", String.join(", ", collectionList.toString()), Collections.singletonList(intHashMap)));
		System.out.println(String.format("Sum of all Square values in HashMap %s is %d, using Lambda expression %d", Collections.singletonList(intHashMap), intHashMapSumSquares, intHashMapSumSquares));		
	}
	
	@Test                                               
    @DisplayName("OOP")   
    void OOP() {
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
