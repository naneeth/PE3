package com.stackroute.pe3;
/*
Write a program to find out if a series of 7 digits are consecutive numbers.
 To make this easier, assume the digits are a string and use split().
 */
public class ConsecutiveNumbers {
    public static String isConsecutive(String inputString) {
        boolean consecutive = true;
        String outputString = "";
        String[] numbers = inputString.split(",");
        int[] numberArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                numberArray[i] = Integer.parseInt(numbers[i]);
            } catch (Exception e) {
                outputString = null;
                return outputString;
            }
        }
        if (outputString != null && numberArray.length == 7) {
            if (((numberArray[0]) - (numberArray[1])) == 1) {
                for (int i = 0; i < numberArray.length - 1; i++) {
                    if (numberArray[i] - numberArray[i + 1] != 1) {
                        consecutive = false;
                        break;
                    }
                }
            } else if (((numberArray[0]) - (numberArray[1])) == -1) {
                for (int i = 0; i < numberArray.length - 1; i++) {
                    if (numberArray[i] - numberArray[i + 1] != -1) {
                        consecutive = false;
                        break;
                    }
                }
            }
            if (consecutive) {
                outputString = inputString + " are consecutive numbers";
            } else {
                outputString = inputString + " are not consecutive numbers";
            }
        } else {
            outputString = null;
        }
        return outputString;
    }
}
