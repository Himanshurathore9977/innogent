package pack1java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeFilterByAge {
	public static List<Employee> getYoungerEmployee(List<Employee> employeeList){
		Stream<Employee> s1 = employeeList.stream() ; 
		return s1.filter(emp -> emp.getAge() <= 25).collect(Collectors.toList()) ; 
	}
	public static List<Employee> getOlderEmployee(List<Employee> employeeList){
		return employeeList.stream(). 
				filter(emp -> emp.getAge() > 25).
				collect(Collectors.toList()) ;
	}	
}
	
