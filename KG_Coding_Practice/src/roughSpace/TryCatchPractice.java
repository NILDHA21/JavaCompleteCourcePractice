package roughSpace;

public class TryCatchPractice {
	public static void main(String[] args) {
			
		try {
			int i = 05;
			int j = 0;
			int result = i / j;
			
			System.out.println("Result: " + result);
		} catch(ArithmeticException exception) {
			System.out.println("Exception message is '" + exception.getMessage() + "'");
		} catch(Throwable th) {
			System.out.println("General exception.");
			throw th;
		}
		}
	}