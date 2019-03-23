import java.util.*;

public class Actors {
	int [] actor = new int[3];
	String [] actorType = {"Simple","Average","Complex"};
	String [] description = {"Definr API \t","Ip/TCP\t\t","GUI\t\t"};
	int [] weight = {1,2,3};
	int totalActorPoint;
	Scanner scan = new Scanner(System.in);
	
	public void a () throws Exception {
		int x = 0;
		
		System.out.println("1. Weighting Actors for Complexity");
		System.out.println("==================================================================================");
		System.out.println("Actor Type     Description\t     Weight\tQty");
		System.out.println("==================================================================================");
	
	Formula1 f1 = new Formula1();
	for (int index=0; index<actor.length; index++) {
		do {
			try {
				System.out.print(actorType[index] + "\t\t" +description[index] +"\t"+ weight[index] + "\t");
				int input = scan.nextInt();
				f1.Calc(input, weight[index]);
				
				x=1;
				}catch (InputMismatchException ex) {
					System.out.println("\n Only Can Enter Integer Number");
					scan.next();
					
					x=2;
				}
			}while (x==2);				
			
	}
	totalActorPoint=f1.getTotalActorPoint();
	System.out.println("Total Actor Point= " + totalActorPoint);
}
}