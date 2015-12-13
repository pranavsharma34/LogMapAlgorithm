import java.util.*;

public class Lp {

	List<Double> gammaValues;
	List<Double> alphaValues;
	List<Double> betaValues;
	
	double lpm0 = 0;
	double lpm1 = 0;
	double lpm2 = 0;
	
	public double lpm0()
	{
		gammaValues = new LinkedList<Double>();
		alphaValues = new LinkedList<Double>();
		betaValues = new LinkedList<Double>();
		
		gamma g = new gamma();
		gammaValues = g.gamma0();
		double gammas0s0 = gammaValues.get(0);
		double gammas0s1 = gammaValues.get(1);
		
		alpha a = new alpha();
		alphaValues = a.alpha0();
		double a0s0 = alphaValues.get(0);
		double a0s1 = alphaValues.get(1);
		
		beta b = new beta();
		betaValues = b.beta1();
		double b1s0 = betaValues.get(0);
		double b1s1 = betaValues.get(1);
		
		lpm0 = Math.log(Math.exp(b1s1 + a0s1 + gammas0s1))
				- Math.log(Math.exp(b1s0 + a0s0 + gammas0s0));
		
		return lpm0;
	}
	
	public double lpm1()
	{
		gammaValues = new LinkedList<Double>();
		alphaValues = new LinkedList<Double>();
		betaValues = new LinkedList<Double>();
		
		gamma g = new gamma();
		gammaValues = g.gamma1();
		double gammas0s0 = gammaValues.get(0);
		double gammas0s1 = gammaValues.get(1);
		double gammas1s0 = gammaValues.get(2);
		double gammas1s1 = gammaValues.get(3);
		
		alpha a = new alpha();
		alphaValues = a.alpha1();
		double a1s0 = alphaValues.get(0);
		double a1s1 = alphaValues.get(1);
		
		beta b = new beta();
		betaValues = b.beta2();
		double b2s0 = betaValues.get(0);
		double b2s1 = betaValues.get(1);
		
		lpm1 = Math.log(Math.exp(b2s0 + a1s1 + gammas1s0) + Math.exp(b2s1 + a1s0 + gammas0s1))
				- Math.log(Math.exp(b2s1 + a1s1 + gammas1s1) + Math.exp(b2s0 + a1s0 + gammas0s0));
		
		return lpm1;
	}
	
	public double lpm2()
	{
		gammaValues = new LinkedList<Double>();
		alphaValues = new LinkedList<Double>();
		betaValues = new LinkedList<Double>();
		
		gamma g = new gamma();
		gammaValues = g.gamma2();
		double gammas0s0 = gammaValues.get(0);
		double gammas0s1 = gammaValues.get(1);
		double gammas1s0 = gammaValues.get(2);
		double gammas1s1 = gammaValues.get(3);
		
		alpha a = new alpha();
		alphaValues = a.alpha2();
		double a2s0 = alphaValues.get(0);
		double a2s1 = alphaValues.get(1);
		
		beta b = new beta();
		betaValues = b.beta3();
		double b3s0 = betaValues.get(0);
		double b3s1 = betaValues.get(1);
		
		lpm2 = Math.log(Math.exp(b3s0 + a2s1 + gammas1s0) + Math.exp(b3s1 + a2s0 + gammas0s1))
				- Math.log(Math.exp(b3s1 + a2s1 + gammas1s1) + Math.exp(b3s0 + a2s0 + gammas0s0));
		
		return lpm2;
	}
	
}
