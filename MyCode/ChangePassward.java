package GS;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import User.User;
import javafx.stage.WindowBuilder;

public class ChangePassward {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassward window = new ChangePassward();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChangePassward() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		User uu = new User(0);
		String originalPassword = uu.getPassword();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8ACB\u8F38\u5165\u820A\u5BC6\u78BC");
		lblNewLabel.setBounds(44, 33, 112, 19);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(200, 30, 188, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u8ACB\u8F38\u5165\u65B0\u5BC6\u78BC");
		lblNewLabel_1.setBounds(44, 88, 112, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 85, 188, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u8ACB\u518D\u6B21\u8F38\u5165\u65B0\u5BC6\u78BC");
		lblNewLabel_2.setBounds(44, 146, 127, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 140, 188, 25);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("\u78BA\u8A8D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_1 != null && textField_2 != null && textField_1.getText().equals(textField_2.getText()) && textField.equals(originalPassword)) {
					String newPassword = textField_1.getText();
					uu.changePassword(newPassword);
				}
				else {
					System.out.print("輸入錯誤，請重新輸入");
				}
			}
		});
		btnNewButton.setBounds(166, 195, 99, 27);
		frame.getContentPane().add(btnNewButton);
	}
}
