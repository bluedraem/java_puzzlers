package com.lwx.study.异常谜题;

import java.io.*;

public class Lesson41 {

		public static void main(String[] args) {
		//对于任何在finally语句块中可能抛出的受检查异常都要进行处理，而不是任其传播，下面流拷贝程序在关闭流时没有防止异常的传播，这会有问题
		}

	static void copy(String src, String dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = in.read(buf)) >= 0) {
				out.write(buf, 0, n);
			}
		} finally {
			//这里应该使用try-catch将每个close包装起来
			if (in != null) {
				in.close();
			}
			if (in != null) {
				out.close();
			}

		}

		}
	static void copy2(String src, String dest)  {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
				out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = in.read(buf)) >= 0) {
				out.write(buf, 0, n);
			}
		} catch (IOException e){

		}finally{
			//这里应该使用try-catch将每个close包装起来

			try {
				if(in != null){in.close();}
			}catch (IOException e2){

			}
			try {
				if(in != null){out.close();}
			}catch (IOException e2){

			}

			//也可以用这种方式
		//	closeIgnoreException(in);



		}


	}

	static void closeIgnoreException(Closeable c){
		if(c!=null){

			try {

				c.close();
			}catch (Exception e){

			}
		}

	}

}



