## 包与 Java 常用类

#### 6.1 包

	如果没有包，把所有类放在一个文件夹下
	
	这样的缺陷有两个: 一 当类的数目多了不 易管理，二 不能有两个名字相同的类
	
	这样的问题我们可以用 java 提供的包的知识来解决
	
	包就类似我们操作系统中的文件夹 我们就建立文件夹，把相同类型的文件放在同一个文件夹下
	
	包的道理也是一样的

6.1.1 包定义
	
	包的出现是为了更好的管理类--当然这只是包的一个作用，其实包还为封装提供了支持
	
	在Java中我们通过package关键字声明包 并且包名的首字母都是小写
	
	给所有的类与类的属性和方法声明的前面加上public 关键字 
	
	这样可以避免不同包之间无法调用的问题
	
6.1.2 包的命名规范
	
	业中开发项目时包的一些命名规则 我们一般是按照:
	
	反写的企业域名.功能名.模块名
	
	给包命名的
	
6.1.3 JAVA 常用包简介

	系统类就是SUN定义好完成特定的功能 我们可以直接拿来使用的类
	
	SUN 还把它们按照功能的不同放在不同的包里
	
	lang包中的类可以不用 导入而直接使用
	
	java.lang: java的核心类库，包含了运行java程序必不可少的系统类，如基本数据 类型、基本数学函数、字符串处理、线程、异常处理类等，系统缺省加载这个包
	
	java.lang.reflect: 提供用于反射对象的工具
	
	java.io: java语言的标准输入/输出类库，如基本输入/输出流、文件输入/输出等
	
	java.util: 常用的工具类，如集合框架类，日期处理类等
	
	java.sql: JDBC相关类
	
	java.net: JAVA网络包，其中包含能够使程序通过网络进行通信的
	
	java.awt/javax.swing: 使用java开发C/S结构应用程序使用的类
	
	
#### 6.2 包装类

6.2.1 什么是包装类
	
	Java的数据类型分为两种:值类型和引用类型
	
	其中值类型只有8个，那与此 8 个值类型对应的有8个类，我们把它们称为: 包装类
	
	基本数据类型		包装类
	
	byte			Byte
	
	short           Short
	
	int             Integer
	
	long            Long
	
	float           Float

	double	        Double
	
	char            Character
	
	boolean         Boolean
	 
	包装类全部声明在 java.lang 包中 
	
	lang 包中的类不需要导入而直接使用
	
	基本数据类型变量只在栈中分配一块内存，而包装类在栈和堆中各占一块
	
	JAVA 语言是面向对象的语言，但它不是所有的设计思想都符合面向对象的
	
	这里大家 要知道 java 不符合面向对象的两个地方:
	
	一个是JAVA保留了8个基本数据类型，他们不是 对象，更没有属性和方法
	
	另一个就是JAVA中存在着main方法
	  
6.2.2 自动拆箱与装箱
	 
	  把数据由基本数据类型转换化为对应包装类叫做: 装箱
	  
	  把数据由包装类转换化为基本数据类型叫做: 拆箱
	  
	  int a = 10;
	  Integer b;
	  int c; 
	  
	  //装箱，基本数据类型-->包装类 
	  b = Integer.valueOf(a); 
	  
	  //拆箱，包装类-->基本数据类型
	  c = b.intValue();
	  
	  JDK1.5 中提出的一个新功能就是自动装箱和拆箱
	  
	  int a = 10;
	  
	  //自动装箱，基本数据类型-->包装类
	  Integer b = a;
	  
	  //自动拆箱，包装类-->基本数据类型
	  int c = b;
	  
6.2.3 包装类的常用方法
	
	 * Character 类的常用方法
	 
	 基本数据类型                    包装类
	                          
	 isDigit()                     确定字符是否为 0 至 9 之间的数字
	 
	 isLetter()                    确定字符是否为字母
	 
	 isLowerCase()                 确定字符是否为小写形式
	 
	 isUpperCase()                 确定字符是否为大写形式
	 
	 这些方法都是通过类名点方法名访问的 我们称为静态方法
	 
	 Character.isDigit()
	 
	 Character.isLetter()
	 
	 Character.isLowerCase()
	 
	 Character.isUpperCase()
	 
	 
	 * Number 类的常用方法
	 
	 Byte.valueOf()
	 
	 Short.valueOf()
	 
	 Integer.valueOf()
	 
	 Long.valueOf()
	 
	 Integer.parseInt()
	 
	 Float.parseFloat()


#### 6.3 STRING类
	
6.3.1 String.equals()
	
	比较两个字符串的值是否相等
	
	使用==并不能判断两个字符串的值是否相等 您一定要使用 equals()
	
	原因String是引用类型分配两个内存(栈内存 和 堆内存)
	
	栈内存存储堆内存的引用地址
	
	堆内存中才存储value
	
	==比较的是两个变量是否指向同一块空间
	
	equals()比较的是指向的两个内存空间的值是否相等
	
6.3.2 字符串池
	
	就是说它会把所已知的字符串放入字符串池
	
	如果你创建新字符串没有使用new关键字 首先会去字符串池找有没有相同值的字符串 
	
	如果有的话就指向它 如果没有的话就会创建新的空间
	
	如果使用了new关键字 不会去字符串池中寻找 而直接创建一份新的内存空间
	
6.3.3 length字符串长度

	length() 求字符串长度
	
6.3.4 trim去左右两边空格

	trim():去掉字符串两边的空格
	
6.3.5 大小写转换

	toLowerCase()
	
	toUpperCase()
	
6.3.5 截取字符串
	
	substring(int a, int b)
	
	从 a 开始截取(b-a)个字符(注意有的语言是从 a 开始截取 b 个字符
		
6.3.5 查找字符串-indexOf
	
	indexOf(String target)
	
	查找 target 在字符串中第一次出现的位置
	
	注意下标是从 0 开始，如没出现返回-1
	
	indexOf(int a, String target)
	
	从 a 的位置开始，查找 target 在字符串中第一次出 现的位置
	
	注意下标是从 0 开始，如没出现返回-1
	
6.3.5 查找字符串-lastIndexOf
	
	lastIndexOf(String target) 
	
	查找 target 在字符串中最后一次出现的位置，如没出 现返回-1
	
6.3.6 查找字符-charAt

	charAt(int a)
	
	返回字符串 a 位置的字符
	
	如果越界的话报 java.lang.StringIndexOutOfBoundsException异常
	
6.3.7 字符串替换

	replace(String a, String b)
	
	把字符串中的 a 替换为 b

6.3.8 拆分字符串

	rplit(String a)
	
	把字符串按照其中出现的字符a拆分为一个数组
	
#### 6.4 STRINGBUFFER类

6.4.1 字符串链接 + 

	每次字符串的连接 + += 的时候 
	
	JVM 每次都会给分配一块新的内存空间
	
	就会变为垃圾内存等待回收造成浪费
	
	并且在堆中分配收集内存是很占系统资源的
	
	所以这样的写法虽然不会报错，但显然不是理想的
	
	Java中为我们提供了 StringBuffer 类解决这个问题

6.4.2 StringBuffer

	StringBuffer msg = new StringBuffer(“犀利哥”);
	
	上面当创建 StringBuffer 对象时系统默认分配一定长度的内存
	
	msg.append(“去春游”);
	
	使用 append 方法往其 中放入字符串，如果放入的字符串超出内存的范围
	
	那么它会自动在其后追加一倍长度的内存，这样前面的内存就可以继续使用 没有浪费
	
	最后使用 toString()方法转化为字符串
	
	还有除去 StringBuffer类 jdk1.5 开始还提供了一个 StringBuilder 类
	
	它们之间的区别:
	
	StringBuffer 类的方法是同步的，也就是线程安全的
	
	而StringBuilder 是线程非安全的，但效率较高
	
	