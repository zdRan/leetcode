package com.leetcode.submissions;

import com.leetcode.extend.Interval;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by ranzd on 2018/11/19
 *
 * @author cm.zdran@foxmail.com
 */
public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        if (intervals.size() <= 1) {
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
}
