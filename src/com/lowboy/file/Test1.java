package com.lowboy.file;

import java.io.File;

/** 
 * @author lowboy
 *
 * 2017年4月6日 下午11:46:43
 */
public class Test1 {
	public static void main(String[] args) {
		String path = "E:/poi包";
		File file = new File(path);
		printFileName(file);
	}
	
	public static void printFileName(File file)
	{
		if (file.isFile())
			System.out.println(file.getName());
		else
		{
			File[] files = file.listFiles();
			for (File f : files)
			{
				printFileName(f);
			}
		}
	}
}
