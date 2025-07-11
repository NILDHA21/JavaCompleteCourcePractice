package practiceProgram;

/*52. Design a Course class.
Instance variables: courseName, enrolledStudents.
Static variable: maxCapacity, the maximum number of students for any course.
Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.*/

public class KG52Course {
	static int maxCapacity = 100;
	String courseName;
	int enrollments;
	String[] enrolledStudents;
	
	KG52Course(String courseName){
		this.courseName = courseName;
		this.enrollments = 0;
		this.enrolledStudents = new String[maxCapacity];
	}
	
	static void setMaxCapacity(int maxCapacity) {
		KG52Course.maxCapacity = maxCapacity;
	}
	
	void enrollStudent(String studentName) {
        if (enrollments >= maxCapacity) {
            System.out.println("Cannot enroll. Maximum capacity reached.");
            return;
        }
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                System.out.println(studentName + " is already enrolled.");
                return;
            }
        }
        enrolledStudents[enrollments++] = studentName;
        System.out.println(studentName + " enrolled successfully.");
    }

    void unenrollStudent(String studentName) {
        int index = -1;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Student not found: " + studentName);
            return;
        }

        for (int i = index; i < enrollments - 1; i++) {
            enrolledStudents[i] = enrolledStudents[i + 1];
        }
        enrolledStudents[enrollments - 1] = null;
        enrollments--;

        System.out.println(studentName + " has been unenrolled.");
    }

    void printEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (int i = 0; i < enrollments; i++) {
            System.out.println((i + 1) + ". " + enrolledStudents[i]);
        }
    }
}
