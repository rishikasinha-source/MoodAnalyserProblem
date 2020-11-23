package com.dummy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;


public class MoodAnalyserTest {
	MoodAnalyser analyser=new MoodAnalyser();

	@Test
	public void given_InSadMood_thenShouldBeSadMood() {
		MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
			try {
				Assert.assertEquals("SAD",moodAnalyser.analyseMood("I am in Sad Mood"));
			} catch (MoodAnalyserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	@Test
	public void given_InNullMood_shouldThrowException() {
		MoodAnalyser moodAnalyser=new MoodAnalyser(null);
		{
			try {
			moodAnalyser.analyseMood(null);
			} catch(MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.getType());
			e.printStackTrace();
		}
	}
	}
}
