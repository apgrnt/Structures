package chapt2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import glebe.andrew.queue.Node;

/*
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class TwoPointOne {
	private final ArrayList<Integer> arrayWithDups = new ArrayList<Integer>(new int[]{1,1,2,3,4,3,5});
	private final int[] cleanedArray = new int[]{1,2,3,4,5};
	private final List<Integer> theList = new LinkedList<Integer>(arrayWithDups);
	
	
	@Test
	public void testRemoveDups(){
		
	}
}
