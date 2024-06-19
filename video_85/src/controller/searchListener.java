package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SearchView;

public class searchListener implements ActionListener{
	 private SearchView searchview;
	 
	public searchListener(SearchView searchview) {
		super();
		this.searchview = searchview;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		this.searchview.timkiem();
	}
	
	
}
