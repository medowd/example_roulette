package roulette;

import util.ConsoleReader;

public class EvenOddBet extends Bet {
	private static final String DESCRIPTION = "Odd or Even";
	private static final int ODDS = 1;
	private static final String PROMPT = "Please bet";
	private static final String ODD = "odd";
	private static final String EVEN = "even";
	
	public EvenOddBet() {
		super(DESCRIPTION, ODDS);
	}
	
	@Override
	public String prompt() {
		return ConsoleReader.promptOneOf(PROMPT, EVEN, ODD);
	}

	@Override
	public boolean checkWinOrLose(Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals(EVEN)) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals(ODD));
	}
}
