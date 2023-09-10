package sept6task1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PagnitedStudent {
	public List<StudentDAO> getPagnited(List<StudentDAO> studentList , int start , int end ) {
		return studentList.stream()
		.filter(a -> a.getGender().equals("F"))
        .skip(start)
        .limit(end)
        
        .collect(Collectors.toList());
		
		
//		The skip(long N) is a method of java.util.stream.Stream object. 
//		This method takes one long (N) as an argument and returns a stream after 
//		removing first N elements. skip() can be quite expensive on ordered parallel pipelines, 
//		if the value of N is large, because skip(N) is constrained to skip the first N elements in 
//		the encounter order and not just any n elements.
//		Note : If a stream contains less than N elements, then an empty stream is returned.
		
		
		/*The limit(long N) is a method of java.util.stream.Stream object. 
		 * This method takes one (long N) as an argument and returns a stream of 
		 * size no more than N. limit() can be quite expensive on ordered parallel
		 *  pipelines, if the value of N is large, because limit(N) is constrained 
		 *  to return the first N elements in the encounter order and not just any n elements.
		 */
	}
	
	public List<StudentDAO> getPagnitedOrderedByname(List<StudentDAO> studentList , int start , int end ){
		return studentList.stream()
				.filter(a -> a.getGender().equals("F"))
		        .skip(start)
		        .limit(end)
		        .sorted(Comparator.comparingInt(StudentDAO::getAge))
		        .collect(Collectors.toList()) ; 
		
	}
	public List<StudentDAO> getPagnitedOrderedByMarks(List<StudentDAO> studentList , int start , int end ){
		return studentList.stream()
				.filter(a -> a.getGender().equals("F"))
		        .skip(start)
		        .limit(end)
		        .sorted(Comparator.comparingInt(StudentDAO:: getMarks))
		        .collect(Collectors.toList()) ; 
		
	}
	/*
	public List<StudentDAO> getPagnitedOrderedByMar(List<StudentDAO> studentList , int start , int end ){
		return studentList.stream()
				.filter(a -> a.getGender().equals("F"))
		        .skip(start)
		        .limit(end)
		        .sorted(Comparator.comparingInt(StudentDAO:: getMarks))
		        .collect(Collectors.toList()) ; 
		
	}
	*/
	
	
}
