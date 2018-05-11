package demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a = 10;
		//a ++;// a = a + 1; 
		//System.out.println("a = " + a); //11 
		System.out.println("a = " + (a++));
		System.out.println("a = " + (++a)); // 12
		++ a;
		// a = a + 1; 
		System.out.println("a = " + a); //12
		int b = a ++;//先使用 后自加， 
		System.out.println("a = " + a);//a = 13 
		System.out.println("b = " + b);//b = 12 
		int c = ++ a;//先自加 后使用 
		System.out.println("a = " + a);//a = 14 
		System.out.println("c = " + c);//c = 14
	}
}
