package main;

import javax.swing.SwingUtilities;

import controller.Controller;
import model.Model;
import view.View;

public class MainApplication {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				
				Model model = new Model();
				View view = new View();
				Controller controller = new Controller(model, view);
				
				controller.contol();
			}
		});
		
		
	}
	
}
