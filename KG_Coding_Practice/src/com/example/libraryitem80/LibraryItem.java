package com.example.libraryitem80;

/*80. Start with a base class `LibraryItem` that includes common attributes like 
 * `itemID`, `title`, and `author`, and methods like `checkout()` and `returnItem()`. 
Create subclasses such as `Book`, `Magazine`, and `DVD`, each inheriting from 
`LibraryItem`.*/

public class LibraryItem {

	private int itemID;
	private String title;
	private String author;
	
	public void checkOut()
	{
		System.out.println("This is checkout method.");
	}
	
	public void returnItem()
	{
		System.out.println("This is returnItem method.");
	}
}
