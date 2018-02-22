// The CalendarDate class stores information about a single
// calendar date (month and day but no year).
public class CalendarDate implements Comparable<CalendarDate>{
	private int month;
	private int day;
	
	//Constructs a new CalendarDate with the given month and day
	public CalendarDate(int month, int day){
		this.month = month;
		this.day = day;
	}
	
	//Compares this calendar date to another date.
	//Dates are compared by month and then by day.
	public int compareTo(CalendarDate other){
		if (month != other.month){
			return month - other.month;
		}else{// month == other.month
			return day - other.day;
		}
	}
	//returns month 
	public int getMonth(){
		return month;
	}
	//returns day 
	public int getDay(){
		return day;
	}
	//return the month and day in the month/day style
	public String toString(){
		return month + "/" + day;
	}
	

}
