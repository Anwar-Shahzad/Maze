import java.util.Vector;

public class Info2 extends Info{    
    
	protected String direction;
    
    public Info2( Vector<MazeButton> past, String direction ) {
    	super(past);
    	this.direction = direction;
    }

    public String getDirection() {
    	return direction;
    }
}
