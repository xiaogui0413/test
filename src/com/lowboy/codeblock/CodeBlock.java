package com.lowboy.codeblock;
/** 
 * @author lowboy
 *
 * 2017年4月6日 下午10:28:11
 */

	class A{ 
		static{ 
			System.out.print("1");
		}
		public A(){ System.out.print("2"); } 
		}
	class B extends A{ 
		static{ System.out.print("a"); }
		public B(){ System.out.print("b"); } }
	public class CodeBlock{ 
		public static void main(String[] ars)
		{ 
			A ab = new B(); //执行到此处,结果: 1a2b ab = new B(); //执行到此处,结果: 1a2b2b } }
		     ab = new B();
		}
	}


