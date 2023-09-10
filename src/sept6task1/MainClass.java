package sept6task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		String filePath = "D:\\Innogent Training\\Daily Task\\Sept6 task1\\class.csv" ; 
		ServiceClass  sc = new ServiceClass() ; 
		List<ClassDAO> classlist  = sc.UploadClass(filePath) ; 
		
		
		String filePath1 = "D:\\Innogent Training\\Daily Task\\Sept6 task1\\student.csv" ;  
		List<StudentDAO> studentlist  = sc.uploadStudent(filePath1) ; 
		
		
		String filePath2 = "D:\\Innogent Training\\Daily Task\\Sept6 task1\\address.csv" ;  
		List<AddressDAO> addresslist  = sc.uploadAddress(filePath2) ; 

		
		
		
		// stuednt of pin x 
		SearchStudent	ss = new SearchStudent() ; 
		List<String> st = ss.getStudentWithPin(addresslist, studentlist, 452002) ; 
		System.out.print("With Pin - ");
		st.forEach(a -> System.out.print(a + "  "));
		
		System.out.print("\n" + "with Age ");
		ss.getStudentWithAge(studentlist, 11).forEach(a -> System.out.print(a + " _ ")) ; 
		System.out.print("\n" + "with Class ");
		ss.getStudentWithClass(studentlist, 2).forEach(b -> System.out.print(b+ " - ")) ; 
		System.out.print("\n" + "with Gender  ");
		ss.getStudentWithGender(studentlist, "F").forEach(c -> System.out.print(c+ " _ ") ); 
		
		
		
		//Find all students of city ex X = Indore. I can pass different filters like gender, age, class
		SearchWithCity seachsc = new SearchWithCity() ; 
		seachsc.getStudentWithCity(addresslist, studentlist, "Indore").forEach(a -> System.out.print(a + "  ")) ; 
		
		System.out.println("\n\n" + "Passed Student" );
		// passes student 
		PassedSutudent ps = new PassedSutudent(); 
		ps.getPassedStudent(studentlist).forEach(a -> System.out.print(a + "  "));
		
		//failed  student 
		System.out.println("\n\n" + "Failed Student" );
		FailedStudent fs = new FailedStudent() ; 
		fs.getFailedStudent(studentlist).forEach(a -> System.out.print(a + "  "));
		
		
		//student of class x  
		System.out.println("\n\n" + "Student of x class ");
		StudentOfClassX stObj = new StudentOfClassX() ; 
		stObj.getStudent(classlist, studentlist, "C").forEach(a -> System.out.print(a + "  "));
		
		System.out.println("\n\n" + "Student of x class ");
		FailByAge fa = new FailByAge() ;
		fa.checkFail(studentlist).forEach(a -> System.out.print(a +  "   "));
		/*
		int flag = true ; int flag1 = true ; int flag2 = true ; 
		RankingStudent rs = new RankingStudent() ; 
		rs.checkRank(studentlist)
		.forEach(a -> 
			if(flag) {
				System.out.println("First Rank " + a );
				flag = false ; 
			}
			else if(flag1 ) {
				System.out.println("Second Rank " + a );
			}
			else if(flag2) {
				System.out.println("Third Rank " + a );
			}
			else System.out.println("passed " + a )			
				
		); 
		*/
		System.out.println("\n\n" + "Pagnited Students  ");
		PagnitedStudent pg = new PagnitedStudent() ; 
		List <StudentDAO>  pagList = pg.getPagnited(studentlist, 0 , 3) ; 
		pagList.forEach(a -> System.out.println(a.getName() + "   "+a.getAge()+ "	"  + a.getId() +"	"+ a.getGender()  ));
	
	
		// print list 
		System.out.println("\n\n" + "Pagnited Students order by  name   ");
		pg.getPagnitedOrderedByname(studentlist, 0 , 3)
				.forEach(a -> System.out.println(a.getName() + " " + a.getAge() + "  " )); 
		
		
		System.out.println("\n\n" + "Pagnited Students order by  name   ");
		pg.getPagnitedOrderedByname(studentlist, 0 , 3)
		.forEach(a -> System.out.println(a.getName() + " " + a.getAge() + "  " )); 

	}
	
}