package com.leetcode.test;

import java.util.*;

/**
 * 用于测试一些API
 * <p>
 * Create by ranzd on 2017/10/23
 *
 * @author cm.zdran@foxmail.com
 */
public class TestMain {
    private static int count = 0;

    public static void main(String[] args) {
//        char[][] bord = new char[][]{
////                new char[]{'.', '.', '9', '7', '4', '8', '.', '.', '.'},
////                new char[]{'7', '.', '.', '.', '.', '.', '.', '.', '.'},
////                new char[]{'.', '2', '.', '1', '.', '9', '.', '.', '.'},
////                new char[]{'.', '.', '7', '.', '.', '.', '2', '4', '.'},
////                new char[]{'.', '6', '4', '.', '1', '.', '5', '9', '.'},
////                new char[]{'.', '9', '8', '.', '.', '.', '3', '.', '.'},
////                new char[]{'.', '.', '.', '8', '.', '3', '.', '2', '.'},
////                new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '6'},
////                new char[]{'.', '.', '.', '2', '7', '5', '9', '.', '.'}
////        };
////        long time = System.currentTimeMillis();
////        solveSudoku(bord);
////        time = System.currentTimeMillis() - time;
////        System.out.println(time);

//        System.out.println(maxNumberOfBalloons("balloon"));
//        System.out.println(reverseParentheses("(abcd)"));
//        System.out.println(reverseParentheses("(u(love)i)"));

        //System.out.println(encode(107));
        //System.out.println(shiftGrid(new int[][]{{1,2,3},{4,5,6},{7,8,9}},2));
//        int[][] souece = new int[][]{{1,10,4,2},{9,3,8,7},{16,17,12}};
//        System.out.println(Arrays.toString(luckyNumbers(souece).toArray()));
////        getLeastNumbers(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 2);
//        System.out.println(findTheDistanceValue(new int[]{}, new int[]{-4, -3, 6, 10, 20, 30}, 3));
//        System.out.println(maxNumberOfFamilies(3,new int[][]{{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}}));
//        System.out.println(sumFourDivisors(new int[]{21}));
//        System.out.println(minSubsequence(new int[]{4, 3, 10, 9, 8}));
        //System.out.println(reformat("aaaa222"));
//        permute(new int[]{1,2,3});

//        System.out.println(arrangeWords("To be or not to be"));
//        List<List<String>> param = new ArrayList<>();
//        param.add(Arrays.asList("arrtztkotazhufrsfczr","knzgidixqgtnahamebxf","zibvccaoayyihidztflj"));
//        param.add(Arrays.asList("cffiqfviuwjowkppdajm","owqvnrhuzwqohquamvsz"));
//        param.add(Arrays.asList("knzgidixqgtnahamebxf","owqvnrhuzwqohquamvsz","qzeqyrgnbplsrgqnplnl"));
//        param.add(Arrays.asList("arrtztkotazhufrsfczr","cffiqfviuwjowkppdajm"));
//        param.add(Arrays.asList("arrtztkotazhufrsfczr","knzgidixqgtnahamebxf","owqvnrhuzwqohquamvsz","qzeqyrgnbplsrgqnplnl","zibvccaoayyihidztflj"));
//
//        System.out.println(peopleIndexes(param));
        System.out.println(new Date(1591027199000L));
    }

    public static void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;
        solve(board);
    }

    public static boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {//trial. Try 1 through 9
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c; //Put c for this cell

                            if (solve(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) return false; //check row
            if (board[row][i] != '.' && board[row][i] == c) return false; //check column
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }

    public static int maxNumberOfBalloons(String text) {
        int[] count = new int[5];
        Arrays.fill(count, 0);

        for (char c : text.toCharArray()) {
            if (c == 'b') {
                count[0] += 1;
            }
            if (c == 'a') {
                count[1] += 1;
            }
            if (c == 'l') {
                count[2] += 1;
            }
            if (c == 'n') {
                count[3] += 1;
            }
            if (c == 'o') {
                count[4] += 1;
            }
        }
        int result = count[0];
        for (int i = 1; i < 5; i++) {
            if (i % 2 == 0) {
                result = Math.min(result, count[i] / 2);
            } else {
                result = Math.min(result, count[i]);
            }
        }
        return result;
    }

    public static String reverseParentheses(String s) {
        int ls = s.indexOf('(');
        int re = s.lastIndexOf(')');
        return s.substring(0, ls) + dfs(ls, re, s.substring(ls, re)) + s.substring(re);
    }

    private static String dfs(int ls, int re, String s) {
        int le = s.indexOf('(');
        int rs = s.lastIndexOf(')');

        if (le == -1 || rs == -1) {
            count--;
            if (count % 2 == 0) {
                return s;
            } else {
                return reverse(s);
            }
        }
        count++;
        if (count % 2 == 0) {
            return s.substring(ls, le) + dfs(le, rs, s.substring(le, rs)) + s.substring(rs, re);
        } else {
            return reverse(s.substring(rs, re)) + dfs(le, rs, s.substring(le, rs)) + reverse(s.substring(ls, le));
        }
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String encode(int num) {
        StringBuilder sb = new StringBuilder();
        long count = 0;
        long flag = 0;
        long mod = 2;
        int index = 1;
        while (count < num) {

            if ((num - flag) % mod < mod / 2) {

                sb.append("0", 0, 1);
                System.out.println(index + ":" + "0");
            } else {
                sb.append("1", 0, 1);
                System.out.println(index + ":" + "1");
            }
            index++;
            count += mod;
            flag = mod;
            mod *= 2;
        }
        return sb.toString();
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int count = grid.length * grid[0].length;
        List<Integer> total = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            total.add(0);
        }
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                total.set((index + k) % count, grid[i][j]);
                index++;
            }
        }
        List<List<Integer>> result = new ArrayList<>(grid.length);
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < total.size(); i++) {
            row.add(total.get(i));
            if ((i + 1) % grid[0].length == 0) {
                result.add(row);
                row = new ArrayList<>();
            }
        }
        return result;
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        int[] minNumbers = new int[matrix.length];
        int[] maxNumbers = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(min, matrix[i][j]);
                maxNumbers[j] = Math.max(maxNumbers[j], matrix[i][j]);
            }
            minNumbers[i] = min;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= minNumbers[i] && matrix[i][j] >= maxNumbers[j]) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        int temp = 0;
        for (int i = arr.length - 1; i >= k; i--) {
            for (int j = 0; j < k; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[0];
                    arr[0] = temp;
                }
            }

        }
        return Arrays.copyOf(arr, k);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int a : arr1) {
            boolean success = true;
            for (int b : arr2) {
                if (Math.abs(a - b) <= d) {
                    success = false;
                    break;
                }
            }
            if (success) {
                count++;
            }
        }
        return count;
    }

    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count = 0;
        int line = 1;
        boolean[] arr = new boolean[11];
        for (int i = 0; i < reservedSeats.length; ) {
            if (reservedSeats[i][0] == line) {
                arr[reservedSeats[i][1]] = true;
                i++;
                continue;
            }
            if (reservedSeats[i][0] == line + 1) {
                int temp = 0;
                for (int j = 2; j <= 5; j++) {
                    if (arr[j]) {
                        temp++;
                        break;
                    }
                }
                for (int j = 4; j <= 7; j++) {
                    if (arr[j]) {
                        temp++;
                        break;
                    }
                }
                for (int j = 4; j <= 7; j++) {
                    if (arr[j]) {
                        temp++;
                        break;
                    }
                }
                if (temp == 3) {
                    count += 2;
                } else {
                    count += temp;
                }
                line++;
                Arrays.fill(arr, false);
            } else {
                count += 2;
                line++;
            }
        }
        return count;
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ansList = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            ansList.add(nums[i], index[i]);
        }
        int[] arr = new int[nums.length];
        for (int i = 0; i < ansList.size(); i++) {
            arr[i] = ansList.get(i);
        }
        return arr;
    }

    public static int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 2; j < nums[i]; j++) {
                if (nums[i] % j == 0) {
                    if (temp != 0) {
                        if (temp * j == nums[i]) {
                            ans += temp;
                            ans += j;
                            ans += 1;
                            ans += nums[i];
                        }
                        break;
                    }
                    temp = j;
                }
            }
        }
        return ans;
    }

    public static boolean hasValidPath(int[][] grid) {
        return dsf(grid, grid[0][0], 1, 0) || dsf(grid, grid[0][0], 0, 1);
    }

    public static boolean dsf(int[][] grid, int step, int x, int y) {
        if (x == grid.length - 1 && y == grid[0].length - 1) {
            return true;
        }
        boolean ans = false;
        if (x + 1 < grid.length) {
            if (step == 2 || step == 3 || step == 4) {

                if (grid[x + 1][y] == 2 || grid[x + 1][y] == 5 || grid[x + 1][y] == 6) {
                    ans = dsf(grid, grid[x][y], x + 1, y);
                }
                if (ans) {
                    return true;
                }
            }
        }
        if (y + 1 < grid[x].length) {
            if (step == 1 || step == 4 || step == 6) {

                if (grid[x][y + 1] == 1 || grid[x][y + 1] == 3 || grid[x][y + 1] == 5) {
                    ans = dsf(grid, grid[x][y], x, y + 1);
                }
                if (ans) {
                    return true;
                }
            }
        }
        return false;
    }

    public int findLucky(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int key : arr) {
            if (count.containsKey(key)) {
                count.put(key, count.get(key) + 1);
            } else {
                count.put(key, 1);
            }
        }
        for (int key : count.keySet()) {
            if (key == count.get(key)) {
                ans = Math.max(key, ans);
            }
        }
        return ans;
    }

    public int numTeams(int[] rating) {
        int ans = 0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                for (int k = j + 1; k < rating.length; k++) {
                    if (rating[i] < rating[j] && rating[j] < rating[k]) {
                        ans++;
                    }
                    if (rating[i] > rating[j] && rating[j] > rating[k]) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static int countLargestGroup(int n) {
        Map<Integer, Integer> count = new HashMap<>();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int key = count(i);
            int value = 0;
            if (count.containsKey(key)) {
                value = count.get(key) + 1;
            } else {
                value = 1;
            }
            max = Math.max(value, max);
            count.put(key, value);
        }
        int ans = 0;
        for (int value : count.values()) {
            if (value == max) {
                ans++;
            }
        }
        return ans;
    }

    private static int count(int num) {
        String value = String.valueOf(num);
        int count = 0;
        for (char c : value.toCharArray()) {
            count = count + (c - '0');
        }
        return count;
    }

    public static List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int a : nums) {
            sum += a;
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[nums.length - 1]);
        int count = nums[nums.length - 1];
        sum -= nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (count > sum) {
                return ans;
            }
            ans.add(nums[i]);
            count += nums[i];
            sum -= nums[i];
        }
        return ans;
    }

    public static String reformat(String s) {
        char[] str = new char[s.length()];
        char[] num = new char[s.length()];
        int strIndex = 0;
        int numIndex = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                num[numIndex++] = c;
            } else {
                str[strIndex++] = c;
            }
        }
        if (Math.abs(numIndex - strIndex) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        numIndex--;
        strIndex--;
        while (numIndex >= 0 || strIndex >= 0) {
            if (numIndex > strIndex) {
                sb.append(num[numIndex--]);
                if (strIndex >= 0) {
                    sb.append(str[strIndex--]);
                }
            } else {
                sb.append(str[strIndex--]);
                if (numIndex >= 0) {
                    sb.append(num[numIndex--]);
                }
            }
        }
        return sb.toString();
    }


    public static List<List<Integer>> permute(int[] nums) {
        boolean[] flag = new boolean[nums.length];
        Arrays.fill(flag, false);
        List<List<Integer>> result = new LinkedList<>();
        dfs(flag, new LinkedList<>(), nums, 0, result);
        for (List<Integer> item : result) {
            System.out.println(Arrays.deepToString(item.toArray()));

        }
        return result;
    }

    public static void dfs(boolean[] flag, LinkedList<Integer> item, int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(item));
            return;
        }
        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                item.add(nums[i]);
                flag[i] = true;
                dfs(flag, item, nums, index + 1, result);
                flag[i] = false;
                item.removeLast();
            }
        }
    }

    public static String arrangeWords(String text) {
        String[] arr = text.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0].substring(0, 1).toUpperCase());
        sb.append(arr[0].substring(1));
        for (int i = 1; i < arr.length; i++) {
            sb.append(" ").append(arr[i].toLowerCase());
        }
        return sb.toString();
    }

    public static List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        Map<List<String>, Integer> source = new HashMap<>();
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            source.put(favoriteCompanies.get(i), i);
        }

        List<Integer> result = new ArrayList<>(favoriteCompanies.size());
        Set<String> strSet = new HashSet<>();
        favoriteCompanies.sort((o1, o2) -> o2.size() - o1.size());

        for (int i = 0; i < favoriteCompanies.size(); i++) {
            boolean isAns = false;
            for (String str:favoriteCompanies.get(i)){
                if (!strSet.contains(str)) {
                    isAns = true;
                    strSet.add(str);
                }
            }
            if (isAns){
                result.add(source.get(favoriteCompanies.get(i)));
            }

        }
        return result;
    }
}
