public class TryCatchFinally {

public static void main(String[] args) {
        String[] str = new String[5];
        try {
            String s = str[99];
        }
        catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("\n" + "Exception has been caught");
        }
        finally {
            System.out.println("\n" + "finally has been executed");
        }
    }
}