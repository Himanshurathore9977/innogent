package sept6task1;

import java.util.List;
import java.util.stream.Collectors;

public class StudentOfClassX {
	public List<String> getStudent (List<ClassDAO> classList , List<StudentDAO> studentList , String className){
		
		List<Integer> classIdList = classList.stream()
				.filter(a -> a.getName().equalsIgnoreCase(className))
			.map(c -> c.getId()).collect(Collectors.toList()) ; 

		List<String> list = studentList.stream()
								.filter(a -> classIdList.contains(a.getClass_id()))
								.map(m -> m.getName())
								.collect(Collectors.toList());
	
		return list ; 
	}
}
