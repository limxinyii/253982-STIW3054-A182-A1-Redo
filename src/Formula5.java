
public class Formula5 extends ManHours {
	int input, input2,total;
	double er, totalMH, percent,adjustedManHour;
	
	public void Calc(int a, int b) {
		this.input = a;
		this.input2 = b;
		total = a+b;
		
	if (total>0 && total<=2) {
		er = 20;
	}
	else if (total>2 && total<=4) {
		er = 28;
	}
	else if (total>=5){
		System.out.println("Restructuring the project team so that the members fall at least below 5");
	}
}
	
	public double Formula5(){
		return totalMH = er*Main.ucp;
	}
	
	public double getTotalMH() {
		return totalMH;
	}
	
	public void Calculate(double p) {
		this.percent = p;
		adjustedManHour = (1+(percent/100))*Main.MH;
	}
	
	public double getAdjustMH() {
		return adjustedManHour;
	}
		
}
	
	

