package com.bridgelabz.moodanalyse;

public class MoodAnalysisException extends Exception{
	/**
	 * It is a data type that contains fixed set of constants. 
	 *
	 */
	enum expectedType {
		Null_EXCEPTION, EMPTY_EXCEPTION;
	}

	expectedType type;

	public MoodAnalysisException(expectedType type, String message) {
		super(message);
		this.type = type;
	}

}
