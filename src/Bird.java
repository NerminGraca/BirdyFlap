import java.awt.Color;
import java.awt.Graphics;


public class Bird {
	
	private int x;
	private int y;
	private int height;
	private int width;
	private Color color;
	
	public Bird(int x, int y, int width, int height, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
	}
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public boolean isEnd() {
		if (this.y <= 0 || this.y >= 630 - height) {
			return true;
		}
		return false;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
