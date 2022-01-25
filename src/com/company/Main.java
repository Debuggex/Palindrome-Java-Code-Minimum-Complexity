package com.company;

import java.util.Scanner;

public class Main {

    public static String Palindrome(String word) {
        //Taking out middle index
        int middle = word.length() / 2;
        //Taking out Last Index
        int Last = word.length() - 1;

        for (int i = 0; i < middle; i++) {
            /*Checking if Character at position ith with correspond to Character at Last position is same or not.
            For Let Say: in 5-Character Length Palindrome, the element at position (0 and 4), (1 and 3).... are same
            or not?
             */
            if (word.charAt(i) == word.charAt(Last - i)) {
                //If they are same then we are moving to next iteration.
                continue;
            } else {
                //If any of the Character mismatch then without going Further we will just return the Value.
                return "Word is not Palindrome";
            }
        }

        return "Word is Palindrome";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String Word = sc.next();
        System.out.println(Palindrome(Word));
    }
}
