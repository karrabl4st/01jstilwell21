import java.awt.Graphics;

public class Branch {
	
	private int[] x = new int[2];
	private int[] y = new int[2];
	
	public Branch (int[] x, int[] y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void setFirstVals(int x, int y) {
		
		this.x[0] = x;
		this.y[0] = y;
		
	}
	
	public void setSecondVals(int x, int y) {
		
		this.x[1] = x;
		this.x[2] = y;
		
	}
	
	public void setX(int[] x) { 
		
		this.x = x;
		
	}
	
	public void setY(int[] y) {
		
		this.y = y;
		
	}
	
	public void setAll(int[] x, int[] y) {
		
		this.x = x;
		this.y = y;
		
	}

	public int[] getX() {
		
		return x;
		
	}
	
	public int[] getY() {
		
		return y;
		
	}
	
	public int[][] getAll() {
		
		int[][] all = {x, y};
		return all;
		
	}
	
	public void drawBranch(Graphics g) {
		
		g.drawLine(x[0], y[0], x[1], y[1]);
		
	}

}
