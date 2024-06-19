package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.bai2View;

public class bai2Listener implements ActionListener {
	
	private bai2View bai2View;
	
	public bai2Listener(view.bai2View bai2View) {
		this.bai2View = bai2View;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		this.bai2View.output();
		
	}

}
