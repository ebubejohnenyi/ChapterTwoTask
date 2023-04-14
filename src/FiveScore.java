import java.util.Scanner;

public class FiveScore {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int count = 0;
        int score = 0;
        int sum = 0;
        while (count < 5) {
            System.out.println("Enter Score: ");
            score = userInput.nextInt();
            count++;
            sum = sum + score;
        }
        System.out.println("Total is : " + sum);
    }
}
