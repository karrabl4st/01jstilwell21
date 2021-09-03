import java.awt.Graphics;

import javax.swing.JFrame;

public class TreeFrame extends JFrame {
	
	int[] offsetDegree = new int[2];
	int branchLength;
	int wantedSegments;
	static int segment = 0;
	
	public TreeFrame (String title, int[] offsetDegree, int branchLength, int wantedSegments) {
		
		super(title);
		this.branchLength = branchLength;
		this.wantedSegments = wantedSegments;
		
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
		if (segment < wantedSegments) {
			paint(g);
		}
	}	

}
