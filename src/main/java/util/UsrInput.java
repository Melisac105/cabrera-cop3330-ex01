package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);


    static public String readUsrInput() {
        System.out.print("What is your name? ");
        return input.nextLine();
    }
}
