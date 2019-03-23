import java.util.*;

public class ManHours {
	int total;
	double er, totalMH,adjustMH;
	
	Scanner scan = new Scanner(System.in); 
	
	public void e() {
		
		System.out.print("\n\nNumber of Factor Rating of E1-E6 that are below 3: ");
		int input = scan.nextInt();
		System.out.print("Number of Factor Rating of E7-E8 that are above 3 : ");
		int input2 = scan.nextInt();
		Formula5 f5 = new Formula5();
		f5.Calc(input,input2);
		totalMH = f5.Formula5();
		System.out.printf("Total Man Hours £º %.3f\n\n", totalMH);
	
	}
	
	public void f() {
		//Adjusted Man-Hours
		System.out.print("Risk Coefficients(%) £º ");
		double percent = scan.nextDouble();
		Formula5 adMH = new Formula5();
		adMH.Calculate(percent);
		adjustMH = adMH.getAdjustMH();
		System.out.printf("Adjusted Man-Hours £º %.2f",adjustMH);
	}
	
	
}
