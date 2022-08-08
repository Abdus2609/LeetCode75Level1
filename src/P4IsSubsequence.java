public class P4IsSubsequence {
    
    public static boolean isSubsequence(String s, String t) {
        if (s.equals("")) {
            return true;
        }

        if (s.length() > 100) {
            return false;
        }

        if (t.length() > (10 * 10 * 10 * 10)) {
            return false;
        }

        if (!(s.matches("[a-z]+") && t.matches("[a-z]+"))) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int i = s.length() - 1;

        for (int j = t.length() - 1; j >= 0; j--) {
            if (i < 0) {
                break;
            }

            if (tArr[j] == sArr[i]) {
                i--;
            }
        }

        return i < 0;
    }

    public static void main(String[] args) {
        String s = "b";
        String t = "abc";
        System.out.println(isSubsequence(s, t));
    }
}