package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener{
	private MyColorView colorview;
	
	
	public MyColorListener(MyColorView colorview) {
		this.colorview = colorview;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Red text")) {
			this.colorview.changeTextColor(Color.red);
		}else if(src.equals("Yellow text")) {
			this.colorview.changeTextColor(Color.yellow);
		}
		else if(src.equals("Green text")) {
			this.colorview.changeTextColor(Color.green);
		}
		else if(src.equals("Red background")) {
			this.colorview.changeBackgroundColor(Color.red);
		}
		else if(src.equals("Yellow background")) {
			this.colorview.changeBackgroundColor(Color.yellow);
		}
		else if(src.equals("Green background")) {
			this.colorview.changeBackgroundColor(Color.green);
		}
		
	}
	
}
