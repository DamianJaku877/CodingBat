package CodingBatAp1;

public class NumberOfStrings {

    private String[] wordsCount = new String[]{"a", "bb", "b", "ccc"};
    private  int numberString;

    public int GetNumberString(int numberString){

        int count = 0;

        for (String s : wordsCount){
            if(s.length() == numberString){
                count++;
            }
        }
       return count;
    }
}
