package sunblazeFE;

import java.util.Arrays;

import org.json.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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
	//Using File Reader for Exception Handling illustration, especially closing the file
	public static String getTextFile(String path) {
		File file = null;
		FileReader fileReader = null;
		try {
			file = new File(path); //file is required for length of char array
		    fileReader = new FileReader(file);
			//File Reader requires char array since it reads character by character
		    char[] fileValueArray = new char[(int)file.length()];
			fileReader.read(fileValueArray);
			String fileValueString = new String(fileValueArray);
			return fileValueString;
        } 
		catch (IOException e) {
            System.err.println(String.format("Could not read data: %s", e.toString()));
            return null;
        }
		// In JAVA File close() requires another Checked Exception
		finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static JSONObject getJSON(String filePath) {
		JSONObject jsonData = null;
		try {
			String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
			//Parse JSON data
	        jsonData= new JSONObject(jsonString);
		}
		catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
            e.printStackTrace();
        }
		catch (Exception e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
            e.printStackTrace();
        }
		return jsonData;
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