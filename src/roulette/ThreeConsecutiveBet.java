package roulette;

import util.ConsoleReader;

public class ThreeConsecutiveBet extends Bet {
	private static final int THREE = 3;
	private static final String DESCRIPTION = "Three in a Row";
	private static final int ODDS = 11;
	private static final String PROMPT = "Enter first of three consecutive numbers";
	
	public ThreeConsecutiveBet() {
		super(DESCRIPTION, ODDS);
	}
	
	@Override
	public String prompt() {
		return ConsoleReader.promptRange(PROMPT, 1, Wheel.NUM_SPOTS - THREE)+"";
	}

	@Override
	public boolean checkWinOrLose(Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + THREE);
	}

}
