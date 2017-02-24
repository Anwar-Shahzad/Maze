import java.util.Vector;

public class Solver2 {

    private MazeFrame frame;
    private StateQueue theQ;
    //private Vector<MazeButton> solution = null;
    //private static Vector<State> allStates;

    public Solver2 (State initial, MazeFrame frame){
	theQ = new StateQueue();
	theQ.insert(initial);
	this.frame = frame;
	//allStates = frame.getAllStates();
    }

    // public static Vector<State> getAllStates () {
    //return allStates;
    //}

    public void solve (){
	while (!theQ.isEmpty()){
	    State2 temp = (State2) theQ.remove();
	    if (temp.getCurrent().getNum() == 0){
		//System.out.println(0);
		//frame.spot(new Transistion(temp.getCurrent()));
		//Vector<MazeButton> info = (Vector<MazeButton>) temp.getInfo();
		//for (int i = info.size() - 1; i >= 0; i--){
		//MazeButton runningOutOfNames = info.elementAt(i);
		//System.out.print("(" + runningOutOfNames.getRow()  + "," + runningOutOfNames.getCol() + ")" + " ");
		//}
		Vector<MazeButton> solution = temp.getInfo().getPast();
		//for (MazeButton m: solution){
		//		System.out.print ("(" + m.getRow() + "," + m.getCol() + ")" + " " );
		//}
		System.out.println("The solution is given in terms of the (x,y) coordinate of the button you should go to (e.g. (0,0) is  the 6, (6,0) is the 3):"); 
		for (int i = solution.size() - 1; i >= 0; i --) {
		    
		    System.out.print ("(" + solution.elementAt(i).getRow() + "," + solution.elementAt(i).getCol() + ")" + " " );
		}
		    
		
		System.out.print("Done.");
		break;
		//return;
		
	    }
	    
	    else {
		
		Vector<Transistion2> trans = ((MazeButton2)temp.getCurrent()).getTrans2();
		Vector<MazeButton> history =  temp.getInfo().getPast();
		
		for (Transistion2 t: trans) {
		    State2 possible = t.changeState2(temp);
		    if (!t.getTarget().getBeenHere() && possible != null){
			
			//for (int i = 0; i < tracker.size(); i++) {
			//  MazeButton copy = tracker.remove(i);
			//  forT.addElement(copy);
			//}
			    
			Vector<MazeButton> forT = new Vector<MazeButton>();
			forT.addElement((MazeButton2) t.getTarget());
			for (MazeButton m: history){
			    forT.addElement((MazeButton2) m);
			}
			//Vector<MazeButton> forT = new Vector<MazeButton>();
			//for (State s: allStates)
			//  if (s.getCurrent().equals(t.getTarget()))
			//forT = s.getInfo().getPast();
			//for (MazeButton m: history)
			//  forT.addElement(m);
			
			
			//Info thisIsIt = new Info(forT);
			theQ.insert(new State2(t.getTarget(),new Info2(forT, possible.getInfo().getDirection())));
			//theQ.insert(possible);
			//System.out.print(temp.getCurrent().getNum());
			    
			
		    }
		}
	
	//	    frame.spot(new Transistion(temp.getCurrent()));
	    //solution += " " + temp.getCurrent().getNum();
	    //System.out.print(temp.getCurrent().getNum());

			
		
		
	    }
	}


    }
}

    
    