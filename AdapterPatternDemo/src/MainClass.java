/***
 * 
 * @author aaljanabi
 * Adapter Pattern enables the collaboration between two incompatible interfaces or classes by 
 * creating an adapter class that acts as a bridge between them. It allows two or more 
 * unrelated classes to work together by wrapping an object of one class with an interface 
 * that is compatible with another class.
 * In simpler terms, the adapter pattern allows us to translate the interface of one class 
 * into another interface that clients expect. It is like a translator who translates the 
 * language of one person into another person's language so that they can communicate with 
 * each other.
 * 
 Suppose you have a class that represents a person's contact information with properties such as 
 name, email, and phone. You want to use this class with an API that requires contacts to be 
 represented as objects with firstName, lastName, emailAddress, and phoneNumber properties. Use 
 the Adapter pattern to adapt the contact class to work with the API.
 
 */


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact person=new Contact("Adam Alkinani","adam@singingMonsters.com","8165990253");
		APIContact adaptedData=new contactAdapter(person);
		System.out.println(adaptedData);
		
	}

}
