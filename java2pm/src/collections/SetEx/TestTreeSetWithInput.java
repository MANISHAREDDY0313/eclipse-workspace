package collections.SetEx;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class TestTreeSetWithInput {
	
	public static void main(String[] args) {
		
 		Set<String> names = new TreeSet<String>();
 		
 		Scanner sc = new Scanner(System.in);
 		
 		// input string till 'END' is encountered
 		while(true) {
 			System.out.println("enter name:");
 			String name = sc.next();
 			
 			if(name.equals("END")) {
 				break;
 			}
 			
 			names.add(name);
 		
 		}
 		 
 		// 4. display the names
 		System.out.println("******************printing all the names**********************");
 		for(String s: names) {
 			System.out.println(s);
 		}

 	}
 }



		
		