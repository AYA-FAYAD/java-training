import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args){
        //  byte age =30;
        //  long viewsCount = 3_123_444_676L;
        //  float price = 10.99F;
        //  Date now = new Date();

        //  System.out.println(now);
        
        //  System.out.println(age);
        // String message = new String("Hello World ");
        // String message = "  Hello aya" + "lolo";
        // String message = "hello \"aya\"";
        // System.out.println(message);

        // String message3 = "c:\\Windows\\";
        // System.out.println(message3);
        // String message3 = "c:\nWindows\\";
        // System.out.println(message3);

        // String message3 = "c:\tWindows\\";
        // System.out.println(message3);
        // System.out.println(message.trim());

        // System.out.println(message.startsWith("H"));
        // System.out.println(message.length());
        // System.out.println(message.replace("lo", "*"));
        // System.out.println(message.indexOf("e"));
        // System.out.println(message);

        // Point point1 = new Point(1, 1);
        // Point point2 = point1;
        // point1.x =2;
        // System.out.println(point2);

        // Array

        // int[] numbers = {2,5,4,6,7};
        // System.out.println(numbers.length);
        // Arrays.sort(numbers);
        // numbers[0]=1;
        // numbers[1] =2;
        // System.out.println(Arrays.toString(numbers));

        // Multi-demensional Array row and culom:

        // int [][] numbers= new int[2] [3];
        // numbers[0][0] =1;
        // System.out.println(Arrays.deepToString(numbers));


        // int [][] numbers= {{1,2,3},{1,4,5}};
       
        // System.out.println(Arrays.deepToString(numbers));

    // Arithmetic Expression

    //  int result = 10 /3;
    //  double result = (double)10 / (double) 3;

    // int x =1;
    // x++;

    // int x =1;
    // int y =x++;
    //  System.out.println(x);
    //  System.out.println(y);

    // int x =1;
    // int y =++x;
    //  System.out.println(x);
    //  System.out.println(y);
                                    
    // //// Implicit casting

    // short x =1;
    // int y =x +2;
     
    //  System.out.println(y);

    // String x ="1";
    
    // int y = Integer.parseInt(x)+1;

    // System.out.println(y);

    // ////////// MATH CLass

    // int result = Math.round(1.1F);
    // System.out.println(result);

    // int result = (int)Math.ceil(1.1F);
    // System.out.println(result);

    // int result = (int)Math.floor(1.1F);
    // System.out.println(result);

    // double result = Math.random();
    // System.out.println(result);

    // int result =  (int)Math.round(Math.random()*100);
    // System.out.println(result);


    // /////////////FORMATING NUMBRER////////////

    // NumberFormat currency = NumberFormat.getCurrencyInstance();
    // String result = currency.format(1234567.891);
    // System.out.println(result);

    // NumberFormat precent= NumberFormat.getPercentInstance();
    // String result = precent.format(1234567.891);
    // System.out.println(result);

    
    // String result = NumberFormat.getCurrencyInstance().format(1234567.891);
    // System.out.println(result);

    // //////////////Reading Input ///////////


    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Age:");
    //  byte age= scanner.nextByte();

    //  System.out.println("You are" + age);

    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Name:");
    //  String name= scanner.next();

    //  System.out.println("You are " + name);

    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Name:");
    //  String name= scanner.nextLine();

    //  System.out.println("You are " + name);


    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Name:");
    //  String name= scanner.nextLine().trim();

    //  System.out.println("You are " + name);


    // ///////// Comparison Operators 

    // int x =1;
    // int y = 1;
    // System.out.println(x == y);
    // System.out.println(x != y);

    // //////// Logical Operators

    // int tem = 40;
    // boolean isHyperpyrexia = tem >37 &&  tem > 39;
    // System.out.println(isHyperpyrexia);
    
    // boolean hasFever= true;
    // boolean hasPainInThroat=true;
    // boolean isGrowthOnAgar= true;
    // boolean isVarialInfection= (hasFever || hasPainInThroat) && !isGrowthOnAgar;
    
    // System.out.println(isVarialInfection);

    // /////////IF//////

    // int income =120_000;
    // boolean hasHighIncome=false;
    // if(income > 1000){
    //      hasHighIncome=true;
    // }else{
    //     hasHighIncome=false;
    // }


    // System.out.println(hasHighIncome);


    // int income = 120_000;
    // boolean hasHighIncome = income >100_000;

    // System.out.println(hasHighIncome);

    // int income =120_000;
    // String className = "Economy";
    // if(income > 100_000){
    //     className="First";
    // }


    // }

    // //////THE TERNARY //////

    // int income =120_000;
    // String className= income > 100_000 ? "First": "Economy";

    // System.out.println(className);


    // ////Switch Statements


    // String role = "Admin";

    // switch (role) {
    //     case "Admin":
    //     System.out.println("You are an admin");
            
    //         break;

    //     case "Moderator":
    //         System.out.println("You are an moderator");
                
    //             break;    
    
    //     default:
    //     System.out.println("you are a guset");
        
    // }

    // ////////FOR Looop////////

    // for(int i = 0; i < 5; i++){
    //     System.out.println("Hello World From Aya" + i);
    // }

    // ////////While Looop////////
    Scanner scanner= new Scanner(System.in);
    String input="";
    // while (!input.equals("q")) {
    //     System.out.print("Input : "); 
    //     input = scanner.next().toLowerCase();
    //     if(input.equals("pass"))
    //          continue;
    //     if(input.equals("q"))
    //          break;
    //     System.out.println(input);     
        
    // }\

    // while (true) {
    //     System.out.print("Input : "); 
    //     input = scanner.next().toLowerCase();
    //     if(input.equals("pass"))
    //          continue;
    //     if(input.equals("q"))
    //          break;
    //     System.out.println(input);     
        
    // }

    //  //////////Do while loop //// at least one exucute

    // do{
    //     System.out.print("Input : "); 
    //     input = scanner.next().toLowerCase();
    //     System.out.println(input);

    // }while(!input.equals("q"));


    // //////ForEach loop

    String [] fruits = {"Apple", "Mango","Orange"};

    // for(int i=0; i< fruits.length; i++)
    //    System.out.println(fruits[i]);

    for(int i= fruits.length -1; i >= 0; i--)
       System.out.println(fruits[i]);

    // for(String fruit: fruits)
    //    System.out.println(fruit);

    }
    
}
