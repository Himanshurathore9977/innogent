package pack1java;

public class Employee {

	
	private int id;

	private String name;

	private int age;

	private String gender;

	private String department;

	private int yearOfJoining;

	private double salary;
	
	
	
	/*
	Employee(int id , String name , int age , String gender, String department, int yearOfJoining , double salary  ){
		this.id = id ; 
		this.name =  name ; 
		this.age = age ; 
		this.gender = gender ; 
		this.department = department ;
		this.yearOfJoining = yearOfJoining ; 
		this.salary = salary ; 
	}
*/

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public int getYearOfJoining() {
		return yearOfJoining;
	}



	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public Employee(int id2, String name2, int age2, String gender2, String department2, int yearOfJoining2,
			double salary2) {
		this.id = id2 ; 
		this.name =  name2 ; 
		this.age = age2 ; 
		this.gender = gender2 ; 
		this.department = department2 ;
		this.yearOfJoining = yearOfJoining2 ; 
		this.salary = salary2 ;
		// TODO Auto-generated constructor stub
	}
	

}
