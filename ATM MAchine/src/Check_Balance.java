import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Check_Balance {

	JLabel label = new JLabel();
	JLabel label2 = new JLabel("1000");

	JFrame frame = new JFrame();

	JPanel p = new JPanel();

	// ------------------------------------------------------------------------------------------
	Check_Balance() {
		ImageIcon image = new ImageIcon("atm.jpg");

		label.setBounds(100, 10, 500, 150);
		label.setFont(new Font(null, Font.PLAIN, 30));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setTitle("ABI ATM");
		frame.setSize(600, 600);
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setLayout(null);
		frame.add(label);
		frame.setIconImage(image.getImage());

		label.setText("Your Availabel Balance is: ");
		label.setFont(new Font("ARIAL", Font.BOLD, 24));

		label2.setBounds(140, 150, 200, 50);
		label2.setFont(new Font("ARIAL", Font.BOLD, 24));

		p.setBounds(140, 150, 200, 50);
		p.setBackground(Color.WHITE);

		frame.add(p);
		p.add(label2);

		frame.setVisible(true);

	}

}
