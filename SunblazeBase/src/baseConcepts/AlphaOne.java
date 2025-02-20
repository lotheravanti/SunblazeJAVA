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
		String lowerCase = "lower case text";
		String replacedMessage = message.replace("One", "Prime");
		//Convert to Upper Case
		String upperCase = lowerCase.toUpperCase();
		boolean startsWith = message.startsWith("Alpha");
		boolean endsWith = message.endsWith("Initialized");
		int[] integerArray = {1,1};
		String[] stringArray = {"First", "Second"};
		
		System.out.print(replacedMessage + " starts with Alpha: " + startsWith + " and ends with Initialized: " + endsWith);

	}

}
