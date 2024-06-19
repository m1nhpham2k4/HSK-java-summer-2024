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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controller.searchListener;
import model.searchModel;

public class SearchView extends JFrame{
	private searchModel searchmodel;
	private JTextField jtextfield_tukhoa;
	private JTextArea jtextArea_vanban;
	private JLabel jlabel_ketqua;

	public SearchView() throws HeadlessException {
		this.searchmodel = new searchModel();
		this.init();
	}
	public void init() {
		this.setTitle("Tim kiem");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jlabel_vanban = new JLabel("Van ban");
		Font font = new Font("Arial", Font.BOLD,40);
		jlabel_vanban.setFont(font);
		jtextArea_vanban = new JTextArea(100,100);
		jtextArea_vanban.setFont(font);
		
		JLabel jlabel_tukhoa = new JLabel("Tu khoa");
		jlabel_tukhoa.setFont(font);
		jtextfield_tukhoa = new JTextField();
		jtextfield_tukhoa.setFont(font);
		
//		JPanel jpanel_center = new JPanel();
//		jpanel_center.setLayout(new GridLayout(2,1,10,10));
//		jpanel_center.add(jlabel_vanban);
//		jpanel_center.add(jtextArea_vanban);
		
		searchListener timkiemlistener = new searchListener(this);
		
		JButton jbutton_thongke = new JButton("Thong ke");
		jbutton_thongke.setFont(font);
		jbutton_thongke.setBackground(Color.blue);
		jbutton_thongke.addActionListener(timkiemlistener);
		jlabel_ketqua = new JLabel();
		jlabel_ketqua.setBackground(Color.yellow);
		jlabel_ketqua.setOpaque(true);
		
		JPanel jpanel_footer = new JPanel();
		jpanel_footer.setLayout(new GridLayout(2,2,20,20));
		jpanel_footer.add(jlabel_tukhoa);
		jpanel_footer.add(jtextfield_tukhoa);
		jpanel_footer.add(jbutton_thongke);
		jpanel_footer.add(jlabel_ketqua);
		
		
		
		
		this.setLayout(new BorderLayout());
		this.add(jlabel_vanban, BorderLayout.NORTH);
		this.add(jtextArea_vanban, BorderLayout.CENTER);
		this.add(jpanel_footer, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public void timkiem() {
		this.searchmodel.setVanban(jtextArea_vanban.getText());
		this.searchmodel.setTukhoa(jtextfield_tukhoa.getText());
		this.searchmodel.Search();
		this.jlabel_ketqua.setText(this.searchmodel.getKetqua());
	}
	
}
