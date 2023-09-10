package pack1java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DepartmentList {
	//Print the name of all departments in the organization?
	public static Set<String> getDepartmentSet(List<Employee> employee) {
		
		 Set<String> set= employee.stream()
				 .map(m -> m.getDepartment())
				 .collect(Collectors.toSet()) ; 
		 
		return set ; 
	}
}
