package com.teamtreehouse.vending;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AlphaNumericChooserTest {
	
	AlphaNumericChooser chooser;
	 
	@Before 
	public void setUp() throws Exception {
		chooser = new AlphaNumericChooser(26,10);
	}

	@Test
	public void validInputReturnsProperLocation() throws Exception {
		//Act 
		AlphaNumericChooser.Location location = chooser.locationFromInput("A5");
		//Assert
		assertEquals("Proper row" , 0, location.getRow());
		assertEquals("Proper Column" , 4 , location.getColumn());

	}
	
	@Test (expected = InvalidLocationException.class )
	public void invalidInputReturnsException() throws Exception {
		//Act
		chooser.locationFromInput("WRONG");		

	}

}
