package com.stackroute.pe3;
/*
Write a program to create a ChessBoard pattern with the help of multidimensional array,
where WWrepresents white color and BB represents Black color.
 */

public class ChessBoardPattern {
    public String chessPattern(int a, int b) {
        String toggler = "WW|";
        String pattern = "";
        for (int i = 0; i < a; i++) {
            switch (toggler) {
                case "WW|":
                    toggler = "BB|";
                    break;
                case "BB|":
                    toggler = "WW|";
                    break;
            }
            pattern = pattern + "\n";
            for (int j = 0; j < b; j++) {
                switch (toggler) {
                    case "WW|":
                        toggler = "BB|";
                        pattern = pattern + toggler;
                        break;
                    case "BB|":
                        toggler = "WW|";
                        pattern = pattern + toggler;
                        break;
                }
            }
        }
        return pattern;
    }
}
