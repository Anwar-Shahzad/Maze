import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.util.Vector;

public class FirstMaze {//extends Maze {

    protected static int[][]  dataArray;
    protected static MazeButton[][] table;
    protected static State startPos;
    protected static Vector<State> allStates;

    public FirstMaze() {
    	dataArray = new int[7][7];
    	table = new MazeButton[dataArray.length][dataArray[1].length];
    	allStates = new Vector<State>();
	
    	dataArray[0][0] = 6;
    	dataArray[0][1] = 3;
		dataArray[0][2] = 2;
		dataArray[0][3] = 4;
		dataArray[0][4] = 6;
		dataArray[0][5] = 2;
		dataArray[0][6] = 5;
	
		dataArray[1][0] = 3;
		dataArray[1][1] = 5;
		dataArray[1][2] = 2;
		dataArray[1][3] = 4;
		dataArray[1][4] = 4;
		dataArray[1][5] = 4;
		dataArray[1][6] = 1;
	
		dataArray[2][0] = 3;
		dataArray[2][1] = 3;
		dataArray[2][2] = 2;
		dataArray[2][3] = 3;
		dataArray[2][4] = 3;
		dataArray[2][5] = 4;
		dataArray[2][6] = 2;
	
		dataArray[3][0] = 3;
		dataArray[3][1] = 4;
		dataArray[3][2] = 1;
		dataArray[3][3] = 2;
		dataArray[3][4] = 2;
		dataArray[3][5] = 5;
		dataArray[3][6] = 3;
	
		dataArray[4][0] = 4;
		dataArray[4][1] = 4;
		dataArray[4][2] = 4;
		dataArray[4][3] = 2;
		dataArray[4][4] = 3;
		dataArray[4][5] = 2;
		dataArray[4][6] = 4;
	
		dataArray[5][0] = 2;
		dataArray[5][1] = 5;
		dataArray[5][2] = 4;
		dataArray[5][3] = 2;
		dataArray[5][4] = 3;
		dataArray[5][5] = 2;
		dataArray[5][6] = 5;
	
		dataArray[6][0] = 3;
		dataArray[6][1] = 5;
		dataArray[6][2] = 2;
		dataArray[6][3] = 1;
		dataArray[6][4] = 4;
		dataArray[6][5] = 4;

		for (int i = 0; i < dataArray.length; i++) {
		    for (int j = 0; j < dataArray[i].length; j++) {
		    	if (i == 6 && j == 6) {
		    		table[i][j] = new MazeButton("GOAL");
		    		table[i][j].setFont(new Font("Arial", Font.BOLD, 22));
				    table[i][j].setForeground(Color.BLUE);
		    	}
			    	
		    	else {
		    		table[i][j] = new MazeButton("" + dataArray[i][j]);
		    		table[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
		    	}
		    }	
		}
	
		for (int i = 0; i < table.length; i++) {
		    for (int j = 0; j < table[i].length; j++){
		    	Vector<MazeButton> forInfo = new Vector<MazeButton>();
		    	forInfo.addElement(table[i][j]);
		    	allStates.addElement(new State(table[i][j], new Info(forInfo)));
		    	findTrans(i, j, table);
		    }
		}

		startPos = allStates.elementAt(0);
    }

    public static State getStart() {
    	return startPos;
    }

    public static Vector<State> getAllStates() {
    	return allStates;
    }
    
    public static void setStart( State newStart ) {
    	startPos = newStart;
    }

    public void findTrans( int i, int j, MazeButton[][] table ) {
	
		MazeButton button = table[i][j];
		Vector<Transition> transitions = button.getTrans();
		int distance = button.getNum();
		if (i >= distance)
		    transitions.add(new Transition( table[i-distance][j]));
		if (distance + i <= 6)
		    transitions.add(new Transition(table[distance + i][j]));
		if (j >= distance)
		    transitions.add(new Transition(table[i][j - distance]));
		if (distance + j <= 6)
		    transitions.add(new Transition(table[i][j + distance]));	
	    }
		    
	    public static MazeButton[][] getTable() {
		return table;
    }
	 
    public static  int[][] getArray() {
    	return dataArray;
    }
}
		
		
	    
    
