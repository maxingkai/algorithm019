import java.util.*;

/**
 * @version v1.0
 * @Author: mxk
 * @Description:
 * @Date: 4:47 下午 2020/11/12
 */
public class groupAnagrams {


    public static List<List<Integer>> groupAnagrams(String[] strs){
        // 参数校验
        if(strs==null ||strs.length==0){
            return new ArrayList();
        }
        // 使用集合存储，属于异位词的放入同一个key下
        Map<String, List<String>> map = new HashMap();
        for(String s : strs){
            char[] sarr = s.toCharArray();
            Arrays.sort(sarr);
            String key = String.valueOf(sarr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }

    /**
     * 利用集合存储
     * key => [val1, val2]
     * @param strs
     * @return
     */
    public static List<List<String>> groupAnagrams1(String[] strs){
        if(strs == null || strs.length == 0){
            return new ArrayList();
        }
        Map<String, List<String>> map = new HashMap();
        for(String s : strs){
            char[] sarr = s.toCharArray();
            Arrays.sort(sarr);
            String key = String.valueOf(sarr);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }


    public static List<List<String>> groupAnagrams0(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList();
        }
        Map<String, List<String>> map = new HashMap();
        for(String s : strs){
            char[] val = s.toCharArray();
            Arrays.sort(val);
            String key = String.valueOf(val);
            if(! map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> res = groupAnagrams(strs);
//        System.out.println(res);
    }
}
