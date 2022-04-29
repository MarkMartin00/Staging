package com.revature;

import java.util.*; 
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class SpecialCharacters {
    public static int countSpecialCharacters(String S)
    {
        //this is default OUTPUT. You can change it.
        int result = 0;
    
        if ((1<= S.length()) && (S.length() <= 100000)) {
            
            for (int x =0; x < S.length(); x ++) {
            	char i = S.charAt(x);
            	if ((i == '!') || (i == '#') || (i == '@') || (i == '$') || (i == '%') || (i == '^') || (i == '`') || (i == '~')) {
            		result ++;
            	} else {
            		
            	}
                
              }
            }
        return result;
        }

    

    public static void main(String[] args) {
        // INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
       
        // OUTPUT [uncomment & modify if required]
        System.out.print(countSpecialCharacters(S));
        sc.close();
    }
}