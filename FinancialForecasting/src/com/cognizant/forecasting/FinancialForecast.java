package com.cognizant.forecasting;

public class FinancialForecast {
	
	 public static double futureValue(double currentValue, double growthRate,int years) {
		 
		 	if (years == 0) {
		 		return currentValue;
		 	}
		 	return futureValue(currentValue * (1 + growthRate),growthRate,years - 1);
}

	public static void main(String[] args) {
		double initialInvestment = 10000;
        double annualGrowthRate = 0.08; // 8%
        int forecastYears = 5;

        double futureValue = futureValue(
                initialInvestment,
                annualGrowthRate,
                forecastYears
        );

        System.out.println("Initial Investment : ₹" + initialInvestment);
        System.out.println("Growth Rate        : " + (annualGrowthRate * 100) + "%");
        System.out.println("Forecast Period    : " + forecastYears + " years");
        System.out.printf("Predicted Value    : ₹%.2f%n", futureValue);

	}
}