import java.awt.Graphics;

import javax.swing.JFrame;

public class TreeFrame extends JFrame {
	
	static int offset = 0;
	
	@Override
	public void paint(Graphics g) {
		
		if (offset < 100) {
			if (offset == 0) {
				g.drawLine(0, 0, offset, offset);
			}
		}
		
	}

}
