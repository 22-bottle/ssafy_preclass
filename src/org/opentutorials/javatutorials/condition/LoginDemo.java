package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		String id = args[0];
        if(id.equals("lhb")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
	}
}
