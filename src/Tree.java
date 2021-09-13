import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.Color;

public class Tree {
	
	private double splitAngle;
	private int maxSegments;
	
	Tree(double splitAngle, int maxSegments) {
		
		this.splitAngle = splitAngle;
		this.maxSegments = maxSegments;
		
	}
	
	public void setSplitAngle(double splitAngle) {
		
		this.splitAngle = splitAngle;
		
	}
	
	public void setSegments(int maxSegments) {
		
		this.maxSegments = maxSegments;
		
	}
	
	public double getSplitAngle() {
		
		return splitAngle;
		
	}
	
	public int getSegments() {
		
		return maxSegments;
		
	}
	
	public void drawOn(Graphics g, int x, int y) {
		
		drawTree(g, x, y, splitAngle, maxSegments);

		
	}
	
	private void drawTree(Graphics g, int sx, int sy, double sAngle, int segsRemaining) {
		
		int strokeWeight = segsRemaining;
		
		int len = branchLength(segsRemaining);
		int nx = (int) (sx + len * Math.cos(sAngle));
		int ny = (int) (sy - len * Math.sin(sAngle));
		
		int max = 6;
		int min = 4;
		double ran1 = (Math.random() * (max - min)) + min;
		double ran2 = (Math.random() * (max - min)) + min;
		
		Graphics2D g2 = (Graphics2D) g;
		BasicStroke st = new BasicStroke(strokeWeight);
		g2.setStroke(st);
		g2.drawLine(sx, sy, nx, ny);
		
		Graphics2D g3 = (Graphics2D) g;
			
		if (segsRemaining > 1) {
			
			if (segsRemaining < 4) {
				
				drawLeaf(g3, sx, sy, sAngle);
				
			}
			
			segsRemaining--;
			drawTree(g, nx, ny, sAngle + Math.PI/ran1, segsRemaining);
			drawTree(g, nx, ny, sAngle - Math.PI/ran2, segsRemaining);
			
		}
		
	}
	
	private void drawLeaf(Graphics2D g, int sx, int sy, double theta) {
		
		AffineTransform xf = g.getTransform(); // safe affine transform state
		g.translate(sx, sy); // move the coordinate origin to x,y
		g.rotate(theta); // and rotate to align with the current growth orientation angle
		
		g.setColor(Color.green);
		g.fillOval(0, 0, 10, 5);
		g.fillOval(0, 0, 10, 5);
		
		g.setColor(Color.red);
		g.fillOval(0, 0, 5, 5);
		
		g.setColor(Color.black);
		g.setTransform(xf); // reset affine transform back to original state
		
	}
	
	private int branchLength(int segsRemaining) {
		
		int max = (int)(Math.pow(segsRemaining, 2.5));
		int min = (int)(Math.pow(segsRemaining, 2));
		int branchLength = (int) ((Math.random() * (max - min)) + min);
		
		return branchLength;
		
	}

}
