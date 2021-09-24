package test;

public class ExceptionHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10 ;
		int[] b = {1,3,6};
		
		try {
//			System.out.println(a/0);
			System.out.println(b[6]);
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Inside Arithmatic");
		}
		catch(NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("Inside Null pointer");
		}
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("if none other mentioned exception raised it will handle");
		}
		finally {
			System.out.println("In finally");
		}
		
		System.out.println("After all catch");

	}

}
