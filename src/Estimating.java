import java.util.*;

public class Estimating {
	int [] reportType = new int[3];
	String type [] = {"Simple","Average","Complex"};
	int average [] = {12,20,40};
	double totalRMH, totalFMH;
	Scanner scan = new Scanner(System.in);
	
	public void g() {
		int x = 0;
		
		System.out.println("\n5.Weighting Report");
		System.out.println("=======================================================");
		System.out.println("Report Type  Average Man-Hours  Qty");
		System.out.println("=======================================================");
		
		Formula6 f6 = new Formula6();
		do {
			try {
					for (int index=0; index<reportType.length; index++) {
						System.out.print(type[index] +"\t\t" + average[index] +"\t\t" );
						int input = scan.nextInt();
						f6.Calc(input,average[index]);
					}
					
			}catch (InputMismatchException ex) {
				System.out.println("Only Can Enter Integer Number");
				scan.next();
				x=2;
			}
		}while(x==2);
		totalRMH = f6.getTotalReportMH();
		System.out.println("\nTotal Report Man-hour Estimate = "+ totalRMH);
		totalFMH = f6.getFinalTotalMH();
		System.out.println("\n==============================");
		System.out.printf("Total Man-Hours = %.2f" , totalFMH);
		System.out.println("\n==============================");
	}
}
