package interviewquestions;

public class HappyNumbers {

	public static void main(String[] args) {
		System.out.println(happy(7));


	}
	
	public static boolean happy(int number) {
		int num=number;
		int numInSequence = 0;
		while(num!=1 && num!=4) {
			while (num >= 1) {
				numInSequence += Math.pow(num % 10, 2);
				num /= 10;
			} 
			num = numInSequence;
			numInSequence = 0;
			pause(1000);
			System.out.println(num);
			
		}
		if (num==1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	

}
