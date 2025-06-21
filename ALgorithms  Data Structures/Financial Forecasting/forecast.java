class FinancialForecast {

    // Recursive method to calculate future value
    public double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount; // Base case: no more years to grow
        }
        // Recursive step: calculate for previous year, then apply rate
        double previous = calculateFutureValue(amount, rate, years - 1);
        return previous + (previous * rate / 100);
    }
}
