
public class TheMaze {

    MazeFrame frame;
    boolean over = false;
	
    public TheMaze(MazeFrame frame2){
	frame = frame2;
    }

    public void badSpot() {
	over = true;
    }
}
