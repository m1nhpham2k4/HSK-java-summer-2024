package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class flowLayout extends JFrame{
	public flowLayout(){
		this.setTitle("Minh dep trai");
		this.setSize(600,400);
//		 Can giua
		this.setLocationRelativeTo(null);
		
		FlowLayout flowlayout = new FlowLayout();
		GridLayout g = new GridLayout(4,4);
		
		this.setLayout(g);
		
		for(int i = 0;i < 16;i++) {
			JButton j = new JButton(i + "");
			this.add(j);
		}
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new flowLayout();
		
	}
}