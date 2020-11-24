package com.dummy;

public class MoodAnalyser {
	String message;
	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}
	public MoodAnalyser(String message) {
		this.message=message;
	}
		public String analyseMood(String message) throws MoodAnalyserException {
			try {
		if(message.contains("I am in Any Mood"))
			return "HAPPY";
			else if (message.length() == 0)
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Empty mood");
			return "SAD";
			}  catch (NullPointerException e) {
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please enter correct mood");
			}
		}
		public void analyseMood() {
			// TODO Auto-generated method stub
			
		}
}
