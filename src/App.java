import java.util.Scanner;

public class App {

    public String GREEN = "\033[0;32m"; // GREEN
    public String BLUE = "\033[0;34m"; // BLUE
    public String RESET = "\033[0m"; // Text Reset
    public String RED = "\033[0;31m"; // RED
    public String PURPLE = "\033[0;35m"; // PURPLE

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

    // Borders and symbols https://www.w3.org/TR/xml-entity-names/025.html, and
    // https://www.alt-codes.net/arrow_alt_codes.php

    public void color(String color, String text) {
        System.out.println(color + text + RESET);
    }

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
        System.out.println(BLUE + "│ " + RED + "Do you want to play version 1, 2, or 3?" + RESET);
        System.out.print(BLUE + "│ " + RESET);
        String gameMode = input.nextLine();
        System.out.println(BLUE + "│ " + RESET + "You selected: " + gameMode);
        System.out.println(BLUE + "├────────────────────────────────────────" + RESET);

        if (gameMode.equals("1")) {
            System.out.print(BLUE + "│ " + RESET + "Enter a celebrity: \n" + BLUE + "│ ↪ " + RESET);
            String celeb = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a place: \n" + BLUE + "│ ↪ " + RESET);
            String place = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a verb ending in -ing: \n" + BLUE + "│ ↪ " + RESET);
            String verbIng = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a hero: \n" + BLUE + "│ ↪ " + RESET);
            String hero = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an object: \n" + BLUE + "│ ↪ " + RESET);
            String object = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a celebrity: \n" + BLUE + "│ ↪ " + RESET);
            String celeb2 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an adjective: \n" + BLUE + "│ ↪ " + RESET);
            String adj = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an object: \n" + BLUE + "│ ↪ " + RESET);
            String object2 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a person: \n" + BLUE + "│ ↪ " + RESET);
            String person = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a place: \n" + BLUE + "│ ↪ " + RESET);
            String place2 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a verb ending in -ing: \n" + BLUE + "│ ↪ " + RESET);
            String verbIng2 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an object: \n" + BLUE + "│ ↪ " + RESET);
            String object3 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an object: \n" + BLUE + "│ ↪ " + RESET);
            String object4 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a person: \n" + BLUE + "│ ↪ " + RESET);
            String person2 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a verb: \n" + BLUE + "│ ↪ " + RESET);
            String verb = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an adjective: \n" + BLUE + "│ ↪ " + RESET);
            String adj2 = input.nextLine();

            System.out.println(BLUE + "├────────────────────────────────────────" + RESET);
            System.out.println(BLUE + "│ " + RESET + "Yesterday, " + celeb + " went to the " + place + " and started "
                    + verbIng + ". \n" +
                    BLUE + "│ " + RESET + "However, " + hero
                    + " was there and was able to stop him before it was too late.\n" +
                    BLUE + "│ " + RESET + "He grabbed a " + object + " and used it to apprehend " + celeb + ".\n" +
                    BLUE + "│ " + RESET + "But, " + celeb2 + " appeared out of nowhere with a " + adj + " " + object2
                    + " and helped " + celeb
                    + " escape!\n" +
                    BLUE + "│ " + RESET + "\n" +
                    BLUE + "│ " + RESET + "The next day, " + person + " was walking towards the " + place2
                    + " when they saw " + celeb
                    + " and " + celeb2 + ".\n" +
                    BLUE + "│ " + RESET + "They were each holding a " + object3 + " and " + object4 + " and were "
                    + verbIng2 + " " + person2
                    + "!\n" +
                    BLUE + "│ " + RESET + "It was a " + adj2 + " sight to see, but " + person
                    + " knew they had to do something, so he called over " + hero + ". \n" +
                    BLUE + "│ " + RESET + "Together, they were able to " + verb + " " + celeb + " and " + celeb2
                    + " and save " + person2
                    + "! The end.\n" +
                    BLUE + "│ " + RESET);

            System.out.print(BLUE + "│ " + GREEN + "Do you want to play again? (y/n)\n" + BLUE + "│ ↪ " + RESET);
            String playAgain = input.nextLine();
            if (playAgain.equals("y")) {
                doMadlib();
            } else {
                printGoodbye();
            }

        } else if (gameMode.equals("2")) {
            System.out.print(BLUE + "│ " + RESET + "Enter a person: \n" + BLUE + "│ ↪ " + RESET);
            String person = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an adjective: \n" + BLUE + "│ ↪ " + RESET);
            String adjective1 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a place: \n" + BLUE + "│ ↪ " + RESET);
            String place = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an adjective: \n" + BLUE + "│ ↪ " + RESET);
            String adjective2 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a personal feature: \n" + BLUE + "│ ↪ " + RESET);
            String personalFeature = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a personality trait: \n" + BLUE + "│ ↪ " + RESET);
            String personalityTrait = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a magical beast(like a dragon): \n" + BLUE + "│ ↪ " + RESET);
            String magicalBeast = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an adjective: \n" + BLUE + "│ ↪ " + RESET);
            String adjective3 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an adjective: \n" + BLUE + "│ ↪ " + RESET);
            String adjective4 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an object: \n" + BLUE + "│ ↪ " + RESET);
            String object = input.nextLine();

            System.out.println(BLUE + "├────────────────────────────────────────" + RESET);
            System.out.println(BLUE + "│ " + RESET + "Once upon a time, " + person + " lived in a " + adjective1 + " "
                    + place + ".\n" +
                    BLUE + "│ " + RESET + "They were known for they're " + adjective2 + " " + personalFeature + " and "
                    + personalityTrait + ".\n" +
                    BLUE + "│ " + RESET + "One day, they were walking in the " + place + " when they saw a "
                    + magicalBeast
                    + ".\n" +
                    BLUE + "│ " + RESET + "The " + magicalBeast + " was " + adjective3 + " and " + adjective4 + ".\n" +
                    BLUE + "│ " + RESET + "However " + person + " is brave and decided to fight" + RESET + " the "
                    + magicalBeast + ".\n" +
                    BLUE + "│ " + RESET + "They grabbed a " + object + " and defeated the " + magicalBeast + "!\n" +
                    BLUE + "│ " + RESET + person + " Then lived happily ever after. The end.\n" +
                    BLUE + "│ " + RESET);

            System.out.print(BLUE + "│ " + GREEN + "Do you want to play again? (y/n)\n" + BLUE + "│ ↪ " + RESET);
            String playAgain = input.nextLine();
            if (playAgain.equals("y")) {
                doMadlib();
            } else {
                printGoodbye();
            }
        } else if (gameMode.equals("3")) {
            System.out.print(BLUE + "│ " + RESET + "Enter a weather: \n" + BLUE + "│ ↪ " + RESET);
            String weather = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a person: \n" + BLUE + "│ ↪ " + RESET);
            String person = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an object: \n" + BLUE + "│ ↪ " + RESET);
            String object = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a person: \n" + BLUE + "│ ↪ " + RESET);
            String person2 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a place: \n" + BLUE + "│ ↪ " + RESET);
            String place = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a number: \n" + BLUE + "│ ↪ " + RESET);
            String number = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an emotion: \n" + BLUE + "│ ↪ " + RESET);
            String emotion = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a verb: \n" + BLUE + "│ ↪ " + RESET);
            String verb = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter a verb: \n" + BLUE + "│ ↪ " + RESET);
            String verb2 = input.nextLine();
            System.out.print(BLUE + "│ " + RESET + "Enter an object: \n" + BLUE + "│ ↪ " + RESET);
            String object2 = input.nextLine();

            System.out.println(BLUE + "├────────────────────────────────────────" + RESET);
            System.out.println(BLUE + "│ " + RESET + "In a " + weather + " day, " + person + " used a " + object
                    + " to flee from prison, with the help of " + person2 + ".\n" +
                    BLUE + "│ " + RESET + "He ran for hours until he reached a " + place
                    + " where he rested for the night.\n" +
                    BLUE + "│ " + RESET + "The next day, there was " + number + " " + emotion
                    + " cops waiting outside to arrest " + person + ". \n" +
                    BLUE + "│ " + RESET + person + " grabbed a " + object2 + " and tried to " + verb
                    + " away from the cops.\n" +
                    BLUE + "│ " + RESET + "After a long fight, the cops " + verb2 + " and arrested " + person
                    + ", putting him back into prison.\n" +
                    BLUE + "│ " + RESET + "The end.\n" +
                    BLUE + "│ " + RESET); // story

            System.out.print(BLUE + "│ " + GREEN + "Do you want to play again? (y/n)\n" + BLUE + "│ ↪ " + RESET);
            String playAgain = input.nextLine();
            if (playAgain.equals("y")) {
                doMadlib();
            } else {
                printGoodbye();
            }
        } else {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
        }

    }

    public String getUserName() {
        Scanner input = new Scanner(System.in);
        System.out.println(BLUE + "│ " + GREEN + "What is your name?" + RESET);
        System.out.print(BLUE + "│ ↪ " + RESET);
        String userName = input.nextLine();
        return userName;
    }

    public void printGreeting(String userName) {
        System.out.println(BLUE + "├────────────────────────────────────────" + RESET);
        System.out.println(BLUE + "│ " + RESET + "Hello, " + GREEN + userName + RESET + "!");
    }

    public void printGoodbye() {
        System.out.println(BLUE + "│ " + PURPLE
                + "╭────────────────────────────────────────────────────────────────────╮\n" + //
                BLUE + "│ " + PURPLE + "│  _______  _______  _______  ______   ______            _______  _  │\n" + //
                BLUE + "│ " + PURPLE + "│ (  ____ \\(  ___  )(  ___  )(  __  \\ (  ___ \\ |\\     /|(  ____ \\( ) │\n" + //
                BLUE + "│ " + PURPLE + "│ | (    \\/| (   ) || (   ) || (  \\  )| (   ) )( \\   / )| (    \\/| | │\n" + //
                BLUE + "│ " + PURPLE + "│ | |      | |   | || |   | || |   ) || (__/ /  \\ (_) / | (__    | | │\n" + //
                BLUE + "│ " + PURPLE + "│ | | ____ | |   | || |   | || |   | ||  __ (    \\   /  |  __)   | | │\n" + //
                BLUE + "│ " + PURPLE + "│ | | \\_  )| |   | || |   | || |   ) || (  \\ \\    ) (   | (      (_) │\n" + //
                BLUE + "│ " + PURPLE + "│ | (___) || (___) || (___) || (__/  )| )___) )   | |   | (____/\\ _  │\n" + //
                BLUE + "│ " + PURPLE + "│ (_______)(_______)(_______)(______/ |/ \\___/    \\_/   (_______/(_) │\n" + //
                BLUE + "│ " + PURPLE + "│                                                                    │\n" + //
                BLUE + "│ " + PURPLE + "╰────────────────────────────────────────────────────────────────────╯\n"
                + RESET);
    }

    public void printInstructions() {
        System.out.println(BLUE + "╭───────────────────────────────────────────────────────────────────╮\n" + //
                "│  _______  _______  ______     _       _________ ______   _______  │\n" + //
                "│ (       )(  ___  )(  __  \\   ( \\      \\__   __/(  ___ \\ (  ____ \\ │\n" + //
                "│ | () () || (   ) || (  \\  )  | (         ) (   | (   ) )| (    \\/ │\n" + //
                "│ | || || || (___) || |   ) |  | |         | |   | (__/ / | (_____  │\n" + //
                "│ | |(_)| ||  ___  || |   | |  | |         | |   |  __ (  (_____  ) │\n" + //
                "│ | |   | || (   ) || |   ) |  | |         | |   | (  \\ \\       ) | │\n" + //
                "│ | )   ( || )   ( || (__/  )  | (____/\\___) (___| )___) )/\\____) | │\n" + //
                "│ |/     \\||/     \\|(______/   (_______/\\_______/|/ \\___/ \\_______) │\n" + //
                "│                                                                   │\n" + //
                "╰───────────────────────────────────────────────────────────────────╯" + RESET);
        // ASCII art from (for goodbye aswell)
        // https://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20

        System.out.println(BLUE + "\n│" + RESET + " Welcome to the Madlib program!");
        System.out.println(BLUE + "│" + RESET + " You will be prompted to enter various words to complete a story.");
        System.out.println(BLUE + "│" + RESET + " The story will then be displayed with your words in the blanks.");
        System.out.println(BLUE + "│" + RESET + " You can play however many times you want!");
    }

    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
