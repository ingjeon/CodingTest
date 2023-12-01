import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {
            Integer num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if( k < num) list1.add(num);
        }
        return list1.isEmpty() ? new int[] { -1 } : list1.stream().mapToInt(i -> i).toArray();

    }
}