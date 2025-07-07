package roughSpace;

public class MainClass {
    public static void main(String[] args) {
        // Using the static method
        FinalUtility.greet("Nilesh");

        // Creating an object and calling instance method
        FinalUtility fu = new FinalUtility();
        fu.showInfo();
    }
}
