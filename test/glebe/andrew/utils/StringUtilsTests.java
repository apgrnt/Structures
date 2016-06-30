package glebe.andrew.utils;

import org.junit.Assert;
import org.junit.Test;

/*
 * This class tests the methods used in the StringUtilsClass
 */
public class StringUtilsTests {
	
	
	
	@Test
	public void testDupCharsMethod(){
		String uniqueCharsString = "abcdef";
		String nonUniqueCharsString = "aabbcc";
		
		Assert.assertFalse(StringUtils.dupChars(uniqueCharsString));
		Assert.assertTrue(StringUtils.dupChars(nonUniqueCharsString));
	}
	
	@Test
	public void testIsPermutationsMethod1(){
		String nonPermutation = "abcde"; 
		String permutation1 = "god";     
		String permutation2 = "dog";     
		String nonPermutation2 = "dogg"; 
		Assert.assertFalse(StringUtils.arePermutations(nonPermutation, permutation1));
		Assert.assertTrue(StringUtils.arePermutations(permutation1, permutation2));
		Assert.assertFalse(StringUtils.arePermutations(permutation1, nonPermutation2));
	}
	
}
