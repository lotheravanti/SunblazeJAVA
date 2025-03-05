package sunblazeFE;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SunblazeSelenium {

	public int multiply(int a, int b) {
        return a * b;
	}
	
	int a;
	int b;
	
	@BeforeEach                                         
    void setUp() {
		a = 2;
		b = 3;
    }

    @Test                                               
    @DisplayName("Simple multiplication should work")   
    void testMultiply() {
    	System.out.println(String.format("JUnit test run successful"));
    	assertEquals(5, multiply(a, b),     
                "Regular multiplication should work");        
    }
}
