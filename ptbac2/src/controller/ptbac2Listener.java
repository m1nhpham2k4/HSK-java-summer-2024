package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ptbac2View;

public class ptbac2Listener implements ActionListener {
	private ptbac2View ptbac2view;
	
	public ptbac2Listener(ptbac2View ptbac2view) {
		this.ptbac2view = ptbac2view;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("Giai")) {
			this.ptbac2view.giaiptbac2();
		}else if(src.equals("Xoa")) {
			this.ptbac2view.xoa();
		}
		else if(src.equals("Thoat")) {
			this.ptbac2view.thoat();
		}
	}
	
}
