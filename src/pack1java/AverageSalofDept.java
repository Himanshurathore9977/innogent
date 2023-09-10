package pack1java;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageSalofDept {
	public Map<String , List<Employee>> getAverageSalOfDept(List<Employee> employeeList){
		

		Map<String, List<Employee>> map  = employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment)) ;
		return map ; 
	}
	
	float averageAgeOfMale(List<Employee> employeeList) {
	       List<Employee> listOfMaleEmp = listOfMaleEmp(employeeList);
	       Integer sum = listOfMaleEmp.stream().map(e->e.getAge()).reduce(0,Integer::sum);
	       return sum/listOfMaleEmp.size();
	}
	float averageAgeOfFemale(List<Employee> employeeList) {
	       List<Employee> listOfFemaleEmp = listOfFemaleEmp(employeeList);
	       Integer sum = listOfFemaleEmp.stream().map(e->e.getAge()).reduce(0,(c,e)->c+e);
	       return sum/listOfFemaleEmp.size();
	}
	List<Employee> listOfMaleEmp(List<Employee> employeeList){
	       return employeeList.stream().filter(emp->"Male".equals(emp.getGender())).collect(Collectors.toList());
	}
	List<Employee> listOfFemaleEmp(List<Employee> employeeList){
	       return employeeList.stream().filter(emp->"Female".equals(emp.getGender())).collect(Collectors.toList());
	}
	    
	    
}
