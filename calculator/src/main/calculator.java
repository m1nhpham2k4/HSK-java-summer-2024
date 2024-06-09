package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class calculator extends JFrame{
	public calculator() {
		this.setTitle("My Calculator");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField j_text = new JTextField(50);
		
		JPanel j_panel_head = new JPanel();
		j_panel_head.setLayout(new BorderLayout());
		j_panel_head.add(j_text, BorderLayout.CENTER);
		
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b_cong = new JButton("+");
		JButton b_tru = new JButton("-");
		JButton b_nhan = new JButton("*");
		JButton b_chia = new JButton("/");
		JButton b_bang = new JButton("=");
		
		JPanel j_panel_button = new JPanel();
		j_panel_button.setLayout(new GridLayout(5,3));
		
		j_panel_button.add(b0);
		j_panel_button.add(b1);
		j_panel_button.add(b2);
		j_panel_button.add(b3);
		j_panel_button.add(b4);
		j_panel_button.add(b5);
		j_panel_button.add(b6);
		j_panel_button.add(b7);
		j_panel_button.add(b8);
		j_panel_button.add(b9);
		j_panel_button.add(b_cong);
		j_panel_button.add(b_tru);
		j_panel_button.add(b_nhan);
		j_panel_button.add(b_chia);
		j_panel_button.add(b_bang);
		
//		this.setLayout(new BorderLayout());
		this.add(j_panel_head, BorderLayout.NORTH);
		this.add(j_panel_button, BorderLayout.CENTER);
		this.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			new calculator();
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		
	}
}
