import java.util.Scanner;
public class AskingQuestions {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How old are you? ");
        int age = input.nextInt();
        System.out.println("How tall are you? ");
        String height = input.next();
        System.out.println("How much do you weigh? ");
        double weight = input.nextDouble();
        System.out.println("So, you're " + age + " years old, " + height + " tall, and " + weight + " pounds heavy.");
    }
}
      
