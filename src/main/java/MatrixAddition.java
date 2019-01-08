import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MatrixAddition {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows of matrix");
        int rows = scan.nextInt();
        System.out.println("Input number of columns of matrix");
        int columns = scan.nextInt();
        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];
        substitution(1,rows,columns,matrix1);
        substitution(2,rows,columns,matrix2);
        System.out.println(addition(rows,columns,matrix1,matrix2));
    }

    public static int[][] substitution(int k,int r,int c,int[][] matrix){
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                System.out.println("enter element row " + i + " column " + j + "of matrix "+k);
                Scanner scan = new Scanner(System.in);
                matrix[i][j]=scan.nextInt();
            }
        }
     return matrix;
    }

    public static boolean isValid(int matrix[][]){
        boolean b=true;
        for(int i=0;i<matrix.length;i++){
            if(matrix[0].length!=matrix[i].length){
                b =false;
                break;
            }
        }
       return b;
    }


    public static List<Integer> addition(int r, int c, int matrix1[][], int matrix2[][]){
        int[][] matrix =new int[r][c];
        List<Integer> sum = new ArrayList<>();
        int c1 = matrix1[0].length;
        int r1 = matrix1.length;
        int c2 = matrix2[0].length;
        int r2 = matrix2.length;
        if (c1==c2 && c2==c && r1==r2 && r2==r && isValid(matrix1) && isValid(matrix2))
        {
            for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                sum.add(matrix[i][j]);
            }

        }
        return sum;
    }
        else
            {

            return null;
            }
    }
}
