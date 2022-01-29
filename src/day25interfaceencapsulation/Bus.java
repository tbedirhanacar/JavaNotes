package day25interfaceencapsulation;

public class Bus implements AirCondition, HybridEngine {

	@Override
	public void electronicAc() {
		
		System.out.println("The Bus AC is semi-electronic AC...");

	}

	@Override
	public void climeateAc() {
		
		System.out.println("The Bus AC is not climate AC...");

	}

	@Override
	public void bacteriaKiller() {
		
		System.out.println("The Bus AC kills %85 bacteria...");

	}

	@Override
	public void havingHybridEngine() {
		
		System.out.println("The Bus engine is hybrid ");
	}

	@Override
	public void run() {
		
		System.out.println("The Bus AC works perfectly");
	}


}
