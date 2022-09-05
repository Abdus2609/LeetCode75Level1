import java.util.*;

public class P28DecodeString {

    public String decodeString(String s) {
        String decoded = "";
        Stack<Integer> multipliers = new Stack<Integer>();
        Stack<String> strings = new Stack<String>();
        int currMult = 0;
        
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                currMult = 10 * currMult + s.charAt(i) - '0';
            } else if (s.charAt(i) == '[') {
                multipliers.push(currMult);
                strings.push(decoded);
                currMult = 0; 
                decoded = "";
            } else if (s.charAt(i) == ']') {
                int k = multipliers.pop();
                String next = strings.pop();
                for (int j = 0; j < k; ++j) 
                    next += decoded;
                decoded = next; 
            } else {
                decoded += s.charAt(i);
            }
        }

        return decoded;
    }
    
}
