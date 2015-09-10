package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet {
	private static final int THRESHOLD = 19;
	private static final String LOW = "low";
	private static final String HIGH = "high";
	private static final String DESCRIPTION = "High or Low";
	private static final int ODDS = 1;
	private static final String PROMPT = "Please bet";

	public HighLowBet() {
		super(DESCRIPTION, ODDS);
	}

	@Override
	public String prompt() {
		return ConsoleReader.promptOneOf(PROMPT, HIGH, LOW);
	}

	@Override
	public boolean checkWinOrLose(Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() < THRESHOLD && betChoice.equals(LOW)) ||
                (myWheel.getNumber() >= THRESHOLD && betChoice.equals(HIGH));
	}

}
