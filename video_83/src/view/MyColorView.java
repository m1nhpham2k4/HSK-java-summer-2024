package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.MyColorListener;
import model.mycolorModel;

public class MyColorView extends JFrame{	
	private mycolorModel colorModel;
	private JLabel j_label;
	
	public MyColorView() {
		this.colorModel = new mycolorModel();
		this.init();
	
	}

	private void init() {
		this.setTitle("My Color");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);;
		
		j_label = new JLabel("TEXT");
		Font font_text = new Font("Arial", Font.BOLD, 100);
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(2,3));
		j_label.setOpaque(true);
		j_label.setFont(font_text);
		
		Font font = new Font("Arial", Font.BOLD, 20);
		
		
		MyColorListener colorlistener = new MyColorListener(this);
		JButton jbutton_text_red = new JButton("Red text");
		jbutton_text_red.setFont(font);
		jbutton_text_red.setForeground(Color.RED);
		jbutton_text_red.addActionListener(colorlistener);

		JButton jbutton_text_yellow = new JButton("Yellow text");
		jbutton_text_yellow.setFont(font);
		jbutton_text_yellow.setForeground(Color.YELLOW);
		jbutton_text_yellow.addActionListener(colorlistener);
		
		JButton jbutton_text_green = new JButton("Green text");
		jbutton_text_green.setFont(font);
		jbutton_text_green.setForeground(Color.GREEN);
		jbutton_text_green.addActionListener(colorlistener);
		
		JButton jbutton_background_red = new JButton("Red background");
		jbutton_background_red.setFont(font);
		jbutton_background_red.setBackground(Color.RED);
		jbutton_background_red.setOpaque(true);
		jbutton_background_red.addActionListener(colorlistener);

		JButton jbutton_background_yellow= new JButton("Yellow background");
		jbutton_background_yellow.setFont(font);
		jbutton_background_yellow.setBackground(Color.YELLOW);
		jbutton_background_yellow.setOpaque(true);
		jbutton_background_yellow.addActionListener(colorlistener);
		
		JButton jbutton_background_green = new JButton("Green background");
		jbutton_background_green.setFont(font);
		jbutton_background_green.setBackground(Color.GREEN);
		jbutton_background_green.setOpaque(true);
		jbutton_background_green.addActionListener(colorlistener);
		
		jpanel.add(jbutton_text_red);
		jpanel.add(jbutton_text_yellow);
		jpanel.add(jbutton_text_green);
		jpanel.add(jbutton_background_red);
		jpanel.add(jbutton_background_yellow);
		jpanel.add(jbutton_background_green);
		
		this.setLayout(new BorderLayout());
		this.add(j_label, BorderLayout.NORTH);
		this.add(jpanel, BorderLayout.CENTER);

		
		this.setVisible(true);
	}

	public void changeTextColor(Color color) {
		this.j_label.setForeground(color);
		
	}

	public void changeBackgroundColor(Color color) {
		this.j_label.setBackground(color);
		
	}
	
	
}
