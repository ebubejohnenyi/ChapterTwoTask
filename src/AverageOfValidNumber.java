import java.util.Scanner;

public class AverageOfValidNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int validNumber = 0;
        while (count < 5){
            System.out.println("Enter Number: ");
            int userInput = input.nextInt();
            count++;
            if (userInput >= 0 && userInput <= 100){
                sum = userInput + sum;
                validNumber++;
            }
        }
        System.out.println("Average is : " + sum / validNumber);
    }
}
