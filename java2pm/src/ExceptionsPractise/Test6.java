package ExceptionsPractise;

public class Test6 {
public static void main(String[] args) {
	System.out.println("statement1");
	try {
		System.out.println(10/0);
		}
	catch(Exception e) {//ArithmaticException
		System.out.println(10/2);
	}
	System.out.println("statement3");
	}
}
