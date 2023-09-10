package pack1java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenderCount {
	//How many male and female employees are there in the organization?	
	public  int femaleCount(List<Employee> employee) {
		int fcount = 0 ; 
		
		long s1 = employee.stream()
				.filter(emp-> "female".equalsIgnoreCase(emp.getGender() ))
				.count(); 
		 
		return (int)s1 ; 
		
		/*
		for(int i=0 ; i<employee.size() ; i++) {
			Employee emp = employee.get(i) ; 
		
			String g = emp.gender ;
			System.out.println(g);
			if(g=="Female") {
				fcount++ ; 
			}
			else mcount++ ;
		}
		System.out.println("female " + fcount);
		System.out.println("male " + mcount);
		*/
	}
	public   int maleCount(List<Employee> employee) {
		
		long s1 = employee.stream()
				.filter(emp-> "male".equalsIgnoreCase(emp.getGender() ))
				.count(); 
		return (int)s1  ; 
	}	
		
}
