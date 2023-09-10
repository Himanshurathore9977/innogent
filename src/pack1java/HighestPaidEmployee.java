package pack1java;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class HighestPaidEmployee {
	double  max = 0 ; 
	String person = ""; 
	public Employee getHighestPaidEmployee(List<Employee> employeeList){
		
		return employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
		
//		Stream<Employee> s1 = employeeList.stream() ;
//		Stream<Double> s3 = s1.map(e -> Math.max(e.getSalary(), max) ); 
//		//Stream<String> stream = .stream();
//		Double  sal = s3.reduce((first, second) -> second)
//		  .orElse(null);
//
//		Stream<Employee> stream = 
//				  employeeList.stream().filter(element -> element.getSalary()==sal);
//				Optional<Employee> anyElement = stream.findAny();
//				String highSal = anyElement.get().getName();
//		
//		return highSal ; 
		
		
	
		
		
		 
	}
}
