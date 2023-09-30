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

public class Withdraw_Window implements ActionListener {
	JLabel label = new JLabel();
	JFrame frame = new JFrame();

	JButton[] button = new JButton[10];
	JButton benter, bclear;

	JPanel p = new JPanel();

	JTextField text = new JTextField();
	JTextField text2 = new JTextField();

	Border blackline = BorderFactory.createLineBorder(Color.black);
	double num1 = 0, result = 0;

	// ------------------------------------------------------------------------------------------
	Withdraw_Window() {
		ImageIcon image = new ImageIcon("atm.jpg");

		label.setBounds(70, 10, 500, 150);
		label.setFont(new Font(null, Font.PLAIN, 30));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setTitle("ABI ATM");
		frame.setSize(600, 600);
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setLayout(null);
		frame.add(label);
		frame.setIconImage(image.getImage());
		text.setBounds(150, 200, 300, 50);
		text.setEditable(false);

		label.setText("Enter the Amount You want to Withdraw:");
		label.setFont(new Font("ARIAL", Font.BOLD, 24));

		// create number buttons
		for (int i = 0; i < 10; i++) {
			button[i] = new JButton(String.valueOf(i));
			button[i].addActionListener(this);
			button[i].setFocusable(false);
		}

		benter = new JButton("Enter");
		bclear = new JButton("Clear");

		p.add(button[0]);
		p.add(button[1]);
		p.add(button[2]);
		p.add(button[3]);
		p.add(button[4]);
		p.add(button[5]);
		p.add(button[6]);
		p.add(button[7]);
		p.add(button[8]);
		p.add(button[9]);
		p.add(benter);
		p.add(bclear);
		bclear.addActionListener(this);
		benter.addActionListener(this);

		p.setBounds(140, 300, 320, 200);
		p.setBackground(Color.BLACK);
		p.setLayout(new GridLayout(4, 4, 10, 10));
		p.setBorder(blackline);
		frame.add(p);

		frame.add(text);

		frame.setVisible(true);

	}

	// --------------------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == button[i]) {
				text.setText(text.getText().concat(String.valueOf(i)));
			}
			if (e.getSource() == benter) {
				num1 = Double.parseDouble(text.getText());
				result = 1000 - num1;
				if (result <= 1000 && result >= 0) {
					dialog_window();
				} else {
					dialog_window2();
				}

			}

			if (e.getSource() == bclear) {
				text.setText("");

			}

		}
	}

	private void dialog_window2() {
		// TODO Auto-generated method stub
		JFrame frame2 = new JFrame();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JPanel p2 = new JPanel();
		frame2.setTitle("ABI ATM");
		frame2.setSize(600, 600);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setBackground(new Color(153, 204, 255));
		frame2.setLayout(null);
		label2.setText("Transaction UnSuccessfull !");

		label2.setBounds(110, 26, 500, 150);
		label2.setFont(new Font(null, Font.BOLD, 30));

		label3.setText("Your Account has insufficient balance :");
		label3.setBounds(100, 100, 500, 150);
		label3.setFont(new Font(null, Font.BOLD, 20));

		p2.setBounds(100, 200, 450, 50);

		frame2.add(p2);
		p2.add(label3);
		frame2.add(label2);
		frame2.setVisible(true);

	}

	private void dialog_window() {
		// TODO Auto-generated method stub
		JFrame frame2 = new JFrame();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();

		JPanel p2 = new JPanel();
		frame2.setTitle("ABI ATM");
		frame2.setSize(600, 600);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setBackground(new Color(153, 204, 255));
		frame2.setLayout(null);
		label2.setText("Transaction Successfull !");

		label2.setBounds(110, 26, 500, 150);
		label2.setFont(new Font(null, Font.BOLD, 30));

		label3.setText("New Balance");

		label3.setBounds(70, 10, 500, 150);
		label3.setFont(new Font(null, Font.BOLD, 30));

		text2.setBounds(150, 100, 300, 50);
		text2.setFont(new Font(null, Font.BOLD, 30));
		text2.setEditable(false);
		p2.setLayout(new GridLayout(0, 1));

		p2.setBounds(140, 200, 220, 100);
		text2.setText(String.valueOf(result));

		p2.add(label3);
		p2.add(text2);
		frame2.add(p2);
		frame2.add(label2);
		frame2.setVisible(true);

	}
}

//-----------------------------------------------------------------------------------------------	
