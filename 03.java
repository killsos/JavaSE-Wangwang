package demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a = 10, b = 20; 
		float f = 10.2f; 
		boolean isLove = true; 
		String msg = "hello";
		
		//任何数据类型与String相加，自动转换为String类型 
		String msg2 = msg + a;
		String msg3 = msg + f;
		String msg4 = msg + isLove; 
		System.out.println(msg2); 
		System.out.println(msg3); 
		System.out.println(msg4);
		
		//快速把某类类型转换为String的方法
		String msg5 = a + ""; 
		System.out.println("msg5 = " + msg5);
	
	}
}
