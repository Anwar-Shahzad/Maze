import java.io.*;
import java.util.Vector;

public class SecondMaze extends FirstMaze {//extends Maze {

    private static MazeButton2[][] table2;
    private static State2 startPos;
    
    public SecondMaze () {
	dataArray = new int[8][8];
	table2 = new MazeButton2[dataArray.length][dataArray[1].length];
	allStates = new Vector<State>();

	dataArray[0][0] = 6;
	dataArray[0][1] = 2;
	dataArray[0][2] = 7;
	dataArray[0][3] = 4;
	dataArray[0][4] = 2;
	dataArray[0][5] = 4;
	dataArray[0][6] = 4;
	dataArray[0][7] = 2;

	dataArray[1][0] = 2;
	dataArray[1][1] = 2;
	dataArray[1][2] = 2;
	dataArray[1][3] = 5;
	dataArray[1][4] = 4;
	dataArray[1][5] = 2;
	dataArray[1][6] = 1;
	dataArray[1][7] = 6;

	dataArray[2][0] = 3;
	dataArray[2][1] = 4;
	dataArray[2][2] = 2;
	dataArray[2][3] = 4;
	dataArray[2][4] = 2;
	dataArray[2][5] = 5;
	dataArray[2][6] = 5;
	dataArray[2][7] = 3;

	dataArray[3][0] = 4;
	dataArray[3][1] = 5;
	dataArray[3][2] = 4;
	dataArray[3][3] = 3;
	dataArray[3][4] = 2;
	dataArray[3][5] = 2;
	dataArray[3][6] = 3;
	dataArray[3][7] = 4;

	dataArray[4][0] = 2;
	dataArray[4][1] = 1;
	dataArray[4][2] = 2;
	dataArray[4][3] = 3;
	dataArray[4][4] = 4;
	dataArray[4][5] = 4;
	dataArray[4][6] = 2;
	dataArray[4][7] = 3;

	dataArray[5][0] = 2;
	dataArray[5][1] = 4;
	dataArray[5][2] = 3;
	dataArray[5][3] = 2;
	dataArray[5][4] = 3;
	dataArray[5][5] = 3;
	dataArray[5][6] = 6;
	dataArray[5][7] = 4;

	dataArray[6][0] = 6;
	dataArray[6][1] = 4;
	dataArray[6][2] = 2;
	dataArray[6][3] = 3;
	dataArray[6][4] = 3;
	dataArray[6][5] = 2;
	dataArray[6][6] = 6;
	dataArray[6][7] = 3;

	dataArray[7][0] = 6;
	dataArray[7][1] = 7;
	dataArray[7][2] = 4;
	dataArray[7][3] = 3;
	dataArray[7][4] = 3;
	dataArray[7][5] = 2;
	dataArray[7][6] = 2;
	dataArray[7][7] = 0;

	for (int i = 0; i < dataArray.length; i++) {
	    for (int j = 0; j < dataArray[i].length; j++) {
		if (i == 7 && j == 7)
		    table2[i][j] = new MazeButton2("GOAL");
		else
		    table2[i][j] = new MazeButton2("" + dataArray[i][j]);
	    }
	}

	for (int i = 0; i < table2.length; i++) {
	    for (int j = 0; j < table2[i].length; j++){
		findTrans(i, j, table2);
	    }
	}

	Vector<MazeButton> past = new Vector<MazeButton>();
	MazeButton2 button = table2[0][0];
	past.addElement(button);
	Info2 forStart = new Info2(past, null);
	startPos = new State2(button,forStart);
    }

    public static State2 getStart() {
	return startPos;
    }

    public void findTrans (int i, int j, MazeButton2[][] table2) {	
	MazeButton2 button = table2[i][j];
	Vector<Transistion2> transistions = button.getTrans2();
	int distance = button.getNum();
	if (i >= distance)
	    transistions.add(new Transistion2(table2[i-distance][j]));
	if (distance + i <= 7)
	    transistions.add(new Transistion2(table2[distance + i][j]));
	if (j >= distance)
	    transistions.add(new Transistion2(table2[i][j - distance]));
	if (distance + j <= 7)
	    transistions.add(new Transistion2(table2[i][j + distance]));
	
    }
	    	    
    public static MazeButton2[][] getTable2() {
	return table2;
    }	    

    public static  int[][] getArray () {
	return dataArray;
    }

}
