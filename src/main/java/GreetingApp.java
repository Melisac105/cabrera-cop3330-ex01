/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 1 - Saying Hello
Create a program that prompts for your name and prints a greeting using your name.

Example Output
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint
Keep the input, string concatenation, and output separate.
*/

import util.ConcatenateString;
import util.Output;
import util.UsrInput;

public class GreetingApp {

    public static void main(String[] args) {
        String name = UsrInput.readUsrInput();
        String outputString = ConcatenateString.concatString(name);
        Output.printOutput(outputString);
    }
}
