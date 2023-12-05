package com.mycompany.easy1;

import java.util.*;
public class Easy1 {
     public int lengthOfLastWord(String s) {
        int length=0;
        int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(s.length()-1-j)==' ')
            {
                j++;
                continue;
            }
            else{

            
            if(s.charAt(i)!=' ')
            {
                length++;
               
            }
             else
            {
                break;
            }
            }
           
        }
        return length;      
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Easy1 easy1 = new Easy1();
        int result = easy1.lengthOfLastWord(input);
        System.out.println("Length of the last word: " + result);

        scanner.close();
      
   
}
    }

