package com.dummy;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	MoodAnalyser analyser=new MoodAnalyser();

	//@Test
//	public void  givenSad_WhenAnalyseSad_thenShouldSadMood() {
//		Assert.assertEquals("SAD",analyser.analyseMood("I am in Sad Mood"));
	// }
		
	@Test
	public void givenAny_WhenAnalyseAny_thenShouldReturnHappyMood() {
		Assert.assertEquals("HAPPY",analyser.analyseMood("I am in any Mood"));
		
		
	}

}
