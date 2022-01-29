package day29exceptions;



public class Exception02 {

	public static void main(String[] args) {
	
		divide(5, 2);
	
		divide(5, 1);
	
	}
	
	public static void divide(int a, int b) {

		try {
			if(b==1) {
				throw new DivideByOneException("No need to divide a number by 1");
			}else {
				System.out.println("Result is " + a/b);
			}
		} catch (DivideByOneException e) {
			System.err.println(e.getMessage());
		}

	}

}

//Create custom Runtime Exception
/*
 	To create a RuntimeException follow the came steps with Comple Time Exception creation.
 	Only difference is you have to extend to RuntimeException instead of Exception
 	
 	
 	
 */
class DivideByOneException extends RuntimeException {
	
	public DivideByOneException(String message) {
		super(message);
	}
	
}
