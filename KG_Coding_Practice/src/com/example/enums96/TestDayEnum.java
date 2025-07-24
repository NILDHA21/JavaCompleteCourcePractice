package com.example.enums96;
import java.util.Iterator;

/*96. Create an enum called Day that represents the days of the week. 
 * Write a program that prints out all the days of the week from this enum.*/

public class TestDayEnum {
	public static void main(String[] args) {
		System.out.println("Printing all the days of the week:");
		
		System.out.println(Day.MONDAY);
		System.out.println(Day.TUESDAY);
		System.out.println(Day.WEDNESDAY);
		System.out.println(Day.THURSDAY);
		System.out.println(Day.FRIDAY);
		System.out.println(Day.SATURDAY);
		System.out.println(Day.SUNDAY);
		
		System.out.println(" ----------- OR ----------- ");
		
		System.out.println("Printing all the days of the week:");
		for(Day day : Day.values()) {
			System.out.println(day);
		}
	}
}
