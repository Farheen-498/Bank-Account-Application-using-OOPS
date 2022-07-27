package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
//It will read data from a CSV File and return as a list
	public static List<String[]> read(String file) {
		String dataRow;
		List<String[]> data = new LinkedList<String[]>();
		try {
			BufferedReader br= new BufferedReader(new FileReader(file));
			
			while((dataRow=br.readLine()) != null){
			String[] dataRecords = dataRow.split(",");
			data.add(dataRecords);}
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
		} catch (IOException e) {
			System.out.println("COULD NOT FIND FILE");
		}
		return data;
		
	}
}
