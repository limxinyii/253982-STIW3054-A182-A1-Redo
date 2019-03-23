import java.util.*;

public class UseCase extends Actors {
	int [] useCase = new int[3];
	String [] useCaseType = {"Simple","Average","Complex"};
	String [] description = {"3 or fewer","4 to 7 \t","Greater than 7"};
	int [] weight = {5,10,15};
	int totalUseCase,uucp;
	
	Scanner scan = new Scanner (System.in);
	
	
	public void b() throws Exception{
		int x = 0;
		
		System.out.println("\n2. Weighting Use Case for Complexity");
		System.out.println("==================================================================================");
		System.out.println("Actor Type     Description            Weight    Qty");
		System.out.println("==================================================================================");
		
		Formula2 f2 = new Formula2();
		for (int index=0; index<useCase.length; index++) {
			do {
				try {
					System.out.print(useCaseType[index] + "\t\t" + description[index] + "\t\t" + weight[index] + "\t");
					int input = scan.nextInt();
					f2.Calc(input, weight[index]);
					 x=1;
				}catch (InputMismatchException ex) {
					System.out.println("\n Only Can Enter Integer Number");
					scan.next();
					x=2;
				}
			}while (x==2);
			
		}
		totalUseCase = f2.getTotalUseCase();
		System.out.println("\nTotal Use Case = " + totalUseCase);
		uucp=(totalUseCase + Main.totalAP);
		System.out.println("Unadjusted Use Case Point = " + uucp);
		
		
	}
}
