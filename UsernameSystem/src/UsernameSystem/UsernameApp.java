package UsernameSystem;


public class UsernameApp {
	
	public static void main(String[] args) 
	{
		// Create an instance of Keyboard1 since getString() is not static
		Keyboard1 keyboard = new Keyboard1();
		
			//create a username by entering your Forename and Surname
			System.out.println("Enter your first name: ");
			String firstName = keyboard.getString();
			
			System.out.println("Enter your last name: ");
			String lastName = keyboard.getString();
	
			//display username
			String username = UsernameCreator.generateUsername(firstName, lastName);
			System.out.println("Generated username: " + username);

	}
}
