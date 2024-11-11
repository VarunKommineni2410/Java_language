package JAVA_2;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class DEMO_2 {
    public static void main(String[] args) {

        String s="madam";
        int c=0;
        // mohot

        for(int i=0;i<s.length();i++){
            if((s.charAt(i))==s.charAt(s.length()-i-1)){
                c=1;

            }

        }

        if(c==1){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}