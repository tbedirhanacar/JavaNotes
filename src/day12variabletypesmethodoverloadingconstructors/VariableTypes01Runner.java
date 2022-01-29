package day12variabletypesmethodoverloadingconstructors;

public class VariableTypes01Runner {

	public static void main(String[] args) {
		
		VariableTypes01 obj1 = new VariableTypes01();
		System.out.println(obj1.name);		
		obj1.name = "Veli Han";
		System.out.println(obj1.name);
		
		System.out.println(obj1.id);
		obj1.id = "New Id";
		System.out.println(obj1.id);
		
		VariableTypes01 obj2 = new VariableTypes01();
		System.out.println(obj2.name);
		
		System.out.println(obj2.id);
		
	}

}
