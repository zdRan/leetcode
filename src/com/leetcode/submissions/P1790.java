package com.leetcode.submissions;

/**
 * Create by Ranzd on 2022/10/11 下午7:27
 *
 * @author ranzhendong@maoyan.com
 */
public class P1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        char[] arrS1 = s1.toCharArray();
        char[] arrS2 = s2.toCharArray();

        if(arrS1.length!= arrS2.length){
            return false;
        }
        int count = 0;
        int left = -1;
        int right = -1;
        for(int i = 0;i<arrS1.length;i++){
            if(arrS1[i]!=arrS2[i]){
                count++;
                if(left == -1){
                    left = i;
                }else{
                    right = i;
                }
            }
            if(count>2){
                return false;
            }
            if(left>-1&&right>-1){
                return arrS1[left] == arrS2[right]&&arrS1[right] ==arrS2[left];
            }
        }
        return count==0||count ==2;

    }


    public static void main(String[] args) {
        areAlmostEqual("npv", "zpn");
    }
}
