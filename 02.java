package demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a = 10, b = 20;
		float c = 30;
		double d = 21.3;
		// 小类型自动转换为大类型
		double m = a, n = c;
		
		// a是 int c是 float 则结果自动转换为float
		float e = a + c;
		System.out.println(e);
		// c是 float d是 double 则结果自动转换为double
		double f = c + d;
		System.out.println(f);
	
	}
}
