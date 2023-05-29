import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P242 {
    public static void main(String[] args) {


    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()|| s.length()==0 || t.length()==0) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        for (char each : s.toCharArray()) {
            sMap.put(each, sMap.getOrDefault(each, 0) + 1);
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (char each : t.toCharArray()) {
            tMap.put(each, tMap.getOrDefault(each, 0) + 1);
        }

        for (char each : s.toCharArray()) {
            if (!sMap.get(each).equals(tMap.get(each)))
                return false;
        }
        return true;
    }
}
