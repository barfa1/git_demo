package access;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp = new Employee();
//		emp.display();
//		
//		
//		Employee newemp = new Employee(1125,50000);
////		newemp = null;
//		newemp.display();
		
		
		//Polymorphism (compile time polymorphism)
		
		Polymorphism pl = new Polymorphism();
		
		System.out.println("First: "+ pl.add(4,8));
		System.out.println("First: "+ pl.add(4,8,5));
		System.out.println("First: "+ pl.add(4,8,5,9));
		
		
		//Getter Setter
		
		Account acc = new Account();
		acc.setBal(2000000);
		acc.setAcc_name("Shubham Varfa");
		acc.setAcc_no(621564563);
		System.out.println(acc.getAcc_name()+" "+acc.getBal()+ " " + acc.getAcc_no());
		
		
		
		

	}

}
