package Ex04;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nyles Symonette
 */

import java.util.Scanner;

public class App {
    public static void main(String [] args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter Noun: ");
        String noun = keyboardInput.nextLine();

        System.out.print("Enter Verb: ");
        String verb = keyboardInput.nextLine();

        System.out.print("Enter adjective: ");
        String adjective = keyboardInput.nextLine();

        System.out.print("Enter adverb: ");
        String adverb = keyboardInput.nextLine();


        System.out.println("Do you " +verb+ " your " +adjective+ " "+noun+" "+ adverb+" ? That's hilarious ");




    }
}
