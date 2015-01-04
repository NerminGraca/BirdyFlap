import javax.swing.JFrame;

/**
 * Code for my version of game Flappy Bird
 * 
 * @author Graca Nermin
 *
 */
public class Play {

	public static void main(String[] args) {

		Game frame = new Game();
		JFrame window = new JFrame();
		window.setSize(500, 700);
		window.setLocation(50, 50);
		window.setContentPane(frame);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
