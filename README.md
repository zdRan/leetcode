# [LeetCode 算法题目](https://github.com/zdRan/leetcode)
## src目录结构说明
1. extend：扩展包，题目中需要的一些扩展类，例如链表题目的节点类等。
2. mains：Main 方法测试类，所有题目的测试入口类。可以直接运行。（从28题之后所有的测试代码都在submissions下）
3. problems：题目说明类，包含解题的一些思路和需要注意的一些测试数据。（78题之后的思路都写在了代码里）
4. submissions：提交的代码，解题的具体实现在这个包下。
5. utils：工具类，一些测试用到的工具类，例如打印数组等。
6. test：用于测试一些API。

## 趟不动了，开始按标签刷
### [树](https://leetcode-cn.com/tag/tree/)
| # | 思路   | 代码      | 难度       |
|---| ----- | -------- | ---------- |
|面试题 04.03|[特定深度节点链表](#)|[Java](./src/com/leetcode/submissions/ListOfDepthLCCI.java)|Medium|
|589|[N叉树的前序遍历](#)|[Java](./src/com/leetcode/submissions/NaryTreePreorderTraversal.java)|Easy|
|剑指 Offer 32 - II|[从上到下打印二叉树 II](#)|[Java](./src/com/leetcode/submissions/ListOfDepth.java)|Easy|
|654|[最大二叉树](#)|[Java](./src/com/leetcode/submissions/MaximumBinaryTree.java)|Medium|
|998|[最大二叉树 II](#)|[Java](./src/com/leetcode/submissions/MaximumBinaryTreeII.java)|Medium|
|897|[递增顺序查找树](#)|[Java](./src/com/leetcode/submissions/IncreasingOrderSearchTree.java)|Easy|
|剑指 Offer 54 |[二叉搜索树的第k大节点](#)|[Java](./src/com/leetcode/submissions/KthLargest.java)|Easy|
|1530|[好叶子节点对的数量](#)|[Java](./src/com/leetcode/submissions/NumberOfGoodLeafNodesPairs.java)|Medium|
|222|[完全二叉树的节点个数](#)|[Java](./src/com/leetcode/submissions/CountCompleteTreeNodes.java)|Medium|
|剑指 Offer 26|[树的子结构](#)|[Java](./src/com/leetcode/submissions/IsSubStructure.java)|Medium|
|剑指 Offer 55 - II|[平衡二叉树](#)|[Java](./src/com/leetcode/submissions/IsBalanced.java)|Easy|
|814 |[二叉树剪枝](#)|[Java](./src/com/leetcode/submissions/BinaryTreePruning.java)|Medium|
|面试题 04.05|[合法二叉搜索树](#)|[Java](./src/com/leetcode/submissions/IsValidBST.java)|Medium|
|865|[具有所有最深节点的最小子树](#)|[Java](./src/com/leetcode/submissions/SubtreeWithAllDeepest.java)|Medium|
|面试题 04.12|[求和路径](#)|[Java](./src/com/leetcode/submissions/PathsWithSum.java)|Medium|
|1022|[从根到叶的二进制数之和](#)|[Java](./src/com/leetcode/submissions/SumOfRootToLeafBinaryNumbers.java)|Easy|
|1110|[删点成林](#)|[Java](./src/com/leetcode/submissions/DeleteNodesAndReturnForest.java)|Medium|


## 题目目录
| # | 思路   | 代码      | 难度       |
|---| ----- | -------- | ---------- |
|131 |[分割回文串](#)|[Java](./src/com/leetcode/submissions/PalindromePartitioning.java)|Medium|
|130 |[被围绕的区域](#)|[Java](./src/com/leetcode/submissions/SurroundedRegions.java)|Medium|
|129 |[求根到叶子节点数字之和](#)|[Java](./src/com/leetcode/submissions/SumRootToLeafNumbers.java)|Medium|
|128 |[最长连续序列](#)|[Java](./src/com/leetcode/submissions/LongestConsecutiveSequence.java)|Hard|
|127 |[Word Ladder](#)|[Java](./src/com/leetcode/submissions/WordLadder.java)|Medium|
|126 |[Word Ladder II](#)|[放弃](./src/com/leetcode/submissions/WordLadderII.java)|Hard|
|125 |[Valid Palindrome](#)|[Java](./src/com/leetcode/submissions/ValidPalindrome.java)|Easy|
|124 |[Binary Tree Maximum Path Sum](#)|[Java](./src/com/leetcode/submissions/BinaryTreeMaximumPathSum.java)|Hard|
|123 |[Best Time to Buy and Sell Stock III](#)|[Java](./src/com/leetcode/submissions/BestTimeToBuyAndSellStockIII.java)|Hard|
|122 |[Best Time to Buy and Sell Stock II](#)|[Java](./src/com/leetcode/submissions/BestTimeToBuyAndSellStockII.java)|Easy|
|121 |[Best Time to Buy and Sell Stock](#)|[Java](./src/com/leetcode/submissions/BestTimeToBuyAndSellStock.java)|Easy|
|120 |[Triangle](#)|[Java](./src/com/leetcode/submissions/Triangle.java)|Medium|
|119 |[Pascal's Triangle II](#)|[Java](./src/com/leetcode/submissions/PascalsTriangleII.java)|Easy|
|118 |[Pascal's Triangle](#)|[Java](./src/com/leetcode/submissions/PascalsTriangle.java)|Easy|
|117 |[Populating Next Right Pointers in Each Node II](#)|[Java](./src/com/leetcode/submissions/PopulatingNextRightPointersII.java)|Medium|
|116 |[Populating Next Right Pointers in Each Node](#)|[Java](./src/com/leetcode/submissions/PopulatingNextRightPointers.java)|Medium|
|115 |[Distinct Subsequences](#)|[Java](./src/com/leetcode/submissions/DistinctSubsequences.java)|Hard|
|114 |[Flatten Binary Tree to Linked List](#)|[Java](./src/com/leetcode/submissions/FlattenBTToLinkedList.java)|Medium|
|113 |[Path Sum II](#)|[Java](./src/com/leetcode/submissions/PathSumII.java)|Medium|
|112 |[Path Sum](#)|[Java](./src/com/leetcode/submissions/PathSum.java)|Easy|
|111 |[Minimum Depth of Binary Tree](#)|[Java](./src/com/leetcode/submissions/MinimumDepthOfBT.java)|Easy|
|110 |[Balanced Binary Tree](#)|[Java](./src/com/leetcode/submissions/BalancedBT.java)|Easy|
|109 |[Convert Sorted List to Binary Search Tree](#)|[Java](./src/com/leetcode/submissions/ConvertSortedListToBST.java)|Medium|
|108 |[Convert Sorted Array to Binary Search Tree](#)|[Java](./src/com/leetcode/submissions/ConvertSortedArrayToBST.java)|Easy|
|107 |[Binary Tree Level Order Traversal II](#)|[Java](./src/com/leetcode/submissions/BTLevelOrderTraversalII.java)|Easy|
|106 |[Construct Binary Tree from Inorder and Postorder Traversal](#)|[Java](./src/com/leetcode/submissions/ConstructBinaryTree2.java)|Medium|
|105 |[Construct Binary Tree from Preorder and Inorder Traversal](#)|[Java](./src/com/leetcode/submissions/ConstructBinaryTree.java)|Medium|
|104 |[Maximum Depth of Binary Tree](#)|[Java](./src/com/leetcode/submissions/MaximumDepthOfBT.java)|Easy|
|103 |[Binary Tree Zigzag Level Order Traversal](#)|[Java](./src/com/leetcode/submissions/BTZigzagLevelOrderTraversal.java)|Medium|
|102 |[Binary Tree Level Order Traversal](#)|[Java](./src/com/leetcode/submissions/BTLevelOrderTraversal.java)|Medium|
|101 |[Symmetric Tree](#)|[Java](./src/com/leetcode/submissions/SymmetricTree.java)|Easy|
|100 |[Same Tree](#)|[Java](./src/com/leetcode/submissions/SameTree.java)|Easy|
|99 |[Recover Binary Search Tree](#)|[Java](./src/com/leetcode/submissions/RecoverBST.java)|Hard|
|98 |[Validate Binary Search Tree](#)|[Java](./src/com/leetcode/submissions/ValidateBST.java)|Medium|
|97 |[Interleaving String](#)|[Java](./src/com/leetcode/submissions/InterleavingString.java)|Hard|
|96 |[Unique Binary Search Trees](#)|[Java](./src/com/leetcode/submissions/UniqueBST.java)|Medium|
|95 |[Unique Binary Search Trees II](#)|[Java](./src/com/leetcode/submissions/UniqueBSTII.java)|Medium|
|94 |[Binary Tree Inorder Traversal](#)|[Java](./src/com/leetcode/submissions/BinaryTreeInorderTraversal.java)|Medium|
|93 |[Restore IP Addresses](#)|[Java](./src/com/leetcode/submissions/RestoreIPAddresses.java)|Medium|
|92 |[Reverse Linked List II](#)|[Java](./src/com/leetcode/submissions/ReverseLinkedListII.java)|Medium|
|91 |[Decode Ways](#)|[Java](./src/com/leetcode/submissions/DecodeWays.java)|Medium|
|90 |[Subsets II](#)|[Java](./src/com/leetcode/submissions/SubsetsII.java)|Medium|
|89 |[Gray Code](#)|[Java](./src/com/leetcode/submissions/GrayCode.java)|Medium|
|88 |[Merge Sorted Array](#)|[Java](./src/com/leetcode/submissions/MergeSortedArray.java)|Easy|
|87 |[Scramble String](#)|[Java](./src/com/leetcode/submissions/ScrambleString.java)|Hard|
|86 |[Partition List](#)|[Java](./src/com/leetcode/submissions/PartitionList.java)|Medium|
|85 |[Maximal Rectangle](#)|[Java](./src/com/leetcode/submissions/MaximalRectangle.java)|Hard|
|84 |[Largest Rectangle in Histogram](#)|[Java](./src/com/leetcode/submissions/LargestRectangle.java)|Hard|
|83 |[Remove Duplicates from Sorted List](#)|[Java](./src/com/leetcode/submissions/RemoveDuplicatesSorted.java)|Easy|
|82 |[Remove Duplicates from Sorted List II](#)|[Java](./src/com/leetcode/submissions/RemoveDuplicatesSortedII.java)|Medium|
|81 |[Search in Rotated Sorted Array II](#)|[Java](./src/com/leetcode/submissions/SearchArrayII.java)|Medium|
|80 |[Remove Duplicates from Sorted Array II](#)|[Java](./src/com/leetcode/submissions/RemoveDuplicatesII.java)|Medium|
|79 |[Word Search](#)|[Java](./src/com/leetcode/submissions/WordSearch.java)|Medium|
|78 |[Subsets](./src/com/leetcode/problems/Subsets.md)|[Java](./src/com/leetcode/submissions/Subsets.java)|Medium|
|77 |[Combinations](./src/com/leetcode/problems/Combinations.md)|[Java](./src/com/leetcode/submissions/Combinations.java)|Medium|
|76 |[Minimum Window Substring](./src/com/leetcode/problems/MinWindow.md)|[Java](./src/com/leetcode/submissions/MinWindow.java)|Hard|
|75 |[Sort Colors](./src/com/leetcode/problems/SortColors.md)|[Java](./src/com/leetcode/submissions/SortColors.java)|Medium|
|74 |[Search a 2D Matrix](./src/com/leetcode/problems/SearchMatrix.md)|[Java](./src/com/leetcode/submissions/SearchMatrix.java)|Medium|
|73 |[Set Matrix Zeroes](./src/com/leetcode/problems/SetMatrixZeroes.md)|[Java](./src/com/leetcode/submissions/SetMatrixZeroes.java)|Medium|
|72 |[Edit Distance](./src/com/leetcode/problems/EditDistance.md)|[Java](./src/com/leetcode/submissions/EditDistance.java)|MinimumWindow|
|71 |[Simplify Path](./src/com/leetcode/problems/SimplifyPath.md)|[Java](./src/com/leetcode/submissions/SimplifyPath.java)|Medium|
|70 |[Climbing Stairs](./src/com/leetcode/problems/ClimbingStairs.md)|[Java](./src/com/leetcode/submissions/ClimbingStairs.java)|Easy|
|69 |[Sqrt(x)](.)|Java 自带的函数库。不过效率不高|Easy|
|68 |[Text Justification](./src/com/leetcode/problems/TextJustification.md)|[Java](./src/com/leetcode/submissions/TextJustification.java)|Hard|
|67 |[Add Binary](./src/com/leetcode/problems/AddBinary.md)|[Java](./src/com/leetcode/submissions/AddBinary.java)|Hard|
|66 |[Plus One](./src/com/leetcode/problems/PlusOne.md)|[Java](./src/com/leetcode/submissions/PlusOne.java)|Easy|
|65 |[Valid Number](./src/com/leetcode/problems/ValidNumber.md)|[Java](./src/com/leetcode/submissions/ValidNumber.java)|Hard|
|64 |[Minimum Path Sum](./src/com/leetcode/problems/MinimumPathSum.md)|[Java](./src/com/leetcode/submissions/MinimumPathSum.java)|Medium|
|63 |[Unique Paths II](./src/com/leetcode/problems/UniquePathsII.md)|[Java](./src/com/leetcode/submissions/UniquePathsII.java)|Medium|
|62 |[Unique Paths](./src/com/leetcode/problems/UniquePaths.md)|[Java](./src/com/leetcode/submissions/UniquePaths.java)|Medium|
|61 |[Rotate List](./src/com/leetcode/problems/RotateList.md)|[Java](./src/com/leetcode/submissions/RotateList.java)|Medium|
|60 |[Permutation Sequence](./src/com/leetcode/problems/PermutationSequence.md)|[Java](./src/com/leetcode/submissions/PermutationSequence.java)|Medium|
|59 |[Spiral Matrix II](./src/com/leetcode/problems/SpiralMatrixII.md)|[Java](./src/com/leetcode/submissions/SpiralMatrixII.java)|Medium|
|58 |[Length of Last Word](./src/com/leetcode/problems/LengthLastWord.md)|[Java](./src/com/leetcode/submissions/LengthLastWord.java)|Easy|
|57 |[Insert Interval](./src/com/leetcode/problems/InsertInterval.md)|[Java](./src/com/leetcode/submissions/InsertInterval.java)|Hard|
|56 |[Merge Intervals](./src/com/leetcode/problems/MergeIntervals.md)|[Java](./src/com/leetcode/submissions/MergeIntervals.java)|Medium|
|55 |[Jump Game](./src/com/leetcode/problems/JumpGame2.md)|[Java](./src/com/leetcode/submissions/JumpGame2.java)|Medium|
|54 |[Spiral Matrix](./src/com/leetcode/problems/SpiralMatrix.md)|[Java](./src/com/leetcode/submissions/SpiralMatrix.java)|Medium|
|53 |[Maximum Subarray](./src/com/leetcode/problems/MaximumSubarray.md)|[Java](./src/com/leetcode/submissions/MaximumSubarray.java)|Medium|
|52 |[N-Queens II](./src/com/leetcode/problems/NQueens.md)|[Java](./src/com/leetcode/submissions/NQueensII.java)|Hard|
|51 |[N-Queens](./src/com/leetcode/problems/NQueens.md)|[Java](./src/com/leetcode/submissions/NQueens.java)|Hard|
|50 |[Pow(x, n)](./src/com/leetcode/problems/PowXN.md)|[Java](./src/com/leetcode/submissions/PowXN.java)|Medium|
|49 |[Group Anagrams](./src/com/leetcode/problems/GroupAnagrams.md)|[Java](./src/com/leetcode/submissions/GroupAnagrams.java)|Medium|
|48 |[Rotate Image](./src/com/leetcode/problems/RotateImage.md)|[Java](./src/com/leetcode/submissions/RotateImage.java)|Medium|
|47 |[PermutationsII](./src/com/leetcode/problems/PermutationsII.md)|[Java](./src/com/leetcode/submissions/PermutationsII.java)|Medium|
|46 |[Permutations](./src/com/leetcode/problems/Permutations.md)|[Java](./src/com/leetcode/submissions/Permutations.java)|Medium|
|45 |[JumpGame](./src/com/leetcode/problems/JumpGame.md)|[Java](./src/com/leetcode/submissions/JumpGame.java)|Hard|
|44 |[WildcardMatching](./src/com/leetcode/problems/WildcardMatching.md)|[Java](./src/com/leetcode/submissions/WildcardMatching.java)|Hard|
|43 |[Multiply strings](./src/com/leetcode/problems/MultiplyStrings.md)|[Java](./src/com/leetcode/submissions/MultiplyStrings.java)|Medium|
|42 |[Trapping Rain Water](./src/com/leetcode/problems/TrappingRainWater.md)|[Java](./src/com/leetcode/submissions/TrappingRainWater.java)|Hard|
|41 |[First missing positive](./src/com/leetcode/problems/FirstMissingPositive.md)|[Java](./src/com/leetcode/submissions/FirstMissingPositive.java)|Hard|
|40 |[Combination Sum II](./src/com/leetcode/problems/CombinationSumII.md)|[Java](./src/com/leetcode/submissions/CombinationSumII.java)|Medium|
|39 |[Combination Sum](./src/com/leetcode/problems/CombinationSum.md)|[Java](./src/com/leetcode/submissions/CombinationSum.java)|Medium|
|38 |[Count and Say](./src/com/leetcode/problems/CountAndSay.md)|[Java](./src/com/leetcode/submissions/CountAndSay.java)|Easy|
|37 |[Sudoku Solver](./src/com/leetcode/problems/SudokuSolver.md)|[Java](./src/com/leetcode/submissions/SudokuSolver.java)|Hard|
|36 |[Valid Sudoku](./src/com/leetcode/problems/ValidSudoku.md)|[Java](./src/com/leetcode/submissions/ValidSudoku.java)|Medium|
|35 |[Search Insert Position](./src/com/leetcode/problems/SearchInsertPosition.md)|[Java](./src/com/leetcode/submissions/SearchInsertPosition.java)|Easy|
|34 |[Search for a Range](./src/com/leetcode/problems/SearchRange.md)|[Java](./src/com/leetcode/submissions/SearchRange.java)|Medium|
|33 |[Search in Rotated Sorted Array](./src/com/leetcode/problems/SearchArray.md)|[Java](./src/com/leetcode/submissions/SearchArray.java)|Medium|
|32 |[Longest Valid Parentheses](./src/com/leetcode/problems/LongestValidParentheses.md)|[Java](./src/com/leetcode/submissions/LongestValidParentheses.java)|Hard|
|31 |[Next Permutation](./src/com/leetcode/problems/NextPermutation.md)|[Java](./src/com/leetcode/submissions/NextPermutation.java)|Medium|
|30 |[Substring with Concatenation of All Words](./src/com/leetcode/problems/ConcatenationWords.md)|[Java](./src/com/leetcode/submissions/ConcatenationWords.java)|Hard|
|29 |[Divide Two Integers](./src/com/leetcode/problems/DivideIntegers.md)|[Java](./src/com/leetcode/submissions/DivideIntegers.java)|Medium	|
|28 |[Implement strStr()](./src/com/leetcode/problems/ImplementStr.md)|[Java](./src/com/leetcode/submissions/ImplementStr.java)|Easy|
|27 |[Remove Element](./src/com/leetcode/problems/RemoveElement.md)|[Java](./src/com/leetcode/submissions/RemoveElement.java)|Easy|
|26 |[Remove Duplicates from Sorted Array](./src/com/leetcode/problems/RemoveDuplicates.md)|[Java](./src/com/leetcode/submissions/RemoveDuplicates.java)|Easy|
|25 |[Reverse Nodes in k-Group](./src/com/leetcode/problems/ReverseNodes.md)|[Java](./src/com/leetcode/submissions/ReverseNodes.java)|Hard|
|24 |[Swap Nodes in Pairs](./src/com/leetcode/problems/SwapNodes.md)|[Java](./src/com/leetcode/submissions/SwapNodes.java)|Medium|
|23 |[Merge k Sorted Lists](./src/com/leetcode/problems/MergekLists.md)|[Java](./src/com/leetcode/submissions/MergekLists.java)|Hard|
|22 |[Generate Parentheses](./src/com/leetcode/problems/GenerateParentheses.md)|[Java](./src/com/leetcode/submissions/GenerateParentheses.java)|Medium|
|21 |[Merge Two Sorted Lists](./src/com/leetcode/problems/MergeTwoSortedLists.md)|[Java](./src/com/leetcode/submissions/MergeTwoLists.java)|Easy|
|20 |[Valid Parentheses](./src/com/leetcode/problems/ValidParentheses.md)|[Java](./src/com/leetcode/submissions/ValidParentheses.java)|Easy|
|19 |[Remove Nth Node From End of List](./src/com/leetcode/problems/RemoveNthNodeFromEndofList.md)|[Java](./src/com/leetcode/submissions/RemoveNodeFromList.java)|Medium|
|18 |[4Sum](./src/com/leetcode/problems/FourSum.md)|[Java](./src/com/leetcode/submissions/FourSum.java)|Medium|
|17 |[Letter Combinations of a Phone Number](./src/com/leetcode/problems/LetterCombinations.md)|[Java](./src/com/leetcode/submissions/LetterCombinations.java)|Medium|
|16 |[3Sum Closest](./src/com/leetcode/problems/ThreeSumClosest.md)|[Java](./src/com/leetcode/submissions/ThreeSumClosest.java)|Medium|
|15 |[3Sum](./src/com/leetcode/problems/ThreeSum.md)|[Java](./src/com/leetcode/submissions/ThreeSum.java)|Medium|
|14 |[Longest Common Prefix](./src/com/leetcode/problems/LongestCommonPrefix.md)|[Java](./src/com/leetcode/submissions/LongestCommonPrefix.java)|Easy|
|13 |[Roman to Integer](./src/com/leetcode/problems/RomanToInteger.md)|[Java](./src/com/leetcode/submissions/RomanToInteger.java)|Easy|
|12 |[Integer to Roman](./src/com/leetcode/problems/IntegertoRoman.md)|[Java](./src/com/leetcode/submissions/IntegertoRoman.java)|Medium|
|11 |[Container With Most Water](./src/com/leetcode/problems/ContainerWithMostWater.md)|[Java](./src/com/leetcode/submissions/ContainerWithMostWater.java)|Medium|
|10 |[Regular Expression Matching](./src/com/leetcode/problems/RegularExpressionMatching.md)|[Java](./src/com/leetcode/submissions/RegularExpressionMatching.java)|Hard|
|9  |[Palindrome Number](./src/com/leetcode/problems/PalindromeNumber.md)|[Java](./src/com/leetcode/submissions/PalindromeNumber.java)|Easy|
|8  |[String to Integer (atoi)](./src/com/leetcode/problems/StringToInteger.md)|[Java](./src/com/leetcode/submissions/StringToInteger.java)|Medium|
|7  |[Reverse Integer](./src/com/leetcode/problems/ReverseInteger.md)|[Java](./src/com/leetcode/submissions/ReverseInteger.java)|Easy|
|6  |[ZigZag Conversion](./src/com/leetcode/problems/ZigZagConversion.md)|[Java](./src/com/leetcode/submissions/ZigZagConversion.java)|Medium|
|5  |[Longest palindromic substring](./src/com/leetcode/problems/LongestPalindromicSubstring.md)|[Java](./src/com/leetcode/submissions/LongestPalindromicSubstring.java)|Medium|
|4  |[Median of Two Sorted Arrays](./src/com/leetcode/problems/MedianofTwoSortedArrays.md)|[Java](./src/com/leetcode/submissions/MedianTwoArrays.java)|Hard|
|3  |[Longest Substring Without Repeating Characters](./src/com/leetcode/problems/LongestSubstring.md)|[Java](./src/com/leetcode/submissions/LongestSubstring.java)|Medium|
|2  |[Add Two Numbers](./src/com/leetcode/problems/AddTwoNumbers.md)|[Java](./src/com/leetcode/submissions/AddTwoNumbers.java)|Medium|
|1  |[Two sum](./src/com/leetcode/problems/TwoSum.md)|[Java](./src/com/leetcode/submissions/TwoSum.java)|Easy|

