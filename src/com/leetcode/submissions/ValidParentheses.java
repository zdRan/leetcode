package com.leetcode.submissions;

import java.util.Stack;

/**
 * Create by ranzd on 2017/12/6
 *
 * @author ranzd@chinaunicom.cn
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char ch:s.toCharArray()) {
            if (!characterStack.empty()){
                char left = characterStack.peek();
                switch (ch){
                    case ')':
                        if (left == '('){
                            characterStack.pop();
                        }else {
                            return false;
                        }
                        break;
                    case '}':
                        if (left == '{'){
                            characterStack.pop();
                        }else {
                            return false;
                        }
                        break;
                    case ']':
                        if (left == '['){
                            characterStack.pop();
                        }else {
                            return false;
                        }
                        break;
                    default:
                        characterStack.push(ch);
                        break;
                }
            }else {
                characterStack.push(ch);
            }
        }
        return characterStack.empty();
    }
}
