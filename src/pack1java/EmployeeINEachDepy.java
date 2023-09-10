package pack1java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeINEachDepy {
	public Map<String ,  List<Employee> > count(List<Employee> employeeList) {
		
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		
	}
}
