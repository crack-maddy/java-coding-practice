package com.inteview;

public class NoteCount {
    public static void main(String[] args) {
        int amount = 10500;
        int[] denominations = {1000,500,100};
        System.out.println(calculateMinNotes(amount,denominations));
    }

    public static int calculateMinNotes(int amount, int[] denominations){
        int noteCount = 0;
        for(int denom: denominations){
            int notes = amount / denom;
            noteCount += notes;
            amount %= denom;
        }
        if(amount != 0){
            return  -1;
        }
        return noteCount;
    }

}
