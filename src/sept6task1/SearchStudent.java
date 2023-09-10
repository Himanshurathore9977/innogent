package sept6task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchStudent {
	public List<String> getStudentWithPin(List<AddressDAO> addresslist , List<StudentDAO> studentlist , int pin ){
		List<Integer> list = addresslist.stream()
						.filter(p -> p.getPin_code() == pin )
						.map(a -> a.getStudent_id())
						.collect(Collectors.toList()); 
		System.out.println(list);
		
		List<String> li = studentlist.stream()
						.filter(e -> list.contains(e.getId()))
						.map(e -> e.getName()).collect(Collectors.toList()) ; 
		return li ; 
		
	}
	
	public List<String> getStudentWithAge(List<StudentDAO> studentlist , int age ){
		List<String> list = studentlist.stream()
						.filter(p -> p.getAge() == age )
						.map(a -> a.getName())
						.collect(Collectors.toList()); 
		
		
		return list ; 
		
	}
	
	public List<String> getStudentWithGender(List<StudentDAO> studentlist , String gender  ){
		List<String> list = studentlist.stream()
						.filter(p -> p.getGender().equals(gender) )
						.map(a -> a.getName())
						.collect(Collectors.toList()); 
		return list ; 
		
	}
	
	public List<String> getStudentWithClass(List<StudentDAO> studentlist , int class_id  ){
		List<String> list = studentlist.stream()
						.filter(p -> p.getClass_id() == class_id )
						.map(a -> a.getName())
						.collect(Collectors.toList()); 
		return list ; 
		
	}
}
