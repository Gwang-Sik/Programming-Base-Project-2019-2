package Fishing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.ImageIcon;

public class GameLobby extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameLobby GameLobby = new GameLobby();
					GameLobby.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameLobby() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("°ÔÀÓ ·Îºñ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 10, 10));
		
		JButton Fishing = new JButton("³¬½ÃÇÏ±â");
		Fishing.setBackground(new Color(255, 239, 213));
		Fishing.setFont(new Font("aµµ±úºñ", Font.PLAIN, 40));
		Fishing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new TryFishing();
			}
		});
		contentPane.add(Fishing);
		
		JButton MyItem = new JButton("³» ³¬½Ã´ë");
		MyItem.setBackground(new Color(255, 239, 213));
		MyItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Inventory();
			}
		});
		MyItem.setFont(new Font("aµµ±úºñ", Font.PLAIN, 40));
		contentPane.add(MyItem);
		
		JButton IceBox = new JButton("¾ÆÀÌ½º¹Ú½º");
		IceBox.setBackground(new Color(255, 239, 213));
		IceBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new IceBox();
			}
		});
		IceBox.setFont(new Font("aµµ±úºñ", Font.PLAIN, 40));
		contentPane.add(IceBox);
		
		JButton Logout = new JButton("·Î±×¾Æ¿ô");
		Logout.setBackground(new Color(255, 239, 213));
		Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Login();
			}
		});
		Logout.setFont(new Font("aµµ±úºñ", Font.PLAIN, 40));
		contentPane.add(Logout);
		
		setVisible(true);
	}

}
