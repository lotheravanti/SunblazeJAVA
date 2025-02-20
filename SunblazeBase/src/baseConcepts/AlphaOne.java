package baseConcepts;

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
		
		//String Operations
		String stringValue = "lower case text";
		//Get length of String
		int lengthString = message.length();
		//Convert to Upper Case
		String upperCase = stringValue.toUpperCase();
		//Reverse String
		//Replace part of String
		String replacedMessage = message.replace("One", "Prime");
		//Get last N characters of a String
		//Remove First and Last characters of String
		//Check if String is Alphabet
		//Verify if String starts or ends with
		boolean startsWith = message.startsWith("Alpha");
		boolean endsWith = message.endsWith("Initialized");
		//Check if String is Upper Case or Lower Case
		
		//Array Operations
		//Create new placeholder Array of fixed length
		int[] fixedArray = new int[5];
		fixedArray[2] = 10;
		//Create Two Dimensional Array
		int[][] twoDimArray = {{1, 2}, {3, 4}, {5, 6}};
		//Generate String from Array with delimiter
		//Reverse Array
		
		
		System.out.print(replacedMessage + " starts with Alpha: " + startsWith + " and ends with Initialized: " + endsWith);

	}

}
