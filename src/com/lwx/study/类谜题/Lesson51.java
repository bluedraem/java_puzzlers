package com.lwx.study.类谜题;

public class Lesson51 {

	
	public static void main(String[] args) {

	//编译失败
		System.out.println(new MyPoint(1,"aa"));//x==1:null
		
		
	}
}
class Point{

	protected int x;

	private String name;
	public  Point(int x){
		this.x=x;
		name=makeName();
	}
	public String makeName(){
		return "x=="+x;
	}
	public String toString(){
		return name;
	}
}
class MyPoint extends Point{

	private String color;

	public String makeName(){
		return super.makeName()+":"+color;
	}

	public  MyPoint(int x,String color){
		super(x);
		this.color=color;
	}


}
