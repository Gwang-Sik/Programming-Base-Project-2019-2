package Fishing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class IceBox extends JFrame {

	private JPanel contentPane;
	TryFishing tf = new TryFishing();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IceBox frame = new IceBox();
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
	public IceBox() {
		setTitle("내 아이스박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane IceBox = new JTabbedPane(JTabbedPane.TOP);
		IceBox.setFont(new Font("a바보온달", Font.PLAIN, 19));
		contentPane.add(IceBox);
		
		JPanel Fish_Val = new JPanel();
		Fish_Val.setBackground(new Color(135, 206, 250));
		IceBox.addTab("Box", null, Fish_Val, null);
		Fish_Val.setLayout(null);
		
		JLabel Fish_Image = new JLabel("New label");
		Fish_Image.setBounds(0, 0, 368, 276);
		Fish_Image.setHorizontalAlignment(SwingConstants.CENTER);
		Fish_Val.add(Fish_Image);
		
		JLabel Total_cost = new JLabel("총가격");
		Total_cost.setHorizontalAlignment(SwingConstants.CENTER);
		Total_cost.setFont(new Font("a해바라기", Font.PLAIN, 20));
		Total_cost.setBounds(382, 89, 104, 18);
		Fish_Val.add(Total_cost);
		
		JLabel Fish_Name = new JLabel("이름");
		Fish_Name.setHorizontalAlignment(SwingConstants.CENTER);
		Fish_Name.setFont(new Font("a해바라기", Font.PLAIN, 20));
		Fish_Name.setBounds(382, 31, 104, 18);
		Fish_Val.add(Fish_Name);
		
		
		JLabel Name_Field = new JLabel("생선이름");
		Name_Field.setHorizontalAlignment(SwingConstants.LEFT);
		Name_Field.setFont(new Font("a해바라기", Font.PLAIN, 20));
		Name_Field.setBounds(500, 31, 203, 18);
		Fish_Val.add(Name_Field);
		
		JLabel Cost_Field = new JLabel("정산금");
		Cost_Field.setHorizontalAlignment(SwingConstants.LEFT);
		Cost_Field.setFont(new Font("a해바라기", Font.PLAIN, 20));
		Cost_Field.setBounds(500, 83, 203, 31);
		Fish_Val.add(Cost_Field);
		
		JButton Sale = new JButton("판매");
		Sale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Sale.setBackground(new Color(123, 104, 238));
		Sale.setFont(new Font("a해바라기", Font.PLAIN, 24));
		Sale.setBounds(500, 141, 203, 123);
		Fish_Val.add(Sale);
		
		JButton Back_Lobby = new JButton("돌아가기");
		Back_Lobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new GameLobby();
			}
		});
		Back_Lobby.setFont(new Font("a스피드", Font.PLAIN, 15));
		Back_Lobby.setBackground(new Color(0, 255, 127));
		Back_Lobby.setBounds(382, 217, 104, 47);
		Fish_Val.add(Back_Lobby);
		
		JButton Sum = new JButton("정산하기");
		Sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cost_Field.setText(tf.profit);
			}
		});
		Sum.setFont(new Font("a스피드", Font.PLAIN, 15));
		Sum.setBackground(new Color(0, 255, 127));
		Sum.setBounds(382, 141, 104, 47);
		Fish_Val.add(Sum);
		setVisible(true);
	}
}
