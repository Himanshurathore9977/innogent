package sept6task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceClass {
	public List<ClassDAO> UploadClass(String filepath){
		List <ClassDAO> list= new ArrayList<ClassDAO>() ; 
				
		String line = "";  
		String splitBy = ",";  
		try   
		{  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader(filepath));  
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				String[] employee = line.split(splitBy);    // use comma as separator  
				list.add(new ClassDAO(Integer.parseInt(employee[0]), employee[1])) ; 
			}  
			br.close(); 
		}   
		catch (IOException e)   
		{  
			e.printStackTrace();  
		}  
	return list ; 
}
	public List<StudentDAO> uploadStudent(String filepath){
		List <StudentDAO> list= new ArrayList<StudentDAO>() ; 
				
		String line = "";  
		String splitBy = ",";  
		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		BufferedReader br = new BufferedReader(new FileReader(filepath));  
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				String[] employee = line.split(splitBy);    // use comma as separator  
				// int id , String name, int class_id, int marks, String gender, int age
		
				list.add(new StudentDAO(Integer.parseInt(employee[0]), employee[1], Integer.parseInt(employee[2]), Integer.parseInt(employee[3]), employee[4], Integer.parseInt(employee[5]))) ; 
			} 
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
	return list ; 
	}
	
	
	public List<AddressDAO> uploadAddress(String filepath){
		List <AddressDAO> list= new ArrayList<AddressDAO>() ; 
				
		String line = "";  
		String splitBy = ",";  
		try   
		{  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader(filepath));  
			while ((line = br.readLine()) != null)   //returns a Boolean value  
				{  
					//id | pin_code | city | student_id
					String[] employee = line.split(splitBy);    // use comma as separator  
					list.add(new AddressDAO(Integer.parseInt(employee[0]), Integer.parseInt(employee[1]), employee[2], Integer.parseInt(employee[3]))) ; 
				} 
			}   
			catch (IOException e)   
			{  
				e.printStackTrace();  
			}  
		return list ; 
	}
}
