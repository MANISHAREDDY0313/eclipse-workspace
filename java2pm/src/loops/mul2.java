package loops;

import java.util.Scanner;

public class mul2 {
	//take no,as input print  multiplication table till input
	
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		for(int i=1; i<=10; i++){
			int res = size*i;
			System.out.println(size +" * " + i + " = " +res);
		}
	}

}
