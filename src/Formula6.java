
public class Formula6 extends Estimating{
	int input, average, totalReportMH;
	
	public void Calc(int i, int a) {
		this.input = i;
		this.average = a;
		
		totalReportMH += i*a;
	}
	
	public double getTotalReportMH() {
		return totalReportMH;
	}
	
	public double getFinalTotalMH() {
		return totalReportMH + Main.adjMHours;
	}
}
