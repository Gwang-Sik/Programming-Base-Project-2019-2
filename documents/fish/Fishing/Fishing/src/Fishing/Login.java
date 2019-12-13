package Fishing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField IDtxt;
	private JTextField PWtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("\uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("·Î±×ÀÎ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((IDtxt.getText().equals("test")) && (PWtxt.getText().equals("123456"))) {
					System.out.println("OK");
					dispose();
					new GameLobby();
				}
			}
		});
		btnNewButton.setBounds(281, 127, 97, 23);
		contentPane.add(btnNewButton);
		
		IDtxt = new JTextField();
		IDtxt.setBounds(101, 128, 168, 21);
		contentPane.add(IDtxt);
		IDtxt.setColumns(10);
		
		JLabel ID = new JLabel("ID");
		ID.setBounds(71, 131, 18, 15);
		contentPane.add(ID);
		
		JLabel PW = new JLabel("PW");
		PW.setBounds(71, 161, 18, 15);
		contentPane.add(PW);
		
		PWtxt = new JTextField();
		PWtxt.setBounds(101, 159, 168, 21);
		contentPane.add(PWtxt);
		PWtxt.setColumns(10);
	}
}
