import java.awt.Color;
import java.awt.Graphics;

/**
 * Class Pipes of game "BirdyFlap"
 * 
 * @author Graca
 *
 */
public class Pipes {
	private int x;
	private int y;
	private int width;
	private int height;
	private int speed = 1;

	/**
	 * Constructor of object Pipes
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Pipes(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	/**
	 * Getter of value x of object Pipes
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * Getter of value y of object Pipes
	 * @return
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Method of drawing object Pipes
	 * @param g
	 */
	public void draw(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(x, y, width, height);
		g.fillRect(x, height + 125, width, height + 300);
	}

	/**
	 * Method which moves object Pipes on GUI windoe
	 */
	public void move() {
		this.x -= speed;
	}

	/**
	 * Method checks if object Bird has colided with object Pipe in GUI window
	 * for upper pipes
	 * @param bird
	 * @return
	 */
	public boolean collision(Bird bird) {
		for (int i = this.x; i < x + width; i++) {
			for (int j = this.y; j < height; j++) {
				if (i == bird.getX() + bird.getWidth() && j == bird.getY()) {
					return true;
				}
			}

		}
		return false;
	}

	/**
	 * Method checks if object Bird has colided with object Pipe in GUI window
	 * for lower pipes
	 * @param bird
	 * @return
	 */
	public boolean collisionDown(Bird bird) {
		for (int i = this.x; i < x + width; i++) {
			for (int j = height + 125; j < height + 300; j++) {
				if (i == bird.getX() + bird.getWidth()
						&& j == bird.getY() + bird.getHeight()) {
					return true;
				}
			}

		}
		return false;
	}

}
