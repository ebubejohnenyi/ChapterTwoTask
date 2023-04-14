import java.util.Scanner;

public class FiveValidScore {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int validNumber = 0;
        int sum = 0;
        int userInput;
        int loopCounter = 5;
        while (validNumber < loopCounter ){
            System.out.println("Enter valid number from 0 - 100 : ");
            userInput = input.nextInt();
            if (userInput >= 0 && userInput <= 100){
                sum = userInput + sum;
                validNumber++;
            }
        }
        System.out.println("Sum of valid Number is: " + sum);
    }
}
