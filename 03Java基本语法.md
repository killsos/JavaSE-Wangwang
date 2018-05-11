## JAVA基本语法

#### 3.1 数据类型

3.1.1 数据类型: 基本数据类型  引用数据类型

3.1.2 基本数据类型: 

		数值:  整数类型  byte short int long  浮点型: float double  
		
		字符型 char  
		
		布尔型 boolean
		
3.1.3 引用数据类型: 

		类 class
		
		接口  interface
		
		数组
		
3.1.4 数据类型与占用位数
		
		boolean           1
		
		byte              8
		
		short             16
		
		int               32
		
		long              64
		
		float             32
		
		double            64
		
		char              16
		

3.1.5 数值的范围
		
		byte           -128  ~   127
		
		shot           -32768  ~   32767
		
		int            -2**31  ~   2**31 - 1
		
		long          -2**63  ~   2**63 - 1
		
		float
		
		double
		
3.1.6 字符型

		char
		
		Java使用Unicode编码   16位
		
		char 单个字符  如果用字符串 使用String类
		
3.1.7 布尔型

		true false
		
		JAVA不支持 0代表false  1代表true
		
3.2.1 变量声明与使用

		数据类型		变量名	变量值
		
		int age = 20;
		
		JAVA是强类型语言  使用变量之前必须先声明
		
3.2.2 变量命名规则

		变量名中字母 数字 下划线 $ 构成
		
		首字母不能是数字
		
		多个单词构成的变量名  第一个词首字母小写  其余单词首字母大写
		
		变量名首字母小写 而类名首字母大写
		
		boolean值一般is开头
		
3.3.1 字符串类型
	
	char 是单个字符  用单引号
	
	String 字符串  引用类型  双引号
	
	String name = new String("ql"); 
	
3.3.2 转义字符

	如果定义的字符串中包含双引号等特殊字符 用转义字符来解决
	
	单引号        \'
	
	双引号        \"
	
	反斜杠        \\
	
	回车         \n
	
	换行         \r
	
	制表符       \t
	
3.3.3 接受用户控制台输入数据

	01.java
	
3.4.1 数据类型转换--自动类型转换
	
	