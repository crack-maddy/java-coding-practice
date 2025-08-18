package day.Tue_18_08;

public class FindLengthOfLastWord {
    public static void main(String[] args) {
        String str = "madhava ponnana abc    ";
        System.out.println(findLength(str));
    }

    public static int findLength(String str) {
        str = str.trim();

        if (str.lastIndexOf(' ') == -1) {
            return str.length();
        }

        return str.length() - str.lastIndexOf(' ') - 1;
    }
}
