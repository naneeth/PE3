package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.List;

/*
Write a program to set up an array of places, Loop round and remove the vowels.
 Display the new words in console.
 */
public class RemoveVowels {
    public List<String> removeVowel(String[] place) {
        List<String> list = new ArrayList();
        if (place == null) {
            return null;
        } else {
            for (int i = 0; i < place.length; i++) {
                //  place[i]=vowel(place[i]);
                for (int j = 0; j < place[i].length(); j++) {
                    if (place[i].charAt(j) == 'a' || place[i].charAt(j) == 'e' || place[i].charAt(j) == 'i' || place[i].charAt(j) == 'o' || place[i].charAt(j) == 'u') {
                        place[i] = place[i].substring(0, j) + place[i].substring(j + 1);
                        j--;
                    }
                }
                list.add(place[i]);

            }
            return list;
        }

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


