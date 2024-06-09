package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.View;

public class lastbuttonListener implements ActionListener{
	private View lastbuttonView;
	
	public lastbuttonListener(View ctv) {
		this.lastbuttonView = ctv; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sourceEvent = e.getActionCommand();
		if(sourceEvent.equals("1")) {
			this.lastbuttonView.changTo_1();
		}else if(sourceEvent.equals("2")) {
			this.lastbuttonView.changTo_2();
		}else if(sourceEvent.equals("3")) {
			this.lastbuttonView.changTo_3();
		}else if(sourceEvent.equals("4")) {
			this.lastbuttonView.changTo_4();
		}

	}
}
