package com.lowboy.calender;

import java.util.Date;

/** 
 * @author lowboy
 *
 * 2017年4月6日 下午11:18:05
 */
/**
 * 计算1970年到现在的毫秒数
 */
public class Date1970 {
	public static void main(String args[]){
		Date date = new Date();
		long now = date.getTime();
		System.out.println(now);
		
	}
	
}
