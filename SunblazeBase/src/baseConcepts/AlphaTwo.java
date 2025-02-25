package baseConcepts;

import java.util.Arrays;

//Superclass/Base Class
public class AlphaTwo {
	
	//Fields/Properties
	String outerAlphaTwoString;
	static String staticAlphaTwoString;
	int[] alphaTwoIntArray = {1,2,3,4,0};
	String overLoadString = "OVERLOADED";
	
	//Constructor
	AlphaTwo(){
		//Non static variable is referenced with 'this'
		this.outerAlphaTwoString = "This is AlphaTwo's String";
		//Static variable can be used by Inner Class
		staticAlphaTwoString = "This is AlphaTwo's Static String and can be used in Inner Class";
		this.alphaTwoIntArray[4] = 5;
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
	//Method is static here so it can be used in AlphaTwoSub's initialization
	public static String ReverseString(String s) {
		return new StringBuilder().append(s).reverse().toString();
	}
	//Method overloading, using same name but differing number of parameters
	public String ReverseString(String s, String overLoad) {
		return overLoad + new StringBuilder().append(s).reverse().toString();
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
