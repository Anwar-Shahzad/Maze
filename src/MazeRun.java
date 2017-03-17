import java.awt.*;


public class MazeRun {
	
    public static void main( String[] args ) {
		String key = args[0];
		MazeFrame frame = new MazeFrame();
		if (key.equals("SecondMaze")){
		    frame = new MazeFrame2();
		}
		frame.init();
	    frame.pack();
	    frame.setVisible(true);
	    frame.setSize(new Dimension(1000,1000));
	    frame.repaint();
    }
}
/*
if (key.equals("FirstMaze")){
    frame =  new MazeFrame();
}
else 
*/
