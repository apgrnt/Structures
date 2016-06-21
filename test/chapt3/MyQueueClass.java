package chapt3;

import java.util.Queue;
import java.util.Stack;

public class MyQueueClass {
    private static final Exception StackFullException = null;
    private int queueSize = 0;
    private final int STACK_LIMIT = 5;
    private final Stack<Integer> stack1 = new Stack();
    private final Stack<Integer> stack2 = new Stack();

    public void push(int i) {
	if(stack1.size() == 5) {
	   if(stack2.size() == 5) {
	       try {
		   throw StackFullException;
	       } catch (Exception e) {
		   e.printStackTrace();
	       }
	   } else {
	       stack2.push(i);
	       queueSize++;
	   }
	} else{
	    stack1.push(i);
	    queueSize++;
	}
    }

    public int size() {
	return queueSize;
    }

    public int pop() {
	int i = 0;
	if(stack2.size() == 0){
	    queueSize--;
	    return i;
	}
	return i;
    }

}
