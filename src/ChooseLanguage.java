import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userInput;

        System.out.println("Press 1 For English");
        System.out.println("Press 2 For Yoruba");
        System.out.println("Press 3 For Igbo");
        System.out.println("Press 4 For Hausa");
        System.out.println("Dear Customer Kindly Enter Number: ");
        userInput = input.nextInt();

            switch (userInput){
                case 1: {
                    System.out.println("English");
                }
                break;
                case 2: {
                    System.out.println("Yoruba");
                }
                break;
                case 3: {
                    System.out.println("Igbo");
                }
                break;
                case 4: {
                    System.out.println("Hause");
                }
            }

    }
}
