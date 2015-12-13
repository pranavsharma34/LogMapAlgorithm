import java.util.*;

public class alpha implements values {
	
	List<Double> alphaValues;
	List<Double> alphaValuesTemp;
	List<Double> gammaValues;
	
	double a0s0 = 0;
	double a0s1 = 0;
	double a1s0 = 0;
	double a1s1 = 0;
	double a2s0 = 0;
	double a2s1 = 0;
		
	
	public List<Double> alpha0()
	{
		alphaValues = new LinkedList<Double>();
		alphaValues.add(a0s0);
		alphaValues.add(a0s1);
		
		return alphaValues;
	}
	
	public List<Double> alpha1()
	{
		gamma g = new gamma();
		gammaValues = g.gamma0();
		
		double gammas0s0 = gammaValues.get(0);
		double gammas0s1 = gammaValues.get(1);
		
		a1s0 = Math.log(Math.exp(gammas0s0 + a0s0));
		a1s1 = Math.log(Math.exp(gammas0s1 + a0s0));
		
		alphaValues = new LinkedList<Double>();
		alphaValues.add(a1s0);
		alphaValues.add(a1s1);
		
		return alphaValues;
	}
	
	public List<Double> alpha2()
	{
		gamma g = new gamma();
		gammaValues = g.gamma1();
		
		double gammas0s0 = gammaValues.get(0);
		double gammas0s1 = gammaValues.get(1);
		double gammas1s0 = gammaValues.get(2);
		double gammas1s1 = gammaValues.get(3);
		
		alphaValuesTemp = new LinkedList<Double>();
		alphaValuesTemp = alpha1();
		
		a1s0 = alphaValuesTemp.get(0);
		a1s1 = alphaValuesTemp.get(1);
		
		a2s0 = Math.log(Math.exp(gammas0s0 + a1s0) + Math.exp(gammas1s0 + a1s1));
		a2s1 = Math.log(Math.exp(gammas0s1 + a1s0) + Math.exp(gammas1s1 + a1s1));
		
		alphaValues = new LinkedList<Double>();
		alphaValues.add(a2s0);
		alphaValues.add(a2s1);
		
		return alphaValues;
	}
	
}
