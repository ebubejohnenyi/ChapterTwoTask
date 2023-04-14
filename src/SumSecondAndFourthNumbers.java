import java.util.Scanner;

public class SumSecondAndFourthNumbers {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int count = 1;
        int counter = 5;
        int sum = 0;
        int userInput;

        while (count <= counter){
            System.out.println("Kindly enter a Number: ");
            userInput = input.nextInt();
            if (userInput >= 0 && userInput <= 100){
                if (count == 2 || count == 4){
                    sum += userInput;
                }
                count++;
            }
        }
        System.out.println("Total is: " + sum);
        }
    }

