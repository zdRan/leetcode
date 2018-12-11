package com.leetcode.submissions;

/**
 * Create by ranzd on 2018/12/11
 *
 * @author cm.zdran@gmail.com
 */
public class AddBinary {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(addBinary("110010","10111"));
    }

    public static String addBinary(String a, String b) {
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;

        for (; i >= 0 && j >= 0; i--, j--) {
            switch (a.charAt(i) + b.charAt(j)) {
                //0 + 0 = 96
                case 96:
                    if (flag) {
                        sb.insert(0, "1");
                        flag = false;
                    } else {
                        sb.insert(0, "0");
                    }
                    break;
                case 97:
                    //0 + 1 = 1 + 0 = 97
                    if (flag) {
                        sb.insert(0, "0");
                    } else {
                        sb.insert(0, "1");
                    }
                    break;
                //1 + 1 = 98
                case 98:
                    if (flag) {
                        sb.insert(0, "1");
                    } else {
                        sb.insert(0, "0");
                    }
                    flag = true;
                    break;
            }
        }
        for (; i >= 0; i--) {
            if (a.charAt(i) == '0') {
                if (flag) {
                    sb.insert(0, "1");
                    flag = false;
                } else {
                    sb.insert(0, a.substring(0, i+1));
                    break;
                }
            } else {
                if (flag) {
                    sb.insert(0, "0");
                    flag = true;
                } else {
                    sb.insert(0, a.substring(0, i + 1));
                    break;
                }
            }
        }

        for (; j >= 0; j--) {
            if (b.charAt(j) == '0') {
                if (flag) {
                    sb.insert(0, "1");
                    flag = false;
                } else {
                    sb.insert(0, b.substring(0, j + 1));
                    break;
                }
            } else {
                if (flag) {
                    sb.insert(0, "0");
                    flag = true;
                } else {
                    sb.insert(0, b.substring(0, j + 1));
                    break;
                }
            }
        }
        if (flag) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}
