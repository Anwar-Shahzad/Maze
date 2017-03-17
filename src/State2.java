
public class State2 extends State{

    public State2( MazeButton current, Info2 inform ) {
    	super(current, inform);
    }

    public State2 getState() {
    	return this;
    }

    public MazeButton getCurrent() {
    	return current;
    }

    public void setCurrent( MazeButton current ) {
    	this.current = current;
    }

    public Info2 getInfo() {
    	return (Info2) inform;
    }

    public void setInfo( Info2 inform ) {
    	this.inform = inform;
    }

}
