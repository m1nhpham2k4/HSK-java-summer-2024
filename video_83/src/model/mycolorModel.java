package model;

import java.awt.Color;

public class mycolorModel {
	private Color foreground;
	private Color background;
	private boolean opaque;
	public mycolorModel() {
		this.foreground = Color.black;
		this.background = Color.white;
		this.opaque = true;
	}
	public Color getForeground() {
		return foreground;
	}
	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}
	public Color getBackground() {
		return background;
	}
	public void setBackground(Color background) {
		this.background = background;
	}
	public boolean isOpaque() {
		return opaque;
	}
	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}
	
	

}
