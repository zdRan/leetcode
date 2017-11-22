package com.leetcode.submissions;

/**
 * Create by ranzd on 17-11-21
 *
 * @author ranzd@chinaunicom.cn
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        //不存在 . * 的情况
        if (!p.contains(".")&& !p.contains("*")){
            return s.equals(p);
        }

        return recursion2(s,p,s.length()-1,p.length()-1);
    }

    private boolean recursion(String s,String p,int sIndex,int pIndex){
        //递归结束条件
        if (pIndex<0 && sIndex < 0){
            return true;
        }
        if ((pIndex<0 && sIndex>=0)){
            return false;
        }
        if ((pIndex>=0&& sIndex<0)){
            //解决 a* 匹配完所有的s
            if (p.charAt(1) == '*' && pIndex == 1)
                return true;
            return false;
        }
        //匹配 "."
        if (p.charAt(pIndex) == '.'){
            return recursion(s,p,sIndex-1,pIndex-1);
        }
        //匹配 "*"
        if (p.charAt(pIndex) == '*'){
            //匹配成功
            if (p.charAt(pIndex-1) == '.'){
                return recursion(s,p,sIndex-1,pIndex);
            }
            if (s.charAt(sIndex) == p.charAt(pIndex-1)){
                return recursion(s,p,sIndex-1,pIndex);
            }else {
                return recursion(s,p,sIndex,pIndex-2);
            }
        }
        //匹配其他字符
        if (s.charAt(sIndex) == p.charAt(pIndex)){
            return recursion(s,p,sIndex-1,pIndex-1);
        }else {
            //匹配失败，再次从头开始匹配
            pIndex = p.length()-1;
            return recursion(s,p,sIndex-1,pIndex);
        }
    }

    private boolean recursion2(String s,String p,int sIndex,int pIndex){
        if (pIndex<0){
            return sIndex<0;
        }
        if (sIndex<0){
            if (pIndex - 1 >= 0 && p.charAt(pIndex) == '*'){
                return recursion2(s,p,sIndex,pIndex -2);
            }
            return false;
        }
        if (p.charAt(pIndex)!='*'){
            if (p.charAt(pIndex) == s.charAt(sIndex) ||(p.charAt(pIndex) == '.'&& sIndex>=0)){
                return recursion2(s,p,sIndex-1,pIndex -1);
            }else {
                return false;
            }
        }else {
            while (sIndex>=0 && ((p.charAt(pIndex-1) == '.') || p.charAt(pIndex-1) == s.charAt(sIndex))){
                if (recursion2(s,p,sIndex,pIndex-1)){
                    return true;
                }
                sIndex--;
            }
            return recursion2(s,p,sIndex,pIndex-2);
        }
    }
}
