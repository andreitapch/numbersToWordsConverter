package com.sonatype.converter;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.Map;

@RunWith(JUnit4.class)
public class UnitsConverterTest {

	private UnitsConverter unitsConverter;
	private NumbersToTest numbersToTest;

	@Before
	public void setup() {
		unitsConverter = new UnitsConverter();
		numbersToTest = new NumbersToTest();
	}
	
	 @Test
	 public void validateGetStringNumbers() {
		 Map<Integer, String> numbersMap = numbersToTest.getIntToStringMap();
		 numbersMap.forEach((i, s) -> assertEquals(s, unitsConverter.getStringNumbers(i)));
	 }

	@Test
	public void validateGetStringNegativeNumbers() {
		Map<Integer, String> numbersMap = numbersToTest.getNegativeToStringMap();
		numbersMap.forEach((i, s) -> assertEquals(s, unitsConverter.getStringNumbers(i)));
	}
}
