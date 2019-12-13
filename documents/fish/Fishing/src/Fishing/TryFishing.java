package Fishing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import java.awt.Window.Type;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class TryFishing extends JFrame {

	private JPanel contentPane;
	int total;
	public String profit;
	JTextField CostField;
	private JTextField NameField;
	
	GetFish gf = new GetFish();
	ImageIcon Fish = gf.Fish();
	ImageIcon Ocean = gf.Ocean();
	 
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
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("세월을 낚는중....");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setForeground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Back = new JButton("돌아가기");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profit = Integer.toString(total);
				dispose();
				new GameLobby();
			}
		});
		Back.setFont(new Font("더페이스샵 잉크립퀴드체", Font.BOLD, 35));
		Back.setBackground(new Color(224, 255, 255));
		Back.setBorderPainted(false);
		Back.setBounds(364, 381, 185, 63);
		contentPane.add(Back);
		
		JLabel FishImage = new JLabel();
		FishImage.setIcon(Ocean);
		FishImage.setBounds(145, 60, 260, 140);
		contentPane.add(FishImage);
		FishImage.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton Fishing = new JButton("낚시하기");
		Fishing.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int count = 0;
				CostField.setText(gf.FishCost(count));
				total += gf.Reverse(CostField.getText(),count);
				count ++;
			}
		});
		Fishing.setBounds(14, 381, 185, 63);
		contentPane.add(Fishing);
		Fishing.setFont(new Font("더페이스샵 잉크립퀴드체", Font.BOLD, 35));
		Fishing.setBackground(new Color(224, 255, 255));
		Fishing.setBorderPainted(false);
		
		JPanel FishPoint = new JPanel();
		FishPoint.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		FishPoint.setBackground(new Color(224, 255, 255));
		FishPoint.setBounds(80, 35, 380, 280);
		contentPane.add(FishPoint);
		FishPoint.setLayout(null);
		
		NameField = new JTextField();
		NameField.setFont(new Font("a스피드", Font.PLAIN, 15));
		NameField.setEditable(false);
		NameField.setColumns(10);
		NameField.setBounds(115, 205, 209, 24);
		FishPoint.add(NameField);
		
		CostField = new JTextField();
		CostField.setFont(new Font("a옛날사진관5", Font.PLAIN, 15));
		CostField.setEditable(false);
		CostField.setBounds(115, 244, 209, 24);
		FishPoint.add(CostField);
		CostField.setColumns(10);
		
		JLabel Name = new JLabel("이름");
		Name.setFont(new Font("a옛날사진관5", Font.PLAIN, 17));
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setBounds(14, 208, 62, 18);
		FishPoint.add(Name);
		
		JLabel Cost = new JLabel("가격");
		Cost.setFont(new Font("a옛날사진관5", Font.PLAIN, 17));
		Cost.setHorizontalAlignment(SwingConstants.CENTER);
		Cost.setBounds(14, 247, 62, 18);
		FishPoint.add(Cost);
		setVisible(true);
	}
}
