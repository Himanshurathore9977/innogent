package pack1java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageAge {
	int  fcount = 0 ; 
	public int femaleAvgAge(List<Employee> employee , int fcount ) {
		
		
		Stream <Employee>s1 = employee.stream() ; 
		
		List<Employee> s2 = s1.filter(emp-> "female".equalsIgnoreCase(emp.getGender() )).collect(Collectors.toList()) ; 
		
		Integer s3 = s2.stream()
				.map(e -> e.getAge())
				.reduce(0 , (c,e) -> c+e);
		
		return s3/fcount ; 
		/*
		for(int i=0 ; i<employee.size() ; i++) {
			Employee emp = employee.get(i) ; 
			
			String g = emp.gender ;
			if(g=="Female") {
				fcount++ ; 
				fsum++ ; 
			}
			else mcount++ ;
			
		}
		*/
	}
public int maleAvgAge(List<Employee> employee , int mcount ) {
		
		
		Stream <Employee>s1 = employee.stream() ; 
		
		List<Employee> s2 = s1.filter(emp-> "male".equalsIgnoreCase(emp.getGender() )).collect(Collectors.toList()) ; 
		
		Integer s3 = s2.stream()
				.map(e -> e.getAge())
				.reduce(0 , (c,e) -> c+e);
		
		return s3/mcount ; 
	}	
}
