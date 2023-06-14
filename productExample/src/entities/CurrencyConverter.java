package entities;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double convertDollarsToReais(double dollars, double dollarPrice) {
		double dollarConverted = dollars * dollarPrice;
		return dollarConverted += dollarConverted * IOF;
	}
}
