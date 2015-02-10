package com.lwx.study.类谜题;

import java.util.Calendar;

public class Lesson49 {
	//初始化顺序影响结果 放这里是85
	//private static final int CURRENT_YEAR=Calendar.getInstance().get(Calendar.YEAR);
	private static final Lesson49 INSTANCE=new Lesson49();
	private  int beltSize;
	private static final int CURRENT_YEAR=Calendar.getInstance().get(Calendar.YEAR);
	
	public Lesson49(){
		beltSize=CURRENT_YEAR-1930;
	}
	public int beltSize(){
		return beltSize;
	}
	
	public static void main(String[] args) {

		//System.out.println(Integer.bitCount(2));
		System.out.println(INSTANCE.beltSize());
		
		
	}
}
