package com.dummy;

public class MoodAnalyserException extends Exception {
	enum ExceptionType {
		ENTERED_NULL,ENTERED_EMPTY;
	}
	
	private ExceptionType type;

	public ExceptionType getType() {
		return type;
	}


	public MoodAnalyserException(ExceptionType type, String message) {
		super(message);
		this.type=type;
	}

}
