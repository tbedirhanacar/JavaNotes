package day13statickeyword;

public class CarsRunner {

	public static void main(String[] args) {
		
		//Inside the Cars Class, we have 6 variables
		//but by using class name you can access just
		//static variables
		System.out.println(Cars.numOfCars);
		
		Cars c1 = new Cars();
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
		
		//Static variables can be accessed by using objects as well
		//but it is not recommended because static variable is not related with the object.
		//Therefore, you are getting yellow underline.
		System.out.println(c1.numOfCars);
		
		//drive() method is non-static therefore to access drive() method, I used c1 object
		c1.drive();
		
		Cars c2 = new Cars("Honda", "Civic", 7000, 2012);
		String vinC2 = Cars.createVin(c2);
		System.out.println(vinC2);
		
		Cars c3 = new Cars("Audi", "R8", 57000, 2021);
		String vinC3 = Cars.createVin(c3);
		System.out.println(vinC3);
	}

}
