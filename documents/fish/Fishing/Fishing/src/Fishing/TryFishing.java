package Fishing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TryFishing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryFishing frame = new TryFishing();
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
	public TryFishing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 204));
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Fishing = new JButton("³¬½ÃÇÏ±â");
		Fishing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Fishing.setForeground(new Color(255, 102, 255));
		Fishing.setBackground(new Color(255, 204, 102));
		Fishing.setBounds(199, 374, 177, 80);
		contentPane.add(Fishing);
		setVisible(true);
	}

}
