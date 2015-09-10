package roulette;

import util.ConsoleReader;

public class TwoConsecutiveBet extends Bet {
	private static final int TWO = 2;
	private static final String DESCRIPTION = "Two in a Row";
	private static final int ODDS = 17;
	private static final String PROMPT = "Enter first of two consecutive numbers";
	
	public TwoConsecutiveBet() {
		super(DESCRIPTION, ODDS);
	}
	
	@Override
	public String prompt() {
		return ConsoleReader.promptRange(PROMPT, 1, Wheel.NUM_SPOTS - TWO)+"";
	}

	@Override
	public boolean checkWinOrLose(Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + TWO);
	}
}
