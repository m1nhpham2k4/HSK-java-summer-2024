package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.viewListener;

public class viewmodel extends JFrame{
	private JLabel jlabel;
	
	public viewmodel() {
		this.init();
		
	}

	private void init() {
		this.setTitle("Text background");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		
		jlabel = new JLabel("TEXT",JLabel.CENTER);
		
		viewListener ac = new viewListener(this);
		Font font = new Font("ARIAL ",Font.BOLD,30);
		jlabel.setFont(font);
		jlabel.setOpaque(true);
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(2,2));
		
		
		JButton jbutton_red_text = new JButton("Red text");
		jbutton_red_text.setFont(font);
		jbutton_red_text.setForeground(Color.red);
		jbutton_red_text.addActionListener(ac);
		
		JButton jbutton_yellow_text = new JButton("Yellow text");
		jbutton_yellow_text.setFont(font);
		jbutton_yellow_text.setForeground(Color.yellow);
		jbutton_yellow_text.addActionListener(ac);
		
		JButton jbutton_green_text = new JButton("Green text");
		jbutton_green_text.setFont(font);
		jbutton_green_text.setForeground(Color.green);
		jbutton_green_text.addActionListener(ac);
		
		JButton jbutton_red_background = new JButton("Red background");
		jbutton_red_background.setFont(font);
		jbutton_red_background.setBackground(Color.red);
		jbutton_red_background.addActionListener(ac);
		
		JButton jbutton_yellow_background = new JButton("Yellow background");
		jbutton_yellow_background.setFont(font);
		jbutton_yellow_background.setBackground(Color.yellow);
		jbutton_yellow_background.addActionListener(ac);
		
		JButton jbutton_green_background = new JButton("Green background");
		jbutton_green_background.setFont(font);
		jbutton_green_background.setBackground(Color.green);
		jbutton_green_background.addActionListener(ac);
		
		jpanel.add(jbutton_red_text);
		jpanel.add(jbutton_yellow_text);
		jpanel.add(jbutton_green_text);
		jpanel.add(jbutton_red_background);
		jpanel.add(jbutton_yellow_background);
		jpanel.add(jbutton_green_background);
		
		
		this.setLayout(new BorderLayout());
		this.add(jlabel,new BorderLayout().NORTH);
		this.add(jpanel, new BorderLayout().CENTER);
		
		
		this.setVisible(true);
	}

	public void changeText(Color color) {
		this.jlabel.setForeground(color);
		
	}

	public void changeBackground(Color color) {
		this.jlabel.setBackground(color);
		
	}
	
}
