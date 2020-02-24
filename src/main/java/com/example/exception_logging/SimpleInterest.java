package com.example.exception_logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {

	private static final Logger LOGGER = LogManager.getLogger(SimpleInterest.class);
	private double principle;
	private double rate;
	private double time;

	public SimpleInterest(double principle, double rate, double time) {
		// TODO Auto-generated constructor stub
		this.principle=principle;
		this.rate=rate;
		this.time=time;
	}

	public void Calculate() {
		// TODO Auto-generated method stub
		double simpleInterest=(principle*rate*time)/100;
		LOGGER.info("\nSimple Interest : "+simpleInterest);
		LOGGER.info("CALCULATING SIMPLE INTEREST IS COMPLETE\n");
		
	}

}
