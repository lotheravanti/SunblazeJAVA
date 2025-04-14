package sunblazeFE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;
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
	//Create a List with values
	List<String> toConcatenateArray = List.of("one", "two", "three", "four", "five", "six", "seven", "eight");
	//Tuple
	//Set
	Set<String> stringSet = new HashSet<>();
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
		//Display number with 2 decimals
		int dollarAmount = 204;
		double conversionRate = 6.75;
		String numTwoDecimals = String.format("%.2f Chinese Yuan", dollarAmount * conversionRate);
		
		System.out.println(String.format("%nIntegers"));
		System.out.println(String.format("Converting String '%s' to Integer: %d", stringNumber, intStringNumber));
		System.out.println(String.format("%d can be divided by %d a total of %d times", forDivisionInt, divisorInt, divisionResultInt));
		System.out.println(String.format("%d divided by %d is %g", forDivisionInt, divisorInt, divisionResultDouble));
		System.out.println(String.format("Current Month %d is in Quarter: %d", currentMonth, currentQuarter));
		System.out.println(String.format("%d dollars is %s", dollarAmount, numTwoDecimals));
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
        //Convert Integer ASCII number to Character
        int[] intASCIIArray = {56, 57, 58, 59, 60, 61, 62, 63, 64, 65};
        char[] charASCIIArray =  new char[intASCIIArray.length];
        for (int i = 0; i < intASCIIArray.length; i++) {
        	charASCIIArray[i] = (char)intASCIIArray[i];
        }
		
        System.out.println(String.format("%nCharacters"));
		System.out.println(String.format("Switching Upper and Lower case from '%s' is '%s'", reverseUpperLower, reversedUpperLower));
		System.out.println(String.format("Converting ASCII number codes '%s' to characters '%s'", Arrays.toString(intASCIIArray), Arrays.toString(charASCIIArray)));
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
		//Check if String contains any characters other than and also of certain length
		String matchCharactersString = "regex_34";
		String noMatchCharactersString = "H 3";
		boolean matchCharactersBool = matchCharactersString.matches("[a-z0-9_]{4,16}");
		boolean nomatchCharactersBool = noMatchCharactersString.matches("[a-z0-9_]{4,16}");
		//Remove all non-alphabet or non-digit characters using [^'exclude']
		String stringMixed = "ultr53o?n";
		String removeDigits = new StringBuilder().append(stringMixed).toString().replaceAll("[^a-z]","");
		String removeAlphabet = new StringBuilder().append(stringMixed).toString().replaceAll("[^0-9]","");
		//Verify if String starts or ends with
		boolean startsWith = message.startsWith("Alpha");
		boolean endsWith = message.endsWith("Initialized");
		//Check if String is Upper Case or Lower Case
		String upperString = "ALLCAPS";
		boolean isUpper = upperString.equals(upperString.toUpperCase());
		String lowerString = "alllower";
		boolean isLower = lowerString.equals(lowerString.toLowerCase());
		//Concatenate range from List
		List<String> toConcatenateList = List.of("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail");
		//2 is starting index and 6 is the end of the range, exclusive(index 5 will be last value)
		List<String> toConcatenateSubList = toConcatenateList.subList(2, 6);
		String stringConcatenated = String.join("", toConcatenateSubList);
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
		System.out.println(String.format("'%s' removing all non-digit characters: %s", stringMixed, removeAlphabet));
		System.out.println(String.format("'%s' removing all non-alphabet characters: %s", stringMixed, removeDigits));
		System.out.println(String.format("'%s' contains only alphabet characters: %s", stringAlphabet, checkAlphabet));
		System.out.println(String.format("'%s' has length between 4 and 6 and only contains lowercase alphabet,_ and numbers: %b", matchCharactersString, matchCharactersBool));
		System.out.println(String.format("'%s' has length between 4 and 6 and only contains lowercase alphabet,_ and numbers: %b", noMatchCharactersString, nomatchCharactersBool));
		System.out.println(String.format("%s starts with Alpha: %b and ends with Initialized: %b", replacedMessage, startsWith, endsWith));		
		System.out.println(String.format("'%s' is all Upper Case: %b", upperString, isUpper));
		System.out.println(String.format("'%s' is all Lower Case: %b", lowerString, isLower));
		System.out.println(String.format("Creating concatenated string from '%s' starting from index 2 and concatenating 4 elements: %s", String.join(", ", toConcatenateList), stringConcatenated));
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
		//Concatenate each entry N times from existing List
		List<String> toConcatenateArray = List.of("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail");
		int intConcatenate = 3;
		List<String> arrConcatenate = new ArrayList<String>();
		for (int i = 0; i < toConcatenateArray.size() - intConcatenate + 1; i++)
		{
		    //i for starting range and i + intConcatenate for end of range
			List<String> toConcatenateSubList = toConcatenateArray.subList(i, i + intConcatenate);
			String stringConcatenated = String.join("", toConcatenateSubList);
			arrConcatenate.add(stringConcatenated);
		}
		
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
		System.out.println(String.format("Creating a new List from '%s' and concatenating %d times: '%s'", String.join(", ", toConcatenateArray), intConcatenate, String.join(", ", arrConcatenate)));
	}
	
	@Test                                               
    @DisplayName("Lists")   
    void Lists() {
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
	    //Sort a list
	    Collections.sort(collectionList);
	    //Get the sum of all items in List using Iterator and While loop
	    Iterator<Integer> iterationList = collectionList.iterator();
	    int collectionWhileSum = 0;
	    while(iterationList.hasNext()) {
	    	collectionWhileSum += iterationList.next();
	    }	    
	    //Get the sum of all items in List using For Loop
	    int collectionForSum = 0;
	    for(var num : collectionList) {
	    	collectionForSum += num;
	    }
	    //Sort List for determining if String is an anagram(same letters) of another
	    String stringAnagram1 = "Buckethead";
	    String stringAnagram2 = "DeathCubeK";
	    List<String> anagramList1 = new ArrayList<String>(Arrays.asList(stringAnagram1.toLowerCase().split("")));
	    List<String> anagramList2 = new ArrayList<String>(Arrays.asList(stringAnagram2.toLowerCase().split("")));
	    Collections.sort(anagramList1);
	    Collections.sort(anagramList2);
	    boolean isAnagram = anagramList1.equals(anagramList2);
	    
		System.out.println(String.format("%nLists"));
		System.out.println(String.format("The number %d appears %d times in List %s", collectionNumber, collectionOccurrencesInt, String.join(", ", collectionList.toString())));
		System.out.println(String.format("List is '%s', Sum of List using While loop is %d, using For loop is %d", String.join(", ", collectionList.toString()), collectionWhileSum, collectionForSum));
		System.out.println(String.format("Using sorted Lists, String '%s' is an anagram of String '%s': %b", stringAnagram1, stringAnagram2, isAnagram ));
	}
	
	@Test                                               
    @DisplayName("Set Operations")   
    void Sets() {
		//Sets don't allow for duplicate items, can be used to get number of unique occurrences
		Set<String> hashSet = new HashSet<>();
		String stringForSet = "aretheyhereyestheyarehere";
		String[] stringForSetArray = stringForSet.split("(?<=.)");
		//Add one by one from Array
		for(String s: stringForSetArray) {
	    	hashSet.add(s);
	    }
		//Add all from Array at once
		Collections.<String>addAll(this.sortedSet, stringForSetArray);
		//Items in Set cannot be referenced by index, copy to List first
		int[] intArrayForSet = {99, 2, 2, 23, 19, 10, 1, 3};
		Set<Integer> treeSetFromArray = new TreeSet();
		for (int i = 0; i < intArrayForSet.length; i++){
			treeSetFromArray.add(intArrayForSet[i]);
	      }
		List<Integer> listFromSet = new ArrayList();
		for (int val: treeSetFromArray){
			listFromSet.add(val);
		}
		//Split String to Set directly
		Set<String> stringSet = new HashSet<String>(Arrays.asList(stringForSet.split("")));
		//Sets are good for representing isograms(word with no repeating letters)
		String isogram = "Dermatoglyphics";
		String[] arrIsogram = isogram.split("(?<=.)");
		Set<String> setIsogram = new HashSet<>();
		for (String st: arrIsogram){
			setIsogram.add(st.toLowerCase());
		}
		boolean isIsogram = arrIsogram.length == setIsogram.size() ? true : false;
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
		System.out.println(String.format("Unique and sorted letters in String '%s' are '%s'", stringForSet, String.join("", this.sortedSet)));
		System.out.println(String.format("Getting last two values from TreeSet '%s' using a List : %d and %d", String.join("", treeSetFromArray.toString()), listFromSet.get(listFromSet.size() - 1), listFromSet.get(listFromSet.size() - 2)));
		System.out.println(String.format("Splitting String '%s' directly to Set: '[%s']", stringForSet, String.join(", ", stringSet)));
		System.out.println(String.format("'%s' is an isogram and contains no repeating letters: %b", isogram, isIsogram));
		System.out.println(String.format("'%s' is a pangram and contains every letter of the alphabet: %s", pangram, sortedPangram));
	}
	
	@Test                                               
    @DisplayName("HashMaps(Dictionaries)")   
    void HashMaps() {
		//Create new HashMap
		HashMap<String, Integer> newDict = new HashMap<String, Integer>();
		//Add items to Dictionary
		newDict.put("oranges", 4);
		newDict.put("pears", 1);
		newDict.put("apple", 2);
		newDict.put("bananas", 3);
		//Get value from Dictionary
		int bananaCount = newDict.get("bananas");
		//Get entry at index of Dictionary
		var newDictEntryAtIndex = newDict.entrySet().toArray()[0];
		//Sort Dictionary by Value
		HashMap<String, Integer> newDictSortedByValue = newDict.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll);
		//Sort Dictionary by Key
		HashMap<String, Integer> newDictSortedByKey = newDict.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), LinkedHashMap::putAll);
		//Add number and square of number from Array to HashMap
		int[] arrayForHashMap = {2,6,4,76,2,102,5,17,2};
	    HashMap<Integer, Integer> intHashMap = new HashMap<Integer, Integer>();
	    for(var num : arrayForHashMap) {
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
	    
		System.out.println(String.format("%nHashMaps(Dictionaries)"));
		System.out.println(String.format("From '%s' getting the number of bananas: %d", Collections.singletonList(newDict), bananaCount));
		System.out.println(String.format("From '%s' get entry at Index 0: %s", Collections.singletonList(newDict), newDictEntryAtIndex));
		System.out.println(String.format("Sorting '%s' by Value: %s", Collections.singletonList(newDict), Collections.singletonList(newDictSortedByValue)));
		System.out.println(String.format("Sorting '%s' by Key: %s", Collections.singletonList(newDict), Collections.singletonList(newDictSortedByKey)));
		System.out.println(String.format("Integer Array is '%s', unordered HashMap with Square values is %s", Arrays.toString(arrayForHashMap), Collections.singletonList(intHashMap)));
		System.out.println(String.format("Sum of all Square values in HashMap %s is %d, using Lambda expression %d", Collections.singletonList(intHashMap), intHashMapSumSquares, intHashMapSumSquares));
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
	
	@Test                                               
    @DisplayName("Exception Handling using Text File")   
    void TryCatchFinally() {
		String filePathCorrectDate = "src/main/resources/Exception Correct Date.txt";
		String filePathIncorrectDate = "src/main/resources/Exception Incorrect Date.txt";
		String dataTextFile = AlphaTwo.getTextFile(filePathCorrectDate);
		
		System.out.println(String.format("%nException Handling"));
		System.out.println(String.format("Reading Text File and parsing date: %s", dataTextFile));
		//No file + path provided to trigger Exception
		AlphaTwo.getTextFile(filePathIncorrectDate);
		AlphaTwo.getTextFile("");
		AlphaTwo.getTextFile("/main/file.txt");
	}
	
	@Test                                               
    @DisplayName("Read JSON file")   
    void GetJSONFile() {
		String filePath = "src/main/resources/Resources.json";
		JSONObject jsonData = AlphaTwo.getJSON(filePath);
		// Access basic JSON data
        String name = jsonData.getString("name");
        int age = jsonData.getInt("age");
        String email = jsonData.getString("email");
        boolean isEmployed = jsonData.getBoolean("isEmployed");
        JSONArray skills = jsonData.getJSONArray("skills");
        
        JSONObject address = jsonData.getJSONObject("address");
        String street = address.getString("street");
        String city = address.getString("city");
        String zipCode = address.getString("zipCode");
        
		
        System.out.println(String.format("%nRead JSON file"));
		System.out.println(String.format("Reading JSON root: %nname: '%s' age: '%d' email: '%s' isEmployed: '%b'", name, age, email, isEmployed));
		System.out.println(String.format("Reading JSON address: %nstreet: '%s' city: '%s' zipCode: '%s'", street, city, zipCode));
		System.out.println(String.format("Reading JSON skills: %n'%s'", Arrays.asList(skills).toString()));
	}
	
	@Test                                               
    @DisplayName("Exercises")   
    void Exercises() {
		System.out.println(String.format("%nExercises"));
	}
}
