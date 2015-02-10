package com.lwx.study.库谜题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Lesson60 {


	public static void main(String[] args) {

		//考察队JDK库的熟悉程度


		List<String>list=new ArrayList<String>();
		list.add("spam");
		list.add("sausage");
		list.add("spam");
		list.add("spam");
		list.add("bacon");
		list.add("spam");
		list.add("tomato");
		list.add("spam");
		List<String>newList=filter(list);
		for(String str:newList){
			//System.out.println(str);
		}
		String str="ab, hello world,cd,hi girl have a good night";

		String strarr[]=str.split(",");//考察正则的使用
		for(String str2:strarr){
			System.out.println(str2);
		}
		Object object[][]={{"aa",66},{true}};
		System.out.println(Arrays.deepToString(object));

		System.out.println(Integer.bitCount(-2));//10000010  11111110

	}
	/**
	 * 过滤list中重复的元素
	 * */
	private static List<String> filter(List<String> list) {
		return new ArrayList<String>(new HashSet<String>(list));
	}


}




