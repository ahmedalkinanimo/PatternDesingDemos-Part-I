
public class BuildPizza {
	private String crustType;
	private String pizzaType;
	private String cut;
	private String cookingMethod;
	
	public String getCrustType() {
		return crustType;
	}
	public BuildPizza setCrustType(String crustType) {
		this.crustType = crustType;
		return this;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public BuildPizza setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
		return this;
	}
	
	public String getCookingMethod() {
		return cookingMethod;
	}
	public BuildPizza setCookingMethod(String cookingMethod) {
		this.cookingMethod = cookingMethod;
		return this;
	}
	
	
	public String getCut() {
		return cut;
	}
	public BuildPizza setCut(String cut) {
		this.cut = cut;
		return this;
	}
	
	
	public Pizza build() {
		return new Pizza(crustType,pizzaType,cut,cookingMethod);
	}
}
