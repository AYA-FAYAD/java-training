import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;


        int principal = 0;
        float monthlyInterest =0;
        int period =0;

        System.out.println("hi my first project ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal ($1K - $ 1M):");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) 
                   break;
            System.out.println("Enter a value between 1k and 1m ");       

        }
        

       

        while (true) {
        System.out.print("Annual Interest Rate : ");
        float annual = scanner.nextFloat();
        if (annual >=1 && annual <= 30) {
            monthlyInterest = annual / PERCENT / MONTH_IN_YEAR;
            break;
        }
        System.out.println("Enter a value between 1 and 30");
       
        
            
        }
        
        // System.out.println("Monthly Interest Rate: " + monthlyInterest);
           
        while (true) {
            System.out.print("Period(Years):");
            int Years = scanner.nextInt();
            if (Years >=1 && Years <=30) {
                 period = Years* MONTH_IN_YEAR;
                break;    
            }
            System.out.println("Enter a value between 1 and 30");
        }

        // System.out.print("Period(Years):");
        // int period = scanner.nextInt() * MONTH_IN_YEAR;

        float base = monthlyInterest + 1;
        double pw = Math.pow(base, period);

        // System.out.println(pw);

        double mortgage = principal * (monthlyInterest * pw) / (pw - 1);

        
        String mortagageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage " + mortagageFormatted);

    
        
    }
}