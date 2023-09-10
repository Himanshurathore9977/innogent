package sept6task1;

import java.util.List;
import java.util.stream.Collectors;

public class FailedStudent {
	public List<String> getFailedStudent(List<StudentDAO> studentlist ){
		return  studentlist.stream()
		.filter(e -> e.getMarks() < 35)
		.map(a -> a.getName())
		.collect(Collectors.toList()) ; 
	}
}
