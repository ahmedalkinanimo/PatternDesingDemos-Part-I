
public class EmployeeDiscount implements DiscountStrategy{	
	public double applyDiscount(double total) {
		return total*0.75; // %25 employee discount
	}
	
}
