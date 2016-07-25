package chapt2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import glebe.andrew.collections.lists.LinkedListTools;

/*
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class TwoPointOne {
	private final Object[] cleanedArray = new Object[]{1,2,3,4,5};
	private final LinkedList<Integer> theList = new LinkedList<Integer>();
	
	@Test
	public void testMatches(){
		theList.clear();
		theList.add(1);
		theList.add(2);
		theList.add(3);
		theList.add(4);
		theList.add(5);
		Assert.assertArrayEquals(cleanedArray, theList.toArray());
	}
	
	
	@Test
	public void testRemoveDups(){
		cleanLinkedListUnderTest();
		LinkedListTools.removeDuplicates(theList);
		Assert.assertArrayEquals(cleanedArray, theList.toArray());
	}


	private void cleanLinkedListUnderTest() {
		theList.clear();
		theList.add(1);
		theList.add(1);
		theList.add(2);
		theList.add(3);
		theList.add(4);
		theList.add(4);
		theList.add(4);
		theList.add(5);
		theList.add(1);
		theList.add(4);
		
	}
	
	@Test
	public void removeDupsNoTempBuffer(){
		cleanLinkedListUnderTest();
		LinkedListTools.removeDuplicatesNoBuffer(theList);
		Assert.assertArrayEquals(cleanedArray, theList.toArray());
	}
}