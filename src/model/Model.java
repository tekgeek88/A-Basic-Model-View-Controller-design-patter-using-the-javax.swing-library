package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Model {

    
    //--------------------  Methods of Madness -------------------------
	
	
    public String getData() throws FileNotFoundException, IOException {
		// If file.txt does not exist create one
		if(!(new File("file.txt").isFile())) {
			Files.createFile(Paths.get("file.txt"));
		}
		// The variable to store the final result of the file read
		String data;
		// Using the new Java7 try with a resource block
		// Wrap the file 
		try (BufferedReader reader = new BufferedReader(
				new FileReader("file.txt"))) {
			// Access the data from the file and store it in a StringBuilder object
			StringBuilder string = new StringBuilder();
			//Read the file line-by-line
			String line = reader.readLine();
			// While there is a line to read do this
			while (line != null) {
				string.append(line);
				// read the next line
				line = reader.readLine();
			}// End of while loop
			// Convert the string builder object to a String and store it in data.
			data = string.toString();
		}
		catch (Exception er) {
			// If there is an error return it to the caller
			data = er.getMessage();
		}
		// Return the string read from the file or the error
		return data;
	}// End getData()
	
	public boolean writeData(String data) throws IOException, FileNotFoundException {
		// Save data to a File
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter("file.txt"))) {
			// Write the data to the file
			writer.write(data);
			// Return indicating the data was written
			return true;
		}
		catch (Exception er) {
			return false;
		}
	} // End of writeData method
    
    
}
