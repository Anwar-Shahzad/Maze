import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.Vector;


public class MazeFrame2 extends MazeFrame {
    
	public void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(9,9,4,4)); 
		SecondMaze smaze = new SecondMaze();
		MazeButton2[][] table = SecondMaze.getTable2();
	
		for (int i = 0; i < table.length; i++){
		    for (int j = 0;j < table[i].length; j++){
				ct.add(table[i][j]);
				table[i][j].setTable(table);
				table[i][j].setRow(i);
				table[i][j].setCol(j);
				table[i][j].setFrame(this);
		    }
		}
	
		now = SecondMaze.getStart();
		now.getCurrent().change();
		SolverButton theEnd = new SolverButton("SOLVE", this);
		theEnd.setFont(new Font("Arial",Font.BOLD,20));
	    theEnd.setForeground(Color.MAGENTA);
		ct.add(theEnd);
    }

    public void spot2( Transition2 temp ) {
		State2 possible = temp.changeState2((State2) now);
		if (possible != null)
		    now = possible;
		repaint();
    }

    public void solve() {
		now = SecondMaze.getStart();
		now.getCurrent().change();
		Solver2 willSolve = new Solver2(now, this);
		willSolve.solve();
    }
}