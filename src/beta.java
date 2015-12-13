import java.util.*;

public class beta implements values {

	List<Double> betaValues;
	List<Double> betaValuesTemp;
	List<Double> gammaValues;
	
	double bks0 = 0;
	double b3s0 = 0;
	double b3s1 = 0;
	double b2s0 = 0;
	double b2s1 = 0;
	double b1s0 = 0;
	double b1s1 = 0;
	
	public List<Double> betak()
	{
		betaValues = new LinkedList<Double>();
		betaValues.add(bks0);
		
		return betaValues;
	}
	
	public List<Double> beta3()
	{
		gamma g = new gamma();
		gammaValues = g.gamma3();
		
		double gammas0s0 = gammaValues.get(0);
		double gammas1s0 = gammaValues.get(1);
		
		b3s0 = Math.log(Math.exp(gammas0s0 + bks0));
		b3s1 = Math.log(Math.exp(gammas1s0 + bks0));
		
		betaValues = new LinkedList<Double>();
		betaValues.add(b3s0);
		betaValues.add(b3s1);
		
		return betaValues;
	}
	
	public List<Double> beta2()
	{
		gamma g = new gamma();
		gammaValues = g.gamma2();
		
		double gammas0s0 = gammaValues.get(0);
		double gammas0s1 = gammaValues.get(1);
		double gammas1s0 = gammaValues.get(2);
		double gammas1s1 = gammaValues.get(3);
		
		betaValuesTemp = new LinkedList<Double>();
		betaValuesTemp = beta3();
		
		
		b3s0 = betaValuesTemp.get(0);
		b3s1 = betaValuesTemp.get(1);
		
		b2s0 = Math.log(Math.exp(gammas0s0 + b3s0) + Math.exp(gammas0s1 + b3s1));
		b2s1 = Math.log(Math.exp(gammas1s1 + b3s1) + Math.exp(gammas1s0 + b3s0));
		
		
		betaValues = new LinkedList<Double>();
		betaValues.add(b2s0);
		betaValues.add(b2s1);
		
		return betaValues;
	}
	
	public List<Double> beta1()
	{
		gamma g = new gamma();
		gammaValues = g.gamma1();
		
		double gammas0s0 = gammaValues.get(0);
		double gammas0s1 = gammaValues.get(1);
		double gammas1s0 = gammaValues.get(2);
		double gammas1s1 = gammaValues.get(3);
		
		betaValuesTemp = new LinkedList<Double>();
		betaValuesTemp = beta2();
		
		b2s0 = betaValuesTemp.get(0);
		b2s1 = betaValuesTemp.get(1);
		
		b1s0 = Math.log(Math.exp(gammas0s0 + b2s0) + Math.exp(gammas0s1 + b2s1));
		b1s1 = Math.log(Math.exp(gammas1s1 + b2s1) + Math.exp(gammas1s0 + b2s0));
		
		betaValues = new LinkedList<Double>();
		betaValues.add(b1s0);
		betaValues.add(b1s1);
		
		return betaValues;
	}
	
}
