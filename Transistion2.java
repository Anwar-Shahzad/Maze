import java.util.Vector;

public class Transistion2 extends Transistion {

    //protected MazeButton target;
    

    public Transistion2(MazeButton2 target) {
	//	this.target = target;
	super(target);
    }

    public void setTarget (MazeButton target) {
	this.target = target;
    }

    public MazeButton2 getTarget2 () {
	return (MazeButton2)target;
    }

    public State2 changeState2 (State2 st) {
	
	MazeButton2 current = (MazeButton2) st.getCurrent();
	int currentRow = current.getRow();
	int currentCol = current.getCol();
	Vector<Transistion2> trans = current.getTrans2();
	String direction = st.getInfo().getDirection();
	//System.out.println("" + current.getNum());
	for (Transistion2 item: trans){
	
	
	
	    if (((MazeButton2) item.target).equals((MazeButton2) this.target)){
		int targetRow = item.target.getRow();
		int targetCol = item.target.getCol();
		String crucial = "";
		if (targetRow < currentRow)
		    crucial = "up";
		else if (targetRow > currentRow)
		    crucial = "down";
		else if (targetCol > currentCol)
		    crucial = "right";
		else if (targetCol < currentCol)
		    crucial = "left";
		//System.out.println("Crucial " + crucial);
		if (!crucial.equals(direction)){
		    st.getCurrent().change();
		    this.target.change();
		    Vector<MazeButton> info = new Vector<MazeButton>();
		    info.addElement((MazeButton2) this.target);
		    if (crucial.equals("left"))
			crucial = "right";
		    else if (crucial.equals("right"))
			crucial = "left";
		    else if (crucial.equals("up"))
			crucial = "down";
		    else if (crucial.equals("down"))
			crucial = "up";
			    
		    Info2 ex = new Info2(info, crucial);
	
		    return new State2(this.target, ex);
		}
		
	    }
	}
	return null;
    }

    

}