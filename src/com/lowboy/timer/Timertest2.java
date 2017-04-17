package com.lowboy.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/** 
 * @author lowboy
 *
 * 2017年4月13日 下午5:21:57
 */
public class Timertest2 {
	public static void main(String[] args) {
		timer();
	}
		
		
		public static void timer(){
		SimpleDateFormat time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			Date date= time.parse("2017/04/13 12:12:12");
			Timer t = new Timer();
			t.scheduleAtFixedRate(new TimerTask(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("-----定时器----");	
				}	
			},
					date, 1000 * 2 * 60);	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
