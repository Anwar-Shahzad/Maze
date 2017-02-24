import java.util.Vector;

public class Transistion {

    protected MazeButton target;

    public Transistion(MazeButton target) {
	this.target = target;
    }

    public void setTarget (MazeButton target) {
	this.target = target;
    }

    public MazeButton getTarget () {
	return target;
    }

    public State changeState (State st) {
	Vector<Transistion> trans = st.getCurrent().getTrans();
	for (Transistion item: trans){
	    if ((item.target).equals(this.target)){
		
		st.getCurrent().change();
		this.target.change();
		Vector<MazeButton> info = new Vector<MazeButton>();
		info.addElement(this.target);
		Info ex = new Info(info);
		
		return new State(this.target, ex);
		
	    }
	}
	return null;
    }

    

}