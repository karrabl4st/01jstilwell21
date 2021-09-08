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
		
		
		
	}
	
	private void drawTree(Graphics g, int sx, int sy, double sAngle, int segsRemaining) {
		
		if (segsRemaining > 0) {
			
			if (segsRemaining < 4) {
				
				//0 is placeholder
				drawLeaf(g, sx, sy, 0);
				
			}
			
			drawTree(g, sx, sy, sAngle, segsRemaining);
			
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
