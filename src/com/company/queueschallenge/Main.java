package com.company.queueschallenge;

import com.company.ArrayQueue2;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        String stringUppercase = string.toUpperCase();
        // Stack
        ArrayDeque<Character> stack = new ArrayDeque<>();
        // Queue
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < stringUppercase.length(); i++) {
            if (stringUppercase.charAt(i) >= 'A' && stringUppercase.charAt(i) <= 'Z') {
                stack.add(stringUppercase.charAt(i));
                queue.add(stringUppercase.charAt(i));
            }
        }

//        for (int i = 0; i < stack.size(); i++) {
//            if (!(stack.removeLast() == queue.pop())) {
//                return false;
//            }
//        }

        //OR
        while(!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }
        return true;
    }
}
