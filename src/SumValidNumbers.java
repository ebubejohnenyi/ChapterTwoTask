import java.util.Scanner;

public class SumValidNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (count < 5){
            System.out.println("Enter Number: ");
            int userInput = input.nextInt();
            count++;
            if (userInput >= 0 && userInput <= 100){
                sum = userInput + sum;
            }
        }
        System.out.println(sum);
    }
}
