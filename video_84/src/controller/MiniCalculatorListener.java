package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.miniCalculatorModel;
import view.MinicCalculatorView;

public class MiniCalculatorListener implements ActionListener {
	private MinicCalculatorView minicalculatorview;

	public MiniCalculatorListener(MinicCalculatorView minicalculatorviwe) {
		this.minicalculatorview = minicalculatorviwe;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("+")) {
			 this.minicalculatorview.plus();
		}else if(src.equals("-")) {
			 this.minicalculatorview.minus();
		}else if(src.equals("*")) {
			 this.minicalculatorview.multiply();
		}else if(src.equals("/")) {
			 this.minicalculatorview.divide();
		}else if(src.equals("^")) {
			 this.minicalculatorview.pow();
		}else if(src.equals("%")) {
			 this.minicalculatorview.mod();
		}
		
	}
	
}
