package day25interfaceencapsulation;

public class Runner {

	public static void main(String[] args) {

		Car car1 = new Car();
		
		car1.bacteriaKiller();
		car1.climeateAc();
		car1.electronicAc();
		car1.havingHybridEngine();
		
		//When you use "default" keyword to create "concrete method" in an interface, you can call the method only by using "object name"
		car1.move();
		
		//When you use "static" keyword to create "concrete method" in an interface, you can call the method only by using "interface name"
		Vehicle.staticMove();
		
		System.out.println(AirCondition.MAKE);//Samsung
		
		System.out.println(HybridEngine.MAKE);//Honda Eco
		
	}

}
