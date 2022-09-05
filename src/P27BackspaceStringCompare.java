public class P27BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {

        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && i > 0 && sBuilder.length() != 0) {
                sBuilder.deleteCharAt(sBuilder.length() - 1);
            } else {
                sBuilder.append(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#' && i > 0) {
                tBuilder.deleteCharAt(sBuilder.length() - 1);
            } else {
                tBuilder.append(t.charAt(i));
            }
        }

        return sBuilder.toString().equals(tBuilder.toString());
    }
}
