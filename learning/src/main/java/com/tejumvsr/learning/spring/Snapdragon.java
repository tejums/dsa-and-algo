package com.tejumvsr.learning.spring;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{

	@Override
	public void process() {
		System.out.println("Worlds best processor");
		
	}

}
