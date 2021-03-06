package basic.exam3;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		
//		now.set(Calendar, DATE, 1);	
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;          // 1 추가해야함
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
			
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
			
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
			
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
			
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
			
		default:
			strWeek = "일";		
		
		}
		
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		
		
		/*now.set(2017, 5, 18);		
	
		System.out.println("년도: " + year);
		System.out.println("월: " + month);
		System.out.println("일: " + day);
		System.out.println("몇번째 요일 " + week);
		System.out.println(strAmPm + " ");
		System.out.println("시: " + hour);
		System.out.println("분: " + minute);
		System.out.println("초: " + second);
	*/
		
		
		
		System.out.println("년도: " + year);
		System.out.println("월: " + month);
		System.out.println("일: " + day);
		System.out.println("몇번째 요일 " + week);
		System.out.println("마지막 날: " + now.getActualMaximum(Calendar.DATE));
		System.out.println(strAmPm + " ");
		System.out.println("시: " + hour);
		System.out.println("분: " + minute);
		System.out.println("초: " + second);
	
	}

}
