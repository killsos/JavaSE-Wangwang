package demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// Scanner为java给我们提供工具类
		// System.in是构造函方法参数 是个输入流
		Scanner input = new Scanner(System.in);
		
		int age;
		float money;
		String name;
		boolean isLove;
		
		System.out.println("请输入你的姓名");
		name = input.next();
		
		System.out.println("请输入你的年龄");
		age = input.nextInt();
		
		System.out.println("请输入你的薪水");
		money = input.nextFloat();
		
		System.out.println("请输入你的爱情");
		isLove = input.nextBoolean();
		
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		System.out.println("money = " + money);
		System.out.println("isLove = " + isLove);
	}
	
	
}