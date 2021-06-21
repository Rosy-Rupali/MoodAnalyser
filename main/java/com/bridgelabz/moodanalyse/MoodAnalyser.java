/************************************************************
 * Purpose : Mood Analyser using Custom Exception 
 * @author Rosy Rupali
 * @Version 1.0
 * @since 21-06-2021
 *
 ************************************************************/
package com.bridgelabz.moodanalyse;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
		super();
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}