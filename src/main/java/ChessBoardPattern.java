public class ChessBoardPattern {
    public static void main(String[] args) {
        System.out.println(chessPattern(8,8));

    }

     public static String chessPattern(int a,int b){
            String s = "WW|";
            String pattern = "";

            for (int i = 0; i < a; i++) {
                switch (s) {
                    case "WW|":
                        s="BB|";
                        break;
                    case "BB|":
                        s ="WW|";
                        break;
                }
                pattern = pattern + "\n";
                for (int j = 0; j < b; j++) {
                    switch (s) {
                        case "WW|":
                            s="BB|";
                            pattern = pattern+s;
                            break;
                        case "BB|":
                            s ="WW|";
                            pattern = pattern+s;
                            break;
                    }

                }
            }
          return pattern;
        }
    }
