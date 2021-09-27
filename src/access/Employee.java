package access;

public class Employee extends Person {

	public int EmpId ;
	public int salary;
	String department;
	
//	public Employee() {
//		System.out.println("Non parameterised constructor..");
//	}
//	
//	public Employee(int empid,int salary) {
//		super();
//		this.EmpId = empid;
//		this.salary = salary;
//	}
	
	public Employee(String name,int age,String city,int empid,int salary) {
		super(name,age,city);
		this.EmpId = empid;
		this.salary = salary;
		
		
//		this.display();
	}
	
	public void display() {
		System.out.println("EmpId is : "+ EmpId);
		System.out.println("Salary is : "+ salary);
 		System.out.println("Department is: "+ department);
	}
	
}
