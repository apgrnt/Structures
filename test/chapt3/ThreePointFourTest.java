package chapt3;

import static org.junit.Assert.*;
import org.junit.Test;


/*
 * Queue via Stacks: 
 * Implement a MyQueueClass which implements a queue using two stacks.
 * hints #97, #113
 * 
 * Stack if first on last off.
 * queue is first in first out.
 */
public class ThreePointFourTest {
    
    @Test
    public void testPush(){
	MyQueueClass queue = new MyQueueClass();
	queue.push(1);
	assertEquals(queue.size(), 1);
	
    }
    
    @Test
    public void testPop() {
	MyQueueClass queue = new MyQueueClass();
	queue.push(1);
	int i = queue.pop();
	assertEquals(1, i);
	assertEquals(queue.size(), 0);
    }
    
    @Test
    public void testPopInOrder() {
	MyQueueClass queue = new MyQueueClass();
	for(int x = 0; x < 5; x++){
	    queue.push(x);
	}
	assertEquals(5, queue.size());
	for(int x = 4; x == 0 ; x--){
	    int popped = queue.pop();
	    assertEquals(x, popped);
	}
    }
    
    @Test
    public void testSecondStack(){
	MyQueueClass queue = new MyQueueClass();
	for(int x = 0; x < 6; x++){
	    queue.push(x);
	}
	
	assertEquals(6, queue.pop());
	
    }
}
