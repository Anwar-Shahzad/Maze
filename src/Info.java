import java.util.Vector;

public class Info {

    protected Vector<MazeButton> past;

    public Info (Vector<MazeButton> past) {
	this.past = past;
    }

    public Vector<MazeButton> getPast () {
	return past;
    }
}
