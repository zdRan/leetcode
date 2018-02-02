package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by ranzd on 2018/2/1
 *
 * @author ranzd@chinaunicom.cn
 */
public class CombinationSumII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> item = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        dsf(0,candidates,target,item,ans);

        return ans;
    }
    private static void dsf(int index,int[] arr,int target,List<Integer> item,List<List<Integer>> ans){
        if (target<0){
            return;
        }
        if (target == 0){
            ans.add(new ArrayList<>(item));
            return;
        }

        for (int i = index;i<arr.length;i++){
            if (i>index && arr[i] == arr[i-1]){
                continue;
            }
            item.add(arr[i]);
            dsf(i+1,arr,target-arr[i],item,ans);
            item.remove(item.size()-1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = combinationSum2(new int[]{10, 1, 1,1,12, 7, 6, 1, 5},8);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).toString());
        }
    }
}
