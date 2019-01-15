package com.stackroute.pe3;
/*
Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
 */

public class TryCatchFinally {
    public static void main(String[] args) {
        String[] words = new String[5];
        try {
            String string = words[99];
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("\n" + "Exception has been caught");
        } finally {
            System.out.println("\n" + "finally has been executed");
        }
    }
}