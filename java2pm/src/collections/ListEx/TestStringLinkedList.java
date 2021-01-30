package collections.ListEx;

//create LinkedList for Strings
//store names inside the LinkedList
//print the LinkedList

import java.util.LinkedList;
import java.util.List;

public class TestStringLinkedList {


	public static void main(String[] args) {
			
			//1.Create arraylist for String
			List<String> names = new LinkedList<String>();
			
			// 2. add names
			names.add("kumar");
			names.add("ram");
			names.add("raj");
			names.add("shyam");
			names.add("teju");
			
			
			// display names:
			System.out.println("***print all names***");
			for(String n: names) {
				System.out.println(n);
			}
		}
}


