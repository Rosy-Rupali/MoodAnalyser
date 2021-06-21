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

	/**
	 * @param message : This message is send by test method
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	/**
	 * If message contains "sad" it returns SAD else it returns HAPPY. If message is
	 * Null it returns HAPPY
	 * @return mood
	 */
	public String analyseMood() {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}