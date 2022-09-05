import java.util.*;

public class P23FindAllAnagramsInString {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramIndexes = new ArrayList<>();

        int[] pCharOccurences = new int[26];
        charCounter(pCharOccurences, p);

        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i < p.length()) {
                break;
            }

            String substring = s.substring(i, i + p.length());
            int[] sCharOccurences = new int[26];
            charCounter(sCharOccurences, substring);
            if (Arrays.equals(sCharOccurences, pCharOccurences)) {
                anagramIndexes.add(i);
            }
        }   

        return anagramIndexes;
    }

    private static void charCounter(int[] array, String str) {
        for (char c : str.toCharArray()) {
            array[c - 'a']++;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
    }
}
