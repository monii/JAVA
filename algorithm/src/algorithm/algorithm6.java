package algorithm;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class algorithm6 {

	public static void main(String[] args) {
		int a = 5;
		int b = 26;
		Solution6 s = new Solution6();
		s.solution(a, b);

	}

}

class Solution6 {
  public String solution(int a, int b) {
      String answer = "";
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		String inputDate = "";
		if (Integer.toString(a).length() != 2) {
			inputDate = "2016" + "0" + Integer.toString(a) + Integer.toString(b);
		} else {
			inputDate = "2016" + Integer.toString(a) + Integer.toString(b);
		}

		Date date;
		try {
			date = dateFormat.parse(inputDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			switch (calendar.get(Calendar.DAY_OF_WEEK)) {

			case 1:
				answer = "SUN";
				break;
			case 2:
				answer = "MON";
				break;
			case 3:
				answer = "TUE";
				break;
			case 4:
				answer = "WED";
				break;
			case 5:
				answer = "THU";
				break;
			case 6:
				answer = "FRI";
				break;
			case 7:
				answer = "SAT";
				break;

			}
		} catch (ParseException e) {
			// TODO í»ÔÑßæà÷ªµªìª¿ catch «Ö«í«Ã«¯
			e.printStackTrace();
		}

		return answer;
  }
}