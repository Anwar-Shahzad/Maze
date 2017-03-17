

public class State {

    protected MazeButton current;
    protected Info inform;

    public State( MazeButton current, Info inform ) {
		this.current = current;
		this.inform = inform;	
    }

    public State getState() {
    	return this;
    }

    public MazeButton getCurrent() {
    	return current;
    }

    public void setCurrent( MazeButton current ) {
    	this.current = current;
    }

    public Info getInfo() {
    	return inform;
    }

    public void setInfo( Object inform ) {
    	this.inform = (Info) inform;
    }

}
