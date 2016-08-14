package com.teamtreehouse.vending;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CreditorTest {

	Creditor creditor;
	
	@Before
	public void setUp() {
	 creditor = new Creditor();

	}

	
	@Test
	public void addingFundsIncrementsAvailableFunds() {
		//Arrange
		
		//Act
		creditor.addFunds(50);
		creditor.addFunds(50);
		
		//Assert
		assertEquals(100, creditor.getAvailableFunds());
	}



	@Test
	public void refundingReturnsAllAvailableFunds() {
		
		creditor.addFunds(100);
		int refund = creditor.refund();
		
		assertEquals(100, refund);
		assertEquals(0,creditor.getAvailableFunds());
	}

	@Test
	public void refundingMakesAvailableFundsZero() {
		
		creditor.addFunds(100);
		creditor.refund();
		
		assertEquals(0,creditor.getAvailableFunds());
	}

}
