import java.awt.Color;
import java.awt.Graphics;

/**
 * Class Bird of game "BirdyFlap"
 * 
 * @author Graca
 *
 */
public class Bird {
	
	private int x;
	private int y;
	private int height;
	private int width;
	private Color color;
	
	/**
	 * Constructor of object Bird with five parameters
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param color
	 */
	public Bird(int x, int y, int width, int height, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	/**
	 * Method of drawing object Bird
	 * @param g
	 */
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, width, height);
	}
	
	/**
	 * Method checks if game is ended if object Bird went beyond limits
	 * @return
	 */
	public boolean isEnd() {
		if (this.y <= 0 || this.y >= 630 - height) {
			return true;
		}
		return false;
	}
	
	/**
	 * Getter of value height of object Bird
	 * @return
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Getter of value width of object Bird
	 * @return
	 */
	public int getWidth() {
		return width;
	}	

	/**
	 * Getter of value x of object Bird
	 * @return
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Getter of value y of object Bird
	 * @return
	 */
	public int getY() {
		return y;
	}

	/**
	 * Setter of value y of object Bird
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

}
