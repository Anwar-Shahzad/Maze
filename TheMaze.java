
public class TheMaze {

    //int howManyPushed = 0;
    //int limit;
    MazeFrame frame;
    boolean over = false;
	
    public TheMaze(MazeFrame frame2) {//(int i, Lab8Frame frame2) {
	//limit = i;
	frame = frame2;
	}

    public void badSpot() {
	//frame.setDoneMessage("You Lose - Good!");
	over = true;
    }
    
    //public void spot() {
	//howManyPushed++;
	//if (howManyPushed == limit){
	//  frame.setDoneMessage("Curses, you win");
	//  over = true;
	//}
	//if (;
    //}
    
    //public void changeColor () {
    //frame.repaint();
    //}

    // public void changeMessage () {
	//if (!over)
	    //frame.setMessage("Only: " + (6 - howManyPushed) + " to go!");
    //}
}
