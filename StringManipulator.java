import java.util.*;

public class StringManipulator {
    public String trimAndConcat(String string1, String string2){
        string1=string1.trim();
        string2=string2.trim();
        return (string1+string2);
    }

    public Integer getIndexOrNull(String string1, char letter){
        Integer firstIndex = string1.indexOf('o');
        if(firstIndex == -1){
            return null;
        } else{
        return (firstIndex);
        }
    }

    public Integer getIndexOrNull(String string1, String string2){
        
    }
}

