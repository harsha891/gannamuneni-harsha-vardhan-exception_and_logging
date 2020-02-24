package com.example.exception_logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {

	private static final Logger LOGGER = LogManager.getLogger(CompoundInterest.class);
	private double timePeriod;
	private double time;
	private double rate;
	private double principle;

	public CompoundInterest(double principle, double rate, double time, double timePeriod) {
		// TODO Auto-generated constructor stub
		this.principle=principle;
		this.rate=rate;
		this.time=time;
		this.timePeriod=timePeriod;
	}

	public void Calculate() {
		// TODO Auto-generated method stub
		double compoundInterest=principle*(Math.pow(1 - (rate/timePeriod),timePeriod*time));
		LOGGER.info("\nCompound Interest : "+compoundInterest);
		LOGGER.info("CALCULATING COMPOUND INTEREST IS COMPLETE\n");
		
	}

}
