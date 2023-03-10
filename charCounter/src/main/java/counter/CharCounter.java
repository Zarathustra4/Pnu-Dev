package counter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CharCounter {
    public static List<Character> processStringArr(List<String> stringList){
        Set<Character> characterHashSet = new HashSet<>();
        for(String strTemp : stringList){
            for(Character chrTemp : strTemp.toCharArray()){
                characterHashSet.add(chrTemp);
            }
        }
        return new ArrayList<>(characterHashSet);
    }
}
