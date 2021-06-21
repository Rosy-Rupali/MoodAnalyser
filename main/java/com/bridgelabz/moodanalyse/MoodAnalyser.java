/************************************************************
 * Purpose : Mood Analyser using Custom Exception 
 * @author Rosy Rupali
 * @Version 1.0
 * @since 21-06-2021
 *
 ************************************************************/
package com.bridgelabz.moodanalyse;

public class MoodAnalyser {

	public String analyseMood(String message) {
		if (message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}