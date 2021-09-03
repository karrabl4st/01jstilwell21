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
	
	

}
