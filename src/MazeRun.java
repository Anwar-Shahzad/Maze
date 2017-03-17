import java.awt.*;


public class MazeRun {
	
    public static void main(String[] args) {
	String key = args[0];
	if (key.equals("FirstMaze")){
	    MazeFrame frame =  new MazeFrame();
	    frame.init();
	    frame.pack();
	    frame.setVisible(true);
	    frame.setSize(new Dimension(600,600));
	    frame.repaint();
	}
	else if (key.equals("SecondMaze")){
	    MazeFrame2 frame2 = new MazeFrame2();
	    frame2.init();
	    frame2.pack();
	    frame2.setVisible(true);
	    frame2.setSize(new Dimension(1000,1000));
	    frame2.repaint();
	}
    }
}
