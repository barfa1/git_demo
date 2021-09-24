package test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		ThrowExample obj = new ThrowExample();
		try {
			obj.ageCheck(age);
		}catch(ArithmeticException ex) {
			System.out.println("Arithmatic exception occured");
			ex.printStackTrace();
		}
		System.out.println("end....");
		

	}
	
	public void ageCheck(int age) {
		if(age <=17) {
			throw new ArithmeticException("Less than 18 not allowed ");
		}
		else {
			System.out.println("Eligible...");
		}
	}

}
