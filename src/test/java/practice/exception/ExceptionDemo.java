package practice.exception;

import java.util.Scanner;

public class ExceptionDemo {
public static void main(String[] args) {
	
	System.out.println("program execution is started");
	
	Scanner sc=new Scanner(System.in);
	/*
	int num=sc.nextInt();
	
	int value=100;
	
	System.out.println(value/num);//arthematic exception
	*/
	
	/*
	int[] a=new int[5];
	
System.out.println("enter position");

int pos=sc.nextInt();

System.out.println("enter value");
int vlaue=sc.nextInt();

System.out.println(a[pos]);//arrayindexboundexception
*/
	/*
	String name="welcome";
int num=Integer.parseInt(name);	//numberformatexception
*/
	
	String name=null;
	System.out.println(name.length());
	System.out.println("program execution is ended");//nullpointerexception
}
}
