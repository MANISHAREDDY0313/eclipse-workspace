package Java08.Features.Lambda;
//Applicable for one line of code and return statement.
public class TestLambda5APP2 {

		public static void main(String[] args) {
		System.out.println("*************approach2 Lambda return applicable for only one statement *********************");
		Calculator c2 = (a,b) -> ( a+b ) ; // returns a+b
		int sum = c2.calculate(200, 100);
		System.out.println(sum);

		Calculator c3 = (a,b) -> ( a-b ) ;// returns a-b
		int sub = c3.calculate(200, 100);
		System.out.println(sub);

		Calculator c4 = (a,b) -> ( a/b ) ;// returns a/b
		int div = c4.calculate(200, 100);
		System.out.println(div);
		}
		}


