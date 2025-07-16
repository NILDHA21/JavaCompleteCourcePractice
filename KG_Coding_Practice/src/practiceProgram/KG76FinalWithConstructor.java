package practiceProgram;

//76. Create an object with final fields and a constructor to initialize them.

public class KG76FinalWithConstructor {
	int age = 25;
	final String schoolName;
	String address = "Jalgaon Jalgaon Jalgaon";
	
	public KG76FinalWithConstructor(int age, String schoolName) {
		super();
		this.age = age;
		this.schoolName = schoolName;
		
	}
	public void displayInfo() {
		System.out.println("Age: " + age);
		System.out.println("School Info: " + schoolName);
		
	}
	
	public static void main(String[] args) {
		KG76FinalWithConstructor student = new KG76FinalWithConstructor(18, "RSCE");
		student.displayInfo();
//		KG76FinalWithConstructor student2 = new KG76FinalWithConstructor(28, "SIBACA");
//		student2.displayInfo();
//		KG76FinalWithConstructor student3 = new KG76FinalWithConstructor(68, "RSCE");
//		student3.displayInfo();
		StringBuilder sb = new StringBuilder(student.address);
		sb.replace(0, 5, "Hi");
		System.out.println("Updated Address: " + sb);
		sb.reverse();
		System.out.println("Reverse Address: " + sb);
		sb.reverse();
		sb.insert(4, ",");
		System.out.println("New Address: " + sb);
	}
}
