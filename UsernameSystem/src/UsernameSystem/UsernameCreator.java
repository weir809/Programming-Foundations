package UsernameSystem;

public class UsernameCreator {
		
	//generates a username in the format of first initial and last name
		public static String generateUsername(String firstName, String lastName) 
		{
			
			char firstInitial = Character.toLowerCase(firstName.charAt(0));
			
			String formattedlastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
			
			String username = firstInitial + formattedlastName;
			
			
			return username;
		}
}
