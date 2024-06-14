package model;

import java.awt.Color;

public class jbuttonmodel {
	private Color background;
	private Color foneground;
	private boolean opaque;
	public jbuttonmodel() {
		this.background = Color.white;
		this.foneground = Color.black;
		this.opaque = true;
	}
	public Color getBackground() {
		return background;
	}
	public void setBackground(Color background) {
		this.background = background;
	}
	public Color getFoneground() {
		return foneground;
	}
	public void setFoneground(Color foneground) {
		this.foneground = foneground;
	}
	public boolean isOpaque() {
		return opaque;
	}
	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	
	
	
}
