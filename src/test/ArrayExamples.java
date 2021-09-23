package test;

import java.util.Scanner;

public class ArrayExamples {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {11,22,66,44,25,21,41};
		
		System.out.println("Element 3rd: "+ array1[2]);
		
		System.out.println("Length of array: "+ array1.length);
		
		System.out.println(array1[array1.length -1]);
		int i;
		//forward loop or ascending order
		System.out.println("ascending order");
		for(i = 0; i< array1.length ; i++) {
			System.out.println(array1[i]);
		}
		//reverse order
		System.out.println("reverse order");
		for (i = array1.length-1; i>=0 ; i--) {
			System.out.println(array1[i]);
		}
		//for each
		System.out.println("for each");
		for(int a:array1) {
			System.out.println(a);
		}
		
		// iterate through over string
		String stri = "Clean India";
		System.out.println("Looping over each char or string");
		for(i = 0; i<stri.length();i++) {
			System.out.println(stri.charAt(i));
		}
		
		// iterate reverse through over string
				String reverse = "";
				System.out.println("Reverse Looping over each char or string");
				for(i = stri.length()-1; i<=0;i--) {
					reverse += stri.charAt(i);
				}
				System.out.println(reverse);
				
				
				//count a character in string
				String string = "Indias Cleanest city is Indore";
				 int ct = 0;  
				 char a = 'i';
		            
			        //Counts each character except space    
			        for(i = 0; i < string.length(); i++) {    
			            if(string.charAt(i) == a)    
			                ct++;    
			        }    
			            
			        //Displays the total number of characters present in the given string    
			        System.out.println("Total number of characters in a string: " + ct); 
			        
			        String[] strarray = string.split(" ");
			        
			        System.out.println("Counting strings in array:  "+strarray.length);
				
//				Reversing a num
				System.out.println("Reversing a Number: ");
				int num = 7388884;
				int count = 0;
				while(num != 0) {
					int var = num%10;
					System.out.println(var);
					num = num/10;
					count++;
				}
				//num count
				System.out.println("Number counting: total numbers are :");
				System.out.println(count);
//				  
//	}
}
}
