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
		setTitle("\uAC8C\uC784 \uC785\uC7A5 \uB85C\uBE44");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 5, 10, 10));
		
		JButton Fishing = new JButton("�����ϱ�");
		Fishing.setFont(new Font("������� Light", Font.PLAIN, 20));
		Fishing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new TryFishing();
			}
		});
		contentPane.add(Fishing);
		
		JButton MyItem = new JButton("�� ���ô�");
		MyItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Inventory();
			}
		});
		MyItem.setFont(new Font("������� Light", Font.PLAIN, 20));
		contentPane.add(MyItem);
		
		JButton MyBate = new JButton("�̳� ����");
		MyBate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Bate();
			}
		});
		MyBate.setFont(new Font("������� Light", Font.PLAIN, 20));
		contentPane.add(MyBate);
		
		JButton IceBox = new JButton("���̽��ڽ�");
		IceBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new IceBox();
			}
		});
		IceBox.setFont(new Font("������� Light", Font.PLAIN, 20));
		contentPane.add(IceBox);
		
		setVisible(true);
	}

}
