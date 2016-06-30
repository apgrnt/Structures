package chapt1;

import org.junit.Assert;
import org.junit.Test;

import glebe.andrew.utils.StringUtils;


/*
 * Question 1.1
Implement an algorithm to determine if a string has all unique characters. 
What if you cannot use additional data structures?
*/
public class OnePointOneTest {
	private String uniqueCharsString = "abcdef";
	private String nonUniqueCharsString = "aabbcc";
	
	@Test
	public void uniqueStringTest(){
		Assert.assertFalse(StringUtils.dupChars(uniqueCharsString));
	}
	
	@Test
	public void nonUniqueCharsTest(){
		Assert.assertTrue(StringUtils.dupChars(nonUniqueCharsString));
	}

}
