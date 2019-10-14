
package com.code.assignment;

import java.util.*;

// Task 6
public class VowelRemove {
    static String remVowel(String str)
    {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        List <Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }

        return sb.toString();
    }
    // Driver method to test the above function
    public static void main(String[] args)
    {
        String str = "Hi Today's Weather is very cold";

        System.out.println(remVowel(str));
    }

}
