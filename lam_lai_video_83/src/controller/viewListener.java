package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.viewmodel;

public class viewListener implements ActionListener {

	private viewmodel ctv;
	
	public viewListener(viewmodel ctv) {
		this.ctv = ctv;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Red text")) {
			this.ctv.changeText(Color.red);
		}else if(src.equals("Yellow text")) {
			this.ctv.changeText(Color.yellow);
		}
		else if(src.equals("Green text")) {
			this.ctv.changeText(Color.green);
		}
		else if(src.equals("Red background")) {
			this.ctv.changeBackground(Color.red);
		}
		else if(src.equals("Yellow background")) {
			this.ctv.changeBackground(Color.yellow);
		}
		else if(src.equals("Green background")) {
			this.ctv.changeBackground(Color.green);
		}
		
	}
	
}
