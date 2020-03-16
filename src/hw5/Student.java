package hw5;

public class Student {
	/* define class variables */
	private String name;
	private int id;
	private String phone;
	private String address;
	private int age;
	private String department;
	
	/* define 13 methods for class */
	
	public Student(int newid, String newname) {
		id = newid;
		name = newname;
	}
	
	public void setID(int id) {
		
	}

	public int getID() {
		return id;		
	}
	
	void setAddress(String address) {
		
	}
	
	String getAddress() {
		return address;
	}
	
	protected void setPhone(String phone) {
		
	}
	
	protected String getPhone() {
		return phone;
	}
	
	public void setAge(int age) {
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setDepartment (String department) {
		
	}
	
	public String getDepartment(int id, String name) {
		return department;
	}
	
	public void printStudentInfo() {
		System.out.println("Here is the student information");
		System.out.println("Name is " + name);
		System.out.println("Id is " + id);
		System.out.println("Phone number is " + phone);
		System.out.println("Address is " + address);
		System.out.println("Age is " + age);
		System.out.println("Department is " + department);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age1 = 25;
		String name1 = "Barrack Obama";
		Student student = new Student(age1, name1);		
		student.phone = "2128574309";
		student.address = "One Infite Loop, Cupertino, California 95014";
		student.age = 33;
		student.department = "ITWS";
		student.printStudentInfo();
	}

}
