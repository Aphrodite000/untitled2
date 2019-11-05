import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findKth(int[] a, int n, int K) {
        // write code here
        Arrays.sort(a);
        //这是升序
        int b=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int m:a){
            int c=map.getOrDefault(m,0);
            if(c==0){
                b++;
                if(b==K-1){
                    return m;
                }
            }
            map.put(m,c+1);
        }
        //题目说了保证有答案，所以不会走到这一步
        return 0;
    }
}
