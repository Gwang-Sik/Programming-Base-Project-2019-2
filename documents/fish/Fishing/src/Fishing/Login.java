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
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField IDtxt;
	private JPasswordField PWtxt;

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
		setType(Type.UTILITY);
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JButton Login = new JButton("로그인");
		Login.setBackground(new Color(255, 248, 220));
		Login.setForeground(new Color(65, 105, 225));
		Login.setFont(new Font("a도깨비", Font.PLAIN, 34));
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((IDtxt.getText().equals("test")) && (PWtxt.getText().equals("123456"))) {
					System.out.println("OK");
					dispose();
					new GameLobby();
				}
			}
		});
		Login.setBounds(306, 69, 112, 91);
		contentPane.add(Login);
		
		JLabel ID = new JLabel("아이디");
		ID.setForeground(Color.BLACK);
		ID.setHorizontalAlignment(SwingConstants.CENTER);
		ID.setFont(new Font("a옛날사진관4", Font.PLAIN, 17));
		ID.setBounds(14, 77, 70, 20);
		contentPane.add(ID);
		
		JLabel PW = new JLabel("비밀번호");
		PW.setForeground(Color.BLACK);
		PW.setHorizontalAlignment(SwingConstants.CENTER);
		PW.setFont(new Font("a옛날사진관4", Font.PLAIN, 17));
		PW.setBounds(14, 134, 70, 20);
		contentPane.add(PW);
		
		IDtxt = new JTextField();
		IDtxt.setHorizontalAlignment(SwingConstants.LEFT);
		IDtxt.setFont(new Font("a신라의달밤B", Font.PLAIN, 15));
		IDtxt.setBackground(new Color(102, 205, 170));
		IDtxt.setBounds(101, 69, 191, 31);
		contentPane.add(IDtxt);
		IDtxt.setColumns(10);
		
		PWtxt = new JPasswordField();
		PWtxt.setBackground(new Color(102, 205, 170));
		PWtxt.setBounds(101, 129, 191, 31);
		contentPane.add(PWtxt);
	}
}
