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
		String mood = null;
		try {
			mood = moodanalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessageNotSad_shouldReturn_Happy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in any mood");
		String mood = null;
		try {
			mood = moodanalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessageIsNullMood_should_ThrowException() {
		MoodAnalyser moodanalyser = new MoodAnalyser(null);
		try {
			moodanalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.expectedType.Null_EXCEPTION, e.type);
		}
	}

	@Test
	public void givenMessageIsEmpty_should_ThrowException() {
		MoodAnalyser moodanalyser = new MoodAnalyser("");
		try {
			moodanalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.expectedType.EMPTY_EXCEPTION, e.type);
		}
	}

}
