/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Simon Furry
 */



import java.util.Scanner;

public class Solution02 {
/*
Create a program that prompts for:
Input string that:
Displays output and shows the input string
Displays the number of characters the string contains
 */
private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        String UserInput = in.nextLine();

        int count = 0;
        for(int i = 0; i < UserInput.length(); i++) {
            if(UserInput.charAt(i) != ' ')  //*If the character in the string
                                            //*is anything other than a blank space
                                            //*1 is added to the counter
                count++;
        }
        System.out.print(UserInput + " has " + count + " characters.");
    }
}
