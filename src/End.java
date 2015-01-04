import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class End extends JFrame {

	/**
	 * Constructor of object End
	 * @param string
	 */
	public End(String string) {
		setSize(175, 150);
		setLocation(100, 100);
		setResizable(false);
		JPanel panel = new JPanel(new BorderLayout());
		setContentPane(panel);
		JTextArea txt = new JTextArea();
		txt.setText("GAME OVER\nYour score is: " + Game.getScore());
		txt.setEditable(false);
		panel.add(txt, BorderLayout.NORTH);
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel.add(button, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
