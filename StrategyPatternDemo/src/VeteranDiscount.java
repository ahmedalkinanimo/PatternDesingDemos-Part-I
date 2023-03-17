
public class VeteranDiscount implements DiscountStrategy{
	
	public double applyDiscount(double total) {
		return total*0.85; // %15 veteran discount
		
	}

}
