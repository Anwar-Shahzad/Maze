import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;


public class SolverButton extends JButton implements ActionListener {

    private MazeFrame frame;
    

    public MazeFrame getFrame () {
	return frame;
    }

    public void setFrame (MazeFrame frame) {
	this.frame = frame;
    }

    public SolverButton (String text, MazeFrame frame) {
	super(text);
	this.addActionListener(this);
	//this.frame = frame;
	this.frame = frame;

    }

    public void paintComponent (Graphics g) {
	super.paintComponent(g);
    }

    public void beenHere () {
	frame.solve();
    }
	

    public void actionPerformed (ActionEvent e) {

	beenHere();
    }

}