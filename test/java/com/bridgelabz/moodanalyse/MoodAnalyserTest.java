/************************************************************
 * Purpose : Test cases of analysing whether the mood is happy or sad.
 * @author Rosy Rupali
 * @Version 1.0
 * @since 21-06-2021
 *
 ************************************************************/
package com.bridgelabz.moodanalyse;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessageIsSadMood_shouldReturn_Sad() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in sad mood");
		// String mood = moodanalyser.analyseMood();
		Assert.assertEquals("SAD", moodanalyser.analyseMood());
	}

	@Test
	public void givenMessageNotSad_shouldReturn_Happy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in any mood");
		// String mood = moodanalyser.analyseMood();
		Assert.assertEquals("HAPPY", moodanalyser.analyseMood());
	}

}
