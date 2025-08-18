package day.Tue_18_08;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(str));
    }

    public static boolean isValidPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb = sb.append(ch);
            }
        }
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

//    public static boolean isValidPalindrome(String str) {
//        char[] ch = str.toLowerCase().toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for (char c : ch) {
//            if (Character.isLetter(c)) {
//                sb = sb.append(c);
//            }
//        }
//        String charString = sb.toString();
//        return isPalindrome(charString);
//    }
//
//    public static boolean isPalindrome(String str) {
//        char[] ch = str.toCharArray();
//        int start = 0;
//        int end = ch.length - 1;
//        while (start < end) {
//            if (ch[start] != ch[end]) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }

}
