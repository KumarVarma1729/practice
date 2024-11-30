package practice.exception;

public class FinallyBlock {
public static void main(String[] args) {
	System.out.println("program execution is started");
	try {
	String name="we";
	System.out.println(name.length());

	}
	catch(NumberFormatException e) {
		System.out.println("catch block is handled");
		System.out.println(e.getMessage());
	}
	catch(NullPointerException e) {
		System.out.println("catch block is handled");

		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("finally block is executed");
	}
	System.out.println("program execution is ended");
}
}
