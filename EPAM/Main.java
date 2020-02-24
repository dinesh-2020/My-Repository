package logging;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Main {
	public static void main(String[] args)
	  {
		  Scanner s=new Scanner(System.in);
		  final Logger logger = Logger.getLogger(Main.class);
		  logger.info("SIMPLE INTEREST");
		  logger.info("Enter principal amount,time in years,rate:");
		  int p=s.nextInt();
		  int t=s.nextInt();
		  int r=s.nextInt();
		  Interest simple_interest_object=new Interest();
		  simple_interest_object.simpleInterest(p,t,r);
		  logger.info("--------------------------------------------------------------------------------------------");
		  logger.info("COMPOUND INTEREST:");
		  logger.info("Enter p -principal amount,n -where n is no of compounding periods in years,r -is rate");
		  int pr=s.nextInt();
		  int n=s.nextInt();
		  float ra=s.nextFloat();
		  Interest compound_interest_object=new Interest();
		  compound_interest_object.compoundInterest(pr,n,ra);
		  //int principal_amount=Integer.parseInt(args[0]);
	  }
}
