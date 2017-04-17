package com.lowboy.string;

/** 
 * @author lowboy
 *
 * 2017年4月7日 下午12:02:29
 */
public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse();

	}
	public static void reverse(){
		String str = "abcdefg";
		System.out.println(str.length());
		for(int i = str.length()-1;i>=0;i--)
		{
			char c = str.charAt(i);
			System.out.print(c);
		}
	}

}
