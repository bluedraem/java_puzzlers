package com.lwx.study;

import java.util.Arrays;
import java.util.Calendar;

public class Lesson49 {

	private static final Lesson49 INSTANCE=new Lesson49();
	private  int beltSize;
	//初始化CURRENT_YEAR放在第一句和这里是有区别的(实际是放在INSTANCE前和后是有区别的)
	private static final int CURRENT_YEAR=Calendar.getInstance().get(Calendar.YEAR);
	
	public Lesson49(){
		beltSize=CURRENT_YEAR-1930;
	}
	public int beltSize(){
		return beltSize;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Integer.bitCount(2));
		//System.out.println(INSTANCE.beltSize());
		
		
	}
}
