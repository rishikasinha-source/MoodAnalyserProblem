package com.dummy;

public class MoodAnalyser {
	public String analyseMood(String message) {
		if (message.contains("I am in Sad Mood"))
			return "SAD";
		else
			return "HAPPY";
	}

	
}
