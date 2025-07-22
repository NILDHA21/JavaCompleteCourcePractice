package com.example.person;

public class KG81PersonEquality {

	private String name;
	private int age;
	
	public KG81PersonEquality(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj) return true;
		if(obj == null) return false;
		if(getClass() != obj.getClass()) return false;
		KG81PersonEquality other = (KG81PersonEquality) obj;
		return this.age == other.age && this.name.equals(other.name);
	}
	
	@Override
	public int hashCode()
	{
		int result = 17;
		result = 31 * result + name.hashCode();
		result = 31 * result + age;
		return result;
	}
	
	public static void main(String[] args)
	{
		KG81PersonEquality p1 = new KG81PersonEquality("Nilesh", 25);
		KG81PersonEquality p2 = new KG81PersonEquality("Neelesh", 35);
		KG81PersonEquality p3 = new KG81PersonEquality("Nilesh", 25);
		
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println("p1.equals(p3): " + p1.equals(p3));
		System.out.println("p1.hashCode() == p3.hashCode(): " + (p1.hashCode() == p3.hashCode()));
	}
}
