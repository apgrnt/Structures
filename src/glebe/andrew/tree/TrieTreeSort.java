package glebe.andrew.tree;

import java.util.ArrayList;
import java.util.List;

public class TrieTreeSort<E> implements SortedTree{
    private final char[] ALPHABET = {'A', 'B', 'C'};
    private final String[] arrayToSort;
    private final String[] sortedArray;
    
    public TrieTreeSort(String[] arrayToSort){
	this.arrayToSort = arrayToSort;
	this.sortedArray = new String[arrayToSort.length];
    }
    
    public char[] getNodes() {
	return ALPHABET;
    }


    public List getSortedList() {
	return new ArrayList<String>();
    }


    public String[] getSortedArray() {
	return sortedArray;
    }
}
