package day25interfaceencapsulation;

public abstract class ElectricalVehicles implements AirCondition, HybridEngine{

	@Override
	public void climeateAc() {
		
		System.out.println("The electrical vehicle has climate AC");
		
	}

	@Override
	public void run() {
		
		System.out.println("Electrical vehicle is the best...");
		
	}
	
	@Override
	public abstract void electronicAc();

}
