package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		switch(age) {
		case 12:
			System.out.println("You're not eligible");
			break;
		case 13:
			System.out.println("Not Eligible");
			break;
		
		case 15:
			System.out.println("Will eligible in 3 years ");
			break;
		
		
		
		case 17:
			System.out.println("Will eligible next year");
			break;
		case 18:
			System.out.println("You're eligible");
			break;
			
		
		default:
			System.out.println("Default block case");
		
		}

	}

}
