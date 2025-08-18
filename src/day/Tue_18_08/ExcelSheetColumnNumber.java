package day.Tue_18_08;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
    public static int titleToNumber(String columnTitle){
        int result = 0;
        for(char c: columnTitle.toCharArray()){
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
