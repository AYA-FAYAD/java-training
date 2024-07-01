public class MortgageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;
    public static byte PERCENT = 100;
    public static byte MONTHS_IN_YEAR = 12;
    
    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    

    public  double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / MortgageCalculator.PERCENT / MortgageCalculator.MONTHS_IN_YEAR;
        float numberOfPayments = years * MortgageCalculator.MONTHS_IN_YEAR;
    
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return balance;
    }

    public  double calculateMortgage() {
    
        float monthlyInterest = annualInterest / MortgageCalculator.PERCENT / MortgageCalculator.MONTHS_IN_YEAR;
        float numberOfPayments = years * MortgageCalculator.MONTHS_IN_YEAR;
    
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return mortgage;
    }



    public short getYear() {
        // TODO Auto-generated method stub
       return years;
    }
    
}
