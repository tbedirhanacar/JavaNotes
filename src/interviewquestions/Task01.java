package interviewquestions;

public class Task01 {
	
	/*
		Write a java program to reverse the string
	 */

	public static void main(String[] args) {
		

		String s = "Bonsoir Elliot";//Create string
		String sNew = "";//Create temp string
		
		for (int i = s.length()-1; i >= 0; i--) {//For loop to assign every character  to temp string one by one in reverse order	
			sNew = sNew + s.substring(i, i+1);

		}
		
		System.out.println(sNew);//Print temp String
		
		//s = sNew; //Optional
			
		

	}

}
//t1000 was here