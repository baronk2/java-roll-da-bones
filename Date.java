public class Date {
	
	private int year, month, day;
	private int[] dIM = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date(int year, int month, int day) {
		setDate(year, month, day);
	}//eo Date
	
	public void addDays(int days) {
		while (days > 0) {
			int yearToSet = year;
			int monthToSet = month;
			int dayToSet = day;
			if (dayToSet == dIM[monthToSet - 1]) {
				dayToSet = 1;
				days--;
				monthToSet++;
				if (monthToSet == 13) {
					monthToSet = 1;
					yearToSet++;
				}//eo if
			}//eo if
			while (dayToSet < dIM[monthToSet - 1] && days > 0) {
				dayToSet++;
				days--;
			}//eo while
			setDate(yearToSet, monthToSet, dayToSet);
		}//eo while
	}//eo addDays
	
	public void addWeeks(int weeks) {
		addDays(7 * weeks);
	}//eo addWeeks
	
	public int daysTo(Date other) {
		return other.dayNum() - this.dayNum();
	}//eo daysTo
	
	private int dayNum() {
		int days = 0;
		days += 365 * year;
		days += (year + 3) / 4;
		days -= (year + 3) / 100;
		days += (year + 3) / 400;
		for (int i = 0; i < month - 1; i++) {
			days += dIM[i];
		}//eo for
		days += day;
		return days;
	}//eo dayNum
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			dIM[1] = 29;
		} else {
			dIM[1] = 28;
		}//eo if else
		this.month = month;
		if (month > 12 || month < 1) {
			throw new IllegalArgumentException();
		}//eo if
		this.day = day;
		if (day > dIM[month - 1] || day < 1) {
			throw new IllegalArgumentException();
		}//eo if
	}//eo setDate
	
	public int getDay() {
		return day;
	}//eo getDay
	
	public int getMonth() {
		return month;
	}//eo getMonth
	
	public int getYear() {
		return year;
	}//eo getYear
	
	public boolean isLeapYear() {
		if (dIM[1] == 29) {
			return true;
		}//eo if
		return false;
	}//eo isLeapYear
	
	public String toString() {
		return year + "/" + month + "/" + day;
	}//eo toString
	
}//eo Date