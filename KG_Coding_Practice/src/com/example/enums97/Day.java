package com.example.enums97;

/*97. Enhance the Day enum by adding an attribute that indicates whether it 
 * is a weekday or weekend. Add a method in the enum that returns whether it's 
 * a weekday or weekend, and write a program to print out each day along with its type.*/

public enum Day {
	MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), 
	FRIDAY(true), SATURDAY(false), SUNDAY(false);
	
	private final boolean isWeekDay;

	private Day(boolean isWeekDay) {
		this.isWeekDay = isWeekDay;
	}
	
	public String getType() {
		return isWeekDay ? "WeekDay" : "WeekEnd";
	}
}
