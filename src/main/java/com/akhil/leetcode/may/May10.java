package com.akhil.leetcode.may;
import java.util.*;
class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N==1)
            return N;
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int m[]: trust){
            if(map.containsKey(m[1]))
                map.replace(m[1], map.get(m[1])+1);
            else
                map.put(m[1], 1);
            set.add(m[0]);
        }

        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            if(i.getValue()==N-1 && !set.contains(i.getKey()))
                return i.getKey();
        }

        return -1;
    }
}
public class May10 {
    public static void main (String ...args){
        Solution sol = new Solution();
        System.out.println(sol.findJudge(3, new int[][]{{1,2},{1,3},{2,3}}));
    }
}
