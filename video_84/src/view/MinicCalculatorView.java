package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.miniCalculatorModel;

public class MinicCalculatorView extends JFrame{
	private miniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_firstvalue;
	private JTextField jTextField_secondvalue;
	private JTextField jTextField_answer;

	public MinicCalculatorView() throws HeadlessException {
		this.miniCalculatorModel = new miniCalculatorModel() ;
		this.init();
	}
	
	
	
	public void init() {
		this.setTitle("CALC");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font = new Font("Arial", Font.BOLD,40);
		
		JLabel jlabel_firstvalue = new JLabel("1st value",JLabel.CENTER);
		jlabel_firstvalue.setFont(font);
		
		JLabel jlabel_secondvalue = new JLabel("2nd value", JLabel.CENTER);
		jlabel_secondvalue.setFont(font);
		
		JLabel jlabel_answer = new JLabel("answer", JLabel.CENTER);
		jlabel_answer.setFont(font);
		
		jTextField_firstvalue = new JTextField(50);
		jTextField_firstvalue.setFont(font);
		jTextField_secondvalue = new JTextField(50);
		jTextField_secondvalue.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(font);
		
		JPanel jpanel_io = new JPanel();
		jpanel_io.setLayout(new GridLayout(3,2,10,10));
		jpanel_io.add(jlabel_firstvalue);
		jpanel_io.add(jTextField_firstvalue);
		jpanel_io.add(jlabel_secondvalue);
		jpanel_io.add(jTextField_secondvalue);
		jpanel_io.add(jlabel_answer);
		jpanel_io.add(jTextField_answer);
		
		
		
		MiniCalculatorListener miniCalculatorlistener = new MiniCalculatorListener(this);
		JPanel jpanel_button = new JPanel();
		jpanel_button.setLayout(new GridLayout(2,3));
		JButton jbutton_plus = new JButton("+");
		jbutton_plus.setFont(font);
		jbutton_plus.addActionListener(miniCalculatorlistener);
		jpanel_button.add(jbutton_plus);
		JButton jbutton_minus = new JButton("-");
		jbutton_minus.setFont(font);
		jbutton_minus.addActionListener(miniCalculatorlistener);
		jpanel_button.add(jbutton_minus);
		JButton jbutton_multiply = new JButton("*");
		jbutton_multiply.setFont(font);
		jbutton_multiply.addActionListener(miniCalculatorlistener);
		jpanel_button.add(jbutton_multiply);
		JButton jbutton_divide = new JButton("/");
		jbutton_divide.setFont(font);
		jbutton_divide.addActionListener(miniCalculatorlistener);
		jpanel_button.add(jbutton_divide);
		JButton jbutton_pow = new JButton("^");
		jbutton_pow.setFont(font);
		jbutton_pow.addActionListener(miniCalculatorlistener);
		jpanel_button.add(jbutton_pow);
		JButton jbutton_mod = new JButton("%");
		jbutton_mod.setFont(font);
		jbutton_mod.addActionListener(miniCalculatorlistener);
		jpanel_button.add(jbutton_mod);
		
		this.setLayout(new BorderLayout(10, 10));
		this.add(jpanel_io, new BorderLayout().CENTER);
		this.add(jpanel_button, new BorderLayout(2,3).SOUTH);
		
		this.setVisible(true);
	}
	public void plus() {
		double firstValue = Double.valueOf(jTextField_firstvalue.getText());
		double secondValue = Double.valueOf(jTextField_secondvalue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.plus();
		this.jTextField_answer.setText(miniCalculatorModel.getAnswer()+ "");
	}
	
	public void minus() {
		double firstValue = Double.valueOf(jTextField_firstvalue.getText());
		double secondValue = Double.valueOf(jTextField_secondvalue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.minus();
		this.jTextField_answer.setText(miniCalculatorModel.getAnswer()+ "");
	}
	
	public void multiply() {
		double firstValue = Double.valueOf(jTextField_firstvalue.getText());
		double secondValue = Double.valueOf(jTextField_secondvalue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.multiply();
		this.jTextField_answer.setText(miniCalculatorModel.getAnswer()+ "");
	}
	
	public void divide() {
		double firstValue = Double.valueOf(jTextField_firstvalue.getText());
		double secondValue = Double.valueOf(jTextField_secondvalue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.divide();
		this.jTextField_answer.setText(miniCalculatorModel.getAnswer()+ "");
	}
	
	public void pow() {
		double firstValue = Double.valueOf(jTextField_firstvalue.getText());
		double secondValue = Double.valueOf(jTextField_secondvalue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.pow();
		this.jTextField_answer.setText(miniCalculatorModel.getAnswer()+ "");
	}
	
	public void mod() {
		double firstValue = Double.valueOf(jTextField_firstvalue.getText());
		double secondValue = Double.valueOf(jTextField_secondvalue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.mod();
		this.jTextField_answer.setText(miniCalculatorModel.getAnswer() + "");
	}
	
	
}
