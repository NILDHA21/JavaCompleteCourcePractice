package practiceProgram;
import java.util.PriorityQueue;
import java.util.Comparator;

public class KG94StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Character.compare(s1.getGrade(), s2.getGrade());
            }
        });

        queue.offer(new Student("N1", 'B'));
        queue.offer(new Student("N2", 'D'));
        queue.offer(new Student("N3", 'D'));
        queue.offer(new Student("N4", 'A'));
        queue.offer(new Student("N5", 'B'));

        System.out.println("Students in priority order (by grade):");
        while (!queue.isEmpty()) {
            Student s = queue.poll();
            System.out.println(s.getName() + " - " + s.getGrade());
        }
    }

    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
}
