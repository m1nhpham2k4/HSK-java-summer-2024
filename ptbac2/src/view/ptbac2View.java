package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controller.ptbac2Listener;
import model.ptbac2Model;

public class ptbac2View extends JFrame{
	private ptbac2Model ptbac2Model;
	private JTextField jtextfield_value_a;
	private JTextField jtextfield_value_b;
	private JTextField jtextfield_value_c;
	private JTextField jtextfield_answer;
	
	public ptbac2View() throws HeadlessException {
		this.ptbac2Model = new ptbac2Model();
		this.init();
	}
	
	public void init() {
		this.setTitle("GIAI PHUONG TRINH BAC HAI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		
		JLabel jlabel_title = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC HAI", JLabel.CENTER);
		Font font = new Font("Arial", Font.BOLD, 60);
		Font font1 = new Font("Arial", Font.BOLD, 30);
		jlabel_title.setFont(font);
		jlabel_title.setOpaque(true);
		jlabel_title.setForeground(Color.black);
		jlabel_title.setBackground(Color.blue);
		JLabel jlabel_value_a = new JLabel("Nhập a", JLabel.CENTER);
		jlabel_value_a.setFont(font1);
		JLabel jlabel_value_b = new JLabel("Nhập b", JLabel.CENTER);
		jlabel_value_b.setFont(font1);
		JLabel jlabel_value_c = new JLabel("Nhập c", JLabel.CENTER);
		jlabel_value_c.setFont(font1);
		JLabel jlabel_answer = new JLabel("Kết quả", JLabel.CENTER);
		jlabel_answer.setFont(font1);
		JLabel jlabel_tac_vu = new JLabel("Chọn tác vụ");
		jlabel_tac_vu.setFont(font1);
		
		
		jtextfield_value_a = new JTextField(20);
		jtextfield_value_b = new JTextField(20);
		jtextfield_value_c = new JTextField(20);
		jtextfield_answer = new JTextField(20);
		
		JPanel jpanel_io = new JPanel();
		jpanel_io.setLayout(new GridLayout(5, 2, 10, 10));
		jpanel_io.add(jlabel_value_a);
		jpanel_io.add(jtextfield_value_a);
		jpanel_io.add(jlabel_value_b);
		jpanel_io.add(jtextfield_value_b);
		jpanel_io.add(jlabel_value_c);
		jpanel_io.add(jtextfield_value_c);
		jpanel_io.add(jlabel_answer);
		jpanel_io.add(jtextfield_answer);
		jpanel_io.add(jlabel_tac_vu);
		
		JPanel jpanel_button = new JPanel();
		jpanel_button.setLayout(new GridLayout(1,3));
		
		ptbac2Listener ptbac2listener = new ptbac2Listener(this);
		JButton jbutton_giai = new JButton("Giai");
		jbutton_giai.addActionListener(ptbac2listener);
		JButton jbutton_xoa = new JButton("Xoa");
		jbutton_xoa.addActionListener(ptbac2listener);
		JButton jbutton_thoat = new JButton("Thoat");
		jbutton_thoat.addActionListener(ptbac2listener);
		jpanel_button.add(jbutton_giai);
		jpanel_button.add(jbutton_xoa);
		jpanel_button.add(jbutton_thoat);
		
		this.setLayout(new BorderLayout());
		this.add(jlabel_title, BorderLayout.NORTH);
		this.add(jpanel_io,BorderLayout.CENTER);
		this.add(jpanel_button, BorderLayout.SOUTH);
		this.setVisible(true);
	
	}

	public void giaiptbac2() {
		String a = String.valueOf(jtextfield_value_a.getText());
		String b = String.valueOf(jtextfield_value_b.getText());
		String c = String.valueOf(jtextfield_value_c.getText());
		ptbac2Model.setValue_a(a);
		ptbac2Model.setValue_b(b);
		ptbac2Model.setValue_c(c);
		ptbac2Model.giaiphuongtrinhbac2();
		this.jtextfield_answer.setText(ptbac2Model.getAnswer());
		
	}

	public void xoa() {
		String a = String.valueOf(jtextfield_value_a.getText());
		String b = String.valueOf(jtextfield_value_b.getText());
		String c = String.valueOf(jtextfield_value_c.getText());
		ptbac2Model.setValue_a(a);
		ptbac2Model.setValue_b(b);
		ptbac2Model.setValue_c(c);
		ptbac2Model.xoa();
		this.jtextfield_value_a.setText(ptbac2Model.getValue_a());
		this.jtextfield_value_b.setText(ptbac2Model.getValue_b());
		this.jtextfield_value_c.setText(ptbac2Model.getValue_c());
		this.jtextfield_answer.setText(ptbac2Model.getAnswer());
	}
	public void thoat() {
		System.exit(0);
	}
	
}
