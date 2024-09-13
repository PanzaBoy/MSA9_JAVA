package Day10_13.Ex02_Util;

import java.util.Calendar;
import java.util.Set;

public class LottoTest {
	
	public static void main(String[] args) {
		// 기본 현재 날짜/시간으로 객체를 가져온다.
		Calendar now = Calendar.getInstance();	// 기본 현재 날짜/시간으로 객체를 가져온다.
		printCalendar("현재", now);
		
		// 로또 추첨일을 지정한다.
		Calendar lotto = Calendar.getInstance();
		lotto.set (2024, Calendar.AUGUST, 24, 21, 00, 00);
		printCalendar("로또 추첨일(연/월/일/시/분/초)", lotto);
		
		long nowP = lotto.getTimeInMillis();
		
		
	}
	

	private static void printCalendar(String msg, Calendar cal) {
		int year = cal.get( Calendar.YEAR );
		int month = cal.get( Calendar.MONTH ) + 1;				
		int day = cal.get( Calendar.DAY_OF_MONTH);
		int hourOfDay = cal.get( Calendar.HOUR_OF_DAY );	
		int minute = cal.get( Calendar.MINUTE );
		int second = cal.get( Calendar.SECOND );
		int millisecond = cal.get( Calendar.MILLISECOND );
		int ampm = cal.get( Calendar.AM_PM );
	}
}
