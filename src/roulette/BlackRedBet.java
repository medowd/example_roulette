package roulette;

import util.ConsoleReader;

public class BlackRedBet extends Bet {
	private static final String DESCRIPTION = "Red or Black";
	private static final int ODDS = 1;
	private static final String PROMPT = "Please bet";

	public BlackRedBet() {
		super(DESCRIPTION, ODDS);
	}
	
	@Override
	public String prompt() {
		return ConsoleReader.promptOneOf(PROMPT, Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean checkWinOrLose(Wheel myWheel, String betChoice) {
		return myWheel.getColor().equals(betChoice);
	}
}
