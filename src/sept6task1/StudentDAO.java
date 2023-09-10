package sept6task1;

public class StudentDAO {

	private int id ; 
	private String  name ; 
	private int class_id ;  
	private String gender ; 
	private int marks ; 
	private int age ;
	
	
	public StudentDAO( int id , String name, int class_id, int marks, String gender, int age) {
		this.id = id ; 
		this.name = name ;
		this.class_id = class_id ; 
		this.gender = gender ; 
		this.marks = marks ; 
		this.age = age ; 
	}
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
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	
	
	
}
