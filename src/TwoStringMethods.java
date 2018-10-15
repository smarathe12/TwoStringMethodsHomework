public class TwoStringMethods {
    public static void main(String[] args) {
        System.out.println(abcTest("123abc"));
        System.out.println(alternateStrings("hello", "siddharth"));
    }

    public static String alternateStrings(String a, String b) {
        String output = "";
        if (a.length() < b.length()) {
            int counter = 1;
            for (int i = 0; i < a.length(); i++) {
                output += a.substring(i, i + 1);
                output += b.substring(i, i + 1);
            }
            output = output + b.substring(a.length());
        } else {
            for (int i = 0; i < b.length(); i++) {
                output += a.substring(i, i + 1);
                output += b.substring(i, i + 1);
            }
            output = output + a.substring(b.length());
        }
        return output;
    }

    public static boolean abcTest(String a) {
        for (int i = 0; i < a.length() - 3; i++) {
            if((!a.substring(i, i + 1).equals(".")) && a.substring(i + 1, i + 4).equals("abc") || a.substring(i, i + 3).equals("abc") ){
                return true;
            }
        }
        return false;
    }


}

