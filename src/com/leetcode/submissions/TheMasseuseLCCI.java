package com.leetcode.submissions;

import java.util.*;

/**
 * Create by Ranzd on 2020-03-24 10:25
 *
 * @author cm.zdran@foxmail.com
 */
public class TheMasseuseLCCI {
    public int ans = 0;
    public int temp = 0;
    public int massage(int[] nums) {
        dfs(nums,0);
        return ans;

    }
    public void dfs(int[] nums,int index){
        if(index>=nums.length){
            ans = Math.max(ans,temp);
            return;
        }
        for(int i = index;i<nums.length;i++){
            temp+= nums[i];
            dfs(nums,i+2);
            temp -= nums[i];
        }
    }

    public static void main(String[] args) {
//        TheMasseuseLCCI lcci = new TheMasseuseLCCI();
//        System.out.println(lcci.massage(new int[]{2,1,4,5,3,1,1,3}));

        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(1L);

        Set<Long> set = new HashSet<>(list);
        System.out.println(Arrays.toString(set.toArray()));
    }
}
