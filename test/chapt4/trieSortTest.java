package chapt4;

import static org.junit.Assert.*;
import glebe.andrew.tree.SortedTree;

import org.junit.Test;

public class trieSortTest {
    private final String[] TEST_DATA = {"A", "B", "CAB", "BAC", "ABC", "ACB", "B"};
    private final String[] FINAL_LIST = {"A", "ABC", "ACB", "B", "B", "BAC", "CAB"};
    private final char[] ALPHABET = {'A','B','C'};
    
    private SortedTree mainTree;

    @Test
    public void testGraphClassCreation() {
	mainTree = new TrieTreeSort(TEST_DATA);
	assertNotNull(mainTree);
    }
    
    @Test
    public void testGraphGetNodesNotNull(){
	mainTree = new TrieTreeSort(TEST_DATA);
	assertNotNull(mainTree.getNodes());
    }
    
   @Test
   public void testGraphGetNodesEqualsAlphabet(){
       mainTree = new TrieTreeSort(TEST_DATA);
       assertEquals(3, mainTree.getNodes().length);
   }
   
   @Test
   public void testGraphNodeOrder(){
       mainTree = new TrieTreeSort(TEST_DATA);
       char[] nodeOrder = {'A','B','C'};
       assertArrayEquals(nodeOrder, mainTree.getNodes());
   }
   
   @Test
   public void testGraphFinalArraySize(){
       mainTree = new TrieTreeSort(TEST_DATA);
       assertEquals(FINAL_LIST.length, mainTree.getSortedArray().length);
   }
   
   @Test
   public void testTreeReturnsFinalArraySorted(){
       mainTree = new TrieTreeSort(TEST_DATA);
       assertArrayEquals(FINAL_LIST, mainTree.getSortedArray());
   }
}
