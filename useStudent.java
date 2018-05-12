package demo;

public class Demo {
	public static void main(String[] args) {
		//类名 对象名 ; 声明对象 类名首字母大写
		Student zhouxingxing;
		//对象名 = new 类名(); 创建对象 对象名首字母小写 
		zhouxingxing = new Student();
		// 对象名.属性名访问对象的属性，访问包括赋值和取值 
		zhouxingxing.stuId = "9527"; 
		zhouxingxing.stuName = "周星星"; 
		zhouxingxing.stuAge = 25;
		//得到属性值
		int age = zhouxingxing.stuAge;
		// 对象名.方法名()访问对象的方法 
		zhouxingxing.sayHello(); 
		zhouxingxing.lesson("javaSE");
		
		//类型匹配
		int result = zhouxingxing.add(12, 24); System.out.println(result);
		// 可以为一个类创建多个对象,并把声明与创建放入一行 
		Student linqingxia = new Student(); 
		Student zhourunfa = new Student();

	}
}