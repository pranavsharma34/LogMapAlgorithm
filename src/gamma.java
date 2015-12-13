import java.util.*;

public class gamma implements values {
	
	List<Double> gammaValues;

	public List<Double> gamma0()
	{
		gammaValues = new LinkedList<Double>();
		double gammas0s0 = 0.5*Lc*((r0x*s0s0x0) + (r0y*s0s0y0));
		double gammas0s1 = 0.5*Lc*((r0x*s0s1x0) + (r0y*s0s1y0));
		
		gammaValues.add(gammas0s0);
		gammaValues.add(gammas0s1);
		
		return gammaValues;
	}
	
	public List<Double> gamma1()
	{
		gammaValues = new LinkedList<Double>();

		double gammas0s0 = 0.5*Lc*((r1x*s0s0x1) + (r1y*s0s0y1));
		double gammas0s1 = 0.5*Lc*((r1x*s0s1x1) + (r1y*s0s1y1));
		double gammas1s0 = 0.5*Lc*((r1x*s1s0x1) + (r1y*s1s0y1));
		double gammas1s1 = 0.5*Lc*((r1x*s1s1x1) + (r1y*s1s1y1));

		gammaValues.add(gammas0s0);
		gammaValues.add(gammas0s1);
		gammaValues.add(gammas1s0);
		gammaValues.add(gammas1s1);
		
		return gammaValues;
	}
	
	public List<Double> gamma2()
	{
		gammaValues = new LinkedList<Double>();

		double gammas0s0 = 0.5*Lc*((r2x*s0s0x2) + (r2y*s0s0y2));
		double gammas0s1 = 0.5*Lc*((r2x*s0s1x2) + (r2y*s0s1y2));
		double gammas1s0 = 0.5*Lc*((r2x*s1s0x2) + (r2y*s1s0y2));
		double gammas1s1 = 0.5*Lc*((r2x*s1s1x2) + (r2y*s1s1y2));
		
		gammaValues.add(gammas0s0);
		gammaValues.add(gammas0s1);
		gammaValues.add(gammas1s0);
		gammaValues.add(gammas1s1);
		
		return gammaValues;
	}
	
	public List<Double> gamma3()
	{
		gammaValues = new LinkedList<Double>();

		double gammas0s0 = 0.5*Lc*((r3x*s0s0x3) + (r3y*s0s0y3));
		double gammas1s0 = 0.5*Lc*((r3x*s1s0x3) + (r3y*s1s0y3));
		
		gammaValues.add(gammas0s0);
		gammaValues.add(gammas1s0);
		
		return gammaValues;
	}
	
	
}
