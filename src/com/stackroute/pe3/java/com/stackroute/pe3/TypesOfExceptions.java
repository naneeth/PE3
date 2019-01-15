package com.stackroute.pe3;
/*
Write a program that will generate exceptions of type NegativeArraySizeException,IndexOutOfBoundsException,
NullPointerException. Record the catching of each exception by displaying the message stored in the exception object.
 */

public class TypesOfExceptions {
    public static void main(String[] args) {
        try {
            String[] string = new String[-7];
        } catch (NegativeArraySizeException b) {
            System.out.println("\n" + "Negative array exception has been caught");
        } finally {
            System.out.println("\n" + "finally has been executed in Negative array exception");
        }
        int[] array = new int[3];
        try {
            int a = array[9];
        } catch (IndexOutOfBoundsException c) {
            System.out.println("\n" + "Index out of bound exception has been caught");
        } finally {
            System.out.println("\n" + "finally has been executed in Index out of bound exception");
        }
        String string = null;
        try {
            if (string.equals("naneeth"))
                string = "naneeth";
            else {
                string = null;
            }
        } catch (NullPointerException c) {
            System.out.println("\n" + "Null pointer exception has been caught");
        } finally {
            System.out.println("\n" + "finally has been executed in null pointer exception");
        }
    }
}
