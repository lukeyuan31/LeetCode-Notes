package Algorithm.Medium;
import java.util.*;

public class TimeBasedKeyValueStore {
    Map<String,TreeMap<Integer,String>> M;

    /** Initialize your data structure here. */
    public TimeBasedKeyValueStore() {
        M=new HashMap<>();

    }

    public void set(String key, String value, int timestamp) {
        if (!M.containsKey(key)) {
            M.put(key, new TreeMap<>());
        }

        M.get(key).put(timestamp,value);
    }

    public String get(String key, int timestamp) {
        if (!M.containsKey(key)){
            return "";
        }else {
            //M.get(key).floorKey(timestamp);
            TreeMap<Integer,String> temp=M.get(key);
            if (temp.floorKey(timestamp)==null){
                return "";
            }else {
                return temp.get(temp.floorKey(timestamp));
            }
        }
    }
}
