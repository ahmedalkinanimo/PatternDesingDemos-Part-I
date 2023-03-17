
public class Pizza {
	private String crustType;
	private String pizzaType;
	private String cut;
	private String cookingMethod;
	
	public Pizza(String crustType,String pizzaType,String cut,String cookingMethod) {
		this.crustType=crustType;
		this.pizzaType=pizzaType;
		this.cut=cut;
		this.cookingMethod=cookingMethod;
	}
	
	public String getCrustType() {
		return crustType;
	}
	public void setCrustType(String crustType) {
		this.crustType = crustType;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public String isCut() {
		return cut;
	}
	public void setCut(String cut) {
		this.cut = cut;
	}
	public String getCookingMethod() {
		return cookingMethod;
	}
	public void setCookingMethod(String cookingMethod) {
		this.cookingMethod = cookingMethod;
	}
	

	public String toString() {
		return "{Pizza Type: "+pizzaType+". Crust Type: "+crustType+". Cooking Method: "+cookingMethod+". Cut?: "+cut+"}";
	}
	
}
