package baseConcepts;

import java.util.Arrays;

public class AlphaTwo {
	
	//Properties
	String alphaTwoString;
	
	//Constructor
	AlphaTwo(){
		this.alphaTwoString = "This is AlphaTwo's String";
	}
	
	//Methods
	public int SumIntArray(int[] intArray) {
		return Arrays.stream(intArray).sum();
	}
}
