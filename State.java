

public class State {

    protected MazeButton current;
    protected Info inform;
    //protected Vector<MazeButton> track;

    public State (MazeButton current, Info inform) {
	this.current = current;
	//info = current.getStrBeenHere();
	this.inform = inform;
	
    }

    // public Vector<MazeButton> getTrack () {
    //return track;
    //}

    //public void setTrack (Vector<MazeButton> track) {
    //this.track = track;
    //}

    public State getState () {
	return this;
    }

    public MazeButton getCurrent () {
	return current;
    }

    public void setCurrent (MazeButton current) {
	this.current = current;
    }

    public Info getInfo () {
	return inform;
    }

    public void setInfo (Object inform) {
	this.inform = (Info) inform;
    }

}