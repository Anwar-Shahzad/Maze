import java.util.Vector;

public class Solver2 {

    private MazeFrame frame;
    private StateQueue theQ;
    public Solver2 (State initial, MazeFrame frame){
	theQ = new StateQueue();
	theQ.insert(initial);
	this.frame = frame;
    }

    public void solve (){
	while (!theQ.isEmpty()){
	    State2 temp = (State2) theQ.remove();
	    if (temp.getCurrent().getNum() == 0){
		Vector<MazeButton> solution = temp.getInfo().getPast();
		System.out.println("The solution is given in terms of the (x,y) coordinate of the button the user should next visit. For example, (0,0) refers to the button with the number "6", and (6,0) refers to  the button with the number "3":"); 
		for (int i = solution.size() - 1; i >= 0; i --) {	    
		    System.out.print ("(" + solution.elementAt(i).getRow() + "," + solution.elementAt(i).getCol() + ")" + " " );
		}
       		System.out.print("Done.");
		break;
	    }
	    
	    else {
		Vector<Transistion2> trans = ((MazeButton2)temp.getCurrent()).getTrans2();
		Vector<MazeButton> history =  temp.getInfo().getPast();
		
		for (Transistion2 t: trans) {
		    State2 possible = t.changeState2(temp);
		    if (!t.getTarget().getBeenHere() && possible != null){
			Vector<MazeButton> forT = new Vector<MazeButton>();
			forT.addElement((MazeButton2) t.getTarget());
			for (MazeButton m: history){
			    forT.addElement((MazeButton2) m);
			}
			theQ.insert(new State2(t.getTarget(),new Info2(forT, possible.getInfo().getDirection())));
		    }
		}
	    }
	}
    }
}

    
    
