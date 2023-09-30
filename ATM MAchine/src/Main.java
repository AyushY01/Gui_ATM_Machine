import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JButton button1 = new JButton("Withdraw");
		JButton button2 = new JButton("Deposit");
		JButton button3 = new JButton("Check Balance");
		
		ImageIcon image = new ImageIcon("atm.jpg");
		ImageIcon image2 = new ImageIcon("images (1).png");

		frame.setIconImage(image.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("ABI ATM");
		frame.setSize(600, 600);
		frame.getContentPane().setBackground(new Color(153, 204, 255));
		frame.setLayout(null);

		label.setForeground(new Color(0x000099));
		label.setText("Welcome to ABI ATM");
		label.setBounds(120, 1, 700, 100);// text
		label.setFont(new Font("Arial", Font.BOLD, 24));
		label.setIcon(image2);// inside image
		label.setBounds(150, 50, 300, 200);// image
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setIconTextGap(-1);

		button1.setBounds(50, 300, 180, 70);
		button1.setFont(new Font("Arial", Font.PLAIN, 20));
		button2.setFont(new Font("Arial", Font.PLAIN, 20));
		button3.setFont(new Font("Arial", Font.PLAIN, 20));

		button2.setBounds(370, 300, 180, 70);
		button3.setBounds(200, 430, 180, 70);

		frame.add(label);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setVisible(true);

		class button_one implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (e.getSource() == button1) {
					frame.dispose();
					Withdraw_Window window1 = new Withdraw_Window();
				}

			}
		}
		class button_two implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (e.getSource() == button2) {
					Deposit_Window dw = new Deposit_Window();
				}

			}
		}
		class button_three implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == button3) {
					frame.dispose();

					Check_Balance cb = new Check_Balance();
				}

			}
		}

		ActionListener listener1 = new button_one();
		button1.addActionListener(listener1);
		ActionListener listener2 = new button_two();
		button2.addActionListener(listener2);
		ActionListener listener3 = new button_three();
		button3.addActionListener(listener3);

	}
}
