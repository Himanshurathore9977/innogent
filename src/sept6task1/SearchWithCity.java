package sept6task1;

import java.util.List;
import java.util.stream.Collectors;

public class SearchWithCity {
	public List<String> getStudentWithCity(List<AddressDAO> addresslist , List<StudentDAO> studentlist , String city  ){
		List<Integer> list = addresslist.stream()
						.filter(p -> p.getCity().equalsIgnoreCase(city) )
						.map(a -> a.getStudent_id())
						.collect(Collectors.toList()); 
		
		
		List<String> li = studentlist.stream()
						.filter(e -> list.contains(e.getId()))
						.map(e -> e.getName()).collect(Collectors.toList()) ; 
		return li ; 
		
	}
	
}
