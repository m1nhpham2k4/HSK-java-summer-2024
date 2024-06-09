package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.lastbuttonListener;
import model.Model;

public class View extends JFrame {
	private Model lastbuttonmodel;
	private JLabel jlabel;
	
	public View() {
		// TODO Auto-generated constructor stub
		this.lastbuttonmodel = new Model();
		this.init();
	}

	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		JPanel jpanel_center = new JPanel();
		
		jpanel_center.setLayout(new GridLayout(2,2));
		
		Font font = new Font("Arial", Font.BOLD, 20);
		ActionListener ac = new lastbuttonListener(this);
		
		JButton jbt_1 = new JButton("1");
		jbt_1.setFont(font);
		jbt_1.addActionListener(ac);
		JButton jbt_2 = new JButton("2");
		jbt_2.setFont(font);
		jbt_2.addActionListener(ac);

		JButton jbt_3 = new JButton("3");
		jbt_3.setFont(font);
		jbt_3.addActionListener(ac);

		JButton jbt_4 = new JButton("4");
		jbt_4.setFont(font);
		jbt_4.addActionListener(ac);

		jpanel_center.add(jbt_1);
		jpanel_center.add(jbt_2);
		jpanel_center.add(jbt_3);
		jpanel_center.add(jbt_4);
		
		JPanel jpanel_footer = new JPanel();
		
		jlabel = new JLabel("---------");
		
		jpanel_footer.add(jlabel);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_center, BorderLayout.CENTER);
		this.add(jpanel_footer, BorderLayout.SOUTH);
		this.setVisible(true);
		
	}
	
	public void changTo_1() {
		this.lastbuttonmodel.setValue_1();
		jlabel.setText("Last button: " + this.lastbuttonmodel.getValue());
	}
	public void changTo_2() {
		this.lastbuttonmodel.setValue_2();
		jlabel.setText("Last button: " + this.lastbuttonmodel.getValue());
	}
	
	public void changTo_3() {
		this.lastbuttonmodel.setValue_3();
		jlabel.setText("Last button: " + this.lastbuttonmodel.getValue());
	}
	
	public void changTo_4() {
		this.lastbuttonmodel.setValue_4();
		jlabel.setText("Last button: " + this.lastbuttonmodel.getValue());
	
	}
}