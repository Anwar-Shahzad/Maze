import java.util.Vector;

public class Solver {

    private MazeFrame frame;
    private StateQueue theQ;
    private static Vector<State> allStates;
    public Solver (State initial, MazeFrame frame){
	theQ = new StateQueue();
	theQ.insert(initial);
	this.frame = frame;
	allStates = frame.getAllStates();
    }

    public static Vector<State> getAllStates () {
	return allStates;
    }

    public void solve (){
	while (!theQ.isEmpty()){
	    State temp = theQ.remove();
	    if (temp.getCurrent().getNum() == 0){
		Vector<MazeButton> solution = temp.getInfo().getPast();
		System.out.println("The solution is given in terms of the (x,y) coordinate of the button the user should next visit. For example, (0,0) refers to the button with the number '6', and (6,0) refers to  the button with the number '3':"); 
		for (int i = solution.size() - 1; i >= 0; i --) {
		    System.out.print ("(" + solution.elementAt(i).getRow() + "," + solution.elementAt(i).getCol() + ")" + " " );
		}
		break;
	    }

	    else {
		Vector<Transition> trans = temp.getCurrent().getTrans();
		Vector<MazeButton> history =  temp.getInfo().getPast();
	      
		for (Transition t: trans) {
		    if (!t.getTarget().getBeenHere()){
			Vector<MazeButton> forT = new Vector<MazeButton>();
			forT.addElement(t.getTarget());
			for (MazeButton m: history){
			  forT.addElement(m);
			}
			theQ.insert(new State(t.getTarget(),new Info(forT)));
		    }
		}
	    }
	}
    }
}

    
    
