
public class Formula1 extends Actors {
	int userInput,weight,totalActorPoint;
	
	public void Calc(int i, int w) {
		this.userInput = i;
		this.weight = w;
		
		totalActorPoint+=i*w;
	}
	
	public int getTotalActorPoint() {
		return totalActorPoint;
	}
}

	