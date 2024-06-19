package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.bai2Listener;
import model.bai2Model;

public class bai2View extends JFrame{
	private bai2Model bai2model;
	private JTextField jtextfile_input;
	private JTextArea jtextarea_output;

	public bai2View() throws HeadlessException {
		this.bai2model = new bai2Model();
		this.init();
	}
	public void init() {
		this.setTitle("Các số nguyên tố đầu tiên");
		this.setSize(700,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bai2Listener bai2listener = new bai2Listener(this);
		jtextfile_input = new JTextField();
		Font font = new Font("Arial", Font.BOLD,30);
		jtextfile_input.setFont(font);
		
		JButton jbutton = new JButton("Generate");
		jbutton.addActionListener(bai2listener);
		jbutton.setFont(font);
		
		JPanel jpanel_ib = new JPanel();
		jpanel_ib.setLayout(new GridLayout(1,2,20,20));
		jpanel_ib.add(jtextfile_input);
		jpanel_ib.add(jbutton);
		
		jtextarea_output = new JTextArea();
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_ib, BorderLayout.NORTH);
		this.add(jtextarea_output, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	public void output() {
		int sodautien = Integer.parseInt(jtextfile_input.getText());
		this.bai2model.setSodautien(sodautien);
//		this.bai2model.timsonguyento(sodautien);
		this.bai2model.checkPrime();
//		this.jtextarea_output.setText(this.bai2model.checkPrime()+);
		this.jtextarea_output.setText(this.bai2model.getAns()+"");
		
	}
	
	
}
