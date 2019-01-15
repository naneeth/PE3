package com.stackroute.pe3;

/*
Create a class called StudentMarks, which prompts user for the number of students, reads it from the keyboard,
 and saves it in an int variable called numOfStudents. It then prompts user for the grades of each of the students
 and saves them in an int array called stuGrades. Your program shall check that the grade is between 0 and 100 else
  has to trow an error message.
 */

public class StudentMarks {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int noOfStudents = scan.nextInt();
//        int[] stuGrades = new int[noOfStudents];
//        for (int i = 0; i < noOfStudents; i++) {
//            System.out.println("Enter grade of student " + (i + 1));
//            try {
//                int input = scan.nextInt();
//                if (input < 0 || input > 100) {
//                    i--;
//                    throw new IllegalArgumentException();
//                } else {
//                    stuGrades[i] = input;
//                }
//            } catch (IllegalArgumentException e) {
//                System.out.println("Enter a number from 0 and 100");
//            }
//        }
//
//
//        System.out.println(isInRange(noOfStudents, stuGrades));
//
//    }

    public String isInRange(int students, int[] array) {
        String output = "";
        if (students == 0 || array.length != students) {
            return null;
        }
        for (int i = 0; i < students; i++) {
            if (array[i] < 0 || array[i] > 100) {
                output = "Error! grades are not in range";
                break;
            } else {
                output = "Grades are in range";
            }
        }
        return output;
    }

}