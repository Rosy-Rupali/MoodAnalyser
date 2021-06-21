/************************************************************
 * Purpose : Test cases of analysing whether the mood is happy or sad.
 * @author Rosy Rupali
 * @Version 1.0
 * @since 21-06-2021
 *
 ************************************************************/
package com.bridgelabz.moodanalyse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

	MoodAnalyser moodanalyser = null;

	@Before
	public void seUp() {
		moodanalyser = new MoodAnalyser();
	}

	@Test
	public void givenMessageIsSadMood_shouldReturn_Sad() {
		String mood = moodanalyser.analyseMood("I am in sad mood");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessageIsAny_shouldReturn_Happy() {
		String mood = moodanalyser.analyseMood("I am in any mood");
		Assert.assertEquals("HAPPY", mood);
	}

}
