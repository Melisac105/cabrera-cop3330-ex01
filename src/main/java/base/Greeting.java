/*Exercise 1 - Saying Hello
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint
Keep the input, string concatenation, and output separate.

Challenges
Write a new version of the program without using any variables.
Write a version of the program that displays different greetings for different people.
Write a version of the program that displays the greeting in a GUI window.
*/

package base;

import java.util.Scanner;

public class Greeting {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Greeting myGreeting = new Greeting();

        myGreeting.readInput();
        myGreeting.concatenateString();
        myGreeting.output();
    }

    public void readInput() {
        System.out.println("What is your name? ");
        String usrIn = input.nextLine();
    }

    public void concatenateString() {
        String finalString = "Hello," + usrIn + ",nice to meet you!";
    }

    public void output() {
        System.out.println(finalString);
    }

}
