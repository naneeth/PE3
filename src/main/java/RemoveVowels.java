import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of places");
        int length = scan.nextInt();
        length=length+1;
        String[] places = new String[length];
        for(int i= 0;i<length;i++){
            places[i]=scan.nextLine();
        }
        String[] input = new String[length-1];

        for (int k=0;k<length-1;k++){
            input[k]=places[k+1];
        }


        System.out.println(removeVowel(input));

    }

    public static List<String> removeVowel(String[] place) {
        List<String> pl = new ArrayList();
        for (int i = 0; i < place.length; i++) {
            //  place[i]=vowel(place[i]);


            for (int j = 0; j < place[i].length(); j++) {
                if (place[i].charAt(j) == 'a' || place[i].charAt(j) == 'e' || place[i].charAt(j) == 'i' || place[i].charAt(j) == 'o' || place[i].charAt(j) == 'u') {
                    place[i] = place[i].substring(0, j) + place[i].substring(j + 1);
                     j--;

                }
            }
           pl.add(place[i]);

        }
        return pl;

    }
}

//    public static String vowel(String s){
//       int a = s.length();
//        for(int i=0;i<a;i++){
//            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
//              s=s.substring(0,i)+s.substring(i+1,a);
//            }
//            }
//        return  s;
//        }
//    }


