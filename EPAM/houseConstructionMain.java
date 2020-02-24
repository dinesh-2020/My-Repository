package logging.houseconstruction;

import org.apache.log4j.Logger;
import java.util.Scanner;
public class houseConstructionMain {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	final Logger logger= Logger.getLogger(houseConstructionMain.class);
	logger.info("Provide required inputs for house construction:\n1:materials standard\ns or a or h\ns-standard materials as-above standard h-high standard");
	char st_materials = s.next().charAt(0);
	logger.info("Enter the squarefeet of house:");
	int sqft=s.nextInt();
	logger.info("Enter whether fully automated house or not\ny-if yes n-if no");
	char fully_automated_or_not = s.next().charAt(0);
	Client c=new Client();
	c.housePrice(st_materials,sqft,fully_automated_or_not);
	
}
}
