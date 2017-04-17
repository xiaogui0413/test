package com.lowboy.string;
/** 
 * @author lowboy
 *
 * 2017年4月7日 下午12:16:28
 */
/**
 * 写个函数reverse words in String，how are you变成are you how
 */
public class Test2 {
	public static void converse(String s) {  
        String[] ss = s.split(" ");  
        String temp = "";  
        int bb = ss.length;  
        for (int i = 0; i < bb/2; i++) {  
            temp = ss[i];  
            ss[i] = ss[bb-1-i];  
            ss[bb-1-i] = temp;  
        }  
        for(int x=0;x<bb;x++){  
            System.out.print(ss[x]+" ");  
        }  
    }  
  
    public static void main(String[] args) {  
        String str = "how are you hehe haha";  
        Test2.converse(str);  
          
    }  

}
