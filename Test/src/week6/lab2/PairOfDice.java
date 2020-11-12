package week6.lab2;

public class PairOfDice {
	
	//Variables
	private Dice dice1;
	private Dice dice2;
	
	public  PairOfDice() {
		dice1 = new Dice();
		dice2 = new Dice();
	}
	
	public void roll() {
		dice1.roll();
		dice2.roll();
	}
	
	public String getFaceValue() {
		return "(" + dice1.getFaceValue() + "," + dice2.getFaceValue() + ")";
	}
	

}
