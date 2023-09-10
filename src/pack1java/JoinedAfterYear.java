package pack1java;

import java.util.List;
import java.util.stream.Collectors;

public class JoinedAfterYear {
	public List<String> getJoinedAfter(List<Employee> employee){
		List<Employee> s1 = employee.stream()
				.filter(x -> x.getYearOfJoining() > 2015).collect(Collectors.toList()); 
		List<String> result = s1.stream().map(e -> e.getName()).collect(Collectors.toList()) ; 
		return result ;   
	}
}
