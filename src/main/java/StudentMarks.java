import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfStudents = scan.nextInt();
        int[] stuGrades = new int[noOfStudents];
        for(int i = 0;i<noOfStudents;i++) {
            System.out.println("Enter grade of student " + (i+1));
            try {
                int input = scan.nextInt();
                if (input < 0 || input > 100) {
                    i--;
                    throw new IllegalArgumentException();
                }
                else {
                    stuGrades[i] = input;
                }
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Enter a number from 0 and 100");
            }
        }


        System.out.println(isInRange(noOfStudents,stuGrades));

    }
    public static String isInRange(int students,int[] array){
        String b = "";
        if(students == 0 || array.length != students){
            return null;
        }
        for (int i = 0;i<students;i++){
            if (array[i]<0 || array[i]>100) {
                b = "Error! grades are not in range";
                break;
            }
            else{
                b = "Grades are in range";
            }
        }
        return b;
    }

}