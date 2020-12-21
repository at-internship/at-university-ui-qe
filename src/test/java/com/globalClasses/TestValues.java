package com.globalClasses;

import com.github.javafaker.Faker;

public class TestValues {
	Faker faker = new Faker();
	
	public String randomName() {
		String name = faker.name().title();
		return name;
	}
	
	public String randomString() {
		String string = faker.lorem().fixedString(20);
		return string;
	}

}
