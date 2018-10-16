package CodingBatAp2;

import java.util.Arrays;

public class WordsFront {

    String[] words = new String[]{"a", "b", "c", "d"};

    public String[] getFrontNumber(int frontNumber){

        String[] result = new String[frontNumber];

        for(int i = 0; i < result.length; i++){
            words[i] = result[i];
        }
        return result;
    }
}
