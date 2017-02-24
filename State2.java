
public class State2 extends State{

    //    protected MazeButton current;
    //protected Info2 inform;
    //protected Vector<MazeButton> track;

    public State2 (MazeButton current, Info2 inform) {
	//this.current = current;
	//info = current.getStrBeenHere();
	//this.inform = inform;
	super(current, inform);
	
    }

    // public Vector<MazeButton> getTrack () {
    //return track;
    //}

    //public void setTrack (Vector<MazeButton> track) {
    //this.track = track;
    //}

    public State2 getState () {
	return this;
    }

    public MazeButton getCurrent () {
	return current;
    }

    // public Vector<MazeButton2> getPast () {
    //return past;
    //}

    public void setCurrent (MazeButton current) {
	this.current = current;
    }

    public Info2 getInfo () {
	return (Info2) inform;
    }

    public void setInfo (Info2 inform) {
	this.inform = inform;
    }

    //public boolean compareTo (Info2 other){
    //return (this.inform.getDirection() == other.inform.getDirection());

}