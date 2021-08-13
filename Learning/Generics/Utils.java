package Generics;

public class Utils {
	
	public static void printUser(User user) {
		System.out.println(user);
	}

	public static void printUsers(GenericList<? extends User> users) {
//		System.out.println(user);
		User use = users.get(0);
		users.add(new User(10));
		
		
	}
}
