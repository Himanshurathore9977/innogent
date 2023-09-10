package sept6task1;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FailByAge {
	public List<String> checkFail(List<StudentDAO> studentlist){
		return studentlist.stream()
				.filter(a -> a.getAge() > 20 )
				.map(s -> s.getName())
				.collect(Collectors.toList()) ; 
				
	}
}
