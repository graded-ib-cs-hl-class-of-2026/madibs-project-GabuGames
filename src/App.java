import java.util.Scanner;

public class App {

    public static String GREEN = "\033[0;32m"; // GREEN
    public static String BLUE = "\033[0;34m"; // BLUE
    public static String RESET = "\033[0m"; // Text Reset
    public static String RED = "\033[0;31m"; // RED
    public static String PURPLE = "\033[0;35m"; // PURPLE

    /*
     * The colors are ANSI escape codes that are used to change the color of the
     * text.
     * \033[ is the escape code, so all of the colors have it.
     * - Sometime it is written as ESC or \e[
     * The part after that is the color code.
     * - 0;32m is the color code for green
     * - 0;34m is the color code for blue
     * - 0;31m is the color code for red
     * - 0;35m is the color code for purple
     * - 0m is the color code for reset
     * learned from
     * https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-
     * using-system-out-println
     */

    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        printInstructions();
        String userName = getUserName();
        printGreeting(userName);
        doMadlib();
    }

    /*
     * Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */

    public void doMadlib() {
        Scanner input = new Scanner(System.in);
        System.out.println(RED + "Do you want to play version 1, 2, or 3?" + RESET);
        String gameMode = input.nextLine();
        System.out.println("You selected: " + gameMode);

        if (gameMode.equals("1")) {
            System.out.println(GREEN + "Enter a weather: " + RESET);
            String weather = input.nextLine();
            System.out.println(GREEN + "Enter a name: " + RESET);
            String name = input.nextLine();
            System.out.println(GREEN + "Enter an adjective: " + RESET);
            String adj1 = input.nextLine();
            System.out.println(GREEN + "Enter an animal: " + RESET);
            String animal = input.nextLine();
            System.out.println(GREEN + "Enter a verb: " + RESET);
            String verb1 = input.nextLine();
            System.out.println("On a very " + weather + " day, " + name + " went out to to go adopt a " + adj1 + " "
                    + animal + "\n" + //
                    ". However, after returning home with the horse it started " + verb1 + " everywhere"); // Final
                                                                                                           // story

            System.out.println(GREEN + "Do you want to play again? (y/n)" + RESET);
            String playAgain = input.nextLine();
            if (playAgain.equals("y")) {
                doMadlib();
            } else {
                printGoodbye();
            }

        } else if (gameMode.equals("2")) {
            System.out.println(GREEN + "Enter a weather: " + RESET);
            String weather = input.nextLine();
            System.out.println(GREEN + "Enter a name: " + RESET);
            String name = input.nextLine();
            System.out.println(GREEN + "Enter an adjective: " + RESET);
            String adj1 = input.nextLine();
            System.out.println(GREEN + "Enter an animal: " + RESET);
            String animal = input.nextLine();
            System.out.println(GREEN + "Enter a verb: " + RESET);
            String verb1 = input.nextLine();
            System.out.println("On a very " + weather + " day, " + name + " went out to to go adopt a " + adj1 + " "
                    + animal + "\n" + //
                    ". However, after returning home with the horse it started " + verb1 + " everywhere"); // Final
                                                                                                           // story

            System.out.println(GREEN + "Do you want to play again? (y/n)" + RESET);
            String playAgain = input.nextLine();
            if (playAgain.equals("y")) {
                doMadlib();
            } else {
                System.out.println(PURPLE + "Goodbye!" + RESET);
            }
        } else if (gameMode.equals("3")) {
            System.out.println(GREEN + "Enter a weather: " + RESET);
            String weather = input.nextLine();
            System.out.println(GREEN + "Enter a name: " + RESET);
            String name = input.nextLine();
            System.out.println(GREEN + "Enter an adjective: " + RESET);
            String adj1 = input.nextLine();
            System.out.println(GREEN + "Enter an animal: " + RESET);
            String animal = input.nextLine();
            System.out.println(GREEN + "Enter a verb: " + RESET);
            String verb1 = input.nextLine();
            System.out.println("On a very " + weather + " day, " + name + " went out to to go adopt a " + adj1 + " "
                    + animal + ". " + "\n" + //
                    "However, after returning home with the horse it started " + verb1 + " everywhere"); // Final
                                                                                                         // story

            System.out.println(GREEN + "Do you want to play again? (y/n)" + RESET);
            String playAgain = input.nextLine();
            if (playAgain.equals("y")) {
                doMadlib();
            } else {
                System.out.println(PURPLE + "Goodbye!" + RESET);
            }
        } else {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
        }

    }

    public String getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.println(GREEN + "What is your name?" + RESET);
        String userName = input.nextLine();
        return userName;
    }

    public void printGreeting(String userName) {
        System.out.println("────────────");
        System.out.println("Hello, " + GREEN + userName + RESET + "!");
    }

    public void printGoodbye() {
        System.out.println(PURPLE + " _______  _______  _______  ______   ______            _______  _ \n" + //
                "(  ____ \\(  ___  )(  ___  )(  __  \\ (  ___ \\ |\\     /|(  ____ \\( )\n" + //
                "| (    \\/| (   ) || (   ) || (  \\  )| (   ) )( \\   / )| (    \\/| |\n" + //
                "| |      | |   | || |   | || |   ) || (__/ /  \\ (_) / | (__    | |\n" + //
                "| | ____ | |   | || |   | || |   | ||  __ (    \\   /  |  __)   | |\n" + //
                "| | \\_  )| |   | || |   | || |   ) || (  \\ \\    ) (   | (      (_)\n" + //
                "| (___) || (___) || (___) || (__/  )| )___) )   | |   | (____/\\ _ \n" + //
                "(_______)(_______)(_______)(______/ |/ \\___/    \\_/   (_______/(_)\n" + //
                "                                                                  " + RESET);
    }

    public void printInstructions() {
        System.out.println(BLUE + " _______  _______  ______     _       _________ ______   _______ \n" + //
                "(       )(  ___  )(  __  \\   ( \\      \\__   __/(  ___ \\ (  ____ \\\n" + //
                "| () () || (   ) || (  \\  )  | (         ) (   | (   ) )| (    \\/\n" + //
                "| || || || (___) || |   ) |  | |         | |   | (__/ / | (_____ \n" + //
                "| |(_)| ||  ___  || |   | |  | |         | |   |  __ (  (_____  )\n" + //
                "| |   | || (   ) || |   ) |  | |         | |   | (  \\ \\       ) |\n" + //
                "| )   ( || )   ( || (__/  )  | (____/\\___) (___| )___) )/\\____) |\n" + //
                "|/     \\||/     \\|(______/   (_______/\\_______/|/ \\___/ \\_______)" + RESET);
        // ASCII art from (for goodbye aswell)
        // https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20

        System.out.println("\nWelcome to the Madlib program!");
        System.out.println("You will be prompted to enter various words to complete a story.");
        System.out.println("The story will then be displayed with your words in the blanks.");
        System.out.println("You can play however many times you want!");
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
