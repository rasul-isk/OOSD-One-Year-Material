package week6.lab2;

public class DiceTest {
	
	public static void main(String[] args) {
		PairOfDice myDie = new PairOfDice();
		
		for(int i = 0; i < 10; i++) {
			myDie.roll();
			System.out.println(myDie.getFaceValue());
		}
	}
}
