package com.titoacademy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "ARadhYa'S bRilLIanCe CEnTeR";
        char [] myChar = myString.toCharArray();
        for (int i = 0; i < myChar.length;i++){
            myChar[i] = (char)(myChar[i] - 32);
            if (myChar[i] == ' '){
                myChar[i + 1] =(char) (myChar[i + 1] - 32);
            }
        }


        int vowelsCount = 0;
        int consonantsCount = 0;
        int specialsSymbolsCount = 0;
        for (int i = 0; i < myChar.length;i++){
            if (myChar[i] >= 'A' && myChar[i] <= 'Z'){
                if (myChar[i] == 'A' || myChar[i] == 'B' || myChar[i] == 'C' || myChar[i] == 'D'
                        || myChar[i] == 'E'){
                    vowelsCount++;
                }else{
                    consonantsCount++;
                }
            } else{
                specialsSymbolsCount++;
            }
        }

        System.out.println("The original string is " + myString);
        System.out.println("The vowels count is " + vowelsCount);
        System.out.println("The consonants counts is " + consonantsCount);
        System.out.println("The special symbols count " + specialsSymbolsCount);

    }
}
