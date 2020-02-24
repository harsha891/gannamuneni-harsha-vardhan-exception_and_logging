package com.example.exception_logging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//LOGGER.info("HELLOO!!");
    	
    	Scanner in=new Scanner(System.in);

    	LOGGER.info("What do you want to do:"
    			+ "\n\t1.Calculate Simple Interest.\n\t"
				+ "2.Calculate Compound Interest.\n\t"
				+ "3.House construction cost."
				+"\nEnter your option:");
		int option=in.nextInt();
		if(option==1)
		{
			LOGGER.info("\tCAlCULATING SIMPLE INTEREST:"+"\nEnter principle:");
			
			
			double principle=in.nextDouble();
			
			LOGGER.info("\nEnter rate:");	
			double rate=in.nextDouble();
			
			LOGGER.info("\nEnter time:");	
			double time=in.nextDouble();
			
			SimpleInterest simple_interest=new SimpleInterest(principle,rate,time);
			simple_interest.Calculate();
		}
		else if(option==2)
		{
			LOGGER.info("\tCAlCULATING COMPOUND INTEREST:"+"\nEnter principle:");
			
			
			double principle=in.nextDouble();
			
			LOGGER.info("\nEnter rate:");
			double rate=in.nextDouble();
			
			LOGGER.info("\nEnter time:");	
			double time=in.nextDouble();
			
			LOGGER.info("\nEnter time period:");	
			double timePeriod=in.nextDouble();
			
			CompoundInterest compound_interest=new CompoundInterest(principle,rate,time,timePeriod);
			compound_interest.Calculate();
		}
		else
		{
			LOGGER.info("\tCALCULATING HOUSE CONSTRUCTION COST:"+"\nEnter area in sq.ft :");
			
			double area=in.nextDouble();
			
			LOGGER.info("\tMATERIAL STANDARDS:\n\t\t"
					+ "1.Standard\n\t\t"
					+ "2.Above Standard\n\t\t"
					+ "3.High Standard\n"
					+ "Enter material standards :");	
			int material=in.nextInt();
			int automation=2;
			if(material==3) {
				LOGGER.info("\tHOME AUTOMATION:\n\t\t"
					+ "1.FULLY AUTOMATED\t\t"
					+ "2.NOT AUTOMATED\n"
					+ "Enter Home automation details :");
			
			automation=in.nextInt();
			}
			HouseConstructionCost house_construction_cost=new HouseConstructionCost(area,material,automation);
			house_construction_cost.Calculate();
		}
    }
}
