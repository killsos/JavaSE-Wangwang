package demo;

public class Student {
			// 属性 :由变量实现
			String stuId; 
			String stuName; 
			int stuAge;
			
			// 行为:由函数(方法)实现 
			void sayHello() {
				System.out.println("大家好，我叫" + stuName + "今年" + stuAge + "岁了。");
			}
			
			/**
			* 计算两个数字的和
			* @param num1 第一个操作数 
			* @param num2 第二个操作数
			* @return 结果
			*/
			int add(int num1, int num2) { 
				int result = num1 + num2;
				return result; 
			}
			
			/**
			* 上课方法
			* @param lessonName 传入课程名称
			*/
			void lesson(String lessonName) {
				System.out.println("我在上老师的" + lessonName + "课"); 
			}
}
