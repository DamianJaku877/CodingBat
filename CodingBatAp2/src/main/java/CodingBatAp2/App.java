package CodingBatAp2;
/*
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]*/

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        WordsFront wordsFront = new WordsFront();
        System.out.println(Arrays.toString(wordsFront.getFrontNumber(3)));

    }
}
