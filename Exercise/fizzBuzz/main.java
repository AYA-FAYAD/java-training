import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numeber");
        int number = scanner.nextInt();

        // if (number%5 == 0 && number%3 ==0){
        //     System.out.println("FuzzBuzz");
        // }
        // else if(number%5 == 0){
        //     System.out.println("Fuzz");
        // }
        // else if ( number%3 ==0) {
        //     System.out.println("Buzz");
        // }
        // else{
        //     System.out.println(number);
        // }

        // make it dry:

        if (number%5 == 0  ){
            if(number%3 ==0){
                System.out.println("FuzzBuzz");
            }
            else{
                System.out.println("Fuzz");
            }
            
        }
        else if ( number%3 ==0) {
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }


        

        
    }
}