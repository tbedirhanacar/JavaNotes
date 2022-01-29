package day21accessmodifiersstigbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
	
		//1.Way
		StringBuilder sb1 = new StringBuilder();//Gives you empty String. Default capacity is 16
		System.out.println("sb1 is : " + sb1);//sb1 is : 
				
		//Altough we didn't do assignment, original value of sb1 is updated to "Ali", it means String Builder is mutable
		sb1.append("Ali");
		System.out.println("sb1 is : " + sb1);//sb1 is : Ali
		
		sb1.append(" Can");
		System.out.println("sb1 is : " + sb1);//sb1 is : Ali Can
		
		sb1.append(", how").append(" are").append(" you?");
		System.out.println("sb1 is : " + sb1);//sb1 is : Ali Can, how are you?
	
		
		//2.Way
		StringBuilder sb2 = new StringBuilder("Ali Can");
		System.out.println("sb2 is: " + sb2);//sb2 is: Ali Can

		
		sb2.append(" went to school.");
		System.out.println("sb2 is: " + sb2);//sb2 is: Ali Can went to school.

		//3.Way
		StringBuilder sb3 = new StringBuilder(9);//9 is the capacity of the StringBuilder
		
		sb3.append("1234");
		System.out.println("sb3 is :" + sb3);
		
		sb3.append("56789");
		System.out.println("sb3 is :" + sb3);
		
		System.out.println(sb3.capacity());//9
		
		sb3.append("Woow!");
		System.out.println("sb3 is :" + sb3);
		
		System.out.println(sb3.capacity());//9*2+2 = 20
	
	}

}
