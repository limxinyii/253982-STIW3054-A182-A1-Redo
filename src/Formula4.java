
public class Formula4 extends EFactor {
	double rating, weight, totalEF, ef, ucp;
	
	public void Calc(double r, double w) {
		// TODO Auto-generated method stub
		this.rating = r;
		this.weight = w;
		
		totalEF+=r*w;
	}
	
	public double getTotalEF() {
		return totalEF;
	}
	
	public double getEF() {
		return ef = (-0.03*totalEF)+1.4;
	}
	
	public double getUCP() {
		return Main.szuc*ef;
	}
}
