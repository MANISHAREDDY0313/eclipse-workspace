package conditions;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		
			
			//take two strings as input and print whether two strings are equal or not
			
			Scanner sc = new Scanner(System.in);//sc is a point of contact for console
			
			System.out.println("enter num1:");
			int n1 = sc.nextInt();
			
			System.out.println("enter num2:");
			int n2 = sc.nextInt();
			
			if(n1 == n2) {
			 System.out.println("numbers are equal");
			}else {
		     System.out.println("numbers are not equal");
				 
			}
	}
}


