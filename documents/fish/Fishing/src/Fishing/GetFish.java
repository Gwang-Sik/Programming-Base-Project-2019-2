package Fishing;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class GetFish {
	public GetFish() {
	}
	
	public String FishCost(int k) { //Integer -> String
		String cost[] = new String[255];
		for(int i = 0; i<255; i++){
			double fishcost = Math.random();
			int j = (int)(fishcost * 100000) + 1000;
			cost[i] = Integer.toString(j);
		}
		return cost[k];
	}
	
	public int Reverse(String t,int j) {  //String -> Integer
		int re[]=new int[255];
		for(int i = 0; i<255; i++){
			re[i] = Integer.parseInt(t);
		}
		return re[j];
	}
	
	public ImageIcon Ocean() {
		ImageIcon imageicon1= new ImageIcon("FishImage/Ocean.png");
		Image re_imageicon1 = imageicon1.getImage();
		Image change1 = re_imageicon1.getScaledInstance(260, 140, Image.SCALE_SMOOTH);
		ImageIcon Ocean = new ImageIcon(change1);
		return Ocean;
	}
	
	public ImageIcon Fish() {
		ImageIcon imageicon = new ImageIcon("FishImage/FishEx1.png");
		Image re_imageicon = imageicon.getImage();
		Image change = re_imageicon.getScaledInstance(260, 140, Image.SCALE_SMOOTH);
		ImageIcon Fish = new ImageIcon(change);
		return Fish;
	}
}