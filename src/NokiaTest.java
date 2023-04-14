import java.util.Scanner;

public class NokiaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaring of Variables
        int userInput;
        int userInputChoice;


        System.out.println("Press 1 --> PhoneBook");
        System.out.println("Press 2 --> Messages");
        System.out.println("Press 3 --> Chat");
        System.out.println("Press 4 --> Call Register");
        System.out.println("Press 5 --> Tones");
        System.out.println("Press 6 --> Settings");
        System.out.println("Press 7 --> Call Divert");
        System.out.println("Press 8 --> Games");
        System.out.println("Press 9 --> Calculator");
        System.out.println("Press 10 --> Reminders");
        System.out.println("Press 11 --> Clock");
        System.out.println("Press 12 --> Profiles");
        System.out.println("Press 13 --> SIM services");
        System.out.println("Dear Customer, Kindly Enter a Number to Nagivate: ");
        userInput = input.nextInt();

        switch (userInput){
            case 1: {
                System.out.println("Press 1 -> Search");
                System.out.println("Press 2 -> Service Nos");
                System.out.println("Press 3 -> Add Name");
                System.out.println("Press 4 -> Erase");
                System.out.println("Press 5 -> Edit");
                System.out.println("Press 6 -> Assign tone");
                System.out.println("Press 7 -> Send b' card");
                System.out.println("Press 8 -> Options");
                System.out.println("Press 9 -> Speed Dials");
                System.out.println("Press 10 -> Voice Tags");
                userInputChoice = input.nextInt();
                switch (userInputChoice){
                    case 8: {
                        System.out.println("Press 1 --> Type of view");
                        System.out.println("Press 2 --> Memory Status");
                    }
                }
            }
            break;




            // CHOICE OF MESSAGE ( NUMBER 2 ) STARTS HERE...
            case 2: {
                System.out.println("Press 1 -> Write Messages");
                System.out.println("Press 2 -> Inbox");
                System.out.println("Press 3 -> Outbox");
                System.out.println("Press 4 -> Picture Manager");
                System.out.println("Press 5 -> Templates");
                System.out.println("Press 6 -> Smileys");
                System.out.println("Press 7 -> Message Settings");
                System.out.println("Press 8 -> Info Service");
                System.out.println("Press 9 -> Voice mailbox number ");
                System.out.println("Press 10 -> Service command editor");
                userInputChoice = input.nextInt();
                switch (userInputChoice){
                    case 7:{
                        System.out.println("Press 1 --> Set 1^2");
                        System.out.println("Press 2 --> Common  ^3");
                        userInputChoice = input.nextInt();

                    }

                }
                switch (userInputChoice){
                    case 1: {
                        System.out.println("Press 1 --> Message Center number");
                        System.out.println("Press 2 --> Message sent as");
                        System.out.println("Press 3 --> Message validation");
                    }
                    break;
                }
                switch (userInputChoice){
                    case 2:{
                        System.out.println("Press 1 --> Delivery reports");
                        System.out.println("Press 2 --> Reply via same center");
                        System.out.println("Press 3 --> Character support");
                    }
                }
                break;
            }
            // CHOICE OF MESSAGE ( NUMBER 2 ) ENDS HERE..




            // CHOICE OF CHAT (NUMBER 3) STARTS HERE...
            case 3: {
                System.out.println("Press 1 -> Chat");
                userInputChoice = input.nextInt();
            }
            break;
            // CHOICE OF CHAT ( NUMBER 3) ENDS HERE..




            // CHOICE OF CALL REGISTER ( NUMBER 4 ) STARTS HERE..
            case 4: {
                System.out.println("Press 1 -> Missed calls");
                System.out.println("Press 2 -> Received Calls");
                System.out.println("Press 3 -> Dailed Numbers");
                System.out.println("Press 4 -> Erase recent calls lists");
                System.out.println("Press 5 -> Show call Duration");
                System.out.println("Press 6 -> Show call costs");
                System.out.println("Press 7 -> Call cost settings ");
                System.out.println("Press 8 -> Prepaid Credit");
                userInputChoice = input.nextInt();
                switch (userInputChoice){
                    case 5:{
                        System.out.println("Press 1 --> Last Call duration");
                        System.out.println("Press 2 --> All call's duration");
                        System.out.println("Press 3 --> Recieved call's duration");
                        System.out.println("Press 4 --> Dailed call's duration");
                        System.out.println("Press 5 --> Clear timers");
                    }
                    break;
                }
                switch (userInputChoice){
                    case 6:{
                        System.out.println("Press 1 --> Last call's cost");
                        System.out.println("Press 2 --> All call's cost");
                        System.out.println("Press 3 --> Clear counters");
                    }
                    break;
                }
                switch (userInputChoice){
                    case 7:{
                        System.out.println("Press 1 --> Call cost limit");
                        System.out.println("Show costs in");
                    }
                    break;
                }
            }
            break;
            // CHOICE OF CALL REGISTERS (NUMBER 4) ENDS HERE...




            // CHOICE OF TONES ( NUMBER 5 ) STARTS HERE...
            case 5: {
                System.out.println("Press 1 -> Ringing tone");
                System.out.println("Press 2 -> Ringing Volume");
                System.out.println("Press 3 -> Incoming call alert");
                System.out.println("Press 4 -> Composer");
                System.out.println("Press 5 -> Message alert tone");
                System.out.println("Press 6 -> Keypad tones");
                System.out.println("Press 7 -> Warning and game tones");
                System.out.println("Press 8 -> Vibrating alert");
                System.out.println("Press 9 -> Screen Saver");
                userInputChoice = input.nextInt();
            }
            break;
            // CHOICE OF TONES ( NUMBER 5) ENDS HERE...




            // CHOICE OF SETTINGS ( NUMBER 6 ) STARTS HERE...
            case 6: {
                System.out.println("Press 1 -> Call Setting");
                System.out.println("Press 2 -> Phone Settings");
                System.out.println("Press 3 -> Security settings");
                System.out.println("Press 4 -> Restore factory settings");
                userInputChoice = input.nextInt();
                switch (userInputChoice){
                    case 1:{
                        System.out.println("Press 1 --> Automatic redial");
                        System.out.println("Speed Dailing");
                        System.out.println("Call waiting options");
                        System.out.println("Own number sending ");
                        System.out.println("Phone line in use");
                        System.out.println("Automatic answer");
                    }
                    break;
                }
                switch (userInputChoice){
                    case 2:{
                        System.out.println("Press 1 --> Language");
                        System.out.println("Press 2 --> Cell info display");
                        System.out.println("Press 3 --> Welcome note");
                        System.out.println("Press 4 --> Network selection");
                        System.out.println("Press 5 --> Lights");
                        System.out.println("Press 6 --> Confirm SIM service actions");
                    }
                    break;
                }
                switch (userInputChoice){
                    case 3:{
                        System.out.println("Press 1 --> PIN code request");
                        System.out.println("Press 2 --> Call barring service");
                        System.out.println("Press 3 --> Fixed dailing ");
                        System.out.println("Press 4 --> Closed user group");
                        System.out.println("Press 5 --> Phone security");
                        System.out.println("Press 6 --> Change access codes");
                    }
                    break;
                }
            }
            break;
            // CHOICE OF SETTINGS ( NUMBER 6 ) ENDS HERE...




            // CHOICE OF CALL DIVERT ( NUMBER 7 ) STARTS HERE..
            case 7: {
                System.out.println("Call divert");
            }
            break;
            // CHOICE OF CALL DIVERT ( NUMBER 7 ) ENDS HERE...




            // CHOICE OF GAMES ( NUMBER 8 ) STARTS HERE...
            case 8: {
                System.out.println("Games");
            }
            break;
            // CHOICE OF GAMES ( NUMBER 8 ) ENDS HERE...




            // CHOICE OF CALCULATOR ( NUMBER 9 ) STARTS HERE...
            case 9: {
                System.out.println("Calculator");
            }
            break;
            // CHOICE OF CALCULATOR ( NUMBER 9 ) ENDS HERE..





            // CHOICE OF REMINDER ( NUMBER 10 ) STARTS HERE...
            case 10: {
                System.out.println("Reminder");
            }
            break;
            // CHOICE OF REMINDER ( NUMBER 10 ) ENDS HERE...




            // CHOICE OF REMINDER ( NUMBER 11 ) STARTS HERE...
            case 11: {
                System.out.println("Press 1 -> Alarm Clock");
                System.out.println("Press 2 -> Clock Settings");
                System.out.println("Press 3 -> Date settings");
                System.out.println("Press 4 -> Stopwatch");
                System.out.println("Press 5 -> Countdown timer");
                System.out.println("Press 6 -> Auto update of date and time");
                userInputChoice = input.nextInt();
            }
            break;


            // CHOICE OF REMINDER ( NUMBER 11 ) STARTS HERE...
            case 12: {
                System.out.println("Profiles");
            }
            break;


            // CHOICE OF REMINDER ( NUMBER 12 ) STARTS HERE...
            case 13: {
                System.out.println("SIM services");
            }

            // CHOICE OF REMINDER ( NUMBER 12 ) ENDS HERE..
        }


        // END OF P.S.V.M
    }
}

