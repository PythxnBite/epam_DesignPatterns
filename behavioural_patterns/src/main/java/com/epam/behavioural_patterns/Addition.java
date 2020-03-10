package com.epam.behavioural_patterns;

public class Addition implements Strategy {
	@Override
	public float calculation(float a, float b) {
		return a + b;
	}

}
