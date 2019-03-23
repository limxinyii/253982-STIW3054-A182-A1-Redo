
public class Formula2 extends UseCase{
	int userInput,weight,totalUseCase;
	
	public void Calc(int i, int w) {
		// TODO Auto-generated method stub
		this.userInput = i;
		this.weight = w;
		
		totalUseCase+=i*w;
	}
	
	public int getTotalUseCase() {
		return totalUseCase;
	}

	
}
