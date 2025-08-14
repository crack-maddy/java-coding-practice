package day.Tue_14_08;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        System.out.println(removeLeadingZeros("0000123450000"));
    }

    public static String removeLeadingZeros(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.replace(0, i, "");
        return sb.toString();
    }
}
