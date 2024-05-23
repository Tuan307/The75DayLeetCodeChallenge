import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        HashMap<Integer,Integer> tmp = hm.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i2.getValue().compareTo(
                                  i1.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
        int[] res = new int[k];
        int r = 0;       
        for(Entry<Integer,Integer> entry : tmp.entrySet()){
            res[r] = entry.getKey();
            r++;
            if(r == k){
                break;
            }
        }       
        for(int i : res){
            System.out.println(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1,1,2,2,2,3,3,4}, 2));
    }
}
