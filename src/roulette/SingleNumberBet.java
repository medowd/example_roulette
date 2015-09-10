package roulette;

import util.ConsoleReader;

public class SingleNumberBet extends Bet {
	private static final String DESCRIPTION = "Single Number";
	private static final int ODDS = 35;
	private static final String PROMPT = "Enter an integer within the range";
	
	public SingleNumberBet() {
		super(DESCRIPTION, ODDS);
	}
	
	@Override
	public String prompt() {
		return ConsoleReader.promptRange(PROMPT, 1, Wheel.NUM_SPOTS-1)+"";
	}
	@Override
	public boolean checkWinOrLose(Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
		return myWheel.getNumber() == start;
	}

	
}
