package com.lowboy.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
	public static void main(String args[])
	{
		try {
		String fileName = "G://xiaopei.txt";
		File file = new File(fileName);
		if(!file.exists()){
			System.out.println("无法找到该文件！");
		}
		
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String tempString = null;
			while ( (tempString = br.readLine()) != null ) {  
			    System.out.println(tempString);  
			}  
			  
			br.close();  
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
