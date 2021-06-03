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

        String name = myGreeting.readInput();
        String outputString = myGreeting.concatenateString(name);
        myGreeting.output(outputString);
    }

    public String readInput() {
        System.out.print("What is your name? ");
        return input.nextLine();
    }

    public String concatenateString(String usrIn) {
        return "Hello," + usrIn + ",nice to meet you!";
    }

    public void output(String finalString) {
        System.out.println(finalString);
    }

}
