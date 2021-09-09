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
		
		if (segsRemaining > 0) {
			
			int len = segsRemaining * 10;
			int nx = (int) (sx + len * Math.cos(sAngle));
			int ny = (int) (sy + len * Math.sin(sAngle));
			
			g.drawLine(sx, sy, nx, ny);
			
			if (segsRemaining < 4) {
				
				//0 is placeholder
				drawLeaf(g, sx, sy, 0);
				
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
