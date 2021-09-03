import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;


public class TreeFrame extends JFrame {
	
	static int segment = 0;
	
	public TreeFrame(String title) {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(800,600));
        this.setBackground(Color.white);
        this.pack();
        
	}

	/* paint method should first create initial branch
	 * call itself, realize that segment != 0
	 * and use a formula in order to find the second x, y coordinates
	 * afterwards, set first x, y coordinates as second
	 * then call itself if segment is less than wantedSegments
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (segment == 0) {
				
		} else {
		}
		segment++;
//		if (segment < maxSegments) {
//			paint(g);
//		}
	}	

}
