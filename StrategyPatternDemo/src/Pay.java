
public class Pay {
	DiscountStrategy Ds;
	public Pay(DiscountStrategy Ds) {
		this.Ds=Ds;
	}
	public double applyDiscount(double total) {
		return Ds.applyDiscount(total);
	}
	
}
