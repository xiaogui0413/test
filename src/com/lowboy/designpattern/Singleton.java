package com.lowboy.designpattern;
/** 
 * @author lowboy
 *
 * 2017年4月7日 下午2:58:40
 */
/**
 * 单例模式-恶汉式
 */
public class Singleton {
	private static Singleton s = new Singleton();
	private Singleton(){}
	public static Singleton getInstance()
	{
		return s;
	}

}
