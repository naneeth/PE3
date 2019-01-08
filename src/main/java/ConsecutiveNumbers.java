import java.util.Scanner;

public class ConsecutiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        System.out.println(isConsecutive(numbers));

    }

    public static String isConsecutive(String s){
        boolean b = true;
        String[] numbers = s.split(",");
        int[] numberArray = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numberArray[i] = Integer.parseInt(numbers[i]);
        }


                if(((numberArray[0])-(numberArray[1]))==1){
                    for(int i = 0;i<numberArray.length-1;i++){
                        if (numberArray[i]-numberArray[i+1]!=1){
                            b = false;
                            break;
                        }

                }
                }
                else if(((numberArray[0])-(numberArray[1]))==-1){
                        for(int i = 0;i<numberArray.length-1;i++){
                            if (numberArray[i]-numberArray[i+1]!=-1){
                                b = false;
                                break;
                            }
                }
        }



        if(b){
            return s+ " are consecutive numbers";
        }
        else{
            return  s+ " are not consecutive numbers";
        }

    }
}
