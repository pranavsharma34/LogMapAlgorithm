import java.util.*;

public class calculation {

	static List<Double> gamma;
	static List<Double> alpha;
	static List<Double> beta;
	
	public static void main(String[] args) {
		
		gamma g = new gamma();
		gamma = g.gamma0();
		System.out.println("Gamma 0 = " + gamma);
		
		gamma = g.gamma1();
		System.out.println("Gamma 1 = " + gamma);
		
		gamma = g.gamma2();
		System.out.println("Gamma 2 = " + gamma);
		
		gamma = g.gamma3();
		System.out.println("Gamma 3 = " + gamma);
		
		alpha a = new alpha();
		alpha = a.alpha0();
		System.out.println("Alpha 0 = " + alpha);
		
		alpha = a.alpha1();
		System.out.println("Alpha 1 = " + alpha);
		
		alpha = a.alpha2();
		System.out.println("Alpha 2 = " + alpha);
		
		beta b = new beta();
		beta = b.betak();
		System.out.println("Beta k = " + beta);

		beta = b.beta3();
		System.out.println("Beta 3 = " + beta);

		beta = b.beta2();
		System.out.println("Beta 2 = " + beta);

		beta = b.beta1();
		System.out.println("Beta 1 = " + beta);
		
		Lp l = new Lp();
		System.out.println("Lp(m = 0) = " + l.lpm0());
		System.out.println("Lp(m = 1) = " + l.lpm1());
		System.out.println("Lp(m = 2) = " + l.lpm2());
		
	}
	
}
