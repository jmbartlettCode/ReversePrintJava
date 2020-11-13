/*
 * Josh Bartlett
 * Purpose: Print a message in reverse
 * June 8, 2019
 * Bellevue University
 * MyStringTest.java
 */

import java.util.Scanner;

public class MyStringTest {
    public static void main(String[] args){
        // Creates a Scanner to get user input
        Scanner input = new Scanner(System.in);
        
        // Asks user for input
        System.out.print("Enter a messaage: ");
        
        // Declare message variable and adds the user input to it
        String message = input.nextLine();
        
        // Declare length variable and adds the length of the message minus 1
        // to account for the zero place to be used in for loop
        int length = message.length() - 1;
        
        // for loop to print the message in reverse
        for(int i = length; i >= 0; i--){
            System.out.print(message.charAt(i));
        }
        
        // Print new line to make output look better
        System.out.println();
    }
}
