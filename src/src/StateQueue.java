public class StateQueue {
    
    private static final int QueueDefaultLength = 10;
    private State[] theQ;
    private int count = 0;
    private int front = 0;
    private int back = -1;
    private int length = QueueDefaultLength;
    
    public StateQueue() {
	    theQ = new State[QueueDefaultLength];
    }
    
    public boolean isEmpty() {
	return count == 0;
    }

    public void insert(State d){
	if ( count == length ) {
	    State[] temp = new State[length*2];
	    for (int i = 0; i < length; i++){
		temp[i] = remove();
	    }	    
	    length = length * 2;;
	    theQ = temp;
	    front = 0;
	    count = length / 2;
	    back = count - 1;
	}
	if ( back != (length-1) ) 
	    back = back+1;
	else
	    back = 0;
	theQ[back] = d;
	count = count + 1;
    }
    public State remove() {//throws QueueEmptyException  {
	if (isEmpty()){
	    System.out.println("StateQueue is empty. Exiting.");
	    System.exit(0);
	}
	State toReturn = theQ[front];
	count = count -1;
	if ( front == (length-1)) 
	    front = 0;
	else
	    front = front +1;
	return toReturn;
    }
    
    public void print() {
	System.out.println("The Queue: "+front+" "+back + " " + count);
	if ( back >= front ) {
	    for (int i=front; i<=back;i++) {
		System.out.println(theQ[i]);
	    }
	}
	else {
	    for (int i = front; i < length; i++ )
		System.out.println(theQ[i]);
	    for (int i = 0; i <= back; i++)
		System.out.println(theQ[i]);
	}
    }   
}
