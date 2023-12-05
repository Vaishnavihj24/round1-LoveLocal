/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hard1;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Hard1 {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < n; i++) {
            if (s.substring(0, n - i).equals(rev.substring(i))) {
                return rev.substring(0, i) + s;
            }
        }

        return ""; // This should not happen given the constraints.
    }

    public static void main(String[] args) {
        Hard1 solution = new Hard1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String result = solution.shortestPalindrome(input);

        System.out.println("Shortest Palindrome: " + result);
    }
}

    

