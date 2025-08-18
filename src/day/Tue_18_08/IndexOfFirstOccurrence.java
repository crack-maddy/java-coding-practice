package day.Tue_18_08;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        System.out.println(findIndex("c","c"));
    }

    public static int findIndex(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
