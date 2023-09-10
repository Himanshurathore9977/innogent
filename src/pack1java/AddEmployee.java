package pack1java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddEmployee {
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
		GenderCount gc= new GenderCount() ; 
		int mcount  =  gc.maleCount(employeeList) ; 
		System.out.println(mcount);
		int fcount  =  gc.femaleCount(employeeList) ; 
				System.out.println(fcount);
		
		DepartmentList pd = new DepartmentList(); 
		System.out.println(DepartmentList.getDepartmentSet(employeeList));
	
		AverageAge av = new AverageAge() ; 
		int Favg = av.femaleAvgAge(employeeList , fcount ) ;
		System.out.println(Favg);
		int Mavg = av.maleAvgAge(employeeList, mcount);
		System.out.println(Mavg);
		
		HighestPaidEmployee hp = new HighestPaidEmployee();
		Employee e = hp.getHighestPaidEmployee(employeeList) ; 
		System.out.println(e.getSalary());
		
		
		JoinedAfterYear jobj  = new  JoinedAfterYear() ;
		List<String> list = 	jobj.getJoinedAfter(employeeList); 
		System.out.println(list.toString());
		
		EmployeeINEachDepy edept = new EmployeeINEachDepy() ; 
		Map<String ,  List<Employee> > map = edept.count(employeeList) ;
		for(Map.Entry x:edept.count(employeeList).entrySet()){
	          System.out.println(x.getKey() + "  :  " );
	          List <Employee> value = (List<Employee>) x.getValue() ; 
	          for(Employee er : value ) {
	        	  System.out.print(er.getName() + "  ,  ");
	          }
	          System.out.println();
	          System.out.println();
	       }
		
		System.out.println("Average Salary ");
		AverageSalofDept avgSa = new AverageSalofDept() ; 
		System.out.println(avgSa.averageAgeOfFemale(employeeList)  ) ; 
		System.out.println(avgSa.averageAgeOfMale(employeeList)  );
		
		
		//map.forEach((e , s) -> System.out.println(e + " " + s.get().getClass()));
		System.out.println("yaha rrak ");
		System.out.println();
		System.out.println();
		
		AverageSalofDept agv = new AverageSalofDept() ;
		Map<String , List<Employee>> mmap = agv.getAverageSalOfDept(employeeList);
		
		
		for(Map.Entry x:agv.getAverageSalOfDept(employeeList).entrySet()){
	          System.out.println(x.getKey() + "  :  " );
	          List <Employee> value = (List<Employee>) x.getValue() ; 
	          for(Employee er : value ) {
	        	  System.out.print(er.getName() + "  ,  ");
	          }
	          System.out.println();
	          System.out.println();
	    }
		
		
		
		
		//oldest employee 
		OldestEmployee old = new  OldestEmployee() ; 
		Employee oldemp = old.oldestEmp(employeeList) ; 
		System.out.println("Older Employee "+ oldemp.getName() ); 
	}
	

}
