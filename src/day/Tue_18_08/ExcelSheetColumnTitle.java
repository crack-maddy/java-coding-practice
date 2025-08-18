package day.Tue_18_08;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {

        System.out.println(convertToTitle(701));

    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            sb.append((char) ('A' + remainder));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
