
public class StudentDiscount implements DiscountStrategy{
	
	public double applyDiscount(double total) {
		return total*0.9; // %10 student discount
		
	}

}