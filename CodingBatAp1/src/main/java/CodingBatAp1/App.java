package CodingBatAp1;
/*
Given an array of strings, return the count of the number of strings with the given length.

wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0

*/

public class App 
{
    public static void main( String[] args )
    {
        NumberOfStrings numberOfStrings = new NumberOfStrings();

        System.out.println(numberOfStrings.GetNumberString(1));
    }
}
