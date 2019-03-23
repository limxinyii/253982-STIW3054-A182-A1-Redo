import java.util.*;

public class TFactor extends UseCase{
	
	int [] TFactor = new int [13];
	String [] description = { "\t Must have a distributed solution \t\t\t","\t Respond to specific performance objectives\t\t",
								"\t Meet end-user efficiency\t\t\t\t","\t Complex internal processing\t\t\t\t",
								"\t code must be reusable\t\t\t\t\t", "\t Must be easy to install\t\t\t\t",
								"\t Must be easy to use\t\t\t\t\t","\t Must be portable\t\t\t\t\t",
								"\t Must be easy to change\t\t\t\t\t",
								"\t Must allow concurrent users\t\t\t\t",
								"\t Includes special security features\t\t\t",
								"\t Must provide direct acess for 3rd parties\t\t", 
								"\t Required special user training facilities\t\t"};
	double [] rating = new double [13];
	double [] weight = {2,1,1,1,1,0.5,0.5,2,1,1,1,1,1};
	double totalTF, tcf, szuc;
	
	Scanner scan = new Scanner (System.in);
	
	public void c() throws Exception{
		int p=0,q=0;
		
		System.out.println("\n3. Weighting Technical Factors");
		System.out.println("Rate each factor from 0 to 5.");
		System.out.println("======================================================================================================");
		System.out.println("Factor  Description \t\t\t\t\t      Weight  Project Rating (0 to 5)");
		System.out.println("======================================================================================================");		 
	
		Formula3 f3 = new Formula3();
		for (int index=0; index<TFactor.length; index++) { 
		do {
			try {
				System.out.print("T" + (index+1) + description[index] + weight[index]+"\t");
				rating[index]=scan.nextDouble();
				if((rating[index]>5) || (rating[index]<0)) {
					
					throw new Exception("Entered Wrong");
					}
				
					f3.Calc(rating[index],weight[index]);
					p=0; q=0;
					
				}catch (InputMismatchException ex) {
					System.out.println("Enterd Wrong, Please Try Again!");
					scan.next();
					q=2;
				}catch (Exception ex) {
					
					
				}
			
			}while ((p==1) || (q==2));
		}
		totalTF = f3.getTotalTF();
		System.out.printf("\nTotal TFactor = %.0f ",totalTF);
		tcf = f3.getTCF();
		System.out.printf("\nTchnical Complexity Factor = %.2f ", tcf);
		szuc = f3.getszuc();
		System.out.printf("\nSize of Use Case = %.2f", szuc);
		
			
	}
	
	}


