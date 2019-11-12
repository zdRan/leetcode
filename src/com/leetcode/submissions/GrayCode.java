package com.leetcode.submissions;

import java.util.ArrayList;
import java.util.List;

/**
 * 89. 格雷编码
 * Create by ranzd on 2019/4/24
 *
 * @author cm.zdran@foxmail.com
 */
public class GrayCode {
    /**
     此方法从对应的n位二进制码字中直接得到n位格雷码码字，步骤如下：
     对n位二进制的码字，从右到左，以0到n-1编号
     如果二进制码字的第i位和i+1位相同，则对应的格雷码的第i位为0，否则为1（当i+1=n时，二进制码字的第n位被认为是0，即第n-1位不变） [4]
     公式表示：  （G：格雷码，B：二进制码）

     例如：二进制码0101，为4位数，所以其所转为之格雷码也必为4位数，因此可取转成之二进位码第五位为0，即0 b3 b2 b1 b0。
     0 xor 0=0，所以g3=0
     0 xor 1=1，所以g2=1
     1 xor 0=1，所以g1=1
     0 xor 1=1，所以g0=1
     因此所转换为之格雷码为0111
     * @param n
     * @return
     */
    public static List<Integer> grayCode(int n) {
        int len = (int) Math.pow(2, n);
        List<Integer> ans = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            ans.add(i ^ (i >> 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(grayCode(0));
    }
}
