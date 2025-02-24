package baseConcepts;

import java.util.Arrays;

public class AlphaTwo {
	
	//Properties
	String outerAlphaTwoString;
	static String staticAlphaTwoString;
	
	//Constructor
	AlphaTwo(){
		//Non static variable is referenced with 'this'
		this.outerAlphaTwoString = "This is AlphaTwo's String";
		//Static variable can be used by Inner Class
		staticAlphaTwoString = "This is AlphaTwo's Static String and can be used in Inner Class";
	}
	
	//Methods
	//Public method, JAVA is an OOP language and doesn't have functions that are declared outside of classes
	//All functions in JAVA are actually methods
	public int SumIntArray(int[] intArray) {
		return Arrays.stream(intArray).sum();
	}
	//Static method
	public static int AverageIntArray(int[] intArray) {
		return Arrays.stream(intArray).sum()/intArray.length;
	}
	//Void method does not have return type, it only executes code
	public void VoidAlphaTwo()
	{
		System.out.println(String.format("AlphaTwo's Void method returned: %s", outerAlphaTwoString));
	}
	
	//Inner Class can be static in JAVA
	static class InnerAlphaTwo{
		
		String innerAlphaTwoString;
		
		//Setter
		public void InnerAlphaTwoSet() {
			innerAlphaTwoString = "This is InnerAlphaTwo's String";
			staticAlphaTwoString = "AlphaTwo's Static String has been updated from within InnerAlphaTwo";
		}
		
		//Getter
		public void InnerAlphaTwoGet() {
			System.out.println(String.format("Inner Class of AlphaTwo's property reads: %s", innerAlphaTwoString));
			//Public outerAlphaTwoString cannot be used in Inner Class, but Static staticAlphaTwoString can
			System.out.println(staticAlphaTwoString);
		}
		
		public int MinIntArray(int[] intArray) {
			return Arrays.stream(intArray).min().getAsInt();
		}
	}
}
