
public class Formula3 extends TFactor {
	double rating, weight, tf,tcf,szuc;
	
	public void Calc(double r, double w) {
		// TODO Auto-generated method stub
		this.rating = r;
		this.weight = w;
		
		totalTF+=r*w;
	}
	
	public double getTotalTF() {
		return totalTF;
	}
	
	public double getTCF() {
		return (tcf = (totalTF*0.01)+0.6);
	}
	
	public double getszuc() {
		return Main.uucp*tcf;
	}

}
