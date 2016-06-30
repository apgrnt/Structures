package chapt1;

import org.junit.Assert;
import org.junit.Test;

import glebe.andrew.utils.StringUtils;

/*
 * Given two strings, write a method to decide if one is a permutation of the other.

 */
public class OnePointThreeTest {
	private final String nonPermutation = "abcde";
	private final String permutation1 = "god";
	private final String permutation2 = "dog";
	private final String nonPermutation2 = "dogg";
	
	@Test
	public void nonPermutationTest(){
		Assert.assertFalse(StringUtils.arePermutations(nonPermutation, permutation1));
	}
	
	@Test
	public void isPerumtationTest(){
		Assert.assertTrue(StringUtils.arePermutations(permutation1, permutation2));
	}
	
	@Test
	public void toLongTest(){
		Assert.assertFalse(StringUtils.arePermutations(permutation1, nonPermutation2));
	}
	
}
