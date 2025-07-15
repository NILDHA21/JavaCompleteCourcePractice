package practiceProgram;

//73. Simulate a dice roll using Math.random() and display the outcome (1 to 6).

public class KG73DiceRoll {
	public static void main(String[] args) {
	
		int diceNum = (int) ((Math.random()*6)+1);
		System.out.println(diceNum);
	}
}
