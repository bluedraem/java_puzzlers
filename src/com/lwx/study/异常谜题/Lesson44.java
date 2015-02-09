package com.lwx.study.异常谜题;

public class Lesson44 {

		public static void main(String[] args) {
		//考察了java虚拟机中校验类合法的第一步 校验

			//编译之后  把Missing删除掉
			//发现Strange1 抛出NoClassDefFoundError 而Strange2则打印出 "Get it"

			//作者推荐使用反射来处理
			try {
			Object missing=Class.forName("Missing");
			}catch (ClassNotFoundException e){

			}

			//error异常是给那些不能回复的错误而保留的，开发更多的应该关注exception
		}



}

class Strange1{

	public static void main(String[] args) {
		try {
			Missing missing=new Missing();
		}catch (NoClassDefFoundError e){
			System.out.println("Get it");
		}
	}
}

class Strange2{

	public static void main(String[] args) {
		Missing missing;
		try {
			missing=new Missing();
		}catch (NoClassDefFoundError e){
			System.out.println("Get it");
		}
	}
}

class Missing{

	Missing(){}
}



