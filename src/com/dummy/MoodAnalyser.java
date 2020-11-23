package com.dummy;

public class MoodAnalyser {
	public String analyseMood(String message) {
		if(message.contains("I am in any Mood"))
			return "HAPPY";
		else
			return "SAD";
			}
	
}
