package test;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=50;i++)
		{
			if(i%2 ==0) {
				System.out.println("even num : "+ i);
			}else {
				System.out.println("odd num : "+ i);
			}
			
		}
		
		int age = 30;
		if(age >=18) {
			System.out.println("Can Vote");
		}
		else if(age == 17) {
			System.out.println("You will get eligible by next year");
		}
		else {
			System.out.println("Cant vote");
		}

	}

}
