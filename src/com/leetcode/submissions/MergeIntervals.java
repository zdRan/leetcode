package com.leetcode.submissions;

import com.leetcode.extend.Interval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by ranzd on 2018/11/19
 *
 * @author cm.zdran@gmail.com
 */
public class MergeIntervals {
    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        intervals.sort(Comparator.comparingInt(o -> o.start));
        LinkedList<Interval> ansList = new LinkedList<>();
        for (Interval i : intervals) {
            if (ansList.isEmpty() || ansList.getLast().end < i.start) {
                ansList.add(i);
            } else {
                ansList.getLast().end = ansList.getLast().end > i.end ? ansList.getLast().end : i.end;
            }
        }
        return ansList;
    }

    public static void main(String[] args) {
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1, 2));
        intervalList.add(new Interval(4, 5));
        intervalList.add(new Interval(3, 4));
        intervalList.add(new Interval(7, 8));

        intervalList = merge(intervalList);
        for (Interval interval : intervalList) {
            System.out.println(interval.start + ":" + interval.end);
        }

    }
}