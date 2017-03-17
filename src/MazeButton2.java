import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MazeButton2 extends MazeButton implements ActionListener {
	
    private int number;
    private MazeButton2 current;
    private MazeButton2[][] table2;
    private MazeFrame2 frame2;
    private int row, col;
    

    private Vector<Transition2> transitions2;

    private boolean beenHere;
    private boolean here;

    public MazeFrame getFrame () {
	return frame2;
    }

    public void setFrame (MazeFrame2 frame){
	frame2 = frame;
    }

    public MazeButton2 (String text) {
    	
    	super(text);
    	//this.setFont(new Font("Arial", Font.PLAIN, 1));
	this.addActionListener(this);
	if (!text.equals("GOAL"))
	    number = Integer.parseInt(text);
	else
	    number = 0;
	transitions2 = new Vector<Transition2>();
	beenHere = false;
	here = false;
	
    }

    public Vector<Transition2> getTrans2 () {
	return transitions2;
    }

    public void setTable(MazeButton2[][] table){
	this.table2 = table;
    }

    public MazeButton2[][] getTable() {
	return table2;
    }

    public int getRow () {
	return row;
    }

    public int getCol () {
	return col;
    }

    public void setRow (int r) {
	row = r;
    }

    public void setCol (int c) {
	col = c;
    }
			  

    public void changeNum (int num) {
	number = num;
    }

    public void resetHere () {
	here = false;
    }

    public void resetBeenHere() {
	beenHere = false;
    }

    public int getNum () {
	return number;
    }

    public void setCurrent (MazeButton2 x){
	current = x;
    }

    public MazeButton2 getCurrent (){
	return current;
    }

    public void change() {
	if (here == false) 
	    here = true;
	else
	    here = false;
    }

    public String getStrBeenHere () {
	return "" + beenHere;
    }

    public boolean getBeenHere () {
	return beenHere;
    }

    public void changeBeenHere () {
	beenHere = true;
    }
    
    
    public void paintComponent(Graphics g) {

	super.paintComponent(g);
	/*
	g.setColor(Color.GREEN);
	if (here == true) 
	    g.fillOval(25,50, 50, 50);
	    */
	if (here == true){
		setBackground(Color.GREEN);
		setOpaque(true);
	}
	else {
		setBackground(null);
		
	}
    }

	public void beenHere() {
	    Transition2 temp = new Transition2(this);
	    frame2.spot2(temp);
	}
	
	public void actionPerformed(ActionEvent e) {
		beenHere();
	}
	
}
