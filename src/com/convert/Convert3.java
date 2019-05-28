package com.convert;
/*
 * 上转型对象不能操作子类新增加的成员变量和成员方法
 * 上转型对象可以代替子类对象调用子类重写的实例方法
 * 上转型对象可以调用子类继承的成员变量和隐藏的成员变量
 */
public class Convert3 {

	public static void main(String[] args) {
		Lady missLiu = new Lady();
		missLiu.pet = new Dog2();	//父类引用指向子类对象；子类的实例赋值给父类的引用
		missLiu.petEnjoy();
		
		Lady missWang = new Lady();
		missWang.pet = new Bird();	//父类引用指向子类对象；子类的实例赋值给父类的引用
		missWang.petEnjoy();
	}

}
