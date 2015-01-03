

import java.awt.Color;
import java.awt.Graphics;

public class Pipes {
	private int x;
	private int y;
	private int width;
	private int height;
	private int speed = 1;
	
	public Pipes(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, width, height);
		g.fillRect(x, height + 125, width, height + 300);
	}
	
	public void move() {
		this.x -= speed;
	}
	
	public boolean collision(Bird bird) {
		for (int i = this.x; i < x + width; i++) {
			for (int j = this.y; j < height; j++) {
				if (i  == bird.getX()+bird.getWidth() && j == bird.getY()) {
					return true;
				}
			}
					
		}
		return false;
	}
	
	public boolean collisionDown(Bird bird) {
		for (int i = this.x; i < x + width; i++) {
			for (int j = height + 125; j < height + 300; j++) {
				if (i  == bird.getX()+bird.getWidth() && j == bird.getY()+bird.getHeight()) {
					return true;
				}
			}
					
		}
		return false;
	}

}
