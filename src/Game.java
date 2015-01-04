import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Class Game of game Birdy Flap
 * 
 * @author Graca
 *
 */
public class Game extends JPanel implements ActionListener {

	private int speed = 1;
	private int ACCELERATION = 1;
	private Bird flappy;
	private Pipes[] pipes;
	private Timer t;
	private static int score = 0;
	private JLabel label;

	/**
	 * Constructor of object Game
	 */
	public Game() {
		label = new JLabel("Your score is: " + score);
		add(label);
		setBackground(new Color(186, 223, 255));
		flappy = new Bird(50, 50, 35, 25, Color.YELLOW);
		Pipes pipe1 = new Pipes(500, 0, 100, (int) (Math.random() * 400 + 100));
		Pipes pipe2 = new Pipes(750, 0, 100, (int) (Math.random() * 400 + 100));
		Pipes pipe3 = new Pipes(1000, 0, 100, (int) (Math.random() * 400 + 100));
		pipes = new Pipes[] { pipe1, pipe2, pipe3 };
		t = new Timer(1000 / 60, this);
		t.start();

		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				speed = -9;
			}
		});

	}

	/**
	 * Method which paints components on GUI window
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		flappy.draw(g);
		for (Pipes p : pipes) {
			p.draw(g);
		}

		g.setColor(Color.GREEN);
		g.fillRect(0, getHeight() - 70, getWidth(), 75);
	}

	/**
	 * Method does multiple calculations and evaluations
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		flappy.setY(flappy.getY() + speed);
		speed += ACCELERATION;

		for (Pipes p : pipes) {
			p.move();
			if (p.collision(flappy) == true) {
				t.stop();
				new End("Game Over!");
				return;
			}
			if (p.collisionDown(flappy) == true) {
				t.stop();
				new End("Game Over!");
				return;
			}

			if (p.getX() == -50) {
				score++;
				label.setText("Your score is: " + score);
			}
			if (p.getX() <= -100) {
				p.setX(650);
			}
		}

		repaint();

		if (flappy.isEnd() == true) {
			t.stop();
			new End("Game Over!");
			return;
		}

	}

	/**
	 * Getter of value score
	 * @return
	 */
	public static int getScore() {
		return score;
	}

}
