import java.util.Vector;

public class Info2 extends Info{

    //protected Vector<MazeButton2> past2;
    protected String direction;
    
    public Info2 (Vector<MazeButton> past,String direction ) {
	//super();
	//this.past2  = past;
	super(past);
	this.direction = direction;
    }

    //public Vector<MazeButton> getPast () {
	//turn past;
	//
    
    public String getDirection () {
	return direction;
    }

    //public //void setDirection (String direction) {
    //this.direction = direction;
    //}

}