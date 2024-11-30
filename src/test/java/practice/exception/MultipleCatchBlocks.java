package practice.exception;

public class MultipleCatchBlocks {
public static void main(String[] args) {
	
	System.out.println("program execution is started");
	try {
	String name=null;
	System.out.println(name.length());
	}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	
	
	catch(NumberFormatException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	catch(NullPointerException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
	System.out.println("program execution is ended");
	
	
	
	
	
}
}
