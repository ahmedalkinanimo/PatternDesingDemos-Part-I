
/***
 * 
 * @author aaljanabi
 * The Strategy Pattern is a design pattern in Object-Oriented Programming (OOP) that allows 
 * you to define a family of algorithms, encapsulate each one as an object, and make them 
 * interchangeable at runtime. This means that you can choose the algorithm you want to use 
 * at runtime instead of hardcoding it into your code.
 * 
 * Implement the Strategy Pattern to allow different discount strategies to be applied to a 
 * shopping cart at runtime. You can define a Context class that takes a Strategy object 
 * (the discount strategy) in its constructor, and an interface called DiscountStrategy that 
 * defines the applyDiscount() method.
 */
public class MainClass {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	double yourTotal=1000;
	Pay order=new Pay(new StudentDiscount());
	System.out.println(order.applyDiscount(yourTotal));
	order=new Pay(new VeteranDiscount());
	System.out.println(order.applyDiscount(yourTotal));
	order=new Pay(new EmployeeDiscount());
	System.out.println(order.applyDiscount(yourTotal));
	
	DiscountStrategy vetDiscount=new VeteranDiscount();  // last
	DiscountStrategy stuDiscount=new StudentDiscount();  // second
	DiscountStrategy empDiscount=new EmployeeDiscount(); // first
	Pay order1=new Pay(vetDiscount);
	double afterDiscount=order1.applyDiscount(stuDiscount.applyDiscount(empDiscount.applyDiscount(yourTotal)));
	System.out.println(afterDiscount);
  }
}

