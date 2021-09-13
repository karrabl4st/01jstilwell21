import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

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
		int nx2 = (int) (sx - len * Math.cos(sAngle));
		int ny = (int) (sy - len * Math.sin(sAngle));
		
		int max = 6;
		int min = 4;
		double ran1 = (Math.random() * (max - min)) + min;
		double ran2 = (Math.random() * (max - min)) + min;
		
		Graphics2D g2 = (Graphics2D) g;
		BasicStroke st = new BasicStroke(strokeWeight);
		g2.setStroke(st);
		g2.drawLine(sx, sy, nx, ny);
			
		if (segsRemaining > 1) {
			
			if (segsRemaining < 4) {
				
				drawLeaf(g, sx, sy, sAngle);
				
			}
			
			segsRemaining--;
			drawTree(g, nx, ny, sAngle + Math.PI/ran1, segsRemaining);
			drawTree(g, nx, ny, sAngle - Math.PI/ran2, segsRemaining);
			
		}
		
	}
	
	private void drawLeaf(Graphics g, int sx, int sy, double theta) {
		
		
		
	}
	
	private int branchLength(int segsRemaining) {
		
		int max = segsRemaining * 15;
		int min = segsRemaining * 13;
		int branchLength = (int) ((Math.random() * (max - min)) + min);
		
		return branchLength;
		
	}

}
