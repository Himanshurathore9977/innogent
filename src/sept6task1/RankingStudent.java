package sept6task1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RankingStudent {
	public List<String>checkRank(List<StudentDAO> studentList){
		 List <String> list  =  studentList.stream()
										.filter(a -> a.getMarks()>50) 
										.map(a  -> a.getName()) 
										.sorted(Comparator.reverseOrder())
										.collect(Collectors.toList());  
		return list ; 
		
	}
}
