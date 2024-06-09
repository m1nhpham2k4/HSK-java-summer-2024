package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.couterListener;
import model.couter;

public class couterView extends JFrame {
	private couter couterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	private JLabel jLabel_value;

	public couterView() {
		this.couterModel = new couter();
		this.init();
		this.setVisible(true);
	}

	public void init() {

		this.setTitle("CouterView");
		this.setLocationRelativeTo(null);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener ac = new couterListener(this);

		jButton_up = new JButton("Up");
		jButton_up.addActionListener(ac);

		jButton_down = new JButton("Down");
		jButton_down.addActionListener(ac);

		jButton_reset = new JButton("Reset");
		jButton_reset.addActionListener(ac);

		jLabel_value = new JLabel(this.couterModel.getValue() + "", JLabel.CENTER);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_down, BorderLayout.EAST);
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jButton_reset, BorderLayout.SOUTH);
		jPanel.add(jLabel_value, BorderLayout.CENTER);

		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);

	}

	public void increment() {
		this.couterModel.increment();
		this.jLabel_value.setText(this.couterModel.getValue() + " ");
	}

	public void decrement() {
		this.couterModel.decrement();
		this.jLabel_value.setText(this.couterModel.getValue() + " ");
	}

	public void reset() {
		this.couterModel.reset();
		this.jLabel_value.setText(this.couterModel.getValue() + " ");
	}

}
