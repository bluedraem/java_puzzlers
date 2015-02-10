package com.lwx.study.类谜题;

public class Lesson47 {


	
	public static void main(String[] args) {
		//对于继承 静态的属性 需要引起重视
		Dog dogs[]={new Dog(),new Dog()};
		for(Dog dog:dogs){
			dog.say();
		}
		Cat cats[]={new Cat(),new Cat(),new Cat()};
		for(Cat cat:cats){
			cat.say();
		}
		System.out.println("dog--"+Dog.getCount());//dog--5
		System.out.println("cat--" + Cat.getCount());//cat--5


	}



	
}
class Counter{

	private static  int count=0;


	public void increment(){
		count++;
	}

	public static int getCount(){
		return count;
	}
}

class Dog extends Counter{

public Dog(){}
	public void say(){increment();}
}
class Cat extends Counter{

public Cat(){}
	public void say(){increment();}
}

