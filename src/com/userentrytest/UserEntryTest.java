package com.userentrytest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserEntryTest {

	@Test
	public void userTest() {
		ValidateUserEntry userEntry = new ValidateUserEntry();
		assertEquals("Ajit", userEntry.firstName("Ajit"));
		assertEquals("Padwal", userEntry.lastName("Padwal"));
		assertEquals("9887476363", userEntry.contactNumber("83253533"));
		assertEquals("abc.abcd@bl.com", userEntry.contactNumber("abc.abcd@bl.com"));
}
}
