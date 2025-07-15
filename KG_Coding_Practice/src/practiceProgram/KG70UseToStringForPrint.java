package practiceProgram;

//70. Define a Student class with fields like name and age, and use toString to print student details.

public class KG70UseToStringForPrint {
	String name;
	int age;
	
	public KG70UseToStringForPrint(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "Student Details: {name: " + name + ", age: " + age + "}";
	}
	
	public static void main(String[] args) {
		KG70UseToStringForPrint stu = new KG70UseToStringForPrint("Nilesh", 34);
		System.out.println(stu);
	}
	
}

// OR


//public class KG70UseToStringForPrint {
//	public static void main(String[] args) {
//		KG70UseToStringForPrint outer = new KG70UseToStringForPrint();
//		Student std = outer.new Student(); // create object of inner class
//		System.out.println(std); // calls toString() of Student
//	}
//	
//	public class Student {
//		int age = 25;
//		String name = "Nilesh";
//		
//		@Override
//		public String toString() {
//			return "The student name is " + name + " and age is " + age + ".";
//		}
//	}
//
//}


//OR


//public class KG70UseToStringForPrint {
//	public static void main(String[] args) {
//		student std = new student();
//		System.out.println(std);
//	}
//}
//
//
//	class student {
//		int age = 25;
//		String name = "Nilesh";
//		
//		@Override
//		public String toString() {
//			return "The student name is " + name + " and age is " + age + ".";
//		}
//	}


