import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.Vector;


public class MazeFrame extends JFrame {
    
    private JLabel message;
    
    Random generator = new Random();
    protected MazeButton[][] table;
    protected MazeButton startPos;
    protected State now;
    protected static Vector<State> allStates;

   
    public void init() {

	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container ct = getContentPane();
	ct.setLayout(new GridLayout(8,8));
	TheMaze maze1 = new TheMaze(this);
	FirstMaze fmaze = new FirstMaze();
       
	MazeButton[][] table = FirstMaze.getTable();
	for (int i = 0; i < table.length; i++){
	    for (int j = 0;j < table[i].length; j++){
		ct.add(table[i][j]);
		table[i][j].setTable(table);
		table[i][j].setRow(i);
		table[i][j].setCol(j);
		table[i][j].setFrame(this);
	    }
	}
	now = FirstMaze.getStart();
	now.getCurrent().change();
	SolverButton theEnd = new SolverButton("Click for Solution", this);
	ct.add(theEnd);
    }

    public static Vector<State> getAllStates () {
	return allStates;
    }

    public void spot(Transition temp) {
	State possible = temp.changeState(now);
	if (possible != null)
	    now = possible;
	repaint();
    }

    public void solve () {
	now = FirstMaze.getStart();
	now = FirstMaze.getStart();
	Solver willSolve = new Solver(now, this);
	willSolve.solve();
    }
}
