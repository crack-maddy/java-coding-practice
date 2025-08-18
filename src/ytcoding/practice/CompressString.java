package ytcoding.practice;

public class CompressString {
    public static void main(String[] args) {

        /*
            String str  = "a5b4c3d1";
            output = "aaaaabbbbcccd";
         */
        String str = "aaaaabbbbcccd";
//        System.out.println(compress(str));

        System.out.println(decompress("a5b4c3d1"));


    }

    public static String decompress(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 2) {
            char c = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i + 1));
            for (int j = 0; j < count; j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String compress(String str) {
        char[] ch = str.toCharArray();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        char current = ch[0];
        for (int i = 1; i < str.length(); i++) {
            if (ch[i] == current) {
                count++;
            } else {
                sb.append(current).append(count);
                current = ch[i];
                count = 1;
            }
        }
        return sb.append(current).append(count).toString();
    }
}
