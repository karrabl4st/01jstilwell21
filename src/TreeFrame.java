import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;


public class TreeFrame extends JFrame {
	
	static int segment = 0;
	
	public TreeFrame(String title) {
		
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(800,600));
        this.setBackground(Color.white);
        this.pack();
        
	}

	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		Tree t = new Tree(Math.PI/2, 5);
		t.drawOn(g, 400, 550, 20.0);
		
	}

}
