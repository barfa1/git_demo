package test;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ThrowsExample obj = new ThrowsExample();
				try {
					obj.calculator();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			public void calculator() throws InterruptedException {
				method();
			}
			public void method() throws InterruptedException {
				System.out.println("Inside Method 1");
				
				Thread.sleep(3000);
				
				System.out.println("Finished Method 1");
				
			}


}
