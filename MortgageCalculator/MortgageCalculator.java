public class MortgageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;
    public static byte PERCENT = 100;
    private static byte MONTHS_IN_YEAR = 12;
    
    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    

    public  double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
    
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return balance;
    }
    public double [] getRemainingBalances(){
       var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month -1] = calculateBalance(month);
        }
        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / MortgageCalculator.PERCENT / MortgageCalculator.MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MortgageCalculator.MONTHS_IN_YEAR;
    }

   private short getYear() {
        // TODO Auto-generated method stub
       return years;
    }



    public  double calculateMortgage() {
    
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
    
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    
        return mortgage;
    }



    
}
