public class P3IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < sArr.length; i++) {
            char c1 = sArr[i];
            char c2 = tArr[i];

            for (int j = 0; j < sArr.length; j++) {
                if (sArr[j] == c1 && tArr[j] != c2) {
                    return false;
                } else if (sArr[j] != c1 && tArr[j] == c2) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";

        System.out.println(isIsomorphic(s, t));
    }
    
}
