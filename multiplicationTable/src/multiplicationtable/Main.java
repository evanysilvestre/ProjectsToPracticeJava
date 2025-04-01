package multiplicationtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Multiplication Table \nInput a number: ");
            int num = scanner.nextInt();
         
            if (num >= 0) {
                for (int i=0; i<11; i++){
                    System.out.println(num + " x " + i + " = " + (num*i));
                }
            System.out.println("Do you want multiplicate another number? (yes/no)");
            String res = scanner.next();
            String resUpper = res.toUpperCase();
                if (resUpper.equals("NO")) {
                    System.out.println("Closing program...");
                    break;
                } else {
                    continue;
                }
                
            } else {
                System.out.println("Please, enter a positive number! \n");
            }
            
        }
        scanner.close();
        
    }
}
