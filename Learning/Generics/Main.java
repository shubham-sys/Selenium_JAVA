package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	User user1 = new Instructor(10);
	
	Utils.printUser(new Instructor(20));
	
	var users = new GenericList<Instructor>();
	
	Utils.printUsers(users);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("------------------------------------/n");	
		
	String s = "Shubham";
	Object o = s; // can convert from String to Object
	System.out.println(o);
		
	Object o2 = "string literal";
//	String s2 = o2; - Type mismatch: cannot convert from Object to String
	String s2 = (String) o2;
	System.out.println(s2);
	 
	List<String> ls = new ArrayList<>();
//	List<Object> lo = ls; Type mismatch: cannot convert from List<String> to List<Object>
	ls.add("asd");
	
	
	GenericList<Long> list = new GenericList<>();
	
	list.add(43L);
	System.out.println(list.get(0));
	
	
	}

}
