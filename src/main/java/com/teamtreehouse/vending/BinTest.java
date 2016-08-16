package com.teamtreehouse.vending;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class BinTest {
	
	Bin bin;

	@Before
	public void setUp() throws Exception {
		bin = new Bin(10);
	}

	@Test (expected = IllegalArgumentException.class)
	public void restockingWithDifferentItemsIsNotAllowed() {
		bin.restock("Lays", 1, 10, 20);
		bin.restock("Cheetos", 1, 45, 20);
	}

}
