package ytcoding;

import java.util.HashSet;
import java.util.Set;

public class FindLongestSubString {
    public static void main(String[] args) {
        String input = "abbccdeab";
        System.out.println(findLongestSubStringBF(input));
    }

    public static String findLongestSubStringBF(String str) {
        int maxLength = 0;
        String longestSubString = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String substring = str.substring(i, j + 1);
                if (hasUniqueCharacters(substring)) {
                    if (substring.length() > maxLength) {
                        maxLength = substring.length();
                        longestSubString = substring;
                    }
                }
            }
        }
        return longestSubString;
    }

    public static boolean hasUniqueCharacters(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

}
