import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MazeButton extends JButton implements ActionListener {

    protected int number;
    protected MazeButton current;
    protected MazeButton[][] table;
    protected MazeFrame frame2;
    protected int row, col;
    private Vector<Transition> transitions;
    private boolean beenHere;
    private boolean here;
    
    public MazeFrame getFrame () {
	return frame2;
    }
    
    public void setFrame (MazeFrame frame){
	frame2 = frame;
    }
    
    public MazeButton (String text) {
	
    	super(text);
	
	this.addActionListener(this);
	if (!text.equals("GOAL"))
	    number = Integer.parseInt(text);
	else
	    number = 0;
	transitions = new Vector<Transition>();
	beenHere = false;
	here = false;	
    }

    public Vector<Transition> getTrans () {
	return transitions;
    }

    public void setTable(MazeButton[][] table){
	this.table = table;
    }

    public MazeButton[][] getTable() {
	return table;
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

    public void setCurrent (MazeButton x){
	current = x;
    }

    public MazeButton getCurrent (){
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
	beenHere = true;//all start as false, can only become true
    }
 
    public void paintComponent(Graphics g) {

	super.paintComponent(g);
	g.setColor(Color.GREEN);
	if (here == true) 
	    g.fillOval(25,50, 50, 50);
    }
    
    public void beenHere() {
	Transition temp = new Transition(this);
	frame2.spot(temp);
    }
    
    public void actionPerformed(ActionEvent e) {
	beenHere();
    }
    
}


