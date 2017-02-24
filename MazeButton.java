import java.awt.Color;
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
    

    private Vector<Transistion> transistions;

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
	transistions = new Vector<Transistion>();
	//this.frame2 = frame2;
	beenHere = false;
	here = false;
	
    }

    public Vector<Transistion> getTrans () {
	return transistions;
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
	//else
	//  g.clearRect(0,0,40,46);
		
		
	
		
	}

	public void beenHere() {
	    //for (int i = 0; i < transistions.length; i++) {
		//	if (current.equals(transistions[i])){
		    //	current.change();
			//this.change();
			//  }
		//}
	    //for (int i = 0; i < table.length; i++){
		//for (int j = 0; j < table[i].length; j++){
		    //t/able[i][j].setCurrent(this);
		    //}
		//}
	    //repaint();
		    
	    //c = Color.gray;
	    //ImageIcon x = new ImageIcon("/home/staff/jerager/public/cs112/classes/X.gif");
		//this.setIcon(x);
	    //c = Color.red;
	    //this.setEnabled(false);
	    Transistion temp = new Transistion(this);
	    frame2.spot(temp);
	    
		
	}
	
	public void actionPerformed(ActionEvent e) {
		beenHere();
		//repaint();
	}
	
}


//	g.fillPolygon(xPoints, yPoints, xPoints.length);


//int[] xPoints = new int[4];
	//int[] yPoints = new int[4];
       	//xPoints[0] = 50;
       	//yPoints[0] = 10;
	//xPoints[1] = 50;
	//yPoints[1] = 110;
	//xPoints[2] = 75;
       	//yPoints[2] = 10;
	//xPoints[3] = 75;
	//yPoints[3] = 110;
	//xPoints[0] = 50;
	//yPoints[0] = 60;
	//xPoints[1] = 75;
	//yPoints[1] = 10;
	//xPoints[2] = 100;
	//yPoints[2] = 60;
	//xPoints[3] = 75;
	//		//yPoints[3] = 110;
	//g.drawString("1", 50,50);
	//g.setColor(c);