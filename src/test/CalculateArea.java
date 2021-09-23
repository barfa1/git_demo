package test;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		
		double pi = 3.14;
		double result = pi*r*r;
		System.out.println(result);

	}

}
