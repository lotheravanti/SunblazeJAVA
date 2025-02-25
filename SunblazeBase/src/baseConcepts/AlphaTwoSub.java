package baseConcepts;

//Subclass of AlphaTwo
public class AlphaTwoSub extends AlphaTwo {
	
	String alphaTwoSubString = "This is AlphaTwoSub's String";
	
	AlphaTwoSub(){
		this.alphaTwoIntArray[4] = 6;
		//Use Method of Base Class, in JAVA this can be a Static Method
		this.alphaTwoSubString = super.ReverseString(alphaTwoSubString);
	}
}
