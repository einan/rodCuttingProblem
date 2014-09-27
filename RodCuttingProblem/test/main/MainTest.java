package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void maxProfitTest() throws Exception {
		// Setup Fixture
		int rodLen = 5;
		int output = 0;
		int priceArray[] = { 0, 2, 1, 7, 3, 4 };

		// Exercise SUT
		output = new Main().getMaxProfit(rodLen, output, priceArray);

		// Verify Outcome
		assertEquals(11, output);
	}
}
