package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 1443. 收集树上所有苹果的最少时间（尝试中）
 * Create by Ranzd on 2021-02-13 18:59
 *
 * @author cm.zdran@foxmail.com
 */
public class MinimumTimeToCollectAllApplesInATree {

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> edgesList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            edgesList.add( new ArrayList<>(2));
        }
        for (int i = 0; i < edges.length; i++) {
            edgesList.get(edges[i][0]).add(edges[i][1]);
        }
        System.out.println(edgesList);
        int result = 0;
        for (int i = 0; i < edgesList.get(0).size(); i++) {
            result+= func(edgesList.get(0).get(i), edgesList, hasApple);
        }
        return result * 2;
    }

    public int func(int root, List<List<Integer>> edgesList , List<Boolean> hasApple) {
        if (root >= edgesList.size()) {
            return hasApple.get(root) ? 1 : 0;
        }
        int result = 0;
        for (int i = 0; i < edgesList.get(root).size(); i++) {
            result+= func(edgesList.get(root).get(i), edgesList, hasApple);
        }
        return result > 0 ? result + 1 : hasApple.get(root) ? 1 : 0;
    }

    public static void main(String[] args) {
        MinimumTimeToCollectAllApplesInATree tree = new MinimumTimeToCollectAllApplesInATree();
        int ans = tree.minTime(7,
                new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}},
                Arrays.asList(false,false,true,false,true,true,false));
        System.out.println(ans);



    }


}
