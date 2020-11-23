package com.dummy;

public class MoodAnalyser {
	String message;
	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}
	public MoodAnalyser(String message) {
		this.message=message;
	}
		public String analyseMood(String message) {
		if(message.contains("I am in Any Mood"))
			return "HAPPY";
		else
			return "SAD";
			}
	
}
