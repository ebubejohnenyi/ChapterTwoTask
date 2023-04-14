import java.util.Scanner;

public class TenValidScores {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int userNumbers;
        int minLoop = 1;
        int maxLoop = 10;
        int maxNumber = 100;
        int sumOfValidScore = 0;

        while (minLoop <= maxLoop){
            System.out.println("Kindly Enter a Score: ");
            userNumbers = input.nextInt();
            if (userNumbers >= minLoop && userNumbers <= maxNumber){
                if (minLoop == 2 || minLoop == 4 || minLoop == 6 || minLoop == 8 || minLoop == 10 ){
                    sumOfValidScore = userNumbers + sumOfValidScore;
                }
                minLoop++;
            }
        }
        System.out.println("The sum of Valid numbers is: " + sumOfValidScore );
    }

}
