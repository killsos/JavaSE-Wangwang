package demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// 把字符串转换为基本类型 
		String str1 = "10"; 
		String str2 = "10.2"; 
		String str3 = "boolean";
		
		// 与基本数据类型对应的有八个包装类 
		// int的包装类为Integer
		int a = Integer.parseInt(str1); 
		System.out.println(a); // 10
		System.out.println(str1 + 10); // 1010
		System.out.println(a + 10); // 20
		
		//float的包装类为Float
		float b = Float.parseFloat(str2); 
		System.out.println(b);
		
		//boolean的包装类为Boolean
		boolean c = Boolean.parseBoolean(str3); 
		System.out.println(c);
	}
}
