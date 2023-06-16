package mypackage;
import java.sql.SQLOutput;
import java.util.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String ss = new String(sb);
        if(ss.equals(s)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }

    }
}
