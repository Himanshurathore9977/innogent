package normalPack;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import pack1java.Employee;

public class Streams {
	public static void main(String[] args) {
		try {
			FileOutputStream file = new FileOutputStream("D:\\testout.csv") ;
			FileInputStream fileIn = new FileInputStream("D:\\testout.csv") ;

			List<Employee> employeeList = new ArrayList<Employee>();
			employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
			int x = 70 ; 
			String s1 = "Hello" ; 
			file.write(0);
			file.write(65) ;
			file.write(x);
			file.write(0);
			file.write(65) ;
			file.write(x);
			file.write(0);
			file.write(5) ;
			file.write(5);
			file.write(110 );
			file.write(656) ;
			file.write(x);
			//error 
			//file.write(s1);
			int in1 = fileIn.read() ; 
			System.out.println(in1);
			int i=0;    
            while((i=fileIn.read())!=-1){    
             System.out.print(i + "  ");    
            } 
            
			file.close(); 
			System.out.println("ho gaya"); 
			
				
			
			 	File data = new File("D:\\testout1.txt");  
		        FileOutputStream file1 = new FileOutputStream(data);  
		        FilterOutputStream filter = new FilterOutputStream(file1);  
		        filter.write(40);
		        filter.write(50);
		        filter.write(60);
		        filter.write(70);
		        filter.write(20);
		        
		        FileInputStream file2 =  new FileInputStream(data) ;
		        FilterInputStream filter1 = new BufferedInputStream(file2) ; 
		        int k = 00 ; 
		        while((k = filter1.read()) != -1) {
		        	System.out.print(k + " _ ");
		        }
		        filter.close(); 
		        filter1.close();
		        System.out.println();
		        
		        Writer w = new FileWriter("output.csv");  
	            String content = "I love my country";  
	            w.write(content);  
	            
	            w.close();  
	            
	            Reader r = new FileReader("output.csv") ; 
	            
	            
	           int c = r.read() ; 
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
