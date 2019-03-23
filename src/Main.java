import java.util.*;

public class Main {
	static int totalAP, totalUC,uucp;
	static double tcf, szuc,ucp,totalEF,MH,adjMHours;
	

	public static void main(String[]args) throws Exception{
		Actors actor = new Actors();
		actor.a();
		totalAP = actor.totalActorPoint;
		
		UseCase usecase = new UseCase();
		usecase.b();
		totalUC = usecase.totalUseCase;
		uucp = usecase.uucp;
		
		TFactor tf = new TFactor();
		tf.c();
		tcf = tf.tcf;
		szuc = tf.szuc;
		
		EFactor ef = new EFactor();
		ef.d();
		totalEF = ef.totalEF;
		ucp = ef.ucp;
		
		ManHours mh = new ManHours();
		mh.e();
		MH = mh.totalMH;
		
		ManHours adjustMH = new ManHours();
		adjustMH.f();
		adjMHours=adjustMH.adjustMH;		
		
		Estimating report = new Estimating();
		report.g();
	}
	
}
