package controller;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;

public class Controller {

	private View view;
	private Model model;
	private ActionListener writeButtonActionListener;
	private ActionListener readButtonActionListener;


	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}


	public String getMessage() {

		try {
			return model.getData();
		}
		catch (Exception er) {
			return "There was an error";
		}
	}// End getMessage()


	public boolean writeMessage(String message) {
		try {
			Model model = new Model();
			return model.writeData(message);
		}
		catch (Exception er) {
			return false;
		}
	} // End writeMessage()

	// Add action listeners to the controllers of the GUI
	public void contol() {
		writeButtonActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {                  
				writeData();
			}
		};                
		view.getWriteDataButton().addActionListener(writeButtonActionListener);  

		readButtonActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {                  
				readData();
			}
		};                
		view.getReadDataButton().addActionListener(readButtonActionListener);
	}

	private void readData(){
		try {
			String data = getMessage();
			System.out.println(data);
			view.setText(data);
		} catch (Exception er) {
		}
	}
	
	private void writeData(){
		try {
			String data = view.getText();
			writeMessage(data);
			System.out.println(data);
			view.setText(data);
		} catch (Exception er) {
		}
	}

}
