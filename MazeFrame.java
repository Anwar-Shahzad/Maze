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
	//table = new MazeButton[7][7];
	TheMaze maze1 = new TheMaze(this);
	FirstMaze fmaze = new FirstMaze();
		
	//MazeHandler mh = new MazeHandler(this);
	       
       
	MazeButton[][] table = FirstMaze.getTable();
	//startPos = FirstMaze.getStart();
	//current = table[0][0];
	for (int i = 0; i < table.length; i++){
	    for (int j = 0;j < table[i].length; j++){
		ct.add(table[i][j]);
		//table[i][j].addActionListener(mh);
		//table[i][j].setCurrent(current);
		table[i][j].setTable(table);
		table[i][j].setRow(i);
		table[i][j].setCol(j);
		table[i][j].setFrame(this);
		//table[i][j].setEnabled(false);
	    }
	}
	//begin();
	//Vector<MazeButton> info = new Vector<MazeButton>();
	//info.addElement(startPos);
	//Info example = new Info(info);
	now = FirstMaze.getStart();
	now.getCurrent().change();
	//allStates = FirstMaze.getAllStates();

	SolverButton theEnd = new SolverButton("Click for Solution", this);
	ct.add(theEnd);
    }

    public static Vector<State> getAllStates () {
	return allStates;
    }

    //public void begin () {
    //now = new State(table[0][0]);
	

	//table[0][0].change();
    //}

    public void spot(Transistion temp) {
	//Transistion forNow = new Transistion(now.getCurrent());
	State possible = temp.changeState(now);
	if (possible != null)
	    now = possible;
	repaint();
    }

    public void solve () {
	//if (!now.getCurrent().equals(table[0][0])){
	//  now.getCurrent().change();
	//Vector<MazeButton> temporary = new Vector<MazeButton>();
	//temporary.add(table[0][0]);
	//now = new State(table[0][0], new Info(temporary));
	now = FirstMaze.getStart();
	//table[0][0].changeBeenHere();
	//table[0][0].change();
	//}
	//for (int i = 0; i < table.length; i++){
	//  for (int  j  = 0; j < table.length; j++){
	//if (i == j && i == 0){
	///    
	//table[i][j].resetHere();
		//t//able[i][j].resetBeenHere();
		
	now = FirstMaze.getStart();
	Solver willSolve = new Solver(now, this);
	willSolve.solve();
    }
       
    
    
        		
}






//public MazeButton current () {
//return current;
//  }

//jb.setCurrent(current);
		//jb.addActionListener(x);
		//table[i][j] = jb;
		
			
			//			jb.addActionListener(cC);

		//ct.add(jb);//}

			//if (i==0 || i == 1 || i == 2 || i == 4 || i == 8) {
			//    jb.addActionListener(lh);// T-shaped danger zone
			//}
			//if (x ==2){
			    
			//    jb.addActionListener(lh);
			
			
			
			
			
			
			//jb.addActionListener(hand);

			//if (i==2) {
		//panel.randomSet();
		//	ct.add(panel);
		//}
			
		//buttons[6i + j + i(j+1)] = jb;
    


    //}
    //message = new JLabel(makeMessage("#FF0000","Keep pressing buttons"));
    //	ct.add(message);
	
    //	DisplayPanel two = new DisplayPanel();
    //	ct.add(two);


//	private int randomColorCoord() {
//	return (int) (Math.random()*256);
//}

//	public String makeMessage(String color, String text) {
//	String answer = "<html><FONT COLOR=\"";
//	answer = answer +color+"\">"+text+"</FONT></html>";
//	return answer;
//}
	
//public void setDoneMessage(String message1) {
//	message.setText(makeMessage("#800000",message1));
//	
//	for (JButton b : buttons) {
//		b.setEnabled(false);
//	}
			
		
    //}

//   public void setMessage (String mess) {
//message.setText(makeMessage("111000", mess));
//  }

    //  public void changeColor(){
	//repaint();
    //}

	//try {
		//FirstMaze test = new FirstMaze("FirstMaze.dat");
		//}
		//catch (java.io.IOException e){
		    
		    //	}
		
//TheGame game1 = new TheGame(6,this);
		
		//	GameHandler hand = new GameHandler(game1);
		//LossHandler lh = new LossHandler(game1);
		//ColorChanger cC = new ColorChanger(game1);

		//DisplayPanel panel = new DisplayPanel();

