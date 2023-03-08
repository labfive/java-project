/**
 * Java sample code 
 */
package starter;

public class Message {
	
	public static void dispMessage() {
		
		System.out.println("This is a static reference");
	}

	public void dispAge() {
		
		int age = 25; 
		System.out.println("This is a non-static reference" +age);
		
	}
	
	public static void main(String[] args) {
		
		dispMessage(); 
		Message obj = new Message(); 
		obj.dispAge();
	}

}
