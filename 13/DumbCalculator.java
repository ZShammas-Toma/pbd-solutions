import java.util.Scanner;
public class DumbCalculator {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your first number? ");
        double firstNumber = input.nextDouble();
        System.out.print("What is your second number? ");
        double secondNumber = input.nextDouble();
        System.out.print("What is your third number? ");
        double thirdNumber = input.nextDouble();
        double sumNumbers = firstNumber + secondNumber + thirdNumber;
        System.out.println("(" + firstNumber + " + " + secondNumber + " + " + thirdNumber + ") / 2 is ... " + sumNumbers/2 + ".");
        }
}
