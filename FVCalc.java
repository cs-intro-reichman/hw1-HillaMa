// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		double rateTypeDouble = Double.parseDouble(args[1]);
		double futureValue = currentValue * Math.pow(rateTypeDouble/100 + 1, n);
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + 
							rateTypeDouble + "% will yield $" + (int) futureValue);
	}
}