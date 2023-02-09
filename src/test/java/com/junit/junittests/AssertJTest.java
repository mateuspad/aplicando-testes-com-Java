package com.junit.junittests;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AssertJTest {
	@Test
	public void checkEquality() {
		Person person= new Person("Barrack", "Obama");
		Person personClone = person;

		assertThat(person).isEqualTo(personClone);
	}
}
