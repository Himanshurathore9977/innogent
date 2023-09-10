package pack1java;

import java.util.List;
import java.util.stream.Collectors;

public class OldestEmployee {
	 Employee oldestEmp(List<Employee> employeeList){
	       List<Employee> collect = employeeList.stream().sorted((e1, e2) -> e2.getAge()-(e1.getAge())).collect(Collectors.toList());
	       return collect.get(0);
	    }
}
