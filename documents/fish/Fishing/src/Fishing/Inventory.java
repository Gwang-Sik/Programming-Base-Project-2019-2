package Fishing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventory extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory frame = new Inventory();
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
	public Inventory() {
		setResizable(false);
		setTitle("내 낚시대");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{223, 138, 0};
		gbl_panel.rowHeights = new int[]{113, 59, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel Item_F_Image = new JLabel("OK");
		Item_F_Image.setHorizontalAlignment(SwingConstants.CENTER);
		Item_F_Image.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_F_Image = new GridBagConstraints();
		gbc_Item_F_Image.gridwidth = 2;
		gbc_Item_F_Image.fill = GridBagConstraints.VERTICAL;
		gbc_Item_F_Image.insets = new Insets(0, 0, 5, 5);
		gbc_Item_F_Image.gridx = 0;
		gbc_Item_F_Image.gridy = 0;
		panel.add(Item_F_Image, gbc_Item_F_Image);
		
		JLabel Item_F_Stat = new JLabel("OK");
		Item_F_Stat.setHorizontalAlignment(SwingConstants.CENTER);
		Item_F_Stat.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_F_Stat = new GridBagConstraints();
		gbc_Item_F_Stat.fill = GridBagConstraints.BOTH;
		gbc_Item_F_Stat.insets = new Insets(0, 0, 0, 5);
		gbc_Item_F_Stat.gridx = 0;
		gbc_Item_F_Stat.gridy = 1;
		panel.add(Item_F_Stat, gbc_Item_F_Stat);
		
		JButton Item_F_Use = new JButton("New button");
		Item_F_Use.setFont(new Font("a바보온달", Font.PLAIN, 17));
		Item_F_Use.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_Item_F_Use = new GridBagConstraints();
		gbc_Item_F_Use.anchor = GridBagConstraints.EAST;
		gbc_Item_F_Use.fill = GridBagConstraints.VERTICAL;
		gbc_Item_F_Use.gridx = 1;
		gbc_Item_F_Use.gridy = 1;
		panel.add(Item_F_Use, gbc_Item_F_Use);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{223, 138, 0};
		gbl_panel_1.rowHeights = new int[]{113, 59, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel Item_D_Image = new JLabel("OK");
		Item_D_Image.setHorizontalAlignment(SwingConstants.CENTER);
		Item_D_Image.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_D_Image = new GridBagConstraints();
		gbc_Item_D_Image.fill = GridBagConstraints.VERTICAL;
		gbc_Item_D_Image.gridwidth = 2;
		gbc_Item_D_Image.insets = new Insets(0, 0, 5, 0);
		gbc_Item_D_Image.gridx = 0;
		gbc_Item_D_Image.gridy = 0;
		panel_1.add(Item_D_Image, gbc_Item_D_Image);
		
		JLabel Item_D_Stat = new JLabel("OK");
		Item_D_Stat.setHorizontalAlignment(SwingConstants.CENTER);
		Item_D_Stat.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_D_Stat = new GridBagConstraints();
		gbc_Item_D_Stat.fill = GridBagConstraints.BOTH;
		gbc_Item_D_Stat.insets = new Insets(0, 0, 0, 5);
		gbc_Item_D_Stat.gridx = 0;
		gbc_Item_D_Stat.gridy = 1;
		panel_1.add(Item_D_Stat, gbc_Item_D_Stat);
		
		JButton Item_D_Use = new JButton("New button");
		Item_D_Use.setFont(new Font("a바보온달", Font.PLAIN, 17));
		GridBagConstraints gbc_Item_D_Use = new GridBagConstraints();
		gbc_Item_D_Use.anchor = GridBagConstraints.EAST;
		gbc_Item_D_Use.fill = GridBagConstraints.VERTICAL;
		gbc_Item_D_Use.gridx = 1;
		gbc_Item_D_Use.gridy = 1;
		panel_1.add(Item_D_Use, gbc_Item_D_Use);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{223, 138, 0};
		gbl_panel_2.rowHeights = new int[]{113, 59, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel Item_C_Image = new JLabel("OK");
		Item_C_Image.setHorizontalAlignment(SwingConstants.CENTER);
		Item_C_Image.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_C_Image = new GridBagConstraints();
		gbc_Item_C_Image.fill = GridBagConstraints.VERTICAL;
		gbc_Item_C_Image.gridwidth = 2;
		gbc_Item_C_Image.insets = new Insets(0, 0, 5, 0);
		gbc_Item_C_Image.gridx = 0;
		gbc_Item_C_Image.gridy = 0;
		panel_2.add(Item_C_Image, gbc_Item_C_Image);
		
		JLabel Item_C_Stat = new JLabel("OK");
		Item_C_Stat.setHorizontalAlignment(SwingConstants.CENTER);
		Item_C_Stat.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_C_Stat = new GridBagConstraints();
		gbc_Item_C_Stat.fill = GridBagConstraints.BOTH;
		gbc_Item_C_Stat.insets = new Insets(0, 0, 0, 5);
		gbc_Item_C_Stat.gridx = 0;
		gbc_Item_C_Stat.gridy = 1;
		panel_2.add(Item_C_Stat, gbc_Item_C_Stat);
		
		JButton Item_C_Use = new JButton("New button");
		Item_C_Use.setFont(new Font("a바보온달", Font.PLAIN, 17));
		GridBagConstraints gbc_Item_C_Use = new GridBagConstraints();
		gbc_Item_C_Use.anchor = GridBagConstraints.EAST;
		gbc_Item_C_Use.fill = GridBagConstraints.VERTICAL;
		gbc_Item_C_Use.gridx = 1;
		gbc_Item_C_Use.gridy = 1;
		panel_2.add(Item_C_Use, gbc_Item_C_Use);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{223, 138, 0};
		gbl_panel_3.rowHeights = new int[]{140, 59, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel Item_B_Image = new JLabel("OK");
		Item_B_Image.setHorizontalAlignment(SwingConstants.CENTER);
		Item_B_Image.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_B_Image = new GridBagConstraints();
		gbc_Item_B_Image.fill = GridBagConstraints.VERTICAL;
		gbc_Item_B_Image.gridwidth = 2;
		gbc_Item_B_Image.insets = new Insets(0, 0, 5, 0);
		gbc_Item_B_Image.gridx = 0;
		gbc_Item_B_Image.gridy = 0;
		panel_3.add(Item_B_Image, gbc_Item_B_Image);
		
		JLabel Item_B_Stat = new JLabel("OK");
		Item_B_Stat.setHorizontalAlignment(SwingConstants.CENTER);
		Item_B_Stat.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_B_Stat = new GridBagConstraints();
		gbc_Item_B_Stat.fill = GridBagConstraints.HORIZONTAL;
		gbc_Item_B_Stat.insets = new Insets(0, 0, 0, 5);
		gbc_Item_B_Stat.gridx = 0;
		gbc_Item_B_Stat.gridy = 1;
		panel_3.add(Item_B_Stat, gbc_Item_B_Stat);
		
		JButton Item_B_Use = new JButton("New button");
		Item_B_Use.setFont(new Font("a바보온달", Font.PLAIN, 17));
		GridBagConstraints gbc_Item_B_Use = new GridBagConstraints();
		gbc_Item_B_Use.anchor = GridBagConstraints.EAST;
		gbc_Item_B_Use.fill = GridBagConstraints.VERTICAL;
		gbc_Item_B_Use.gridx = 1;
		gbc_Item_B_Use.gridy = 1;
		panel_3.add(Item_B_Use, gbc_Item_B_Use);
		
		JButton Back_Lobby = new JButton("돌아가기");
		Back_Lobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new GameLobby();
			}
		});
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{223, 138, 0};
		gbl_panel_4.rowHeights = new int[]{140, 59, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel Item_A_Image = new JLabel("OK");
		Item_A_Image.setHorizontalAlignment(SwingConstants.CENTER);
		Item_A_Image.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_A_Image = new GridBagConstraints();
		gbc_Item_A_Image.fill = GridBagConstraints.VERTICAL;
		gbc_Item_A_Image.gridwidth = 2;
		gbc_Item_A_Image.insets = new Insets(0, 0, 5, 0);
		gbc_Item_A_Image.gridx = 0;
		gbc_Item_A_Image.gridy = 0;
		panel_4.add(Item_A_Image, gbc_Item_A_Image);
		
		JLabel Item_A_Stat = new JLabel("OK");
		Item_A_Stat.setHorizontalAlignment(SwingConstants.CENTER);
		Item_A_Stat.setFont(new Font("a옛날사진관2", Font.PLAIN, 20));
		GridBagConstraints gbc_Item_A_Stat = new GridBagConstraints();
		gbc_Item_A_Stat.fill = GridBagConstraints.HORIZONTAL;
		gbc_Item_A_Stat.insets = new Insets(0, 0, 0, 5);
		gbc_Item_A_Stat.gridx = 0;
		gbc_Item_A_Stat.gridy = 1;
		panel_4.add(Item_A_Stat, gbc_Item_A_Stat);
		
		JButton Item_A_Use = new JButton("New button");
		Item_A_Use.setFont(new Font("a바보온달", Font.PLAIN, 17));
		GridBagConstraints gbc_Item_A_Use = new GridBagConstraints();
		gbc_Item_A_Use.fill = GridBagConstraints.VERTICAL;
		gbc_Item_A_Use.anchor = GridBagConstraints.EAST;
		gbc_Item_A_Use.gridx = 1;
		gbc_Item_A_Use.gridy = 1;
		panel_4.add(Item_A_Use, gbc_Item_A_Use);
		Back_Lobby.setFont(new Font("a스피드", Font.PLAIN, 20));
		contentPane.add(Back_Lobby);
		setVisible(true);
	}

}
