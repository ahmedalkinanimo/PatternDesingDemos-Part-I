/**
 * 
 * @author aaljanabi
 * The Builder Pattern is a creational design pattern used in Object-Oriented Programming (OOP) 
 * that allows you to create complex objects step-by-step by separating the construction of a 
 * complex object from its representation.
 * 
 * The main idea behind the Builder Pattern is to use a separate builder object to create an 
 * object with complex initialization. The builder object contains all the necessary methods to 
 * construct the complex object. It allows the client code to create the object step-by-step by 
 * calling the appropriate methods of the builder object.
 */
public class MainMethodClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza P1=new BuildPizza()
				.setPizzaType("Cheese")
				.setCrustType("Thin")
				.setCookingMethod("Well Done")
				.setCut("No")
				.build();
		System.out.println(P1);
	}

}
