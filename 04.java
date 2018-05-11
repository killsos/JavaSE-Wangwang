package demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		float c = 30.12f;
		//强制类型转化，数据类型兼容，数据有可能丢失 
		int a = (int)c; 
		System.out.println(a);
		boolean isLove = true; 
		
		//数据类型不兼容，无法转换 
		
		//int b = (int)isLove;
	}
}
