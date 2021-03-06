package chapt3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import chapt3.ThreePointTwo;
import chapt3.ThreePointTwo.Plate;

public class ThreePointTwoTest {
    
    public ThreePointTwo testClass;
    
    @Test
    public void testPushMethod() {
	testClass = new ThreePointTwo();
	testClass.push(testClass.new Plate());
	assertEquals(testClass.getNumberOfPlates(), 1);
    }
    
    @Test
    public void testPopMethod(){
	testClass = new ThreePointTwo();
	testClass.push(testClass.new Plate());
	Plate testPlate = testClass.pop();
	assertNotNull(testPlate);
    }
    
    @Test
    public void testMaxOutStackOne() {
	testClass = new ThreePointTwo();
	for(int x = 0; x < 5; x++){
	    testClass.push(testClass.new Plate());
	}
	assertEquals(5, testClass.getNumberOfPlates());
	assertEquals(1, testClass.getNumberOfStacks());
    }
    
    @Test
    public void testMakeNewStack(){
	testClass = new ThreePointTwo();
	for(int x = 0; x <= 5; x++){
	    testClass.push(testClass.new Plate());
	}
	assertEquals(6, testClass.getNumberOfPlates());
	assertEquals(2, testClass.getNumberOfStacks());
    }
    
    @Test
    public void testRemoveAStack(){
	testClass = new ThreePointTwo();
	for(int x = 0; x <= 5; x++){
	    testClass.push(testClass.new Plate());
	}
	assertEquals(2, testClass.getNumberOfStacks());
	testClass.pop();
	assertEquals(1, testClass.getNumberOfStacks());
    }
}
