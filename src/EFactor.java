import java.util.Scanner;
import java.util.*;

public class EFactor {
	int [] EFactor = new int [8];
	
	String [] description = {"\t Familiar with FPT software process","\t Application Experience\t\t",
		   						"\t Paradigm Experience\t\t","\t Lead analyst capability\t",
		   						"\t Motivation\t\t\t","\t Stable Requirement\t\t",
		   						"\t Part-time worker\t\t","\t Difficult of programming language"}; 
	double [] rating = new double[8];
	double [] weight = {1,0.5,1,0.5,0,2,-1,-1};
	double totalEF,ef,ucp;
	
	Scanner scan = new Scanner (System.in);
	
	public void d() {
		int p=0,q=0;
		
		System.out.println("\n\n4. Weighting Experience Factors");
		System.out.println("Rate for each factor from 0 to 5.");
		System.out.println("======================================================================================================");
		System.out.println("Factor \t Description \t\t\t      Weight Project Rating (0 to 5)");
		System.out.println("======================================================================================================");
	
	Formula4 f4 = new Formula4();
	for(int index=0; index<=EFactor.length; index++) {
		do {
			try {
				System.out.print("E"+(index+1) + description[index] +"\t"+ weight[index] +"\t");
				rating[index] = scan.nextDouble();
				if((rating[index]>5) || (rating[index]<0)) {
					p=1;
					throw new Exception("Wrong Input");
				}
				f4.Calc(rating[index],weight[index]);
				p=0; q=0;
				
			}catch(InputMismatchException ex) {
				System.out.println("Enterd Wrong, Please Try Again!");
				scan.next();
				q=2;
			}catch (Exception ex) {
				
			}
		}while(p==1||q==2);
	}
	totalEF = f4.getTotalEF();
	System.out.printf("\nTotal Efactor = %.0f ", totalEF);
	ef = f4.getEF();
	System.out.printf("\nExperience Factor = %.2f ", ef);
	ucp = f4.getUCP();
	System.out.printf("\nUse Case Point = %.3f", ucp);
		
	}
}
