import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.Vector;


public class MazeFrame2 extends MazeFrame {
    
    //private JLabel message;
    
    //Random generator = new Random();
    //private MazeButton[][] table;
    //private MazeButton startPos;
    //private State now;
    //private static Vector<State> allStates;	
    
    
   
    public void init() {
	

	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container ct = getContentPane();
	ct.setLayout(new GridLayout(9,9));
	//table = new MazeButton[7][7];
	//TheMaze maze1 = new TheMaze(this);
	SecondMaze smaze = new SecondMaze();
		
	//MazeHandler mh = new MazeHandler(this);
	       
       
	MazeButton2[][] table = SecondMaze.getTable2();
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
	//Vector<MazeButton> past = new Vector<MazeButton>();
	//MazeButton2 button = SecondMaze.getStart();
	//past.addElement(button);
	//Vector<String> direction = new Vector<String>();
	//direction.addElement("left");
	//direction.addElement("right");
	//direction.addElement("down");
	//direction.addElement("up");
	
	//Info2 forStart = new Info2(past, null);
	now = SecondMaze.getStart();
	
	//now = SecondMaze.getStart();
	now.getCurrent().change();
	//allStates = FirstMaze.getAllStates();

	SolverButton theEnd = new SolverButton("Click for Solution", this);
	ct.add(theEnd);
	//System.out.println("third zzz");
    }

    //public static Vector<State> getAllStates () {
    //return allStates;
    //}

    //public void begin () {
    //now = new State(table[0][0]);
	

	//table[0][0].change();
    //}

    public void spot2(Transistion2 temp) {
	//Transistion forNow = new Transistion(now.getCurrent());
	//System.out.println("doble");
	State2 possible = temp.changeState2((State2) now);
	if (possible != null)
	    now = possible;
	repaint();
    }

    public void solve () {
	//if (!now.getCurrent().equals(table[0][0])){
	//  now.getCurrent().change();
	//now = new State(table[0][0]);
	//  table[0][0].changeBeenHere();
	//  table[0][0].change();
	//}
	//for (int i = 0; i < table.length; i++){
	//  for (int  j  = 0; j < table.length; j++){
	//if (i == j && i == 0){
	///    
	//table[i][j].resetHere();
		//t//able[i][j].resetBeenHere();
		
	now = SecondMaze.getStart();
	now.getCurrent().change();
	Solver2 willSolve = new Solver2(now, this);
	willSolve.solve();
	init();
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