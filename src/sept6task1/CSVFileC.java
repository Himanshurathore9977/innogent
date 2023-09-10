package sept6task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileC {
	public static void main(String[] args) {
		
	
	    try {
	        // create FileWriter object with file as parameter

	    	File file = new File("D:\testout") ;
	        FileWriter outputfile = new FileWriter(file);
	  
	        // create CSVWriter object filewriter object as parameter
	        CSVFileC writer = new CSVFileC();
	        
	  
	        // adding header to csv
	        String[] header = { "Name", "Class", "Marks" };
	        writer.writeNext(header);
	  
	        // add data to csv
	        String[] data1 = { "Aman", "10", "620" };
	        writer.writeNext(data1);
	        String[] data2 = { "Suraj", "10", "630" };
	        writer.writeNext(data2);
	  
	        // closing writer connection
	        writer.close();
	    }
	    catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
}
