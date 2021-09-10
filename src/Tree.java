import java.awt.Graphics;

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
	
	public void drawOn(Graphics g, int x, int y, double angle) {
		
		g.drawLine(x, y, x, y - 100);
		
		drawTree(g, x, y - 100, angle, maxSegments);
		
	}
	
	private void drawTree(Graphics g, int sx, int sy, double sAngle, int segsRemaining) {
		
		
			
		int len = segsRemaining * 10;
		int nx = (int) (sx + len * Math.cos(sAngle));
		int nx2 = (int) (sx - len * Math.cos(sAngle));
		int ny = (int) (sy - len * Math.sin(sAngle));
			
		g.drawLine(sx, sy, nx, ny);
		g.drawLine(sx, sy, nx2, ny);
			
		if (segsRemaining > 1) {
			
			if (segsRemaining < 4) {
				
				//0 is placeholder
				drawLeaf(g, sx, sy, sAngle);
				
			}
			
			segsRemaining--;
			drawTree(g, nx, ny, sAngle, segsRemaining);
			
		}
		
	}
	
	private void drawLeaf(Graphics g, int sx, int sy, double theta) {
		
		
		
	}
	
	private int branchLength(int segsRemaining) {
		
		//0 is placeholder
		int branchLength = 0;
		
		return branchLength;
		
	}

}
