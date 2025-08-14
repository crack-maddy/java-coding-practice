package ytcoding;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Welcome to Java World";
        System.out.println(reverseWords2(input));
    }

    public static String reverseWords2(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String reverseWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        for (String word : words) {
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
