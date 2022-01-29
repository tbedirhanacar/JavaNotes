package interviewquestions;

public class Sales {
	public static void main(String[] args) {
		
		int anaPara = 5760;
		int zamOrani = 10;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			anaPara = (int) zam(anaPara, zamOrani);
			System.out.println(anaPara);
			sum += anaPara;
		}
		System.out.println(sum);
	}
	
	
    public static double discount(int price, int percentage) {
        double priceAfterDiscount = price;
        double discount = priceAfterDiscount*percentage/100;
        priceAfterDiscount -= discount;
        return priceAfterDiscount;
    }
    
    public static double zam(int price, int percentage) {
        double priceAfterDiscount = price;
        double discount = priceAfterDiscount*percentage/100;
        priceAfterDiscount += discount;
        return priceAfterDiscount;
    }
}
