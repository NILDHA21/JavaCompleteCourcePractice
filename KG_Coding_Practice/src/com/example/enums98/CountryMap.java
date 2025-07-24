package com.example.enums98;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*98. Create a Map where the keys are country names (as String) and the 
 * values are their capitals (also String). Populate the map with at least 
 * five countries and their capitals. Write a program that prompts the user 
 * to enter a country name and then displays the corresponding capital, 
 * if it exists in the map.*/

public class CountryMap {
	public static void main(String[] args) {
		Map<String, String> countryMap = new HashMap<>();
		countryMap.put("India" , "New Delhi");
		countryMap.put("China" , "Beijing");
		countryMap.put("ShriLinka" , "Colombo");
		countryMap.put("Bangaladesh" , "Dhaka");
		countryMap.put("Bharat" , "New Delhi");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the country name: ");
		String country = sc.next();
		
		if(countryMap.containsKey(country)) {
			System.out.printf("Capital of %s is %s", country, 
					countryMap.get(country));
		} else {
			System.out.println("Sorry, we don't know the capital.");
		}
	}
}
