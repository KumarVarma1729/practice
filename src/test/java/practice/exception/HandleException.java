package practice.exception;

import java.util.Scanner;

public class HandleException {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	int value=100;
	try {
System.out.println(value/num);
	}
	catch(ArithmeticException e){
		System.out.println("entered invalid number");
		
	}

}
}
