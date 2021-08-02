package season1;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
public class SumFct {
	private static List<BigInteger>numsToSum;
	
	public static BigInteger perimeter(BigInteger n) {
		BigInteger numsToSum[]=new BigInteger[n.intValue()+2];
		numsToSum=fibonacci(n, numsToSum);
		return sumList(numsToSum).multiply(BigInteger.valueOf(4));
	}

	public static BigInteger[] fibonacci(BigInteger n, BigInteger numsToSum[]) {
		 
		 numsToSum[0]=new BigInteger("0");
		 numsToSum[1]=new BigInteger("1");
		 for(int i=2;i<n.intValue()+2;i++)
		 {
			 numsToSum[i]=numsToSum[i-1].add(numsToSum[i-2]);
		 }
		 return numsToSum;
	}
	
	public static BigInteger sumList(BigInteger numsToSum[]) {
		BigInteger finalSum=new BigInteger("0");
		for(int i=0;i<numsToSum.length;i++)
		 {
			 finalSum=finalSum.add(numsToSum[i]);
		 }
		return finalSum;
	}
	
	
}
