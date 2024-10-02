package com.tejumvsr.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	MobileProcessor processor;

	public MobileProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}

	public void config() {
		System.out.println(" Octa Core, 4GB RAM, 12MP camera");
		processor.process();
	}
}
