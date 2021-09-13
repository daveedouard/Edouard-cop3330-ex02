/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex02;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args){
        Scanner inputString = new Scanner(System.in);
        System.out.print("What is the input string? ");

        String StringInput = inputString.nextLine();

        System.out.print(StringInput+" has "+StringInput.length()+" characters.");
    }
}
