package view;

import java.awt.BorderLayout;
//Call the import
import controller.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Call the import
import controller.*;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class View {

	private Controller controller;
	private JFrame frame;
	private JLabel lblToChange;
	private JButton btnWriteData;
	private JPanel panel;
	private JButton btnReadData;
	private JTextArea txtArea;
	
	public View() {
		// Create the frame
		frame = new JFrame();
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 480);
		frame.setVisible(true);
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		btnWriteData = new JButton("Write Data");
		btnWriteData.setBounds(243, 408, 117, 29);
		panel.add(btnWriteData);
		
		btnReadData = new JButton("Read Data");
		btnReadData.setBounds(243, 62, 117, 29);
		panel.add(btnReadData);
		
		txtArea = new JTextArea();
		txtArea.setBounds(25, 129, 543, 242);
		panel.add(txtArea);
		
	}// End View constructor
	
	public JButton getWriteDataButton(){
		return btnWriteData;
	}
	
	public JButton getReadDataButton(){
		return btnReadData;
	}
	
	public void setText(String text) {
		txtArea.setText(text);
	}
	
	public String getText() {
		return txtArea.getText();
	}
	
}
