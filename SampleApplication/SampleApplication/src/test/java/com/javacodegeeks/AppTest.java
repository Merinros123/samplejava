package com.javacodegeeks;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testApp() {
		App appObject = new App();
		Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
		System.out.println("sample project");
	}
}
