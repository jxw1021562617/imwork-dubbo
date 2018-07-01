package top.imwork.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUitls {
	/**
	 * 获取两个时间之间的分钟数
	 * @return
	 */
	public int getDateDifferenceForMinute(String time1,String time2){
		Calendar dateOne=Calendar.getInstance(),dateTwo=Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");   
        try {   
        	dateOne.setTime(sdf.parse(time1));
    		dateTwo.setTime(sdf.parse(time2));
        } catch (Exception e) {   
        }   
		
		long timeOne=dateOne.getTimeInMillis();
		long timeTwo=dateTwo.getTimeInMillis();
		int minute=(int)(timeOne-timeTwo)/(1000*60);//转化minute
		System.out.println("相隔"+minute+"分钟");
		return minute;
	}
	
	public static boolean isSameDate(String date1, String date2){
	  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	  Date d1 = null;
	  Date d2 = null;
	  try 
	  {
	   d1 = format.parse(date1);
	   d2 = format.parse(date2);
	  }
	  catch (Exception e) 
	  {
	   e.printStackTrace();
	  }
	  
	  return isSameDay(d1,d2);
	}
	
	public static boolean isSameDay(Date date1, Date date2) {  
	    Calendar calDateA = Calendar.getInstance();  
	    calDateA.setTime(date1);  
	  
	    Calendar calDateB = Calendar.getInstance();  
	    calDateB.setTime(date2);  
	  
	    return calDateA.get(Calendar.YEAR) == calDateB.get(Calendar.YEAR)  
	            && calDateA.get(Calendar.MONTH) == calDateB.get(Calendar.MONTH)  
	            && calDateA.get(Calendar.DAY_OF_MONTH) == calDateB  
	                    .get(Calendar.DAY_OF_MONTH);  
	}  
}
